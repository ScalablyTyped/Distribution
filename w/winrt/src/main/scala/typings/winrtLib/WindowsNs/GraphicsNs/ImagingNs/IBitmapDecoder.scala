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

object IBitmapDecoder {
  @scala.inline
  def apply(
    bitmapContainerProperties: BitmapPropertiesView,
    decoderInformation: BitmapCodecInformation,
    frameCount: scala.Double,
    getFrameAsync: scala.Double => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapFrame],
    getPreviewAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ImageStream]
  ): IBitmapDecoder = {
    val __obj = js.Dynamic.literal(bitmapContainerProperties = bitmapContainerProperties, decoderInformation = decoderInformation, frameCount = frameCount, getFrameAsync = js.Any.fromFunction1(getFrameAsync), getPreviewAsync = js.Any.fromFunction0(getPreviewAsync))
  
    __obj.asInstanceOf[IBitmapDecoder]
  }
}

