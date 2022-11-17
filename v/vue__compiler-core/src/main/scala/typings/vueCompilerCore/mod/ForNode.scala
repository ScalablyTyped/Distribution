package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForNode
  extends StObject
     with Node2 {
  
  var children: js.Array[TemplateChildNode]
  
  var codegenNode: js.UndefOr[ForCodegenNode] = js.undefined
  
  var keyAlias: js.UndefOr[ExpressionNode] = js.undefined
  
  var objectIndexAlias: js.UndefOr[ExpressionNode] = js.undefined
  
  var parseResult: ForParseResult
  
  var source: ExpressionNode
  
  @JSName("type")
  var type_ForNode: 11
  
  var valueAlias: js.UndefOr[ExpressionNode] = js.undefined
}
object ForNode {
  
  inline def apply(
    children: js.Array[TemplateChildNode],
    loc: SourceLocation,
    parseResult: ForParseResult,
    source: ExpressionNode
  ): ForNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parseResult = parseResult.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(11)
    __obj.asInstanceOf[ForNode]
  }
  
  extension [Self <: ForNode](x: Self) {
    
    inline def setChildren(value: js.Array[TemplateChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: TemplateChildNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCodegenNode(value: ForCodegenNode): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    inline def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    inline def setKeyAlias(value: ExpressionNode): Self = StObject.set(x, "keyAlias", value.asInstanceOf[js.Any])
    
    inline def setKeyAliasUndefined: Self = StObject.set(x, "keyAlias", js.undefined)
    
    inline def setObjectIndexAlias(value: ExpressionNode): Self = StObject.set(x, "objectIndexAlias", value.asInstanceOf[js.Any])
    
    inline def setObjectIndexAliasUndefined: Self = StObject.set(x, "objectIndexAlias", js.undefined)
    
    inline def setParseResult(value: ForParseResult): Self = StObject.set(x, "parseResult", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ExpressionNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: 11): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueAlias(value: ExpressionNode): Self = StObject.set(x, "valueAlias", value.asInstanceOf[js.Any])
    
    inline def setValueAliasUndefined: Self = StObject.set(x, "valueAlias", js.undefined)
  }
}
