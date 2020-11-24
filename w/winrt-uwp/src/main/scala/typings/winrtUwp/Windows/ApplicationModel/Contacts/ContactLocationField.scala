package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a user's location and address. */
@js.native
trait ContactLocationField extends js.Object {
  
  /** Gets the category for the contact data. */
  var category: ContactFieldCategory = js.native
  
  /** Gets the contact's city. */
  var city: String = js.native
  
  /** Gets the contact's country. */
  var country: String = js.native
  
  /** Gets the name of the field. */
  var name: String = js.native
  
  /** Gets the contact's postal code. */
  var postalCode: String = js.native
  
  /** Gets the contact's region. */
  var region: String = js.native
  
  /** Gets the contact's street. */
  var street: String = js.native
  
  /** Gets the contact field type for the data. */
  var `type`: ContactFieldType = js.native
  
  /** Gets a string that represents an unstructured address. */
  var unstructuredAddress: String = js.native
  
  /** Gets the value of the contact data. */
  var value: String = js.native
}
object ContactLocationField {
  
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
  ): ContactLocationField = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], unstructuredAddress = unstructuredAddress.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactLocationField]
  }
  
  @scala.inline
  implicit class ContactLocationFieldOps[Self <: ContactLocationField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCategory(value: ContactFieldCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet(value: String): Self = this.set("street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ContactFieldType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnstructuredAddress(value: String): Self = this.set("unstructuredAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
