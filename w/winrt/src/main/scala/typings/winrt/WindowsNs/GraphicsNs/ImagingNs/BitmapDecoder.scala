package typings.winrt.WindowsNs.GraphicsNs.ImagingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
class BitmapDecoder ()
  extends IBitmapDecoder
     with IBitmapFrame {
  /* CompleteClass */
  override var bitmapContainerProperties: BitmapPropertiesView = js.native
  /* CompleteClass */
  override var decoderInformation: BitmapCodecInformation = js.native
  /* CompleteClass */
  override var frameCount: Double = js.native
  /* CompleteClass */
  override def getFrameAsync(frameIndex: Double): IAsyncOperation[BitmapFrame] = js.native
  /* CompleteClass */
  override def getPreviewAsync(): IAsyncOperation[ImageStream] = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
object BitmapDecoder extends js.Object {
  var bmpDecoderId: String = js.native
  var gifDecoderId: String = js.native
  var icoDecoderId: String = js.native
  var jpegDecoderId: String = js.native
  var jpegXRDecoderId: String = js.native
  var pngDecoderId: String = js.native
  var tiffDecoderId: String = js.native
  def createAsync(decoderId: String, stream: IRandomAccessStream): IAsyncOperation[BitmapDecoder] = js.native
  def createAsync(stream: IRandomAccessStream): IAsyncOperation[BitmapDecoder] = js.native
  def getDecoderInformationEnumerator(): IVectorView[BitmapCodecInformation] = js.native
}

