package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  var defaultValue: AnyOf
  
  var end: Type
  
  var name: Type
  
  var notSupported: Type
  
  var start: Type
  
  var `type`: Ref
}
object DefaultValue {
  
  inline def apply(defaultValue: AnyOf, end: Type, name: Type, notSupported: Type, start: Type, `type`: Ref): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: AnyOf): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Type): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setName(value: Type): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotSupported(value: Type): Self = StObject.set(x, "notSupported", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Type): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: Ref): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
