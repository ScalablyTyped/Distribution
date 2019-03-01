package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberSortEntry extends js.Object {
  /** The sort entries in the collection that start at startIndex. */ var items: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.SortEntry
  /** The number of items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueNumberSortEntry {
  @scala.inline
  def apply(items: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.SortEntry, returnValue: scala.Double): Anon_ItemsReturnValueNumberSortEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberSortEntry]
  }
}

