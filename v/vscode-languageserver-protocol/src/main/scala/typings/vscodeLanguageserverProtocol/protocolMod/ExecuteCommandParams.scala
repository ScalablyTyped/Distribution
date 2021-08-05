package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteCommandParams
  extends StObject
     with WorkDoneProgressParams {
  
  /**
    * Arguments that the command should be invoked with.
    */
  var arguments: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * The identifier of the actual command handler.
    */
  var command: String
}
object ExecuteCommandParams {
  
  inline def apply(command: String): ExecuteCommandParams = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteCommandParams]
  }
  
  extension [Self <: ExecuteCommandParams](x: Self) {
    
    inline def setArguments(value: js.Array[js.Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
