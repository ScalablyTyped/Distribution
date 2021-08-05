package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesEdit extends StObject {
  
  var enumValues: Edit
}
object EnumValuesEdit {
  
  inline def apply(enumValues: Edit): EnumValuesEdit = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesEdit]
  }
  
  extension [Self <: EnumValuesEdit](x: Self) {
    
    inline def setEnumValues(value: Edit): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
