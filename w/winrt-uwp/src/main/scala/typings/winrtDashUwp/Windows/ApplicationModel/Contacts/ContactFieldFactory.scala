package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import typings.winrtDashUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates fields that contain information about a contact. You can then add these fields to a Contact object to create the contact. This class is available only to apps that support the Contact contract. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactFieldFactory")
@js.native
/** Creates an instance of the ContactFieldFactory class. */
class ContactFieldFactory () extends js.Object {
  /**
    * Creates a field to contain information about a contact.
    * @param name The name of the field.
    * @param value The value of the field.
    * @param type The type of field.
    * @param category The category the field belongs to.
    * @return Contains a field that you can add to a Contact object.
    */
  def createField(name: String, value: String, `type`: ContactFieldType, category: ContactFieldCategory): ContactField = js.native
  /**
    * Creates a field to contain information about a contact.
    * @param value The value for the field.
    * @param type The type of field.
    * @return Contains a field that you can add to a Contact object.
    */
  def createField(value: String, `type`: ContactFieldType): ContactField = js.native
  /**
    * Creates a field to contain information about a contact.
    * @param value The value for the field.
    * @param type The type of field.
    * @param category The category the field belongs to.
    * @return Contains a field that you can add to a Contact object.
    */
  def createField(value: String, `type`: ContactFieldType, category: ContactFieldCategory): ContactField = js.native
  /**
    * Creates a field to contain information about a contact's instant messaging account.
    * @param userName The user name for the instant messaging account.
    * @return Contains an instant messaging field that you can add to a Contact object.
    */
  def createInstantMessage(userName: String): ContactInstantMessageField = js.native
  /**
    * Creates a field to contain information about a contact's instant messaging account.
    * @param userName The user name for the instant messaging account.
    * @param category The category the field belongs to.
    * @return Contains an instant messaging field that you can add to a Contact object.
    */
  def createInstantMessage(userName: String, category: ContactFieldCategory): ContactInstantMessageField = js.native
  /**
    * Creates a field to contain information about a contact's instant messaging account.
    * @param userName The user name of the instant messaging account.
    * @param category The category the field belongs to.
    * @param service The name of the instant messaging service.
    * @param displayText The text to display to prompt an instant messaging conversation.
    * @param verb The URI that starts an instant messaging conversation.
    * @return Contains an instant messaging field that you can add to a Contact object.
    */
  def createInstantMessage(userName: String, category: ContactFieldCategory, service: String, displayText: String, verb: Uri): ContactInstantMessageField = js.native
  /**
    * Creates a field to contain information about a contact's location.
    * @param unstructuredAddress The address of the contact in an unstructured format.
    * @return Contains a location field that you can add to a Contact object.
    */
  def createLocation(unstructuredAddress: String): ContactLocationField = js.native
  /**
    * Creates a field to contain information about a contact's location.
    * @param unstructuredAddress The address of the contact in an unstructured format.
    * @param category The category the field belongs to.
    * @return Contains a location field that you can add to a Contact object.
    */
  def createLocation(unstructuredAddress: String, category: ContactFieldCategory): ContactLocationField = js.native
  /**
    * Creates a field to contain information about a contact's location.
    * @param unstructuredAddress The address of the contact in an unstructured format.
    * @param category The category the field belongs to.
    * @param street The street address for the address.
    * @param city The name of the city for the address.
    * @param region The name of the region for the address.
    * @param country The name of the country for the address.
    * @param postalCode The postal code for the address.
    * @return Contains a location field that you can add to a Contact object.
    */
  def createLocation(
    unstructuredAddress: String,
    category: ContactFieldCategory,
    street: String,
    city: String,
    region: String,
    country: String,
    postalCode: String
  ): ContactLocationField = js.native
}

