package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`13`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VNodeCall
  extends JSChildNode
     with Node2
     with BlockCodegenNode {
  
  var children: js.UndefOr[
    js.Array[TemplateChildNode] | TemplateTextChildNode | SlotsExpression | ForRenderListExpression
  ] = js.native
  
  var directives: js.UndefOr[DirectiveArguments] = js.native
  
  var disableTracking: Boolean = js.native
  
  var dynamicProps: js.UndefOr[String] = js.native
  
  var isBlock: Boolean = js.native
  
  var patchFlag: js.UndefOr[String] = js.native
  
  var props: js.UndefOr[PropsExpression] = js.native
  
  var tag: String | js.Symbol | CallExpression = js.native
  
  @JSName("type")
  var type_VNodeCall: `13` = js.native
}
object VNodeCall {
  
  @scala.inline
  def apply(
    disableTracking: Boolean,
    isBlock: Boolean,
    loc: SourceLocation,
    tag: String | js.Symbol | CallExpression,
    `type`: `13`
  ): VNodeCall = {
    val __obj = js.Dynamic.literal(disableTracking = disableTracking.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNodeCall]
  }
  
  @scala.inline
  implicit class VNodeCallOps[Self <: VNodeCall] (val x: Self) extends AnyVal {
    
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
    def setDisableTracking(value: Boolean): Self = this.set("disableTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBlock(value: Boolean): Self = this.set("isBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String | js.Symbol | CallExpression): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `13`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: TemplateChildNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(
      value: js.Array[TemplateChildNode] | TemplateTextChildNode | SlotsExpression | ForRenderListExpression
    ): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDirectives(value: DirectiveArguments): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setDynamicProps(value: String): Self = this.set("dynamicProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicProps: Self = this.set("dynamicProps", js.undefined)
    
    @scala.inline
    def setPatchFlag(value: String): Self = this.set("patchFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatchFlag: Self = this.set("patchFlag", js.undefined)
    
    @scala.inline
    def setProps(value: PropsExpression): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
