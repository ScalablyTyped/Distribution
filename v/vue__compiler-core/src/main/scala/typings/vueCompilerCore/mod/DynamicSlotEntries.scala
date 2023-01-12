package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicSlotEntries
  extends StObject
     with ArrayExpression {
  
  @JSName("elements")
  var elements_DynamicSlotEntries: js.Array[ConditionalDynamicSlotNode | ListDynamicSlotNode]
}
object DynamicSlotEntries {
  
  inline def apply(elements: js.Array[ConditionalDynamicSlotNode | ListDynamicSlotNode], loc: SourceLocation): DynamicSlotEntries = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(17)
    __obj.asInstanceOf[DynamicSlotEntries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicSlotEntries] (val x: Self) extends AnyVal {
    
    inline def setElements(value: js.Array[ConditionalDynamicSlotNode | ListDynamicSlotNode]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: (ConditionalDynamicSlotNode | ListDynamicSlotNode)*): Self = StObject.set(x, "elements", js.Array(value*))
  }
}
