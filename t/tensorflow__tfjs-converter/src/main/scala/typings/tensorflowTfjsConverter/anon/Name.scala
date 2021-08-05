package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var defaultValue: AnyOf
  
  var name: Type
  
  var notSupported: Type
  
  var tfDeprecatedName: Type
  
  var tfName: Type
  
  var `type`: Ref
}
object Name {
  
  inline def apply(
    defaultValue: AnyOf,
    name: Type,
    notSupported: Type,
    tfDeprecatedName: Type,
    tfName: Type,
    `type`: Ref
  ): Name = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], tfDeprecatedName = tfDeprecatedName.asInstanceOf[js.Any], tfName = tfName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setDefaultValue(value: AnyOf): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: Type): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotSupported(value: Type): Self = StObject.set(x, "notSupported", value.asInstanceOf[js.Any])
    
    inline def setTfDeprecatedName(value: Type): Self = StObject.set(x, "tfDeprecatedName", value.asInstanceOf[js.Any])
    
    inline def setTfName(value: Type): Self = StObject.set(x, "tfName", value.asInstanceOf[js.Any])
    
    inline def setType(value: Ref): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
