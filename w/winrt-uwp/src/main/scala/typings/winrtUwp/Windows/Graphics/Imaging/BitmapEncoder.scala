package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains methods to create, edit and save images. */
@js.native
trait BitmapEncoder extends js.Object {
  
  /** The metadata for the container. */
  var bitmapContainerProperties: BitmapProperties = js.native
  
  /** The metadata for the selected frame. */
  var bitmapProperties: BitmapProperties = js.native
  
  /** A BitmapTransform object that is used to specify how the frame bitmap is to be transformed. */
  var bitmapTransform: BitmapTransform = js.native
  
  /** Information about the bitmap encoder. */
  var encoderInformation: BitmapCodecInformation = js.native
  
  /**
    * Asynchronously commits and flushes all of the image data.
    * @return An object that manages the asynchronous flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncAction = js.native
  
  /** The height, in pixels, of any generated thumbnail. */
  var generatedThumbnailHeight: Double = js.native
  
  /** The width, in pixels, of any generated thumbnail. */
  var generatedThumbnailWidth: Double = js.native
  
  /**
    * Asynchronously commits the current frame data and appends a new empty frame to be edited.
    * @return An object that manages the asynchronous operation of committing the current frame data and appending a new empty frame to be edited.
    */
  def goToNextFrameAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously commits the current frame data and appends a new empty frame, with the specified encoding options, to be edited.
    * @param encodingOptions The specified encoding options. A collection of key-value pairs containing one or more codec-specific encoding options and the desired values.
    * @return An object that manages the asynchronous operation of committing the current frame data and appending a new empty frame to be edited.
    */
  def goToNextFrameAsync(encodingOptions: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncAction = js.native
  
  /** Indicates whether or not a new thumbnail is automatically generated. */
  var isThumbnailGenerated: Boolean = js.native
  
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
    width: Double,
    height: Double,
    dpiX: Double,
    dpiY: Double,
    pixels: js.Array[Double]
  ): Unit = js.native
  
  /**
    * Sets the image data of the current frame using the specified SoftwareBitmap .
    * @param bitmap The software bitmap containing the image data.
    */
  def setSoftwareBitmap(bitmap: SoftwareBitmap): Unit = js.native
}
