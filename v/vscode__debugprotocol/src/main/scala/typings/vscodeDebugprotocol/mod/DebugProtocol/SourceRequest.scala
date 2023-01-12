package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Source request; value of command field is 'source'.
		The request retrieves the source code for a given source reference.
	*/
trait SourceRequest
  extends StObject
     with Request {
  
  // command: 'source';
  @JSName("arguments")
  var arguments_SourceRequest: SourceArguments
}
object SourceRequest {
  
  inline def apply(
    arguments: SourceArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): SourceRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: SourceArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
