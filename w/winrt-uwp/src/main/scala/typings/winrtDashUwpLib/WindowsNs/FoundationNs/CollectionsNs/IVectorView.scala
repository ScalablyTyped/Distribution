package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an immutable view into a vector. */
@js.native
trait IVectorView[T]
  extends stdLib.Array[T]
     with IIterable[T] {
  /** Gets the number of items in the vector view. */
  var size: scala.Double = js.native
  /**
    * Returns the item at the specified index in the vector view.
    * @param index The zero-based index of the item.
    * @return The item at the specified index.
    */
  def getAt(index: scala.Double): T = js.native
  /**
    * Retrieves the items that start at the specified index in the vector view.
    * @param startIndex The zero-based index of the start of the items in the vector view.
    */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueT[T] = js.native
  def indexOf(value: T, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Retrieves the index of a specified item in the vector view.
    * @param value The item to find in the vector view.
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: T): winrtDashUwpLib.Anon_Index = js.native
}

