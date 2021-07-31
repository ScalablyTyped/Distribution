package typings.winrtUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
trait XboxLiveEndpointPairStateChangedEventArgs extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var newState: XboxLiveEndpointPairState
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var oldState: XboxLiveEndpointPairState
}
object XboxLiveEndpointPairStateChangedEventArgs {
  
  @scala.inline
  def apply(newState: XboxLiveEndpointPairState, oldState: XboxLiveEndpointPairState): XboxLiveEndpointPairStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveEndpointPairStateChangedEventArgs]
  }
  
  @scala.inline
  implicit class XboxLiveEndpointPairStateChangedEventArgsMutableBuilder[Self <: XboxLiveEndpointPairStateChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewState(value: XboxLiveEndpointPairState): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldState(value: XboxLiveEndpointPairState): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
  }
}
