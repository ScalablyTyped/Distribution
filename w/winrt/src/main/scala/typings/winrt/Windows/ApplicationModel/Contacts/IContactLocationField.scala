package typings.winrt.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContactLocationField extends IContactField {
  
  var city: String = js.native
  
  var country: String = js.native
  
  var postalCode: String = js.native
  
  var region: String = js.native
  
  var street: String = js.native
  
  var unstructuredAddress: String = js.native
}
object IContactLocationField {
  
  @scala.inline
  def apply(
    category: ContactFieldCategory,
    city: String,
    country: String,
    name: String,
    postalCode: String,
    region: String,
    street: String,
    `type`: ContactFieldType,
    unstructuredAddress: String,
    value: String
  ): IContactLocationField = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], unstructuredAddress = unstructuredAddress.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactLocationField]
  }
  
  @scala.inline
  implicit class IContactLocationFieldMutableBuilder[Self <: IContactLocationField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnstructuredAddress(value: String): Self = StObject.set(x, "unstructuredAddress", value.asInstanceOf[js.Any])
  }
}
