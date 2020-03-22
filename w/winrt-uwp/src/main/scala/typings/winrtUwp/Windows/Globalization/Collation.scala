package typings.winrtUwp.Windows.Globalization

import typings.std.Array
import typings.winrtUwp.AnonIndex
import typings.winrtUwp.AnonItemsCharacterGrouping
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides read-only lists of character groupings. */
@JSGlobal("Windows.Globalization.Collation")
@js.native
object Collation extends js.Object {
  /** A container for character group information. Characters are grouped in an index that enables an application to determine where the grouping boundaries are. */
  @js.native
  abstract class CharacterGrouping () extends js.Object {
    /** Gets the first item that appears in the grouping under this index. */
    var first: String = js.native
    /** Gets the label that is associated with this index. */
    var label: String = js.native
  }
  
  /** Contains the set of character groups and the functionality to get the label for any given string. */
  @js.native
  /** Create a CharacterGroupings object for the default collation. */
  class CharacterGroupings () extends Array[CharacterGrouping] {
    /** Gets the number of CharacterGrouping objects in the set of character groups. */
    var size: Double = js.native
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
    def getMany(startIndex: Double): AnonItemsCharacterGrouping = js.native
    def indexOf(value: CharacterGrouping, extra: js.Any*): AnonIndex = js.native
    /* hack */
    @JSName("indexOf")
    def indexOf_Double(searchElement: CharacterGrouping): Double = js.native
    /**
      * Gets the label under which the provided text falls.
      * @param text The string for which to get the label.
      * @return The first character grouping label that applies to the given text.
      */
    def lookup(text: String): String = js.native
  }
  
}

