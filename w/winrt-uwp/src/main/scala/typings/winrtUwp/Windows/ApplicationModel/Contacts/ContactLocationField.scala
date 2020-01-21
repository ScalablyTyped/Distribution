package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a user's location and address. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactLocationField")
@js.native
class ContactLocationField protected () extends js.Object {
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
  def this(unstructuredAddress: String, category: ContactFieldCategory) = this()
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
    category: ContactFieldCategory,
    street: String,
    city: String,
    region: String,
    country: String,
    postalCode: String
  ) = this()
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

