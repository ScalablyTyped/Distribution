package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired by the system when the device's accessibility service is turned on or off.
  */
@js.native
trait AppAccessibilitychangedEvent extends AppBaseEvent {
  
  /**
    * Whether accessibility is now enabled or disabled.
    */
  var enabled: Boolean = js.native
}
object AppAccessibilitychangedEvent {
  
  @scala.inline
  def apply(enabled: Boolean, source: App): AppAccessibilitychangedEvent = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppAccessibilitychangedEvent]
  }
  
  @scala.inline
  implicit class AppAccessibilitychangedEventOps[Self <: AppAccessibilitychangedEvent] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
}
