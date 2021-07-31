package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesOnBehalfOf extends StObject {
  
  var enumValues: OnBehalfOf
}
object EnumValuesOnBehalfOf {
  
  @scala.inline
  def apply(enumValues: OnBehalfOf): EnumValuesOnBehalfOf = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesOnBehalfOf]
  }
  
  @scala.inline
  implicit class EnumValuesOnBehalfOfMutableBuilder[Self <: EnumValuesOnBehalfOf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: OnBehalfOf): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
