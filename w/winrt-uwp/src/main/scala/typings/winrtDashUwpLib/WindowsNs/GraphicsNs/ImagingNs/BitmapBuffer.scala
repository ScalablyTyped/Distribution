package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the pixel data buffer of a bitmap. */
@JSGlobal("Windows.Graphics.Imaging.BitmapBuffer")
@js.native
abstract class BitmapBuffer () extends js.Object {
  /** Disposes of the object and associated resources. */
  def close(): scala.Unit = js.native
  /**
    * Creates a reference to the underlying memory buffer.
    * @return A reference to the underlying memory buffer.
    */
  def createReference(): winrtDashUwpLib.WindowsNs.FoundationNs.IMemoryBufferReference = js.native
  /**
    * Gets the number of bit planes in the bitmap buffer.
    * @return The number of bit planes in the bitmap buffer.
    */
  def getPlaneCount(): scala.Double = js.native
  /**
    * Gets a BitmapPlaneDescription object that describes the size, offset, and stride of the bitmap data in the bit plane with the specified index.
    * @param index The index of the bit plane for which the description is retrieved.
    * @return The bit plane description.
    */
  def getPlaneDescription(index: scala.Double): BitmapPlaneDescription = js.native
}

