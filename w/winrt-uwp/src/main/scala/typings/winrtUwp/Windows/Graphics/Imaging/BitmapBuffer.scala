package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.IMemoryBufferReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the pixel data buffer of a bitmap. */
@js.native
trait BitmapBuffer extends StObject {
  
  /** Disposes of the object and associated resources. */
  def close(): Unit = js.native
  
  /**
    * Creates a reference to the underlying memory buffer.
    * @return A reference to the underlying memory buffer.
    */
  def createReference(): IMemoryBufferReference = js.native
  
  /**
    * Gets the number of bit planes in the bitmap buffer.
    * @return The number of bit planes in the bitmap buffer.
    */
  def getPlaneCount(): Double = js.native
  
  /**
    * Gets a BitmapPlaneDescription object that describes the size, offset, and stride of the bitmap data in the bit plane with the specified index.
    * @param index The index of the bit plane for which the description is retrieved.
    * @return The bit plane description.
    */
  def getPlaneDescription(index: Double): BitmapPlaneDescription = js.native
}
object BitmapBuffer {
  
  @scala.inline
  def apply(
    close: () => Unit,
    createReference: () => IMemoryBufferReference,
    getPlaneCount: () => Double,
    getPlaneDescription: Double => BitmapPlaneDescription
  ): BitmapBuffer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference), getPlaneCount = js.Any.fromFunction0(getPlaneCount), getPlaneDescription = js.Any.fromFunction1(getPlaneDescription))
    __obj.asInstanceOf[BitmapBuffer]
  }
  
  @scala.inline
  implicit class BitmapBufferMutableBuilder[Self <: BitmapBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateReference(value: () => IMemoryBufferReference): Self = StObject.set(x, "createReference", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlaneCount(value: () => Double): Self = StObject.set(x, "getPlaneCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlaneDescription(value: Double => BitmapPlaneDescription): Self = StObject.set(x, "getPlaneDescription", js.Any.fromFunction1(value))
  }
}
