package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompoundExpressionNode
  extends ExpressionNode
     with Node2
     with TemplateChildNode
     with TemplateTextChildNode {
  
  var children: js.Array[
    SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
  ] = js.native
  
  /**
    * an expression parsed as the params of a function will track
    * the identifiers declared inside the function body.
    */
  var identifiers: js.UndefOr[js.Array[String]] = js.native
  
  @JSName("type")
  var type_CompoundExpressionNode: `8` = js.native
}
object CompoundExpressionNode {
  
  @scala.inline
  def apply(
    children: js.Array[
      SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation,
    `type`: `8`
  ): CompoundExpressionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompoundExpressionNode]
  }
  
  @scala.inline
  implicit class CompoundExpressionNodeMutableBuilder[Self <: CompoundExpressionNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: js.Array[
          SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(
      value: (SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol)*
    ): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setIdentifiers(value: js.Array[String]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
    
    @scala.inline
    def setIdentifiersVarargs(value: String*): Self = StObject.set(x, "identifiers", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `8`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
