package typings.winrtUwp

import typings.winrtUwp.Windows.Storage.AccessCache.AccessListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsAccessListEntry extends js.Object {
  /** The items in the collection that start at startIndex. */ var items: AccessListEntry
  /** The number of items retrieved. */ var returnValue: Double
}

object AnonItemsAccessListEntry {
  @scala.inline
  def apply(items: AccessListEntry, returnValue: Double): AnonItemsAccessListEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsAccessListEntry]
  }
}

