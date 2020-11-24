package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a field that is an instant messaging (IM) address. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactInstantMessageField")
@js.native
class ContactInstantMessageField protected ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactInstantMessageField {
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
}
