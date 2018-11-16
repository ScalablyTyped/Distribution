package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitmapDecoderStatics extends js.Object {
  var bmpDecoderId: java.lang.String = js.native
  var gifDecoderId: java.lang.String = js.native
  var icoDecoderId: java.lang.String = js.native
  var jpegDecoderId: java.lang.String = js.native
  var jpegXRDecoderId: java.lang.String = js.native
  var pngDecoderId: java.lang.String = js.native
  var tiffDecoderId: java.lang.String = js.native
  def createAsync(decoderId: java.lang.String, stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapDecoder] = js.native
  def createAsync(stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapDecoder] = js.native
  def getDecoderInformationEnumerator(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[BitmapCodecInformation] = js.native
}

