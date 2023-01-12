package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `dataBreakpointInfo` request. */
trait DataBreakpointInfoArguments extends StObject {
  
  /** The name of the variable's child to obtain data breakpoint information for.
  			If variablesReference isn't provided, this can be an expression.
  		*/
  var name: String
  
  /** Reference to the Variable container if the data breakpoint is requested for a child of the container. */
  var variablesReference: js.UndefOr[Double] = js.undefined
}
object DataBreakpointInfoArguments {
  
  inline def apply(name: String): DataBreakpointInfoArguments = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBreakpointInfoArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataBreakpointInfoArguments] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVariablesReference(value: Double): Self = StObject.set(x, "variablesReference", value.asInstanceOf[js.Any])
    
    inline def setVariablesReferenceUndefined: Self = StObject.set(x, "variablesReference", js.undefined)
  }
}
