package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`12`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextCallNode
  extends StObject
     with Node2
     with TemplateChildNode {
  
  var codegenNode: CallExpression | SimpleExpressionNode
  
  var content: TextNode | InterpolationNode | CompoundExpressionNode
  
  @JSName("type")
  var type_TextCallNode: `12`
}
object TextCallNode {
  
  inline def apply(
    codegenNode: CallExpression | SimpleExpressionNode,
    content: TextNode | InterpolationNode | CompoundExpressionNode,
    loc: SourceLocation
  ): TextCallNode = {
    val __obj = js.Dynamic.literal(codegenNode = codegenNode.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(12)
    __obj.asInstanceOf[TextCallNode]
  }
  
  extension [Self <: TextCallNode](x: Self) {
    
    inline def setCodegenNode(value: CallExpression | SimpleExpressionNode): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    inline def setContent(value: TextNode | InterpolationNode | CompoundExpressionNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setType(value: `12`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
