package typings.winrt.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemRemovedEventArgs extends js.Object {
  var removedEntry: AccessListEntry
}

object IItemRemovedEventArgs {
  @scala.inline
  def apply(removedEntry: AccessListEntry): IItemRemovedEventArgs = {
    val __obj = js.Dynamic.literal(removedEntry = removedEntry)
  
    __obj.asInstanceOf[IItemRemovedEventArgs]
  }
}

