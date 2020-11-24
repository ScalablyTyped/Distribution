package typings.winrtUwp.global.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains methods to create, edit and save images. */
@JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
@js.native
abstract class BitmapEncoder ()
  extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder
/* static members */
@JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
@js.native
object BitmapEncoder extends js.Object {
  
  /** The unique identifier of the built-in BMP encoder. */
  var bmpEncoderId: String = js.native
  
  /**
    * Asynchronously creates a new BitmapEncoder .
    * @param encoderId The unique identifier of the specified encoder.
    * @param stream The output stream.
    * @return An object that manages the asynchronous creation of a new BitmapEncoder .
    */
  def createAsync(encoderId: String, stream: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  /**
    * Asynchronously creates a new BitmapEncoder for the specified codec with the specified encoding options and initializes it on a stream.
    * @param encoderId The unique identifier of the specified encoder.
    * @param stream A stream representing where the image file is to be written.
    * @param encodingOptions A collection of key-value pairs containing one or more codec-specific encoding options and the desired values.
    * @return An object that manages the asynchronous creation of a new BitmapEncoder .
    */
  def createAsync(encoderId: String, stream: IRandomAccessStream, encodingOptions: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  
  /**
    * Asynchronously creates a new BitmapEncoder for in-place property and metadata editing. The new encoder can only edit bitmap properties in-place and will fail for any other uses.
    * @param bitmapDecoder A BitmapDecoder containing the image data to be edited. This parameter must be created on a stream with an access mode of ReadWrite .
    * @return An object that manages the asynchronous initialization of a new BitmapEncoder using data from an existing BitmapDecoder .
    */
  def createForInPlacePropertyEncodingAsync(bitmapDecoder: typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  
  /**
    * Asynchronously creates a new BitmapEncoder and initializes it using data from an existing BitmapDecoder .
    * @param stream The output stream.
    * @param bitmapDecoder A BitmapDecoder containing the image data to be copied.
    * @return An object that manages the asynchronous creation of a new BitmapEncoder using data from an existing BitmapDecoder .
    */
  def createForTranscodingAsync(
    stream: IRandomAccessStream,
    bitmapDecoder: typings.winrtUwp.Windows.Graphics.Imaging.BitmapDecoder
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.BitmapEncoder] = js.native
  
  /**
    * A list of the bitmap encoders installed on the system and information about them.
    * @return A list of BitmapCodecInformation objects containing information about each encoder.
    */
  def getEncoderInformationEnumerator(): IVectorView[typings.winrtUwp.Windows.Graphics.Imaging.BitmapCodecInformation] = js.native
  
  /** The unique identifier of the built-in GIF encoder. */
  var gifEncoderId: String = js.native
  
  /** The unique identifier of the built-in JPEG encoder. */
  var jpegEncoderId: String = js.native
  
  /** The unique identifier of the built-in JPEG-XR encoder. */
  var jpegXREncoderId: String = js.native
  
  /** The unique identifier of the built-in PNG encoder. */
  var pngEncoderId: String = js.native
  
  /** The unique identifier of the built-in TIFF encoder. */
  var tiffEncoderId: String = js.native
}
