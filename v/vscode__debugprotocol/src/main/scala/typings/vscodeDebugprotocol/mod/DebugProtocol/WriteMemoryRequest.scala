package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** WriteMemory request; value of command field is 'writeMemory'.
		Writes bytes to memory at the provided location.
		Clients should only call this request if the corresponding capability `supportsWriteMemoryRequest` is true.
	*/
trait WriteMemoryRequest
  extends StObject
     with Request {
  
  // command: 'writeMemory';
  @JSName("arguments")
  var arguments_WriteMemoryRequest: WriteMemoryArguments
}
object WriteMemoryRequest {
  
  inline def apply(
    arguments: WriteMemoryArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): WriteMemoryRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteMemoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteMemoryRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: WriteMemoryArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
