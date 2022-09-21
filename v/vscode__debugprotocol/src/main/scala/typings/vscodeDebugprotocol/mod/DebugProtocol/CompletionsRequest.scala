package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Completions request; value of command field is 'completions'.
		Returns a list of possible completions for a given caret position and text.
		Clients should only call this request if the corresponding capability `supportsCompletionsRequest` is true.
	*/
trait CompletionsRequest
  extends StObject
     with Request {
  
  // command: 'completions';
  @JSName("arguments")
  var arguments_CompletionsRequest: CompletionsArguments
}
object CompletionsRequest {
  
  inline def apply(
    arguments: CompletionsArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): CompletionsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionsRequest]
  }
  
  extension [Self <: CompletionsRequest](x: Self) {
    
    inline def setArguments(value: CompletionsArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
