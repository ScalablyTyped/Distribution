package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A static class that contains the names of contact fields for storing commonly requested information like email address and phone numbers. */
@JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
@js.native
abstract class KnownContactField ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.KnownContactField
/* static members */
@JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
@js.native
object KnownContactField extends js.Object {
  
  /**
    * Converts a string representing the name of a field to its corresponding type.
    * @param name The name of the field.
    * @return The type of field.
    */
  def convertNameToType(name: String): typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType = js.native
  
  /**
    * Converts the type of a field to its corresponding string name.
    * @param type The type of field.
    * @return The name of the field.
    */
  def convertTypeToName(`type`: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType): String = js.native
  
  /** Contains the name of the field used for email addresses. */
  var email: String = js.native
  
  /** Contains the name of the field used for instant messaging accounts. */
  var instantMessage: String = js.native
  
  /** Contains the name of the field used for the contact's location. */
  var location: String = js.native
  
  /** Contains the name of the field used for phone numbers. */
  var phoneNumber: String = js.native
}
