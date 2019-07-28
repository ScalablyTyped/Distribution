package typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.IDirect3DSurface
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an uncompressed bitmap. */
@JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap")
@js.native
class SoftwareBitmap protected () extends js.Object {
  /**
    * Initializes a new instance of the SoftwareBitmap class.
    * @param format The pixel format of the new software bitmap.
    * @param width The width of the new software bitmap, in pixels.
    * @param height The height of the new software bitmap, in pixels.
    */
  def this(format: BitmapPixelFormat, width: Double, height: Double) = this()
  /**
    * Initializes a new instance of the SoftwareBitmap class.
    * @param format The pixel format of the new software bitmap.
    * @param width The width of the new software bitmap, in pixels.
    * @param height The height of the new software bitmap, in pixels.
    * @param alpha The alpha mode of the new software bitmap.
    */
  def this(format: BitmapPixelFormat, width: Double, height: Double, alpha: BitmapAlphaMode) = this()
  /** Gets the alpha mode of the software bitmap. */
  var bitmapAlphaMode: BitmapAlphaMode = js.native
  /** Gets the pixel format of the software bitmap. */
  var bitmapPixelFormat: BitmapPixelFormat = js.native
  /** Gets or sets the dots per inch of the software bitmap in the X direction. */
  var dpiX: Double = js.native
  /** Gets or sets the dots per inch of the software bitmap in the Y direction. */
  var dpiY: Double = js.native
  /** Gets a value indicating whether the software bitmap can be modified. */
  var isReadOnly: Boolean = js.native
  /** Gets the height of the software bitmap, in pixels. */
  var pixelHeight: Double = js.native
  /** Gets the width of the software bitmap, in pixels. */
  var pixelWidth: Double = js.native
  /** Disposes of the object and associated resources. */
  def close(): Unit = js.native
  /**
    * Copies the pixel data from an IBuffer into the SoftwareBitmap .
    * @param buffer The buffer containing the pixel data to be copied.
    */
  def copyFromBuffer(buffer: IBuffer): Unit = js.native
  /**
    * Copies the current SoftwareBitmap into the provided SoftwareBitmap object.
    * @param bitmap The target software bitmap into which the data will be copied.
    */
  def copyTo(bitmap: SoftwareBitmap): Unit = js.native
  /**
    * Copies the software bitmap pixel data into the specified IBuffer .
    * @param buffer The target buffer to which the pixel data will be copied.
    */
  def copyToBuffer(buffer: IBuffer): Unit = js.native
  /**
    * Gets a read-only representation of the SoftwareBitmap object.
    * @return A read-only representation of the SoftwareBitmap object.
    */
  def getReadOnlyView(): SoftwareBitmap = js.native
  /**
    * Gets a BitmapBuffer object that allows you to operate directly on the software bitmap's pixel data.
    * @param mode A value indicating the access mode of the returned buffer.
    * @return The buffer containing pixel data.
    */
  def lockBuffer(mode: BitmapBufferAccessMode): BitmapBuffer = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap")
@js.native
object SoftwareBitmap extends js.Object {
  /**
    * Converts an existing SoftwareBitmap to a SoftwareBitmap with a different pixel format.
    * @param source The software bitmap to convert.
    * @param format The pixel format of the new software bitmap.
    * @return The converted software bitmap.
    */
  def convert(source: SoftwareBitmap, format: BitmapPixelFormat): SoftwareBitmap = js.native
  /**
    * Converts an existing SoftwareBitmap to a SoftwareBitmap with a different pixel format or alpha mode.
    * @param source The software bitmap to convert.
    * @param format The pixel format of the new software bitmap.
    * @param alpha The alpha mode of the new software bitmap.
    * @return The converted software bitmap.
    */
  def convert(source: SoftwareBitmap, format: BitmapPixelFormat, alpha: BitmapAlphaMode): SoftwareBitmap = js.native
  /**
    * Creates a copy of the provided SoftwareBitmap object.
    * @param source The software bitmap to copy.
    * @return The newly created copy of the software bitmap.
    */
  def copy(source: SoftwareBitmap): SoftwareBitmap = js.native
  /**
    * Creates a new SoftwareBitmap by performing a deep copy of the provided buffer. Modifications to the data in the new SoftwareBitmap will not effect the buffer from which it was created.
    * @param source The source buffer from which the copy will be created.
    * @param format The pixel format of the software bitmap.
    * @param width The width of the software bitmap, in pixels.
    * @param height The height of the software bitmap, in pixels.
    * @return The new software bitmap.
    */
  def createCopyFromBuffer(source: IBuffer, format: BitmapPixelFormat, width: Double, height: Double): SoftwareBitmap = js.native
  /**
    * Creates a new SoftwareBitmap by performing a deep copy of the provided buffer. Modifications to the data in the new SoftwareBitmap will not effect the buffer from which it was created.
    * @param source The source buffer from which the copy will be created.
    * @param format The pixel format of the software bitmap.
    * @param width The width of the software bitmap, in pixels.
    * @param height The height of the software bitmap, in pixels.
    * @param alpha The alpha mode of the software bitmap.
    * @return The new software bitmap.
    */
  def createCopyFromBuffer(source: IBuffer, format: BitmapPixelFormat, width: Double, height: Double, alpha: BitmapAlphaMode): SoftwareBitmap = js.native
  /**
    * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
    * @param surface The source surface from which the copy will be created.
    * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
    */
  def createCopyFromSurfaceAsync(surface: IDirect3DSurface): IPromiseWithIAsyncOperation[SoftwareBitmap] = js.native
  /**
    * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
    * @param surface The source surface from which the copy will be created.
    * @param alpha The alpha mode of the software bitmap.
    * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
    */
  def createCopyFromSurfaceAsync(surface: IDirect3DSurface, alpha: BitmapAlphaMode): IPromiseWithIAsyncOperation[SoftwareBitmap] = js.native
}

