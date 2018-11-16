package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides read access to bitmap container data as well as data from the first frame. */
@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
abstract class BitmapDecoder () extends js.Object {
  /** The default alpha mode of the first frame. */
  var bitmapAlphaMode: BitmapAlphaMode = js.native
  /** Provides access to the container bitmap properties. */
  var bitmapContainerProperties: BitmapPropertiesView = js.native
  /** The pixel format that best fits the first frame. */
  var bitmapPixelFormat: BitmapPixelFormat = js.native
  /** A read-only view of the metadata within the first frame. */
  var bitmapProperties: BitmapPropertiesView = js.native
  /** Information about the bitmap decoder. */
  var decoderInformation: BitmapCodecInformation = js.native
  /** The horizontal resolution of the first frame in dots per inch. */
  var dpiX: scala.Double = js.native
  /** The vertical resolution of the first frame in dots per inch. */
  var dpiY: scala.Double = js.native
  /** The number of frames within the image file. */
  var frameCount: scala.Double = js.native
  /** The height of the first frame in pixels, after any EXIF orientation has been applied to the bitmap. */
  var orientedPixelHeight: scala.Double = js.native
  /** The width of the first frame in pixels, after any EXIF orientation has been applied to the bitmap. */
  var orientedPixelWidth: scala.Double = js.native
  /** The height of the first frame in pixels. */
  var pixelHeight: scala.Double = js.native
  /** The width of the first frame in pixels. */
  var pixelWidth: scala.Double = js.native
  /**
                   * Asynchronously retrieves a frame from the image file.
                   * @param frameIndex The zero-based index of the frame to be retrieved.
                   * @return Object that manages the asynchronous retrieval of the frame.
                   */
  def getFrameAsync(frameIndex: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[BitmapFrame] = js.native
  /**
                   * Asynchronously requests the pixel data for the frame.
                   * @return Object that manages the asynchronous retrieval of the pixel data.
                   */
  def getPixelDataAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PixelDataProvider] = js.native
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
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PixelDataProvider] = js.native
  /**
                   * Asynchronously returns a stream containing the preview image.
                   * @return Object that manages the asynchronous retrieval of the bitmap preview data.
                   */
  def getPreviewAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ImageStream] = js.native
  /**
                   * Asynchronously gets a SoftwareBitmap representation of the decoded bitmap.
                   * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
                   */
  def getSoftwareBitmapAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[SoftwareBitmap] = js.native
  /**
                   * Asynchronously gets a SoftwareBitmap representation of the decoded bitmap.
                   * @param pixelFormat The pixel format of the software bitmap.
                   * @param alphaMode The alpha mode of the software bitmap.
                   * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
                   */
  def getSoftwareBitmapAsync(pixelFormat: BitmapPixelFormat, alphaMode: BitmapAlphaMode): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[SoftwareBitmap] = js.native
  /**
                   * Asynchronously gets a SoftwareBitmap representation of the decoded bitmap.
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
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[SoftwareBitmap] = js.native
  /**
                   * Asynchronously returns a stream containing the thumbnail image.
                   * @return Object that manages the asynchronous retrieval of the thumbnail stream.
                   */
  def getThumbnailAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ImageStream] = js.native
}

/** Provides read access to bitmap container data as well as data from the first frame. */
@JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
@js.native
object BitmapDecoder extends js.Object {
  /** The unique identifier of the BMP decoder. */
  var bmpDecoderId: java.lang.String = js.native
  /** The unique identifier of the GIF decoder. */
  var gifDecoderId: java.lang.String = js.native
  /** The unique identifier of the ICO decoder. */
  var icoDecoderId: java.lang.String = js.native
  /** The unique identifier of the JPEG decoder. */
  var jpegDecoderId: java.lang.String = js.native
  /** The unique identifier of the JPEG-XR decoder. */
  var jpegXRDecoderId: java.lang.String = js.native
  /** The unique identifier of the PNG decoder. */
  var pngDecoderId: java.lang.String = js.native
  /** The unique identifier of the TIFF decoder. */
  var tiffDecoderId: java.lang.String = js.native
  /**
                   * Asynchronously creates a new BitmapDecoder using a specific bitmap codec and initializes it using a stream.
                   * @param decoderId The unique identifier of the specified bitmap codec.
                   * @param stream The stream containing the image file to be decoded.
                   * @return An object that manages the asynchronous creation of a new BitmapDecoder .
                   */
  def createAsync(
    decoderId: java.lang.String,
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapDecoder] = js.native
  /**
                   * Asynchronously creates a new BitmapDecoder and initializes it using a stream.
                   * @param stream The stream containing the image file to be decoded.
                   * @return An object that manages the asynchronous creation of a new BitmapDecoder .
                   */
  def createAsync(stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapDecoder] = js.native
  /**
                   * The bitmap decoders installed on the system and information about them.
                   * @return A list of BitmapCodecInformation objects containing information about each decoder.
                   */
  def getDecoderInformationEnumerator(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapCodecInformation] = js.native
}

