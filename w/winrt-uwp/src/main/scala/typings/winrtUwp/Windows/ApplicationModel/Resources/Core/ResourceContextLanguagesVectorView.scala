package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of ResourceContext language qualifiers. */
@js.native
trait ResourceContextLanguagesVectorView extends Array[String] {
  /** Gets the number of ResourceContext language qualifiers in the set. */
  var size: Double = js.native
  /**
    * Returns an iterator to enumerate the items in the set of ResourceContext language qualifiers.
    * @return The iterator. The current position of the iterator is index 0, or the end of the set if the set is empty.
    */
  def first(): IIterator[String] = js.native
  /**
    * Returns the ResourceContext language qualifier at the specified index in the set.
    * @param index The zero-based index of the ResourceContext language qualifier in the set to return.
    * @return The ResourceContext language qualifier at the specified index.
    */
  def getAt(index: Double): String = js.native
  /**
    * Returns the ResourceContext language qualifiers that start at the specified index in the set.
    * @param startIndex The zero-based index of the start of the ResourceContext language qualifiers in the set to return.
    */
  def getMany(startIndex: Double): ItemsArray = js.native
  def indexOf(value: String, extra: js.Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: String): Double = js.native
}

