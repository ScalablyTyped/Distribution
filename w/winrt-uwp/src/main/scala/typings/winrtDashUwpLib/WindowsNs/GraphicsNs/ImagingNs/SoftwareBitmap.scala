package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

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
  def this(format: BitmapPixelFormat, width: scala.Double, height: scala.Double) = this()
  /**
    * Initializes a new instance of the SoftwareBitmap class.
    * @param format The pixel format of the new software bitmap.
    * @param width The width of the new software bitmap, in pixels.
    * @param height The height of the new software bitmap, in pixels.
    * @param alpha The alpha mode of the new software bitmap.
    */
  def this(format: BitmapPixelFormat, width: scala.Double, height: scala.Double, alpha: BitmapAlphaMode) = this()
  /** Gets the alpha mode of the software bitmap. */
  var bitmapAlphaMode: BitmapAlphaMode = js.native
  /** Gets the pixel format of the software bitmap. */
  var bitmapPixelFormat: BitmapPixelFormat = js.native
  /** Gets or sets the dots per inch of the software bitmap in the X direction. */
  var dpiX: scala.Double = js.native
  /** Gets or sets the dots per inch of the software bitmap in the Y direction. */
  var dpiY: scala.Double = js.native
  /** Gets a value indicating whether the software bitmap can be modified. */
  var isReadOnly: scala.Boolean = js.native
  /** Gets the height of the software bitmap, in pixels. */
  var pixelHeight: scala.Double = js.native
  /** Gets the width of the software bitmap, in pixels. */
  var pixelWidth: scala.Double = js.native
  /** Disposes of the object and associated resources. */
  def close(): scala.Unit = js.native
  /**
    * Copies the pixel data from an IBuffer into the SoftwareBitmap .
    * @param buffer The buffer containing the pixel data to be copied.
    */
  def copyFromBuffer(buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): scala.Unit = js.native
  /**
    * Copies the current SoftwareBitmap into the provided SoftwareBitmap object.
    * @param bitmap The target software bitmap into which the data will be copied.
    */
  def copyTo(bitmap: SoftwareBitmap): scala.Unit = js.native
  /**
    * Copies the software bitmap pixel data into the specified IBuffer .
    * @param buffer The target buffer to which the pixel data will be copied.
    */
  def copyToBuffer(buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): scala.Unit = js.native
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

/** Represents an uncompressed bitmap. */
@JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap")
@js.native
object SoftwareBitmap extends js.Object {
  /**
    * Converts an existing SoftwareBitmap to a SoftwareBitmap with a different pixel format.
    * @param source The software bitmap to convert.
    * @param format The pixel format of the new software bitmap.
    * @return The converted software bitmap.
    */
  def convert(
    source: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap,
    format: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
  ): winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap = js.native
  /**
    * Converts an existing SoftwareBitmap to a SoftwareBitmap with a different pixel format or alpha mode.
    * @param source The software bitmap to convert.
    * @param format The pixel format of the new software bitmap.
    * @param alpha The alpha mode of the new software bitmap.
    * @return The converted software bitmap.
    */
  def convert(
    source: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap,
    format: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat,
    alpha: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode
  ): winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap = js.native
  /**
    * Creates a copy of the provided SoftwareBitmap object.
    * @param source The software bitmap to copy.
    * @return The newly created copy of the software bitmap.
    */
  def copy(source: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap): winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap = js.native
  /**
    * Creates a new SoftwareBitmap by performing a deep copy of the provided buffer. Modifications to the data in the new SoftwareBitmap will not effect the buffer from which it was created.
    * @param source The source buffer from which the copy will be created.
    * @param format The pixel format of the software bitmap.
    * @param width The width of the software bitmap, in pixels.
    * @param height The height of the software bitmap, in pixels.
    * @return The new software bitmap.
    */
  def createCopyFromBuffer(
    source: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    format: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat,
    width: scala.Double,
    height: scala.Double
  ): winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap = js.native
  /**
    * Creates a new SoftwareBitmap by performing a deep copy of the provided buffer. Modifications to the data in the new SoftwareBitmap will not effect the buffer from which it was created.
    * @param source The source buffer from which the copy will be created.
    * @param format The pixel format of the software bitmap.
    * @param width The width of the software bitmap, in pixels.
    * @param height The height of the software bitmap, in pixels.
    * @param alpha The alpha mode of the software bitmap.
    * @return The new software bitmap.
    */
  def createCopyFromBuffer(
    source: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    format: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat,
    width: scala.Double,
    height: scala.Double,
    alpha: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode
  ): winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap = js.native
  /**
    * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
    * @param surface The source surface from which the copy will be created.
    * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
    */
  def createCopyFromSurfaceAsync(surface: winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.IDirect3DSurface): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap] = js.native
  /**
    * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
    * @param surface The source surface from which the copy will be created.
    * @param alpha The alpha mode of the software bitmap.
    * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
    */
  def createCopyFromSurfaceAsync(
    surface: winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.IDirect3DSurface,
    alpha: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap] = js.native
}

