package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAdmin extends StObject {
  
  var enumValues: Admin
}
object EnumValuesAdmin {
  
  @scala.inline
  def apply(enumValues: Admin): EnumValuesAdmin = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAdmin]
  }
  
  @scala.inline
  implicit class EnumValuesAdminMutableBuilder[Self <: EnumValuesAdmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Admin): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
