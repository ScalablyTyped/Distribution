package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.StorageNs.AccessCacheNs.AccessListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueAccessListEntry extends js.Object {
  /** The items in the collection that start at startIndex. */ var items: AccessListEntry
  /** The number of items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueAccessListEntry {
  @scala.inline
  def apply(items: AccessListEntry, returnValue: Double): Anon_ItemsReturnValueAccessListEntry = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueAccessListEntry]
  }
}

