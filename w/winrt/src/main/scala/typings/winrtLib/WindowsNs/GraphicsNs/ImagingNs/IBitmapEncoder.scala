package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitmapEncoder extends js.Object {
  var bitmapContainerProperties: BitmapProperties = js.native
  var bitmapProperties: BitmapProperties = js.native
  var bitmapTransform: BitmapTransform = js.native
  var encoderInformation: BitmapCodecInformation = js.native
  var generatedThumbnailHeight: scala.Double = js.native
  var generatedThumbnailWidth: scala.Double = js.native
  var isThumbnailGenerated: scala.Boolean = js.native
  def flushAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def goToNextFrameAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def goToNextFrameAsync(
    encodingOptions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, BitmapTypedValue]
    ]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def setPixelData(
    pixelFormat: BitmapPixelFormat,
    alphaMode: BitmapAlphaMode,
    width: scala.Double,
    height: scala.Double,
    dpiX: scala.Double,
    dpiY: scala.Double,
    pixels: stdLib.Uint8Array
  ): scala.Unit = js.native
}

