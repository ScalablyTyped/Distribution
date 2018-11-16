package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

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
  def this(unstructuredAddress: java.lang.String) = this()
  /**
                   * Creates a new ContactLocationField object.
                   * @param unstructuredAddress The address of the contact in an unstructured format.
                   * @param category The category the field belongs to.
                   */
  def this(unstructuredAddress: java.lang.String, category: ContactFieldCategory) = this()
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
  def this(unstructuredAddress: java.lang.String, category: ContactFieldCategory, street: java.lang.String, city: java.lang.String, region: java.lang.String, country: java.lang.String, postalCode: java.lang.String) = this()
  /** Gets the category for the contact data. */
  var category: ContactFieldCategory = js.native
  /** Gets the contact's city. */
  var city: java.lang.String = js.native
  /** Gets the contact's country. */
  var country: java.lang.String = js.native
  /** Gets the name of the field. */
  var name: java.lang.String = js.native
  /** Gets the contact's postal code. */
  var postalCode: java.lang.String = js.native
  /** Gets the contact's region. */
  var region: java.lang.String = js.native
  /** Gets the contact's street. */
  var street: java.lang.String = js.native
  /** Gets the contact field type for the data. */
  var `type`: ContactFieldType = js.native
  /** Gets a string that represents an unstructured address. */
  var unstructuredAddress: java.lang.String = js.native
  /** Gets the value of the contact data. */
  var value: java.lang.String = js.native
}

