package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.Identifier
  - typings.swcCore.typesMod.KeyValueProperty
  - typings.swcCore.typesMod.AssignmentProperty
  - typings.swcCore.typesMod.GetterProperty
  - typings.swcCore.typesMod.SetterProperty
  - typings.swcCore.typesMod.MethodProperty
*/
trait Property extends StObject
object Property {
  
  inline def AssignmentProperty(key: Identifier, value: Expression): typings.swcCore.typesMod.AssignmentProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentProperty")
    __obj.asInstanceOf[typings.swcCore.typesMod.AssignmentProperty]
  }
  
  inline def GetterProperty(key: PropertyName, span: Span): typings.swcCore.typesMod.GetterProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GetterProperty")
    __obj.asInstanceOf[typings.swcCore.typesMod.GetterProperty]
  }
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typings.swcCore.typesMod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.Identifier]
  }
  
  inline def KeyValueProperty(key: PropertyName, value: Expression): typings.swcCore.typesMod.KeyValueProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("KeyValueProperty")
    __obj.asInstanceOf[typings.swcCore.typesMod.KeyValueProperty]
  }
  
  inline def MethodProperty(async: Boolean, generator: Boolean, key: PropertyName, params: js.Array[Param], span: Span): typings.swcCore.typesMod.MethodProperty = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MethodProperty")
    __obj.asInstanceOf[typings.swcCore.typesMod.MethodProperty]
  }
  
  inline def SetterProperty(key: PropertyName, param: Pattern, span: Span): typings.swcCore.typesMod.SetterProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SetterProperty")
    __obj.asInstanceOf[typings.swcCore.typesMod.SetterProperty]
  }
}
