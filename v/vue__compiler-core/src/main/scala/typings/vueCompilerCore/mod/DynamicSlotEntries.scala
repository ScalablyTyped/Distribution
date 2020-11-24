package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`17`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicSlotEntries extends ArrayExpression {
  
  @JSName("elements")
  var elements_DynamicSlotEntries: js.Array[ConditionalDynamicSlotNode | ListDynamicSlotNode] = js.native
}
object DynamicSlotEntries {
  
  @scala.inline
  def apply(
    elements: js.Array[ConditionalDynamicSlotNode | ListDynamicSlotNode],
    loc: SourceLocation,
    `type`: `17`
  ): DynamicSlotEntries = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicSlotEntries]
  }
  
  @scala.inline
  implicit class DynamicSlotEntriesOps[Self <: DynamicSlotEntries] (val x: Self) extends AnyVal {
    
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
    def setElementsVarargs(value: (ConditionalDynamicSlotNode | ListDynamicSlotNode)*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[ConditionalDynamicSlotNode | ListDynamicSlotNode]): Self = this.set("elements", value.asInstanceOf[js.Any])
  }
}
