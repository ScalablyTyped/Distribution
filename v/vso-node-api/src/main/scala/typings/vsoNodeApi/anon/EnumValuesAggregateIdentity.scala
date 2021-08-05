package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAggregateIdentity extends StObject {
  
  var enumValues: AggregateIdentity
}
object EnumValuesAggregateIdentity {
  
  inline def apply(enumValues: AggregateIdentity): EnumValuesAggregateIdentity = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAggregateIdentity]
  }
  
  extension [Self <: EnumValuesAggregateIdentity](x: Self) {
    
    inline def setEnumValues(value: AggregateIdentity): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
