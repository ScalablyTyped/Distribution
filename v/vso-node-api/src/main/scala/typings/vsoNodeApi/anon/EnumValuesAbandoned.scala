package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAbandoned extends StObject {
  
  var enumValues: Abandoned
}
object EnumValuesAbandoned {
  
  @scala.inline
  def apply(enumValues: Abandoned): EnumValuesAbandoned = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAbandoned]
  }
  
  @scala.inline
  implicit class EnumValuesAbandonedMutableBuilder[Self <: EnumValuesAbandoned] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Abandoned): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
