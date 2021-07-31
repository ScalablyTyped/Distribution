package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AutoRepeatModeChangeRequested event. */
trait AutoRepeatModeChangeRequestedEventArgs extends StObject {
  
  /** Gets a value indicating the requested auto-repeat mode. */
  var requestedAutoRepeatMode: MediaPlaybackAutoRepeatMode
}
object AutoRepeatModeChangeRequestedEventArgs {
  
  @scala.inline
  def apply(requestedAutoRepeatMode: MediaPlaybackAutoRepeatMode): AutoRepeatModeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedAutoRepeatMode = requestedAutoRepeatMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRepeatModeChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class AutoRepeatModeChangeRequestedEventArgsMutableBuilder[Self <: AutoRepeatModeChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestedAutoRepeatMode(value: MediaPlaybackAutoRepeatMode): Self = StObject.set(x, "requestedAutoRepeatMode", value.asInstanceOf[js.Any])
  }
}
