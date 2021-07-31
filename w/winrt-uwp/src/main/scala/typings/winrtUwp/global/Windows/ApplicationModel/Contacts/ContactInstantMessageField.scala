package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a field that is an instant messaging (IM) address. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactInstantMessageField")
@js.native
class ContactInstantMessageField protected ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactInstantMessageField {
  /**
    * Creates a new ContactInstantMessageField object.
    * @param userName The user's name.
    */
  def this(userName: String) = this()
  /**
    * Creates a new ContactInstantMessageField object.
    * @param userName The user's name.
    * @param category The category of contact data.
    */
  def this(
    userName: String,
    category: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldCategory
  ) = this()
  /**
    * Creates a new ContactInstantMessageField object.
    * @param userName The user's name.
    * @param category The category of the contact data.
    * @param service The name of the instant messaging service.
    * @param displayText The display text used with the instant messaging URI.
    * @param verb The URI that starts an instant message.
    */
  def this(
    userName: String,
    category: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldCategory,
    service: String,
    displayText: String,
    verb: Uri
  ) = this()
  
  /** Gets the category for the contact data. */
  /* CompleteClass */
  var category: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldCategory = js.native
  
  /** Gets the display text for the Uniform Resource Identifier (URI) that starts an instant message. */
  /* CompleteClass */
  var displayText: String = js.native
  
  /** Gets the Uniform Resource Identifier (URI) that can start an instant message. */
  /* CompleteClass */
  var launchUri: Uri = js.native
  
  /** Gets the name of the field. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Gets the name of the service used for sending instant messages. */
  /* CompleteClass */
  var service: String = js.native
  
  /** Gets the contact field type for the data. */
  /* CompleteClass */
  var `type`: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType = js.native
  
  /** Gets the user's name. */
  /* CompleteClass */
  var userName: String = js.native
  
  /** Gets the value of the contact data. */
  /* CompleteClass */
  var value: String = js.native
}
