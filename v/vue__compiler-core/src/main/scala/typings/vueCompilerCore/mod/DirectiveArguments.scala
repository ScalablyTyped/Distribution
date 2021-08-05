package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveArguments
  extends StObject
     with ArrayExpression {
  
  @JSName("elements")
  var elements_DirectiveArguments: js.Array[DirectiveArgumentNode]
}
object DirectiveArguments {
  
  inline def apply(elements: js.Array[DirectiveArgumentNode], loc: SourceLocation): DirectiveArguments = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(17)
    __obj.asInstanceOf[DirectiveArguments]
  }
  
  extension [Self <: DirectiveArguments](x: Self) {
    
    inline def setElements(value: js.Array[DirectiveArgumentNode]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: DirectiveArgumentNode*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
