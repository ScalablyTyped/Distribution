package typings.winrt.global.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
class BitmapDecoder ()
  extends typings.winrt.Windows.Graphics.Imaging.BitmapDecoder

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
  def createAsync(decoderId: String, stream: IRandomAccessStream): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapDecoder] = js.native
  def createAsync(stream: IRandomAccessStream): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapDecoder] = js.native
  def getDecoderInformationEnumerator(): IVectorView[typings.winrt.Windows.Graphics.Imaging.BitmapCodecInformation] = js.native
}

