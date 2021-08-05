package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesPartiallyResolved extends StObject {
  
  var enumValues: PartiallyResolved
}
object EnumValuesPartiallyResolved {
  
  inline def apply(enumValues: PartiallyResolved): EnumValuesPartiallyResolved = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPartiallyResolved]
  }
  
  extension [Self <: EnumValuesPartiallyResolved](x: Self) {
    
    inline def setEnumValues(value: PartiallyResolved): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
