package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Disassemble request; value of command field is 'disassemble'.
		Disassembles code stored at the provided location.
		Clients should only call this request if the corresponding capability `supportsDisassembleRequest` is true.
	*/
trait DisassembleRequest
  extends StObject
     with Request {
  
  // command: 'disassemble';
  @JSName("arguments")
  var arguments_DisassembleRequest: DisassembleArguments
}
object DisassembleRequest {
  
  inline def apply(
    arguments: DisassembleArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): DisassembleRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassembleRequest]
  }
  
  extension [Self <: DisassembleRequest](x: Self) {
    
    inline def setArguments(value: DisassembleArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
