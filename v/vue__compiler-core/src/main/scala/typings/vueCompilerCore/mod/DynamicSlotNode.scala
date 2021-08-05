package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicSlotNode
  extends StObject
     with ObjectExpression {
  
  @JSName("properties")
  var properties_DynamicSlotNode: js.Tuple2[Property, DynamicSlotFnProperty]
}
object DynamicSlotNode {
  
  inline def apply(loc: SourceLocation, properties: js.Tuple2[Property, DynamicSlotFnProperty]): DynamicSlotNode = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(15)
    __obj.asInstanceOf[DynamicSlotNode]
  }
  
  extension [Self <: DynamicSlotNode](x: Self) {
    
    inline def setProperties(value: js.Tuple2[Property, DynamicSlotFnProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
