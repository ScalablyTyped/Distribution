package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ReadMemory request; value of command field is 'readMemory'.
		Reads bytes from memory at the provided location.
		Clients should only call this request if the corresponding capability `supportsReadMemoryRequest` is true.
	*/
trait ReadMemoryRequest
  extends StObject
     with Request {
  
  // command: 'readMemory';
  @JSName("arguments")
  var arguments_ReadMemoryRequest: ReadMemoryArguments
}
object ReadMemoryRequest {
  
  inline def apply(
    arguments: ReadMemoryArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): ReadMemoryRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadMemoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadMemoryRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: ReadMemoryArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
