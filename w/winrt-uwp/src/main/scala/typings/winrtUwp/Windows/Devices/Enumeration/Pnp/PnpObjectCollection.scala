package typings.winrtUwp.Windows.Devices.Enumeration.Pnp

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsPnpObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an iterable collection of Pnp device objects. */
@js.native
trait PnpObjectCollection extends Array[PnpObject] {
  /** Returns the number of items in the collection. */
  var size: Double = js.native
  /**
    * Returns the iterator for iteration over the items in the collection.
    * @return The iterator object. The iterator's current position is at the 0-index position, or at the end of the collection if the collection is empty.
    */
  def first(): IIterator[PnpObject] = js.native
  /**
    * Returns the PnpObject located at the specified index.
    * @param index The integer index for the value to retrieve.
    * @return The PnpObject at the specified index.
    */
  def getAt(index: Double): PnpObject = js.native
  /**
    * Retrieves multiple elements in a single pass through the iterator.
    * @param startIndex The index from which to start retrieval.
    */
  def getMany(startIndex: Double): ItemsPnpObject = js.native
  def indexOf(value: PnpObject, extra: js.Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: PnpObject): Double = js.native
}

