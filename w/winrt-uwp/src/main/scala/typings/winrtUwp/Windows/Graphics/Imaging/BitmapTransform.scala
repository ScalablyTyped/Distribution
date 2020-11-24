package typings.winrtUwp.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains transformations that can be applied to pixel data. */
@js.native
trait BitmapTransform extends js.Object {
  
  /** Specifies the bounding rectangle that is used to crop the bitmap. This rectangle is defined in the coordinate space after scale, rotation, and flip are applied. */
  var bounds: BitmapBounds = js.native
  
  /** Specifies the flip operation that is used to transform the bitmap. */
  var flip: BitmapFlip = js.native
  
  /** Specifies the interpolation mode that is used to scale the bitmap. */
  var interpolationMode: BitmapInterpolationMode = js.native
  
  /** Specifies the rotation operation that is used to transform the bitmap. */
  var rotation: BitmapRotation = js.native
  
  /** Specifies the height, in pixels, of the bitmap after it is scaled. This is defined in the coordinate space of the source image, before rotation and flip are applied. */
  var scaledHeight: Double = js.native
  
  /** Specifies the width, in pixels, of the bitmap after it is scaled. This is defined in the coordinate space of the source image, before rotation and flip are applied. */
  var scaledWidth: Double = js.native
}
object BitmapTransform {
  
  @scala.inline
  def apply(
    bounds: BitmapBounds,
    flip: BitmapFlip,
    interpolationMode: BitmapInterpolationMode,
    rotation: BitmapRotation,
    scaledHeight: Double,
    scaledWidth: Double
  ): BitmapTransform = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], interpolationMode = interpolationMode.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaledHeight = scaledHeight.asInstanceOf[js.Any], scaledWidth = scaledWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTransform]
  }
  
  @scala.inline
  implicit class BitmapTransformOps[Self <: BitmapTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBounds(value: BitmapBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlip(value: BitmapFlip): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationMode(value: BitmapInterpolationMode): Self = this.set("interpolationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: BitmapRotation): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaledHeight(value: Double): Self = this.set("scaledHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaledWidth(value: Double): Self = this.set("scaledWidth", value.asInstanceOf[js.Any])
  }
}
