package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the address of a contact. */
@js.native
trait ContactAddress extends StObject {
  
  /** Gets and sets the country of a contact address. The maximum string length for the country is 1024 characters. */
  var country: String = js.native
  
  /** Gets and sets the description of a contact address. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  
  /** Gets and sets the kind of contact address. */
  var kind: ContactAddressKind = js.native
  
  /** Gets and sets the locality of a contact address. The maximum string length for the locality is 1024 characters. */
  var locality: String = js.native
  
  /** Gets and sets the postal code of a contact address. The maximum string length for the postal code is 1024 characters. */
  var postalCode: String = js.native
  
  /** Gets and sets the region of a contact address. The maximum string length for the region is 1024 characters. */
  var region: String = js.native
  
  /** Gets and sets the street address of a contact address. The maximum string length for the street address is 1024 characters. */
  var streetAddress: String = js.native
}
object ContactAddress {
  
  @scala.inline
  def apply(
    country: String,
    description: String,
    kind: ContactAddressKind,
    locality: String,
    postalCode: String,
    region: String,
    streetAddress: String
  ): ContactAddress = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactAddress]
  }
  
  @scala.inline
  implicit class ContactAddressMutableBuilder[Self <: ContactAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ContactAddressKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
  }
}
