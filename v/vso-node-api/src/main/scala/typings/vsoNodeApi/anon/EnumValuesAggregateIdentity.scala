package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAggregateIdentity extends StObject {
  
  var enumValues: AggregateIdentity
}
object EnumValuesAggregateIdentity {
  
  @scala.inline
  def apply(enumValues: AggregateIdentity): EnumValuesAggregateIdentity = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAggregateIdentity]
  }
  
  @scala.inline
  implicit class EnumValuesAggregateIdentityMutableBuilder[Self <: EnumValuesAggregateIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AggregateIdentity): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
