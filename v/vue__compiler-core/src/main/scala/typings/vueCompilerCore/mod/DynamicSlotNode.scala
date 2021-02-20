package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`15`
import org.scalablytyped.runtime.StObject
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
  implicit class DynamicSlotNodeMutableBuilder[Self <: DynamicSlotNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Tuple2[Property, DynamicSlotFnProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
