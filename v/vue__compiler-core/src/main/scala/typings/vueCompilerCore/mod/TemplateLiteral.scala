package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`22`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateLiteral
  extends StObject
     with Node2
     with SSRCodegenNode {
  
  var elements: js.Array[String | JSChildNode]
  
  @JSName("type")
  var type_TemplateLiteral: `22`
}
object TemplateLiteral {
  
  inline def apply(elements: js.Array[String | JSChildNode], loc: SourceLocation): TemplateLiteral = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(22)
    __obj.asInstanceOf[TemplateLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateLiteral] (val x: Self) extends AnyVal {
    
    inline def setElements(value: js.Array[String | JSChildNode]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: (String | JSChildNode)*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setType(value: `22`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
