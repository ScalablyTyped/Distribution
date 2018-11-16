package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitmapEncoderStatics extends js.Object {
  var bmpEncoderId: java.lang.String = js.native
  var gifEncoderId: java.lang.String = js.native
  var jpegEncoderId: java.lang.String = js.native
  var jpegXREncoderId: java.lang.String = js.native
  var pngEncoderId: java.lang.String = js.native
  var tiffEncoderId: java.lang.String = js.native
  def createAsync(encoderId: java.lang.String, stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapEncoder] = js.native
  def createAsync(
    encoderId: java.lang.String,
    stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    encodingOptions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, BitmapTypedValue]
    ]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapEncoder] = js.native
  def createForInPlacePropertyEncodingAsync(bitmapDecoder: BitmapDecoder): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapEncoder] = js.native
  def createForTranscodingAsync(stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream, bitmapDecoder: BitmapDecoder): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapEncoder] = js.native
  def getEncoderInformationEnumerator(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[BitmapCodecInformation] = js.native
}

