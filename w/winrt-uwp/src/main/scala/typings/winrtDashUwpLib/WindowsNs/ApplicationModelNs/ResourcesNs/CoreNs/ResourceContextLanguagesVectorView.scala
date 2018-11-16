package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of ResourceContext language qualifiers. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView")
@js.native
abstract class ResourceContextLanguagesVectorView ()
  extends stdLib.Array[java.lang.String] {
  /** Gets the number of ResourceContext language qualifiers in the set. */
  var size: scala.Double = js.native
  /**
                       * Returns an iterator to enumerate the items in the set of ResourceContext language qualifiers.
                       * @return The iterator. The current position of the iterator is index 0, or the end of the set if the set is empty.
                       */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[java.lang.String] = js.native
  /**
                       * Returns the ResourceContext language qualifier at the specified index in the set.
                       * @param index The zero-based index of the ResourceContext language qualifier in the set to return.
                       * @return The ResourceContext language qualifier at the specified index.
                       */
  def getAt(index: scala.Double): java.lang.String = js.native
  /**
                       * Returns the ResourceContext language qualifiers that start at the specified index in the set.
                       * @param startIndex The zero-based index of the start of the ResourceContext language qualifiers in the set to return.
                       */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueArray = js.native
  def indexOf(value: java.lang.String, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
                       * Returns the index of a specified ResourceContext language qualifier in the set.
                       * @param value The ResourceContext language qualifier to find in the set.
                       */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: java.lang.String): winrtDashUwpLib.Anon_Index = js.native
}

