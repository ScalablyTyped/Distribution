package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapDecoder extends js.Object {
  var bitmapContainerProperties: BitmapPropertiesView
  var decoderInformation: BitmapCodecInformation
  var frameCount: scala.Double
  def getFrameAsync(frameIndex: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapFrame]
  def getPreviewAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ImageStream]
}

