package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`22`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateLiteral
  extends SSRCodegenNode
     with Node2 {
  
  var elements: js.Array[String | JSChildNode] = js.native
  
  @JSName("type")
  var type_TemplateLiteral: `22` = js.native
}
object TemplateLiteral {
  
  @scala.inline
  def apply(elements: js.Array[String | JSChildNode], loc: SourceLocation, `type`: `22`): TemplateLiteral = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLiteral]
  }
  
  @scala.inline
  implicit class TemplateLiteralMutableBuilder[Self <: TemplateLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[String | JSChildNode]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: (String | JSChildNode)*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `22`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
