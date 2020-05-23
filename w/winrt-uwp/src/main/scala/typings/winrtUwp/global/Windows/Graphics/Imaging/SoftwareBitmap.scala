package typings.winrtUwp.global.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an uncompressed bitmap. */
@JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap")
@js.native
class SoftwareBitmap protected ()
  extends typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap {
  /**
    * Initializes a new instance of the SoftwareBitmap class.
    * @param format The pixel format of the new software bitmap.
    * @param width The width of the new software bitmap, in pixels.
    * @param height The height of the new software bitmap, in pixels.
    */
  def this(format: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat, width: Double, height: Double) = this()
  /**
    * Initializes a new instance of the SoftwareBitmap class.
    * @param format The pixel format of the new software bitmap.
    * @param width The width of the new software bitmap, in pixels.
    * @param height The height of the new software bitmap, in pixels.
    * @param alpha The alpha mode of the new software bitmap.
    */
  def this(
    format: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat,
    width: Double,
    height: Double,
    alpha: typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
  ) = this()
  /** Gets the alpha mode of the software bitmap. */
  /* CompleteClass */
  override var bitmapAlphaMode: typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode = js.native
  /** Gets the pixel format of the software bitmap. */
  /* CompleteClass */
  override var bitmapPixelFormat: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat = js.native
  /** Gets or sets the dots per inch of the software bitmap in the X direction. */
  /* CompleteClass */
  override var dpiX: Double = js.native
  /** Gets or sets the dots per inch of the software bitmap in the Y direction. */
  /* CompleteClass */
  override var dpiY: Double = js.native
  /** Gets a value indicating whether the software bitmap can be modified. */
  /* CompleteClass */
  override var isReadOnly: Boolean = js.native
  /** Gets the height of the software bitmap, in pixels. */
  /* CompleteClass */
  override var pixelHeight: Double = js.native
  /** Gets the width of the software bitmap, in pixels. */
  /* CompleteClass */
  override var pixelWidth: Double = js.native
  /** Disposes of the object and associated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Copies the pixel data from an IBuffer into the SoftwareBitmap .
    * @param buffer The buffer containing the pixel data to be copied.
    */
  /* CompleteClass */
  override def copyFromBuffer(buffer: IBuffer): Unit = js.native
  /**
    * Copies the current SoftwareBitmap into the provided SoftwareBitmap object.
    * @param bitmap The target software bitmap into which the data will be copied.
    */
  /* CompleteClass */
  override def copyTo(bitmap: typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap): Unit = js.native
  /**
    * Copies the software bitmap pixel data into the specified IBuffer .
    * @param buffer The target buffer to which the pixel data will be copied.
    */
  /* CompleteClass */
  override def copyToBuffer(buffer: IBuffer): Unit = js.native
  /**
    * Gets a read-only representation of the SoftwareBitmap object.
    * @return A read-only representation of the SoftwareBitmap object.
    */
  /* CompleteClass */
  override def getReadOnlyView(): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
  /**
    * Gets a BitmapBuffer object that allows you to operate directly on the software bitmap's pixel data.
    * @param mode A value indicating the access mode of the returned buffer.
    * @return The buffer containing pixel data.
    */
  /* CompleteClass */
  override def lockBuffer(mode: typings.winrtUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode): typings.winrtUwp.Windows.Graphics.Imaging.BitmapBuffer = js.native
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
  def convert(
    source: typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap,
    format: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
  ): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
  /**
    * Converts an existing SoftwareBitmap to a SoftwareBitmap with a different pixel format or alpha mode.
    * @param source The software bitmap to convert.
    * @param format The pixel format of the new software bitmap.
    * @param alpha The alpha mode of the new software bitmap.
    * @return The converted software bitmap.
    */
  def convert(
    source: typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap,
    format: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat,
    alpha: typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
  ): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
  /**
    * Creates a copy of the provided SoftwareBitmap object.
    * @param source The software bitmap to copy.
    * @return The newly created copy of the software bitmap.
    */
  def copy(source: typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
  /**
    * Creates a new SoftwareBitmap by performing a deep copy of the provided buffer. Modifications to the data in the new SoftwareBitmap will not effect the buffer from which it was created.
    * @param source The source buffer from which the copy will be created.
    * @param format The pixel format of the software bitmap.
    * @param width The width of the software bitmap, in pixels.
    * @param height The height of the software bitmap, in pixels.
    * @return The new software bitmap.
    */
  def createCopyFromBuffer(
    source: IBuffer,
    format: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat,
    width: Double,
    height: Double
  ): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
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
    source: IBuffer,
    format: typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat,
    width: Double,
    height: Double,
    alpha: typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
  ): typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
  /**
    * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
    * @param surface The source surface from which the copy will be created.
    * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
    */
  def createCopyFromSurfaceAsync(surface: IDirect3DSurface): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap] = js.native
  /**
    * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
    * @param surface The source surface from which the copy will be created.
    * @param alpha The alpha mode of the software bitmap.
    * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
    */
  def createCopyFromSurfaceAsync(surface: IDirect3DSurface, alpha: typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap] = js.native
}

