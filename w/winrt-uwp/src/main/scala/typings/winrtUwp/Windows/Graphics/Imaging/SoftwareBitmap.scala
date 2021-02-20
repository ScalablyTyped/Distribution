package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an uncompressed bitmap. */
@js.native
trait SoftwareBitmap extends StObject {
  
  /** Gets the alpha mode of the software bitmap. */
  var bitmapAlphaMode: BitmapAlphaMode = js.native
  
  /** Gets the pixel format of the software bitmap. */
  var bitmapPixelFormat: BitmapPixelFormat = js.native
  
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
  
  /** Gets or sets the dots per inch of the software bitmap in the X direction. */
  var dpiX: Double = js.native
  
  /** Gets or sets the dots per inch of the software bitmap in the Y direction. */
  var dpiY: Double = js.native
  
  /**
    * Gets a read-only representation of the SoftwareBitmap object.
    * @return A read-only representation of the SoftwareBitmap object.
    */
  def getReadOnlyView(): SoftwareBitmap = js.native
  
  /** Gets a value indicating whether the software bitmap can be modified. */
  var isReadOnly: Boolean = js.native
  
  /**
    * Gets a BitmapBuffer object that allows you to operate directly on the software bitmap's pixel data.
    * @param mode A value indicating the access mode of the returned buffer.
    * @return The buffer containing pixel data.
    */
  def lockBuffer(mode: BitmapBufferAccessMode): BitmapBuffer = js.native
  
  /** Gets the height of the software bitmap, in pixels. */
  var pixelHeight: Double = js.native
  
  /** Gets the width of the software bitmap, in pixels. */
  var pixelWidth: Double = js.native
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
  
  @scala.inline
  implicit class SoftwareBitmapMutableBuilder[Self <: SoftwareBitmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitmapAlphaMode(value: BitmapAlphaMode): Self = StObject.set(x, "bitmapAlphaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitmapPixelFormat(value: BitmapPixelFormat): Self = StObject.set(x, "bitmapPixelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopyFromBuffer(value: IBuffer => Unit): Self = StObject.set(x, "copyFromBuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyTo(value: SoftwareBitmap => Unit): Self = StObject.set(x, "copyTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyToBuffer(value: IBuffer => Unit): Self = StObject.set(x, "copyToBuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDpiX(value: Double): Self = StObject.set(x, "dpiX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpiY(value: Double): Self = StObject.set(x, "dpiY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetReadOnlyView(value: () => SoftwareBitmap): Self = StObject.set(x, "getReadOnlyView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockBuffer(value: BitmapBufferAccessMode => BitmapBuffer): Self = StObject.set(x, "lockBuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPixelHeight(value: Double): Self = StObject.set(x, "pixelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelWidth(value: Double): Self = StObject.set(x, "pixelWidth", value.asInstanceOf[js.Any])
  }
}
