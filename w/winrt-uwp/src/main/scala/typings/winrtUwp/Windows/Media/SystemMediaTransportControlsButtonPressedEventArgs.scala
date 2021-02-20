package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SystemMediaTransportControls.ButtonPressed event. */
@js.native
trait SystemMediaTransportControlsButtonPressedEventArgs extends StObject {
  
  /** Gets the button on the SystemMediaTransportControls that was pressed. */
  var button: SystemMediaTransportControlsButton = js.native
}
object SystemMediaTransportControlsButtonPressedEventArgs {
  
  @scala.inline
  def apply(button: SystemMediaTransportControlsButton): SystemMediaTransportControlsButtonPressedEventArgs = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsButtonPressedEventArgs]
  }
  
  @scala.inline
  implicit class SystemMediaTransportControlsButtonPressedEventArgsMutableBuilder[Self <: SystemMediaTransportControlsButtonPressedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: SystemMediaTransportControlsButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
  }
}
