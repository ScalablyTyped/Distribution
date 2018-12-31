package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A static class that contains the names of contact fields for storing commonly requested information like email address and phone numbers. */
@JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
@js.native
abstract class KnownContactField () extends js.Object

/** A static class that contains the names of contact fields for storing commonly requested information like email address and phone numbers. */
@JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
@js.native
object KnownContactField extends js.Object {
  /** Contains the name of the field used for email addresses. */
  var email: java.lang.String = js.native
  /** Contains the name of the field used for instant messaging accounts. */
  var instantMessage: java.lang.String = js.native
  /** Contains the name of the field used for the contact's location. */
  var location: java.lang.String = js.native
  /** Contains the name of the field used for phone numbers. */
  var phoneNumber: java.lang.String = js.native
  /**
    * Converts a string representing the name of a field to its corresponding type.
    * @param name The name of the field.
    * @return The type of field.
    */
  def convertNameToType(name: java.lang.String): winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType = js.native
  /**
    * Converts the type of a field to its corresponding string name.
    * @param type The type of field.
    * @return The name of the field.
    */
  def convertTypeToName(`type`: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactFieldType): java.lang.String = js.native
}

