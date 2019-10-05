package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import typings.winrtDashUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a field that is an instant messaging (IM) address. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactInstantMessageField")
@js.native
class ContactInstantMessageField protected () extends js.Object {
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
  def this(userName: String, category: ContactFieldCategory) = this()
  /**
    * Creates a new ContactInstantMessageField object.
    * @param userName The user's name.
    * @param category The category of the contact data.
    * @param service The name of the instant messaging service.
    * @param displayText The display text used with the instant messaging URI.
    * @param verb The URI that starts an instant message.
    */
  def this(userName: String, category: ContactFieldCategory, service: String, displayText: String, verb: Uri) = this()
  /** Gets the category for the contact data. */
  var category: ContactFieldCategory = js.native
  /** Gets the display text for the Uniform Resource Identifier (URI) that starts an instant message. */
  var displayText: String = js.native
  /** Gets the Uniform Resource Identifier (URI) that can start an instant message. */
  var launchUri: Uri = js.native
  /** Gets the name of the field. */
  var name: String = js.native
  /** Gets the name of the service used for sending instant messages. */
  var service: String = js.native
  /** Gets the contact field type for the data. */
  var `type`: ContactFieldType = js.native
  /** Gets the user's name. */
  var userName: String = js.native
  /** Gets the value of the contact data. */
  var value: String = js.native
}

