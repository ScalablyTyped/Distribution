package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.CollationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the set of character groups and the functionality to get the label for any given string. */
@JSGlobal("Windows.Globalization.Collation.CharacterGroupings")
@js.native
/** Create a CharacterGroupings object for the default collation. */
class CharacterGroupings ()
  extends stdLib.Array[CharacterGrouping] {
  /** Gets the number of CharacterGrouping objects in the set of character groups. */
  var size: scala.Double = js.native
  /**
    * Returns an iterator to enumerate the items in the set of character groups.
    * @return The iterator. The current position of the iterator is index 0, or the end of the set of character groups if the set is empty.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[CharacterGrouping] = js.native
  /**
    * Returns the CharacterGrouping at the specified index in the set of character groups.
    * @param index The zero-based index of the CharacterGrouping in the set to return.
    * @return The CharacterGrouping at the specified index.
    */
  def getAt(index: scala.Double): CharacterGrouping = js.native
  /**
    * Returns the CharacterGrouping objects that start at the specified index in the set of character groups.
    * @param startIndex The zero-based index of the start of the CharacterGrouping objects in the set to return.
    */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueCharacterGrouping = js.native
  def indexOf(value: CharacterGrouping, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Returns the index of a specified CharacterGrouping object in the set of character groups.
    * @param value The CharacterGrouping object to find in the set.
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: CharacterGrouping): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Gets the label under which the provided text falls.
    * @param text The string for which to get the label.
    * @return The first character grouping label that applies to the given text.
    */
  def lookup(text: java.lang.String): java.lang.String = js.native
}

