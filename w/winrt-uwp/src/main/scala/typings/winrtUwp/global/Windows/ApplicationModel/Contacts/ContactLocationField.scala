package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a user's location and address. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactLocationField")
@js.native
class ContactLocationField protected ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactLocationField {
  /**
    * Creates a new ContactLocationField object.
    * @param unstructuredAddress The address of the contact in an unstructured format.
    */
  def this(unstructuredAddress: String) = this()
  /**
    * Creates a new ContactLocationField object.
    * @param unstructuredAddress The address of the contact in an unstructured format.
    * @param category The category the field belongs to.
    */
  def this(
    unstructuredAddress: String,
    category: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldCategory
  ) = this()
  /**
    * Creates a new ContactLocationField object.
    * @param unstructuredAddress The address of the contact in an unstructured format.
    * @param category The category for the contact data.
    * @param street The street address of the contact.
    * @param city The name of the city for this contact's address.
    * @param region The name of the region for this contact's address.
    * @param country The name of the country for this contact's address.
    * @param postalCode The postal code for this contact's address.
    */
  def this(
    unstructuredAddress: String,
    category: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldCategory,
    street: String,
    city: String,
    region: String,
    country: String,
    postalCode: String
  ) = this()
}

