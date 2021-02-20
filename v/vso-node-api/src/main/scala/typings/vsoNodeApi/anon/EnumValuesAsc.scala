package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAsc extends StObject {
  
  var enumValues: Asc = js.native
}
object EnumValuesAsc {
  
  @scala.inline
  def apply(enumValues: Asc): EnumValuesAsc = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAsc]
  }
  
  @scala.inline
  implicit class EnumValuesAscMutableBuilder[Self <: EnumValuesAsc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Asc): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
