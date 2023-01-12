package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteCommandParams
  extends StObject
     with WorkDoneProgressParams {
  
  /**
    * Arguments that the command should be invoked with.
    */
  var arguments: js.UndefOr[js.Array[LSPAny]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteCommandParams] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[LSPAny]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: LSPAny*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
