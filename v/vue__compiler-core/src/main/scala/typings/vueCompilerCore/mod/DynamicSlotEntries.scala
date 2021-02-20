package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`17`
import org.scalablytyped.runtime.StObject
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
  implicit class DynamicSlotEntriesMutableBuilder[Self <: DynamicSlotEntries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[ConditionalDynamicSlotNode | ListDynamicSlotNode]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: (ConditionalDynamicSlotNode | ListDynamicSlotNode)*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
