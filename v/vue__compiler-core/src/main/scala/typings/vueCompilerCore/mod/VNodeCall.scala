package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`13`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VNodeCall
  extends StObject
     with Node2
     with BlockCodegenNode
     with JSChildNode {
  
  var children: js.UndefOr[
    js.Array[TemplateChildNode] | TemplateTextChildNode | SlotsExpression | ForRenderListExpression
  ] = js.undefined
  
  var directives: js.UndefOr[DirectiveArguments] = js.undefined
  
  var disableTracking: Boolean
  
  var dynamicProps: js.UndefOr[String] = js.undefined
  
  var isBlock: Boolean
  
  var patchFlag: js.UndefOr[String] = js.undefined
  
  var props: js.UndefOr[PropsExpression] = js.undefined
  
  var tag: String | js.Symbol | CallExpression
  
  @JSName("type")
  var type_VNodeCall: `13`
}
object VNodeCall {
  
  @scala.inline
  def apply(
    disableTracking: Boolean,
    isBlock: Boolean,
    loc: SourceLocation,
    tag: String | js.Symbol | CallExpression
  ): VNodeCall = {
    val __obj = js.Dynamic.literal(disableTracking = disableTracking.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(13)
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
