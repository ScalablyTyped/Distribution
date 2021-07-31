package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesOrganization extends StObject {
  
  var enumValues: Organization
}
object EnumValuesOrganization {
  
  @scala.inline
  def apply(enumValues: Organization): EnumValuesOrganization = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesOrganization]
  }
  
  @scala.inline
  implicit class EnumValuesOrganizationMutableBuilder[Self <: EnumValuesOrganization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Organization): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
