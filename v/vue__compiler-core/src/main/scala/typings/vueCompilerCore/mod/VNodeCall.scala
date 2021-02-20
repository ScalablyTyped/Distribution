package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`13`
import org.scalablytyped.runtime.StObject
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
  implicit class VNodeCallMutableBuilder[Self <: VNodeCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: js.Array[TemplateChildNode] | TemplateTextChildNode | SlotsExpression | ForRenderListExpression
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: TemplateChildNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: DirectiveArguments): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    @scala.inline
    def setDisableTracking(value: Boolean): Self = StObject.set(x, "disableTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicProps(value: String): Self = StObject.set(x, "dynamicProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicPropsUndefined: Self = StObject.set(x, "dynamicProps", js.undefined)
    
    @scala.inline
    def setIsBlock(value: Boolean): Self = StObject.set(x, "isBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchFlag(value: String): Self = StObject.set(x, "patchFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchFlagUndefined: Self = StObject.set(x, "patchFlag", js.undefined)
    
    @scala.inline
    def setProps(value: PropsExpression): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    @scala.inline
    def setTag(value: String | js.Symbol | CallExpression): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `13`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
