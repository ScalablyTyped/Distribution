package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Storage.Search.SortEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsSortEntry extends js.Object {
  /** The sort entries in the collection that start at startIndex. */ var items: SortEntry
  /** The number of items retrieved. */ var returnValue: Double
}

object ItemsSortEntry {
  @scala.inline
  def apply(items: SortEntry, returnValue: Double): ItemsSortEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsSortEntry]
  }
}

