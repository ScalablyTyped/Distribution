package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.attach
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.launch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `startDebugging` request. */
trait StartDebuggingRequestArguments extends StObject {
  
  /** Arguments passed to the new debug session. The arguments must only contain properties understood by the `launch` or `attach` requests of the debug adapter and they must not contain any client-specific properties (e.g. `type`) or client-specific features (e.g. substitutable 'variables'). */
  var configuration: StringDictionary[Any]
  
  /** Indicates whether the new debug session should be started with a `launch` or `attach` request. */
  var request: launch | attach
}
object StartDebuggingRequestArguments {
  
  inline def apply(configuration: StringDictionary[Any], request: launch | attach): StartDebuggingRequestArguments = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDebuggingRequestArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDebuggingRequestArguments] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: StringDictionary[Any]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: launch | attach): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
