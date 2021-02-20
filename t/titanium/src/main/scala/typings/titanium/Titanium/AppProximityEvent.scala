package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the proximity sensor changes state.
  */
@js.native
trait AppProximityEvent extends AppBaseEvent {
  
  /**
    * Proximity state value.
    */
  var state: Boolean = js.native
}
object AppProximityEvent {
  
  @scala.inline
  def apply(source: App, state: Boolean): AppProximityEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppProximityEvent]
  }
  
  @scala.inline
  implicit class AppProximityEventMutableBuilder[Self <: AppProximityEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
