package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompoundExpressionNode
  extends StObject
     with Node2
     with ExpressionNode
     with TemplateChildNode
     with TemplateTextChildNode {
  
  var children: js.Array[
    SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
  ]
  
  /**
    * an expression parsed as the params of a function will track
    * the identifiers declared inside the function body.
    */
  var identifiers: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("type")
  var type_CompoundExpressionNode: `8`
}
object CompoundExpressionNode {
  
  inline def apply(
    children: js.Array[
      SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation
  ): CompoundExpressionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(8)
    __obj.asInstanceOf[CompoundExpressionNode]
  }
  
  extension [Self <: CompoundExpressionNode](x: Self) {
    
    inline def setChildren(
      value: js.Array[
          SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(
      value: (SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol)*
    ): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setIdentifiers(value: js.Array[String]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
    
    inline def setIdentifiersVarargs(value: String*): Self = StObject.set(x, "identifiers", js.Array(value :_*))
    
    inline def setType(value: `8`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
