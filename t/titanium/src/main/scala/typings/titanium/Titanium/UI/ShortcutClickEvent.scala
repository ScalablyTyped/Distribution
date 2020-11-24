package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a <Titanium.UI.ShortcutItem> was clicked on.
  */
@js.native
trait ShortcutClickEvent extends ShortcutBaseEvent {
  
  /**
    * The shortcut item clicked.
    */
  var item: ShortcutItem = js.native
}
object ShortcutClickEvent {
  
  @scala.inline
  def apply(item: ShortcutItem, source: Shortcut): ShortcutClickEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutClickEvent]
  }
  
  @scala.inline
  implicit class ShortcutClickEventOps[Self <: ShortcutClickEvent] (val x: Self) extends AnyVal {
    
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
    def setItem(value: ShortcutItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
}
