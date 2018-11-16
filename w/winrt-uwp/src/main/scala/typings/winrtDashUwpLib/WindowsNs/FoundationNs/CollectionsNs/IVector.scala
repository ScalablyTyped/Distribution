package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a random-access collection of elements. */
@js.native
trait IVector[T]
  extends stdLib.Array[T]
     with IIterable[T] {
  /** Gets the number of items in the vector. */
  var size: scala.Double = js.native
  /**
                   * Appends an item to the end of the vector.
                   * @param value The item to append to the vector.
                   */
  def append(value: T): scala.Unit = js.native
  /** Removes all items from the vector. */
  def clear(): scala.Unit = js.native
  /**
                   * Returns the item at the specified index in the vector.
                   * @param index The zero-based index of the item.
                   * @return The item at the specified index.
                   */
  def getAt(index: scala.Double): T = js.native
  /**
                   * Retrieves the items that start at the specified index in the vector.
                   * @param startIndex The zero-based index of the start of the items in the vector.
                   */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueT[T] = js.native
  /**
                   * Returns an immutable view of the vector.
                   * @return The view of the vector.
                   */
  def getView(): IVectorView[T] = js.native
  def indexOf(value: T, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
                   * Retrieves the index of a specified item in the vector.
                   * @param value The item to find in the vector.
                   */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: T): winrtDashUwpLib.Anon_Index = js.native
  /**
                   * Inserts an item at a specified index in the vector.
                   * @param index The zero-based index.
                   * @param value The item to insert.
                   */
  def insertAt(index: scala.Double, value: T): scala.Unit = js.native
  /**
                   * Removes the item at the specified index in the vector.
                   * @param index The zero-based index of the vector item to remove.
                   */
  def removeAt(index: scala.Double): scala.Unit = js.native
  /** Removes the last item from the vector. */
  def removeAtEnd(): scala.Unit = js.native
  /**
                   * Replaces all the items in the vector with the specified items.
                   * @param items The collection of items to add to the vector.
                   */
  def replaceAll(items: T): scala.Unit = js.native
  /**
                   * Sets the value at the specified index in the vector.
                   * @param index The zero-based index at which to set the value.
                   * @param value The item to set.
                   */
  def setAt(index: scala.Double, value: T): scala.Unit = js.native
}

