package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextNode
  extends StObject
     with Node
     with TemplateChildNode
     with TemplateTextChildNode {
  
  var content: String
  
  @JSName("type")
  var type_TextNode: `2`
}
object TextNode {
  
  inline def apply(content: String, loc: SourceLocation): TextNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(2)
    __obj.asInstanceOf[TextNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextNode] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setType(value: `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
