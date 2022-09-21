package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Scopes request; value of command field is 'scopes'.
		The request returns the variable scopes for a given stackframe ID.
	*/
trait ScopesRequest
  extends StObject
     with Request {
  
  // command: 'scopes';
  @JSName("arguments")
  var arguments_ScopesRequest: ScopesArguments
}
object ScopesRequest {
  
  inline def apply(
    arguments: ScopesArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): ScopesRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopesRequest]
  }
  
  extension [Self <: ScopesRequest](x: Self) {
    
    inline def setArguments(value: ScopesArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
