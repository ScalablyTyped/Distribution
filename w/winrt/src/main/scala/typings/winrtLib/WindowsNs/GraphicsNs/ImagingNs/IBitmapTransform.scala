package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapTransform extends js.Object {
  var bounds: BitmapBounds
  var flip: BitmapFlip
  var interpolationMode: BitmapInterpolationMode
  var rotation: BitmapRotation
  var scaledHeight: scala.Double
  var scaledWidth: scala.Double
}

object IBitmapTransform {
  @scala.inline
  def apply(
    bounds: BitmapBounds,
    flip: BitmapFlip,
    interpolationMode: BitmapInterpolationMode,
    rotation: BitmapRotation,
    scaledHeight: scala.Double,
    scaledWidth: scala.Double
  ): IBitmapTransform = {
    val __obj = js.Dynamic.literal(bounds = bounds, flip = flip, interpolationMode = interpolationMode, rotation = rotation, scaledHeight = scaledHeight, scaledWidth = scaledWidth)
  
    __obj.asInstanceOf[IBitmapTransform]
  }
}

