package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the address of a contact. */
trait ContactAddress extends js.Object {
  /** Gets and sets the country of a contact address. The maximum string length for the country is 1024 characters. */
  var country: String
  /** Gets and sets the description of a contact address. The maximum string length for the description is 512 characters. */
  var description: String
  /** Gets and sets the kind of contact address. */
  var kind: ContactAddressKind
  /** Gets and sets the locality of a contact address. The maximum string length for the locality is 1024 characters. */
  var locality: String
  /** Gets and sets the postal code of a contact address. The maximum string length for the postal code is 1024 characters. */
  var postalCode: String
  /** Gets and sets the region of a contact address. The maximum string length for the region is 1024 characters. */
  var region: String
  /** Gets and sets the street address of a contact address. The maximum string length for the street address is 1024 characters. */
  var streetAddress: String
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
}

