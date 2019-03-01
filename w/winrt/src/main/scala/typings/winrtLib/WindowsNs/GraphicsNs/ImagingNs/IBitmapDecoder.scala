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
    getFrameAsync: js.Function1[scala.Double, winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapFrame]],
    getPreviewAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ImageStream]]
  ): IBitmapDecoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bitmapContainerProperties")(bitmapContainerProperties)
    __obj.updateDynamic("decoderInformation")(decoderInformation)
    __obj.updateDynamic("frameCount")(frameCount)
    __obj.updateDynamic("getFrameAsync")(getFrameAsync)
    __obj.updateDynamic("getPreviewAsync")(getPreviewAsync)
    __obj.asInstanceOf[IBitmapDecoder]
  }
}

