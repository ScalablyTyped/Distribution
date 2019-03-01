package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueAccessListEntry extends js.Object {
  var items: js.Array[winrtLib.WindowsNs.StorageNs.AccessCacheNs.AccessListEntry]
  var returnValue: scala.Double
}

object Anon_ItemsReturnValueAccessListEntry {
  @scala.inline
  def apply(
    items: js.Array[winrtLib.WindowsNs.StorageNs.AccessCacheNs.AccessListEntry],
    returnValue: scala.Double
  ): Anon_ItemsReturnValueAccessListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueAccessListEntry]
  }
}

