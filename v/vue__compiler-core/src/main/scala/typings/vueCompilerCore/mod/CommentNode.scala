package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentNode
  extends StObject
     with Node
     with TemplateChildNode {
  
  var content: String
  
  @JSName("type")
  var type_CommentNode: `3`
}
object CommentNode {
  
  inline def apply(content: String, loc: SourceLocation): CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(3)
    __obj.asInstanceOf[CommentNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentNode] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setType(value: `3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
