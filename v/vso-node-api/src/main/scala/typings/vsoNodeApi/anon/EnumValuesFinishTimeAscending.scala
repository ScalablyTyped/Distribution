package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFinishTimeAscending extends StObject {
  
  var enumValues: FinishTimeAscending
}
object EnumValuesFinishTimeAscending {
  
  @scala.inline
  def apply(enumValues: FinishTimeAscending): EnumValuesFinishTimeAscending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFinishTimeAscending]
  }
  
  @scala.inline
  implicit class EnumValuesFinishTimeAscendingMutableBuilder[Self <: EnumValuesFinishTimeAscending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: FinishTimeAscending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
