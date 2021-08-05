package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A static class that contains the names of contact fields for storing commonly requested information like email address and phone numbers. */
@JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField")
@js.native
abstract class KnownContactField ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.KnownContactField
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
  inline def convertNameToType(name: String): typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType = ^.asInstanceOf[js.Dynamic].applyDynamic("convertNameToType")(name.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType]
  
  /**
    * Converts the type of a field to its corresponding string name.
    * @param type The type of field.
    * @return The name of the field.
    */
  /* static member */
  inline def convertTypeToName(`type`: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTypeToName")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Contains the name of the field used for email addresses. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.email")
  @js.native
  def email: String = js.native
  inline def email_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("email")(x.asInstanceOf[js.Any])
  
  /** Contains the name of the field used for instant messaging accounts. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.instantMessage")
  @js.native
  def instantMessage: String = js.native
  inline def instantMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instantMessage")(x.asInstanceOf[js.Any])
  
  /** Contains the name of the field used for the contact's location. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.location")
  @js.native
  def location: String = js.native
  inline def location_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
  
  /** Contains the name of the field used for phone numbers. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Contacts.KnownContactField.phoneNumber")
  @js.native
  def phoneNumber: String = js.native
  inline def phoneNumber_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(x.asInstanceOf[js.Any])
}
