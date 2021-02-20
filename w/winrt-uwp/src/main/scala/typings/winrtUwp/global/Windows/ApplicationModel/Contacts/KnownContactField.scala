package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A static class that contains the names of contact fields for storing commonly requested information like email address and phone numbers. */
@JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
@js.native
abstract class KnownContactField ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.KnownContactField
object KnownContactField {
  
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string representing the name of a field to its corresponding type.
    * @param name The name of the field.
    * @return The type of field.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.convertNameToType")
  @js.native
  def convertNameToType(name: String): typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType = js.native
  
  /**
    * Converts the type of a field to its corresponding string name.
    * @param type The type of field.
    * @return The name of the field.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.convertTypeToName")
  @js.native
  def convertTypeToName(`type`: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType): String = js.native
  
  /** Contains the name of the field used for email addresses. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.email")
  @js.native
  def email: String = js.native
  @scala.inline
  def email_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("email")(x.asInstanceOf[js.Any])
  
  /** Contains the name of the field used for instant messaging accounts. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.instantMessage")
  @js.native
  def instantMessage: String = js.native
  @scala.inline
  def instantMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instantMessage")(x.asInstanceOf[js.Any])
  
  /** Contains the name of the field used for the contact's location. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.location")
  @js.native
  def location: String = js.native
  @scala.inline
  def location_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
  
  /** Contains the name of the field used for phone numbers. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.phoneNumber")
  @js.native
  def phoneNumber: String = js.native
  @scala.inline
  def phoneNumber_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(x.asInstanceOf[js.Any])
}
