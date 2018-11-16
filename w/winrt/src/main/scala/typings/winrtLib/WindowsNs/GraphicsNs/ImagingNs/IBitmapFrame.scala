package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitmapFrame extends js.Object {
  var bitmapAlphaMode: BitmapAlphaMode = js.native
  var bitmapPixelFormat: BitmapPixelFormat = js.native
  var bitmapProperties: BitmapPropertiesView = js.native
  var dpiX: scala.Double = js.native
  var dpiY: scala.Double = js.native
  var orientedPixelHeight: scala.Double = js.native
  var orientedPixelWidth: scala.Double = js.native
  var pixelHeight: scala.Double = js.native
  var pixelWidth: scala.Double = js.native
  def getPixelDataAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[PixelDataProvider] = js.native
  def getPixelDataAsync(
    pixelFormat: BitmapPixelFormat,
    alphaMode: BitmapAlphaMode,
    transform: BitmapTransform,
    exifOrientationMode: ExifOrientationMode,
    colorManagementMode: ColorManagementMode
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[PixelDataProvider] = js.native
  def getThumbnailAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ImageStream] = js.native
}

