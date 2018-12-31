package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains transformations that can be applied to pixel data. */
@JSGlobal("Windows.Graphics.Imaging.BitmapTransform")
@js.native
/** Creates a new BitmapTransform object. */
class BitmapTransform () extends js.Object {
  /** Specifies the bounding rectangle that is used to crop the bitmap. This rectangle is defined in the coordinate space after scale, rotation, and flip are applied. */
  var bounds: BitmapBounds = js.native
  /** Specifies the flip operation that is used to transform the bitmap. */
  var flip: BitmapFlip = js.native
  /** Specifies the interpolation mode that is used to scale the bitmap. */
  var interpolationMode: BitmapInterpolationMode = js.native
  /** Specifies the rotation operation that is used to transform the bitmap. */
  var rotation: BitmapRotation = js.native
  /** Specifies the height, in pixels, of the bitmap after it is scaled. This is defined in the coordinate space of the source image, before rotation and flip are applied. */
  var scaledHeight: scala.Double = js.native
  /** Specifies the width, in pixels, of the bitmap after it is scaled. This is defined in the coordinate space of the source image, before rotation and flip are applied. */
  var scaledWidth: scala.Double = js.native
}

