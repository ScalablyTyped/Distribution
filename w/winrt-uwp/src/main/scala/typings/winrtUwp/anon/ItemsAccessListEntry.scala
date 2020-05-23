package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Storage.AccessCache.AccessListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsAccessListEntry extends js.Object {
  /** The items in the collection that start at startIndex. */ var items: AccessListEntry
  /** The number of items retrieved. */ var returnValue: Double
}

object ItemsAccessListEntry {
  @scala.inline
  def apply(items: AccessListEntry, returnValue: Double): ItemsAccessListEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsAccessListEntry]
  }
}

