package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base class of requests, responses, and events. */
trait ProtocolMessage extends StObject {
  
  /** Sequence number of the message (also known as message ID). The `seq` for the first message sent by a client or debug adapter is 1, and for each subsequent message is 1 greater than the previous message sent by that actor. `seq` can be used to order requests, responses, and events, and to associate requests with their corresponding responses. For protocol messages of type `request` the sequence number can be used to cancel the request. */
  var seq: Double
  
  /** Message type.
  			Values: 'request', 'response', 'event', etc.
  		*/
  var `type`: request | response | event | String
}
object ProtocolMessage {
  
  inline def apply(seq: Double, `type`: request | response | event | String): ProtocolMessage = {
    val __obj = js.Dynamic.literal(seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtocolMessage] (val x: Self) extends AnyVal {
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setType(value: request | response | event | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
