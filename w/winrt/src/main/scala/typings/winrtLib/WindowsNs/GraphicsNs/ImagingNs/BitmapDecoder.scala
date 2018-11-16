package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

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
  override var frameCount: scala.Double = js.native
  /* CompleteClass */
  override def getFrameAsync(frameIndex: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapFrame] = js.native
  /* CompleteClass */
  override def getPreviewAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ImageStream] = js.native
}

@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
object BitmapDecoder extends js.Object {
  var bmpDecoderId: java.lang.String = js.native
  var gifDecoderId: java.lang.String = js.native
  var icoDecoderId: java.lang.String = js.native
  var jpegDecoderId: java.lang.String = js.native
  var jpegXRDecoderId: java.lang.String = js.native
  var pngDecoderId: java.lang.String = js.native
  var tiffDecoderId: java.lang.String = js.native
  def createAsync(decoderId: java.lang.String, stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapDecoder] = js.native
  def createAsync(stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapDecoder] = js.native
  def getDecoderInformationEnumerator(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.GraphicsNs.ImagingNs.BitmapCodecInformation] = js.native
}

