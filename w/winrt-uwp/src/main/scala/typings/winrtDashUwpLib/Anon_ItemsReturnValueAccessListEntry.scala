package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueAccessListEntry extends js.Object {
  /** The items in the collection that start at startIndex. */ var items: winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.AccessListEntry
  /** The number of items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueAccessListEntry {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.AccessListEntry,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueAccessListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueAccessListEntry]
  }
}

