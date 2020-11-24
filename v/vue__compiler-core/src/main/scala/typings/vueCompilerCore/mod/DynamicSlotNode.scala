package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`15`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicSlotNode extends ObjectExpression {
  
  @JSName("properties")
  var properties_DynamicSlotNode: js.Tuple2[Property, DynamicSlotFnProperty] = js.native
}
object DynamicSlotNode {
  
  @scala.inline
  def apply(loc: SourceLocation, properties: js.Tuple2[Property, DynamicSlotFnProperty], `type`: `15`): DynamicSlotNode = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicSlotNode]
  }
  
  @scala.inline
  implicit class DynamicSlotNodeOps[Self <: DynamicSlotNode] (val x: Self) extends AnyVal {
    
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
    def setProperties(value: js.Tuple2[Property, DynamicSlotFnProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
