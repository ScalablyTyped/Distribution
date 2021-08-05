package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`17`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayExpression
  extends StObject
     with Node2
     with JSChildNode {
  
  var elements: js.Array[String | JSChildNode]
  
  @JSName("type")
  var type_ArrayExpression: `17`
}
object ArrayExpression {
  
  inline def apply(elements: js.Array[String | JSChildNode], loc: SourceLocation): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(17)
    __obj.asInstanceOf[ArrayExpression]
  }
  
  extension [Self <: ArrayExpression](x: Self) {
    
    inline def setElements(value: js.Array[String | JSChildNode]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: (String | JSChildNode)*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    inline def setType(value: `17`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
