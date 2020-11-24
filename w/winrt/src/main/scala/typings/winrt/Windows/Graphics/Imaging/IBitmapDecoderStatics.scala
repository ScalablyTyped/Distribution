package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitmapDecoderStatics extends js.Object {
  
  var bmpDecoderId: String = js.native
  
  def createAsync(decoderId: String, stream: IRandomAccessStream): IAsyncOperation[BitmapDecoder] = js.native
  def createAsync(stream: IRandomAccessStream): IAsyncOperation[BitmapDecoder] = js.native
  
  def getDecoderInformationEnumerator(): IVectorView[BitmapCodecInformation] = js.native
  
  var gifDecoderId: String = js.native
  
  var icoDecoderId: String = js.native
  
  var jpegDecoderId: String = js.native
  
  var jpegXRDecoderId: String = js.native
  
  var pngDecoderId: String = js.native
  
  var tiffDecoderId: String = js.native
}
