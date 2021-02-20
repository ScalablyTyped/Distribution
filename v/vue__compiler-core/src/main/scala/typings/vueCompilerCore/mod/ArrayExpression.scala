package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`17`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayExpression
  extends JSChildNode
     with Node2 {
  
  var elements: js.Array[String | JSChildNode] = js.native
  
  @JSName("type")
  var type_ArrayExpression: `17` = js.native
}
object ArrayExpression {
  
  @scala.inline
  def apply(elements: js.Array[String | JSChildNode], loc: SourceLocation, `type`: `17`): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayExpression]
  }
  
  @scala.inline
  implicit class ArrayExpressionMutableBuilder[Self <: ArrayExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[String | JSChildNode]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: (String | JSChildNode)*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `17`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
