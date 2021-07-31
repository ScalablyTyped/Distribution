package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDouble extends StObject {
  
  var enumValues: Double
}
object EnumValuesDouble {
  
  @scala.inline
  def apply(enumValues: Double): EnumValuesDouble = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDouble]
  }
  
  @scala.inline
  implicit class EnumValuesDoubleMutableBuilder[Self <: EnumValuesDouble] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Double): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
