package typings.winrtUwp.Windows.Storage.AccessCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data about an ItemRemoved event. */
@js.native
trait ItemRemovedEventArgs extends js.Object {
  
  /** Gets information about the StorageFile or StorageFolder that was removed from the StorageItemMostRecentlyUsedList . */
  var removedEntry: AccessListEntry = js.native
}
object ItemRemovedEventArgs {
  
  @scala.inline
  def apply(removedEntry: AccessListEntry): ItemRemovedEventArgs = {
    val __obj = js.Dynamic.literal(removedEntry = removedEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRemovedEventArgs]
  }
  
  @scala.inline
  implicit class ItemRemovedEventArgsOps[Self <: ItemRemovedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRemovedEntry(value: AccessListEntry): Self = this.set("removedEntry", value.asInstanceOf[js.Any])
  }
}
