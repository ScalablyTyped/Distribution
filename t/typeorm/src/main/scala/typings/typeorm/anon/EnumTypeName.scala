package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumTypeName extends StObject {
  
  var enumTypeName: js.Any
  
  var enumTypeSchema: js.Any
}
object EnumTypeName {
  
  inline def apply(enumTypeName: js.Any, enumTypeSchema: js.Any): EnumTypeName = {
    val __obj = js.Dynamic.literal(enumTypeName = enumTypeName.asInstanceOf[js.Any], enumTypeSchema = enumTypeSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumTypeName]
  }
  
  extension [Self <: EnumTypeName](x: Self) {
    
    inline def setEnumTypeName(value: js.Any): Self = StObject.set(x, "enumTypeName", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeSchema(value: js.Any): Self = StObject.set(x, "enumTypeSchema", value.asInstanceOf[js.Any])
  }
}
