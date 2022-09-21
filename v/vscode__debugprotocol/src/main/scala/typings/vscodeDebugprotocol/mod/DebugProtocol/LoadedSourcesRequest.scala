package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** LoadedSources request; value of command field is 'loadedSources'.
		Retrieves the set of all sources currently loaded by the debugged process.
		Clients should only call this request if the corresponding capability `supportsLoadedSourcesRequest` is true.
	*/
trait LoadedSourcesRequest
  extends StObject
     with Request {
  
  // command: 'loadedSources';
  @JSName("arguments")
  var arguments_LoadedSourcesRequest: js.UndefOr[LoadedSourcesArguments] = js.undefined
}
object LoadedSourcesRequest {
  
  inline def apply(command: String, seq: Double, `type`: request | response | event | String): LoadedSourcesRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadedSourcesRequest]
  }
  
  extension [Self <: LoadedSourcesRequest](x: Self) {
    
    inline def setArguments(value: LoadedSourcesArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
  }
}
