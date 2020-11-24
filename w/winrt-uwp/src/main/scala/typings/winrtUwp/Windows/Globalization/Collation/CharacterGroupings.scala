package typings.winrtUwp.Windows.Globalization.Collation

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsCharacterGrouping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the set of character groups and the functionality to get the label for any given string. */
@js.native
trait CharacterGroupings extends Array[CharacterGrouping] {
  
  /**
    * Returns an iterator to enumerate the items in the set of character groups.
    * @return The iterator. The current position of the iterator is index 0, or the end of the set of character groups if the set is empty.
    */
  def first(): IIterator[CharacterGrouping] = js.native
  
  /**
    * Returns the CharacterGrouping at the specified index in the set of character groups.
    * @param index The zero-based index of the CharacterGrouping in the set to return.
    * @return The CharacterGrouping at the specified index.
    */
  def getAt(index: Double): CharacterGrouping = js.native
  
  /**
    * Returns the CharacterGrouping objects that start at the specified index in the set of character groups.
    * @param startIndex The zero-based index of the start of the CharacterGrouping objects in the set to return.
    */
  def getMany(startIndex: Double): ItemsCharacterGrouping = js.native
  
  def indexOf(value: CharacterGrouping, extra: js.Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: CharacterGrouping): Double = js.native
  
  /**
    * Gets the label under which the provided text falls.
    * @param text The string for which to get the label.
    * @return The first character grouping label that applies to the given text.
    */
  def lookup(text: String): String = js.native
  
  /** Gets the number of CharacterGrouping objects in the set of character groups. */
  var size: Double = js.native
}
