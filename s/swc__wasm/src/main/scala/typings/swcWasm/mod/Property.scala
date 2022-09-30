package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.Identifier
  - typings.swcWasm.mod.KeyValueProperty
  - typings.swcWasm.mod.AssignmentProperty
  - typings.swcWasm.mod.GetterProperty
  - typings.swcWasm.mod.SetterProperty
  - typings.swcWasm.mod.MethodProperty
*/
trait Property extends StObject
object Property {
  
  inline def AssignmentProperty(key: Identifier, value: Expression): typings.swcWasm.mod.AssignmentProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentProperty")
    __obj.asInstanceOf[typings.swcWasm.mod.AssignmentProperty]
  }
  
  inline def GetterProperty(key: PropertyName, span: Span): typings.swcWasm.mod.GetterProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GetterProperty")
    __obj.asInstanceOf[typings.swcWasm.mod.GetterProperty]
  }
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typings.swcWasm.mod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcWasm.mod.Identifier]
  }
  
  inline def KeyValueProperty(key: PropertyName, value: Expression): typings.swcWasm.mod.KeyValueProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("KeyValueProperty")
    __obj.asInstanceOf[typings.swcWasm.mod.KeyValueProperty]
  }
  
  inline def MethodProperty(async: Boolean, generator: Boolean, key: PropertyName, params: js.Array[Param], span: Span): typings.swcWasm.mod.MethodProperty = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MethodProperty")
    __obj.asInstanceOf[typings.swcWasm.mod.MethodProperty]
  }
  
  inline def SetterProperty(key: PropertyName, param: Pattern, span: Span): typings.swcWasm.mod.SetterProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SetterProperty")
    __obj.asInstanceOf[typings.swcWasm.mod.SetterProperty]
  }
}
