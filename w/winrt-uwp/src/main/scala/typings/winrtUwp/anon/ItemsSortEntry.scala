package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Storage.Search.SortEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsSortEntry extends js.Object {
  /** The sort entries in the collection that start at startIndex. */ var items: SortEntry = js.native
  /** The number of items retrieved. */ var returnValue: Double = js.native
}

object ItemsSortEntry {
  @scala.inline
  def apply(items: SortEntry, returnValue: Double): ItemsSortEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsSortEntry]
  }
  @scala.inline
  implicit class ItemsSortEntryOps[Self <: ItemsSortEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItems(value: SortEntry): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

