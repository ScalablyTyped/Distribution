package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`8`
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
  implicit class CompoundExpressionNodeOps[Self <: CompoundExpressionNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(
      value: (SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol)*
    ): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(
      value: js.Array[
          SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
        ]
    ): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `8`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifiersVarargs(value: String*): Self = this.set("identifiers", js.Array(value :_*))
    
    @scala.inline
    def setIdentifiers(value: js.Array[String]): Self = this.set("identifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifiers: Self = this.set("identifiers", js.undefined)
  }
}
