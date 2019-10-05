package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitmapFrame extends js.Object {
  var bitmapAlphaMode: BitmapAlphaMode = js.native
  var bitmapPixelFormat: BitmapPixelFormat = js.native
  var bitmapProperties: BitmapPropertiesView = js.native
  var dpiX: Double = js.native
  var dpiY: Double = js.native
  var orientedPixelHeight: Double = js.native
  var orientedPixelWidth: Double = js.native
  var pixelHeight: Double = js.native
  var pixelWidth: Double = js.native
  def getPixelDataAsync(): IAsyncOperation[PixelDataProvider] = js.native
  def getPixelDataAsync(
    pixelFormat: BitmapPixelFormat,
    alphaMode: BitmapAlphaMode,
    transform: BitmapTransform,
    exifOrientationMode: ExifOrientationMode,
    colorManagementMode: ColorManagementMode
  ): IAsyncOperation[PixelDataProvider] = js.native
  def getThumbnailAsync(): IAsyncOperation[ImageStream] = js.native
}

