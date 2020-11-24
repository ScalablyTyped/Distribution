package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a <Titanium.UI.ShortcutItem> is clicked.
  */
@js.native
trait AppShortcutitemclickEvent extends AppBaseEvent {
  
  /**
    * Identifier of the clicked shortcut item.
    */
  var id: String = js.native
}
object AppShortcutitemclickEvent {
  
  @scala.inline
  def apply(id: String, source: App): AppShortcutitemclickEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppShortcutitemclickEvent]
  }
  
  @scala.inline
  implicit class AppShortcutitemclickEventOps[Self <: AppShortcutitemclickEvent] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
