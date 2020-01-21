package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides read access to data within a single frame. */
@JSGlobal("Windows.Graphics.Imaging.BitmapFrame")
@js.native
abstract class BitmapFrame () extends js.Object {
  /** The default alpha mode of the frame. */
  var bitmapAlphaMode: BitmapAlphaMode = js.native
  /** The pixel format that best fits the frame. */
  var bitmapPixelFormat: BitmapPixelFormat = js.native
  /** A read-only view of the metadata within the frame. */
  var bitmapProperties: BitmapPropertiesView = js.native
  /** The horizontal resolution of the frame in dots per inch. */
  var dpiX: Double = js.native
  /** The vertical resolution of the frame in dots per inch. */
  var dpiY: Double = js.native
  /** The height of the frame in pixels, after any EXIF orientation has been applied to the bitmap. */
  var orientedPixelHeight: Double = js.native
  /** The width of the frame in pixels, after any EXIF orientation has been applied to the bitmap. */
  var orientedPixelWidth: Double = js.native
  /** The height of the frame in pixels. */
  var pixelHeight: Double = js.native
  /** The width of the frame in pixels. */
  var pixelWidth: Double = js.native
  /**
    * Asynchronously requests the pixel data for the frame. The resulting pixel data array will use the bitmap pixel format and alpha mode specified in the BitmapPixelFormat and BitmapAlphaMode properties. It will also have color management and EXIF orientation applied (see the Remarks section for more information).
    * @return Object that manages the asynchronous retrieval of the pixel data.
    */
  def getPixelDataAsync(): IPromiseWithIAsyncOperation[PixelDataProvider] = js.native
  /**
    * Asynchronously requests the pixel data for the frame using the specified parameters.
    * @param pixelFormat The specified pixel format.
    * @param alphaMode The specified alpha mode.
    * @param transform The set of transformations to be applied to the frame.
    * @param exifOrientationMode Indicates whether the EXIF orientation flag should be ignored or respected.
    * @param colorManagementMode Indicates whether the pixel data should be color managed to the sRGB color space.
    * @return Object that manages the asynchronous retrieval of the pixel data.
    */
  def getPixelDataAsync(
    pixelFormat: BitmapPixelFormat,
    alphaMode: BitmapAlphaMode,
    transform: BitmapTransform,
    exifOrientationMode: ExifOrientationMode,
    colorManagementMode: ColorManagementMode
  ): IPromiseWithIAsyncOperation[PixelDataProvider] = js.native
  /**
    * Asynchronously gets a SoftwareBitmap representation of the bitmap frame.
    * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
    */
  def getSoftwareBitmapAsync(): IPromiseWithIAsyncOperation[SoftwareBitmap] = js.native
  /**
    * Asynchronously gets a SoftwareBitmap representation of the bitmap frame.
    * @param pixelFormat The pixel format of the software bitmap.
    * @param alphaMode The alpha mode of the software bitmap.
    * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
    */
  def getSoftwareBitmapAsync(pixelFormat: BitmapPixelFormat, alphaMode: BitmapAlphaMode): IPromiseWithIAsyncOperation[SoftwareBitmap] = js.native
  /**
    * Asynchronously gets a SoftwareBitmap representation of the bitmap frame.
    * @param pixelFormat The pixel format of the software bitmap.
    * @param alphaMode The alpha mode of the software bitmap.
    * @param transform The transform of the software bitmap.
    * @param exifOrientationMode The EXIF orientation mode of the software bitmap.
    * @param colorManagementMode The color management mode of the software bitmap.
    * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
    */
  def getSoftwareBitmapAsync(
    pixelFormat: BitmapPixelFormat,
    alphaMode: BitmapAlphaMode,
    transform: BitmapTransform,
    exifOrientationMode: ExifOrientationMode,
    colorManagementMode: ColorManagementMode
  ): IPromiseWithIAsyncOperation[SoftwareBitmap] = js.native
  /**
    * Asynchronously returns a stream containing the thumbnail image.
    * @return Object that manages the asynchronous retrieval of the thumbnail data.
    */
  def getThumbnailAsync(): IPromiseWithIAsyncOperation[ImageStream] = js.native
}

