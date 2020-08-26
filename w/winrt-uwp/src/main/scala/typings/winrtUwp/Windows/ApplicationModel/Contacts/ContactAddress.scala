package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the address of a contact. */
@js.native
trait ContactAddress extends js.Object {
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
  implicit class ContactAddressOps[Self <: ContactAddress] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ContactAddressKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreetAddress(value: String): Self = this.set("streetAddress", value.asInstanceOf[js.Any])
  }
  
}

