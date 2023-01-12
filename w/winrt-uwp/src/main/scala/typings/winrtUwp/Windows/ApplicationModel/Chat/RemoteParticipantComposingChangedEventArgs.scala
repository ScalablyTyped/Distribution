package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data to the RemoteParticipantComposingChanged event. */
trait RemoteParticipantComposingChangedEventArgs extends StObject {
  
  /** Gets a Boolean value indicating if the remote participant is currently composing a message. */
  var isComposing: Boolean
  
  /** Gets the address of the remote chat participant. */
  var participantAddress: String
  
  /** Gets the ID for the message transport. */
  var transportId: String
}
object RemoteParticipantComposingChangedEventArgs {
  
  inline def apply(isComposing: Boolean, participantAddress: String, transportId: String): RemoteParticipantComposingChangedEventArgs = {
    val __obj = js.Dynamic.literal(isComposing = isComposing.asInstanceOf[js.Any], participantAddress = participantAddress.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteParticipantComposingChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteParticipantComposingChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    inline def setParticipantAddress(value: String): Self = StObject.set(x, "participantAddress", value.asInstanceOf[js.Any])
    
    inline def setTransportId(value: String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
  }
}
