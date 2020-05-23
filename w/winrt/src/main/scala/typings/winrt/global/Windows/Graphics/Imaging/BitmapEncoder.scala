package typings.winrt.global.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
@js.native
class BitmapEncoder ()
  extends typings.winrt.Windows.Graphics.Imaging.BitmapEncoder

/* static members */
@JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
@js.native
object BitmapEncoder extends js.Object {
  var bmpEncoderId: String = js.native
  var gifEncoderId: String = js.native
  var jpegEncoderId: String = js.native
  var jpegXREncoderId: String = js.native
  var pngEncoderId: String = js.native
  var tiffEncoderId: String = js.native
  def createAsync(encoderId: String, stream: IRandomAccessStream): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  def createAsync(
    encoderId: String,
    stream: IRandomAccessStream,
    encodingOptions: IIterable[IKeyValuePair[String, typings.winrt.Windows.Graphics.Imaging.BitmapTypedValue]]
  ): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  def createForInPlacePropertyEncodingAsync(bitmapDecoder: typings.winrt.Windows.Graphics.Imaging.BitmapDecoder): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  def createForTranscodingAsync(stream: IRandomAccessStream, bitmapDecoder: typings.winrt.Windows.Graphics.Imaging.BitmapDecoder): IAsyncOperation[typings.winrt.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  def getEncoderInformationEnumerator(): IVectorView[typings.winrt.Windows.Graphics.Imaging.BitmapCodecInformation] = js.native
}

