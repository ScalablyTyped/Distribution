package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SystemMediaTransportControls.ButtonPressed event. */
trait SystemMediaTransportControlsButtonPressedEventArgs extends StObject {
  
  /** Gets the button on the SystemMediaTransportControls that was pressed. */
  var button: SystemMediaTransportControlsButton
}
object SystemMediaTransportControlsButtonPressedEventArgs {
  
  inline def apply(button: SystemMediaTransportControlsButton): SystemMediaTransportControlsButtonPressedEventArgs = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsButtonPressedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemMediaTransportControlsButtonPressedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setButton(value: SystemMediaTransportControlsButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
  }
}
