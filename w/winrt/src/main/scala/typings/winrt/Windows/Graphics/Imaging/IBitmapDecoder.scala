package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapDecoder extends js.Object {
  var bitmapContainerProperties: BitmapPropertiesView
  var decoderInformation: BitmapCodecInformation
  var frameCount: Double
  def getFrameAsync(frameIndex: Double): IAsyncOperation[BitmapFrame]
  def getPreviewAsync(): IAsyncOperation[ImageStream]
}

object IBitmapDecoder {
  @scala.inline
  def apply(
    bitmapContainerProperties: BitmapPropertiesView,
    decoderInformation: BitmapCodecInformation,
    frameCount: Double,
    getFrameAsync: Double => IAsyncOperation[BitmapFrame],
    getPreviewAsync: () => IAsyncOperation[ImageStream]
  ): IBitmapDecoder = {
    val __obj = js.Dynamic.literal(bitmapContainerProperties = bitmapContainerProperties, decoderInformation = decoderInformation, frameCount = frameCount, getFrameAsync = js.Any.fromFunction1(getFrameAsync), getPreviewAsync = js.Any.fromFunction0(getPreviewAsync))
  
    __obj.asInstanceOf[IBitmapDecoder]
  }
}

