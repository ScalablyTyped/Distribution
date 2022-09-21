package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ConfigurationDone request; value of command field is 'configurationDone'.
		This request indicates that the client has finished initialization of the debug adapter.
		So it is the last request in the sequence of configuration requests (which was started by the `initialized` event).
		Clients should only call this request if the corresponding capability `supportsConfigurationDoneRequest` is true.
	*/
trait ConfigurationDoneRequest
  extends StObject
     with Request {
  
  // command: 'configurationDone';
  @JSName("arguments")
  var arguments_ConfigurationDoneRequest: js.UndefOr[ConfigurationDoneArguments] = js.undefined
}
object ConfigurationDoneRequest {
  
  inline def apply(command: String, seq: Double, `type`: request | response | event | String): ConfigurationDoneRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationDoneRequest]
  }
  
  extension [Self <: ConfigurationDoneRequest](x: Self) {
    
    inline def setArguments(value: ConfigurationDoneArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
  }
}
