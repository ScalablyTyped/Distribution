package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
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
  implicit class AppAccessibilitychangedEventMutableBuilder[Self <: AppAccessibilitychangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
