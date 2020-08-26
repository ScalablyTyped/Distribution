package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a piece of contact data. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactField")
@js.native
class ContactField protected ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactField {
  /**
    * Creates a new ContactField object.
    * @param value The value that the field contains.
    * @param type The type of contact data.
    */
  def this(value: String, `type`: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType) = this()
  /**
    * Creates a new ContactField object.
    * @param value The value for the contact field.
    * @param type The type of contact data.
    * @param category The category that the contact belongs to.
    */
  def this(
    value: String,
    `type`: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType,
    category: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldCategory
  ) = this()
  /**
    * Creates a new ContactField object.
    * @param name The name of the field.
    * @param value The value the field contains.
    * @param type The type of field.
    * @param category The category the field belongs to.
    */
  def this(
    name: String,
    value: String,
    `type`: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType,
    category: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldCategory
  ) = this()
}

