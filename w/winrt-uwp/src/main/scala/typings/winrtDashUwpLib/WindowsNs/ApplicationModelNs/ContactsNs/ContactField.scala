package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a piece of contact data. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactField")
@js.native
class ContactField protected () extends js.Object {
  /**
    * Creates a new ContactField object.
    * @param value The value that the field contains.
    * @param type The type of contact data.
    */
  def this(value: java.lang.String, `type`: ContactFieldType) = this()
  /**
    * Creates a new ContactField object.
    * @param value The value for the contact field.
    * @param type The type of contact data.
    * @param category The category that the contact belongs to.
    */
  def this(value: java.lang.String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
  /**
    * Creates a new ContactField object.
    * @param name The name of the field.
    * @param value The value the field contains.
    * @param type The type of field.
    * @param category The category the field belongs to.
    */
  def this(name: java.lang.String, value: java.lang.String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
  /** Gets the category for the contact data. */
  var category: ContactFieldCategory = js.native
  /** Gets the name of the field. */
  var name: java.lang.String = js.native
  /** Gets the contact field type for the data. */
  var `type`: ContactFieldType = js.native
  /** Gets the value of the contact data. */
  var value: java.lang.String = js.native
}

