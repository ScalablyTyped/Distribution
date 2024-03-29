package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`17`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayExpression
  extends StObject
     with Node
     with JSChildNode {
  
  var elements: js.Array[String | Node]
  
  @JSName("type")
  var type_ArrayExpression: `17`
}
object ArrayExpression {
  
  inline def apply(elements: js.Array[String | Node], loc: SourceLocation): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(17)
    __obj.asInstanceOf[ArrayExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayExpression] (val x: Self) extends AnyVal {
    
    inline def setElements(value: js.Array[String | Node]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: (String | Node)*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setType(value: `17`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
