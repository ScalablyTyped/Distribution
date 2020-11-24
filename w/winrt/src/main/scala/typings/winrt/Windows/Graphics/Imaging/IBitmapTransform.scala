package typings.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitmapTransform extends js.Object {
  
  var bounds: BitmapBounds = js.native
  
  var flip: BitmapFlip = js.native
  
  var interpolationMode: BitmapInterpolationMode = js.native
  
  var rotation: BitmapRotation = js.native
  
  var scaledHeight: Double = js.native
  
  var scaledWidth: Double = js.native
}
object IBitmapTransform {
  
  @scala.inline
  def apply(
    bounds: BitmapBounds,
    flip: BitmapFlip,
    interpolationMode: BitmapInterpolationMode,
    rotation: BitmapRotation,
    scaledHeight: Double,
    scaledWidth: Double
  ): IBitmapTransform = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], interpolationMode = interpolationMode.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaledHeight = scaledHeight.asInstanceOf[js.Any], scaledWidth = scaledWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapTransform]
  }
  
  @scala.inline
  implicit class IBitmapTransformOps[Self <: IBitmapTransform] (val x: Self) extends AnyVal {
    
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
