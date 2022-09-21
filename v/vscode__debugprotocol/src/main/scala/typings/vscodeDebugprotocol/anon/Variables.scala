package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.mod.DebugProtocol.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variables extends StObject {
  
  /** All (or a range) of variables for the given variable reference. */
  var variables: js.Array[Variable]
}
object Variables {
  
  inline def apply(variables: js.Array[Variable]): Variables = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variables]
  }
  
  extension [Self <: Variables](x: Self) {
    
    inline def setVariables(value: js.Array[Variable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
