package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Devices.MediaCaptureFocusState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the FocusChanged event. */
trait MediaCaptureFocusChangedEventArgs extends StObject {
  
  /** Gets the current focus state of the capture device. */
  var focusState: MediaCaptureFocusState
}
object MediaCaptureFocusChangedEventArgs {
  
  inline def apply(focusState: MediaCaptureFocusState): MediaCaptureFocusChangedEventArgs = {
    val __obj = js.Dynamic.literal(focusState = focusState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureFocusChangedEventArgs]
  }
  
  extension [Self <: MediaCaptureFocusChangedEventArgs](x: Self) {
    
    inline def setFocusState(value: MediaCaptureFocusState): Self = StObject.set(x, "focusState", value.asInstanceOf[js.Any])
  }
}
