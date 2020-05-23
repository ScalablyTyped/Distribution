package typings.winrtUwp.Windows.Storage.AccessCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about an ItemRemoved event. */
trait ItemRemovedEventArgs extends js.Object {
  /** Gets information about the StorageFile or StorageFolder that was removed from the StorageItemMostRecentlyUsedList . */
  var removedEntry: AccessListEntry
}

object ItemRemovedEventArgs {
  @scala.inline
  def apply(removedEntry: AccessListEntry): ItemRemovedEventArgs = {
    val __obj = js.Dynamic.literal(removedEntry = removedEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRemovedEventArgs]
  }
}

