package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreBooleans.`true`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`13`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForCodegenNode extends VNodeCall {
  
  @JSName("children")
  var children_ForCodegenNode: ForRenderListExpression = js.native
  
  @JSName("isBlock")
  var isBlock_ForCodegenNode: `true` = js.native
  
  @JSName("patchFlag")
  var patchFlag_ForCodegenNode: String = js.native
  
  @JSName("props")
  var props_ForCodegenNode: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("tag")
  var tag_ForCodegenNode: js.Symbol = js.native
}
object ForCodegenNode {
  
  @scala.inline
  def apply(
    children: ForRenderListExpression,
    disableTracking: Boolean,
    isBlock: `true`,
    loc: SourceLocation,
    patchFlag: String,
    tag: js.Symbol,
    `type`: `13`
  ): ForCodegenNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disableTracking = disableTracking.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], patchFlag = patchFlag.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForCodegenNode]
  }
  
  @scala.inline
  implicit class ForCodegenNodeOps[Self <: ForCodegenNode] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ForRenderListExpression): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBlock(value: `true`): Self = this.set("isBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchFlag(value: String): Self = this.set("patchFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: js.Symbol): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
