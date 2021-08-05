package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFieldsNone extends StObject {
  
  var enumValues: FieldsNone
}
object EnumValuesFieldsNone {
  
  inline def apply(enumValues: FieldsNone): EnumValuesFieldsNone = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFieldsNone]
  }
  
  extension [Self <: EnumValuesFieldsNone](x: Self) {
    
    inline def setEnumValues(value: FieldsNone): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
