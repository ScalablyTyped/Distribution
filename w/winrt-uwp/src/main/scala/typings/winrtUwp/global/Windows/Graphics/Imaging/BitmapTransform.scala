package typings.winrtUwp.global.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Graphics.Imaging.BitmapBounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains transformations that can be applied to pixel data. */
@JSGlobal("Windows.Graphics.Imaging.BitmapTransform")
@js.native
/** Creates a new BitmapTransform object. */
class BitmapTransform ()
  extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapTransform {
  /** Specifies the bounding rectangle that is used to crop the bitmap. This rectangle is defined in the coordinate space after scale, rotation, and flip are applied. */
  /* CompleteClass */
  override var bounds: BitmapBounds = js.native
  /** Specifies the flip operation that is used to transform the bitmap. */
  /* CompleteClass */
  override var flip: typings.winrtUwp.Windows.Graphics.Imaging.BitmapFlip = js.native
  /** Specifies the interpolation mode that is used to scale the bitmap. */
  /* CompleteClass */
  override var interpolationMode: typings.winrtUwp.Windows.Graphics.Imaging.BitmapInterpolationMode = js.native
  /** Specifies the rotation operation that is used to transform the bitmap. */
  /* CompleteClass */
  override var rotation: typings.winrtUwp.Windows.Graphics.Imaging.BitmapRotation = js.native
  /** Specifies the height, in pixels, of the bitmap after it is scaled. This is defined in the coordinate space of the source image, before rotation and flip are applied. */
  /* CompleteClass */
  override var scaledHeight: Double = js.native
  /** Specifies the width, in pixels, of the bitmap after it is scaled. This is defined in the coordinate space of the source image, before rotation and flip are applied. */
  /* CompleteClass */
  override var scaledWidth: Double = js.native
}

