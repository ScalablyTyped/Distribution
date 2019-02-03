package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains methods to create, edit and save images. */
@JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
@js.native
abstract class BitmapEncoder () extends js.Object {
  /** The metadata for the container. */
  var bitmapContainerProperties: BitmapProperties = js.native
  /** The metadata for the selected frame. */
  var bitmapProperties: BitmapProperties = js.native
  /** A BitmapTransform object that is used to specify how the frame bitmap is to be transformed. */
  var bitmapTransform: BitmapTransform = js.native
  /** Information about the bitmap encoder. */
  var encoderInformation: BitmapCodecInformation = js.native
  /** The height, in pixels, of any generated thumbnail. */
  var generatedThumbnailHeight: scala.Double = js.native
  /** The width, in pixels, of any generated thumbnail. */
  var generatedThumbnailWidth: scala.Double = js.native
  /** Indicates whether or not a new thumbnail is automatically generated. */
  var isThumbnailGenerated: scala.Boolean = js.native
  /**
    * Asynchronously commits and flushes all of the image data.
    * @return An object that manages the asynchronous flush operation.
    */
  def flushAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously commits the current frame data and appends a new empty frame to be edited.
    * @return An object that manages the asynchronous operation of committing the current frame data and appending a new empty frame to be edited.
    */
  def goToNextFrameAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously commits the current frame data and appends a new empty frame, with the specified encoding options, to be edited.
    * @param encodingOptions The specified encoding options. A collection of key-value pairs containing one or more codec-specific encoding options and the desired values.
    * @return An object that manages the asynchronous operation of committing the current frame data and appending a new empty frame to be edited.
    */
  def goToNextFrameAsync(
    encodingOptions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Sets pixel data on the frame.
    * @param pixelFormat The pixel format of the pixel data.
    * @param alphaMode The alpha mode of the pixel data.
    * @param width The width, in pixels, of the pixel data.
    * @param height The height, in pixels, of the pixel data.
    * @param dpiX The horizontal resolution, in dots per inch, of the pixel data.
    * @param dpiY The vertical resolution, in dots per inch, of the pixel data.
    * @param pixels The pixel data.
    */
  def setPixelData(
    pixelFormat: BitmapPixelFormat,
    alphaMode: BitmapAlphaMode,
    width: scala.Double,
    height: scala.Double,
    dpiX: scala.Double,
    dpiY: scala.Double,
    pixels: js.Array[scala.Double]
  ): scala.Unit = js.native
  /**
    * Sets the image data of the current frame using the specified SoftwareBitmap .
    * @param bitmap The software bitmap containing the image data.
    */
  def setSoftwareBitmap(bitmap: SoftwareBitmap): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
@js.native
object BitmapEncoder extends js.Object {
  /** The unique identifier of the built-in BMP encoder. */
  var bmpEncoderId: java.lang.String = js.native
  /** The unique identifier of the built-in GIF encoder. */
  var gifEncoderId: java.lang.String = js.native
  /** The unique identifier of the built-in JPEG encoder. */
  var jpegEncoderId: java.lang.String = js.native
  /** The unique identifier of the built-in JPEG-XR encoder. */
  var jpegXREncoderId: java.lang.String = js.native
  /** The unique identifier of the built-in PNG encoder. */
  var pngEncoderId: java.lang.String = js.native
  /** The unique identifier of the built-in TIFF encoder. */
  var tiffEncoderId: java.lang.String = js.native
  /**
    * Asynchronously creates a new BitmapEncoder .
    * @param encoderId The unique identifier of the specified encoder.
    * @param stream The output stream.
    * @return An object that manages the asynchronous creation of a new BitmapEncoder .
    */
  def createAsync(
    encoderId: java.lang.String,
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapEncoder] = js.native
  /**
    * Asynchronously creates a new BitmapEncoder for the specified codec with the specified encoding options and initializes it on a stream.
    * @param encoderId The unique identifier of the specified encoder.
    * @param stream A stream representing where the image file is to be written.
    * @param encodingOptions A collection of key-value pairs containing one or more codec-specific encoding options and the desired values.
    * @return An object that manages the asynchronous creation of a new BitmapEncoder .
    */
  def createAsync(
    encoderId: java.lang.String,
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    encodingOptions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapEncoder] = js.native
  /**
    * Asynchronously creates a new BitmapEncoder for in-place property and metadata editing. The new encoder can only edit bitmap properties in-place and will fail for any other uses.
    * @param bitmapDecoder A BitmapDecoder containing the image data to be edited. This parameter must be created on a stream with an access mode of ReadWrite .
    * @return An object that manages the asynchronous initialization of a new BitmapEncoder using data from an existing BitmapDecoder .
    */
  def createForInPlacePropertyEncodingAsync(bitmapDecoder: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapDecoder): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapEncoder] = js.native
  /**
    * Asynchronously creates a new BitmapEncoder and initializes it using data from an existing BitmapDecoder .
    * @param stream The output stream.
    * @param bitmapDecoder A BitmapDecoder containing the image data to be copied.
    * @return An object that manages the asynchronous creation of a new BitmapEncoder using data from an existing BitmapDecoder .
    */
  def createForTranscodingAsync(
    stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    bitmapDecoder: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapDecoder
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapEncoder] = js.native
  /**
    * A list of the bitmap encoders installed on the system and information about them.
    * @return A list of BitmapCodecInformation objects containing information about each encoder.
    */
  def getEncoderInformationEnumerator(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapCodecInformation] = js.native
}

