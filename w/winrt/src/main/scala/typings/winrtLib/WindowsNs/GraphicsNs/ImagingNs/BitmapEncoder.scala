package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
@js.native
class BitmapEncoder () extends IBitmapEncoder

@JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
@js.native
object BitmapEncoder extends js.Object {
  var bmpEncoderId: java.lang.String = js.native
  var gifEncoderId: java.lang.String = js.native
  var jpegEncoderId: java.lang.String = js.native
  var jpegXREncoderId: java.lang.String = js.native
  var pngEncoderId: java.lang.String = js.native
  var tiffEncoderId: java.lang.String = js.native
  def createAsync(encoderId: java.lang.String, stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapEncoder] = js.native
  def createAsync(
    encoderId: java.lang.String,
    stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    encodingOptions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapTypedValue]
    ]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapEncoder] = js.native
  def createForInPlacePropertyEncodingAsync(bitmapDecoder: winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapDecoder): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapEncoder] = js.native
  def createForTranscodingAsync(
    stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    bitmapDecoder: winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapDecoder
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapEncoder] = js.native
  def getEncoderInformationEnumerator(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapCodecInformation] = js.native
}

