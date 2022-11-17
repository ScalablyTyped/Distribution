package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForCodegenNode
  extends StObject
     with VNodeCall {
  
  @JSName("children")
  var children_ForCodegenNode: ForRenderListExpression
  
  @JSName("isBlock")
  var isBlock_ForCodegenNode: true
  
  @JSName("patchFlag")
  var patchFlag_ForCodegenNode: String
  
  @JSName("props")
  var props_ForCodegenNode: Unit
  
  @JSName("tag")
  var tag_ForCodegenNode: js.Symbol
}
object ForCodegenNode {
  
  inline def apply(
    children: ForRenderListExpression,
    disableTracking: Boolean,
    isComponent: Boolean,
    loc: SourceLocation,
    patchFlag: String,
    props: Unit,
    tag: js.Symbol
  ): ForCodegenNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disableTracking = disableTracking.asInstanceOf[js.Any], isBlock = true, isComponent = isComponent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], patchFlag = patchFlag.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(13)
    __obj.asInstanceOf[ForCodegenNode]
  }
  
  extension [Self <: ForCodegenNode](x: Self) {
    
    inline def setChildren(value: ForRenderListExpression): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setIsBlock(value: true): Self = StObject.set(x, "isBlock", value.asInstanceOf[js.Any])
    
    inline def setPatchFlag(value: String): Self = StObject.set(x, "patchFlag", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Unit): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setTag(value: js.Symbol): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
