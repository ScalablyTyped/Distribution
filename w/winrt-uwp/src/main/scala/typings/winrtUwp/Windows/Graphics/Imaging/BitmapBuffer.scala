package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.IMemoryBufferReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the pixel data buffer of a bitmap. */
@js.native
trait BitmapBuffer extends js.Object {
  
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
  implicit class BitmapBufferOps[Self <: BitmapBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateReference(value: () => IMemoryBufferReference): Self = this.set("createReference", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlaneCount(value: () => Double): Self = this.set("getPlaneCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlaneDescription(value: Double => BitmapPlaneDescription): Self = this.set("getPlaneDescription", js.Any.fromFunction1(value))
  }
}
