package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an uncompressed bitmap. */
trait SoftwareBitmap extends js.Object {
  /** Gets the alpha mode of the software bitmap. */
  var bitmapAlphaMode: BitmapAlphaMode
  /** Gets the pixel format of the software bitmap. */
  var bitmapPixelFormat: BitmapPixelFormat
  /** Gets or sets the dots per inch of the software bitmap in the X direction. */
  var dpiX: Double
  /** Gets or sets the dots per inch of the software bitmap in the Y direction. */
  var dpiY: Double
  /** Gets a value indicating whether the software bitmap can be modified. */
  var isReadOnly: Boolean
  /** Gets the height of the software bitmap, in pixels. */
  var pixelHeight: Double
  /** Gets the width of the software bitmap, in pixels. */
  var pixelWidth: Double
  /** Disposes of the object and associated resources. */
  def close(): Unit
  /**
    * Copies the pixel data from an IBuffer into the SoftwareBitmap .
    * @param buffer The buffer containing the pixel data to be copied.
    */
  def copyFromBuffer(buffer: IBuffer): Unit
  /**
    * Copies the current SoftwareBitmap into the provided SoftwareBitmap object.
    * @param bitmap The target software bitmap into which the data will be copied.
    */
  def copyTo(bitmap: SoftwareBitmap): Unit
  /**
    * Copies the software bitmap pixel data into the specified IBuffer .
    * @param buffer The target buffer to which the pixel data will be copied.
    */
  def copyToBuffer(buffer: IBuffer): Unit
  /**
    * Gets a read-only representation of the SoftwareBitmap object.
    * @return A read-only representation of the SoftwareBitmap object.
    */
  def getReadOnlyView(): SoftwareBitmap
  /**
    * Gets a BitmapBuffer object that allows you to operate directly on the software bitmap's pixel data.
    * @param mode A value indicating the access mode of the returned buffer.
    * @return The buffer containing pixel data.
    */
  def lockBuffer(mode: BitmapBufferAccessMode): BitmapBuffer
}

object SoftwareBitmap {
  @scala.inline
  def apply(
    bitmapAlphaMode: BitmapAlphaMode,
    bitmapPixelFormat: BitmapPixelFormat,
    close: () => Unit,
    copyFromBuffer: IBuffer => Unit,
    copyTo: SoftwareBitmap => Unit,
    copyToBuffer: IBuffer => Unit,
    dpiX: Double,
    dpiY: Double,
    getReadOnlyView: () => SoftwareBitmap,
    isReadOnly: Boolean,
    lockBuffer: BitmapBufferAccessMode => BitmapBuffer,
    pixelHeight: Double,
    pixelWidth: Double
  ): SoftwareBitmap = {
    val __obj = js.Dynamic.literal(bitmapAlphaMode = bitmapAlphaMode.asInstanceOf[js.Any], bitmapPixelFormat = bitmapPixelFormat.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), copyFromBuffer = js.Any.fromFunction1(copyFromBuffer), copyTo = js.Any.fromFunction1(copyTo), copyToBuffer = js.Any.fromFunction1(copyToBuffer), dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any], getReadOnlyView = js.Any.fromFunction0(getReadOnlyView), isReadOnly = isReadOnly.asInstanceOf[js.Any], lockBuffer = js.Any.fromFunction1(lockBuffer), pixelHeight = pixelHeight.asInstanceOf[js.Any], pixelWidth = pixelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftwareBitmap]
  }
}

