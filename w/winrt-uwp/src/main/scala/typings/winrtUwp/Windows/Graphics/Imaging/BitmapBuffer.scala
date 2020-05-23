package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.IMemoryBufferReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the pixel data buffer of a bitmap. */
trait BitmapBuffer extends js.Object {
  /** Disposes of the object and associated resources. */
  def close(): Unit
  /**
    * Creates a reference to the underlying memory buffer.
    * @return A reference to the underlying memory buffer.
    */
  def createReference(): IMemoryBufferReference
  /**
    * Gets the number of bit planes in the bitmap buffer.
    * @return The number of bit planes in the bitmap buffer.
    */
  def getPlaneCount(): Double
  /**
    * Gets a BitmapPlaneDescription object that describes the size, offset, and stride of the bitmap data in the bit plane with the specified index.
    * @param index The index of the bit plane for which the description is retrieved.
    * @return The bit plane description.
    */
  def getPlaneDescription(index: Double): BitmapPlaneDescription
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
}

