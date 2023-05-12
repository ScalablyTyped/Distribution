package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `dataBreakpointInfo` request. */
trait DataBreakpointInfoArguments extends StObject {
  
  /** When `name` is an expression, evaluate it in the scope of this stack frame. If not specified, the expression is evaluated in the global scope. When `variablesReference` is specified, this property has no effect. */
  var frameId: js.UndefOr[Double] = js.undefined
  
  /** The name of the variable's child to obtain data breakpoint information for.
  			If `variablesReference` isn't specified, this can be an expression.
  		*/
  var name: String
  
  /** Reference to the variable container if the data breakpoint is requested for a child of the container. The `variablesReference` must have been obtained in the current suspended state. See 'Lifetime of Object References' in the Overview section for details. */
  var variablesReference: js.UndefOr[Double] = js.undefined
}
object DataBreakpointInfoArguments {
  
  inline def apply(name: String): DataBreakpointInfoArguments = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBreakpointInfoArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataBreakpointInfoArguments] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVariablesReference(value: Double): Self = StObject.set(x, "variablesReference", value.asInstanceOf[js.Any])
    
    inline def setVariablesReferenceUndefined: Self = StObject.set(x, "variablesReference", js.undefined)
  }
}
