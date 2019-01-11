package typings
package titaniumLib.TitaniumNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Contacts")
@js.native
object ^ extends js.Object {
  /**
  		 * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
  		 * indicating that the application is authorized to use the address book.
  		 */
  val AUTHORIZATION_AUTHORIZED: scala.Double = js.native
  /**
  		 * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
  		 * indicating that the application is not authorized to use the address book.
  		 */
  val AUTHORIZATION_DENIED: scala.Double = js.native
  /**
  		 * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
  		 * indicating that the application is not authorized to use the address book *and*
  		 * the user cannot change this application's status.
  		 */
  val AUTHORIZATION_RESTRICTED: scala.Double = js.native
  /**
  		 * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
  		 * indicating that the authorization state is unknown.
  		 */
  val AUTHORIZATION_UNKNOWN: scala.Double = js.native
  /**
  		 * Specifies that a contact is an organization.
  		 */
  val CONTACTS_KIND_ORGANIZATION: scala.Double = js.native
  /**
  		 * Specifies that a contact is a person.
  		 */
  val CONTACTS_KIND_PERSON: scala.Double = js.native
  /**
  		 * Specifies that group members will be sorted by first name.
  		 */
  val CONTACTS_SORT_FIRST_NAME: scala.Double = js.native
  /**
  		 * Specifies that group members will be sorted by last name.
  		 */
  val CONTACTS_SORT_LAST_NAME: scala.Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * Returns an authorization constant indicating if the application has access to the address book.
  		 */
  val contactsAuthorization: scala.Double = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Contacts.Group>.
  		 */
  def createGroup(): titaniumLib.TitaniumNs.ContactsNs.Group = js.native
  def createGroup(parameters: js.Any): titaniumLib.TitaniumNs.ContactsNs.Group = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Contacts.Person>, and commits all pending
  		 * changes to the underlying contacts database.
  		 */
  def createPerson(): titaniumLib.TitaniumNs.ContactsNs.Person = js.native
  def createPerson(parameters: js.Any): titaniumLib.TitaniumNs.ContactsNs.Person = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets all groups.
  		 */
  def getAllGroups(): js.Array[titaniumLib.TitaniumNs.ContactsNs.Group] = js.native
  /**
  		 * Gets all people, unless a limit is specified.
  		 */
  def getAllPeople(limit: scala.Double): js.Array[titaniumLib.TitaniumNs.ContactsNs.Person] = js.native
  /**
  		 * Gets the value of the <Titanium.Contacts.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Contacts.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Contacts.contactsAuthorization> property.
  		 */
  def getContactsAuthorization(): scala.Double = js.native
  /**
  		 * Gets the group with the specified identifier. Deprecated for >= iOS9. Use <Titanium.Contacts.getGroupByIdentifier> instead.
  		 */
  def getGroupByID(id: scala.Double): titaniumLib.TitaniumNs.ContactsNs.Group = js.native
  /**
  		 * Gets the group with the specified identifier.
  		 */
  def getGroupByIdentifier(id: java.lang.String): titaniumLib.TitaniumNs.ContactsNs.Group = js.native
  /**
  		 * Gets the value of the <Titanium.Contacts.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Gets people with a `firstName`, `middleName` or `lastName` field, or a combination
  		 * of these fields, that match the specified name.
  		 */
  def getPeopleWithName(name: java.lang.String): js.Array[titaniumLib.TitaniumNs.ContactsNs.Person] = js.native
  /**
  		 * Gets the person with the specified identifier. Deprecated for >= iOS9. Use <Titanium.Contacts.getPersonByIdentifier> instead.
  		 */
  def getPersonByID(id: scala.Double): titaniumLib.TitaniumNs.ContactsNs.Person = js.native
  /**
  		 * Gets the person with the specified identifier.
  		 */
  def getPersonByIdentifier(id: scala.Double): titaniumLib.TitaniumNs.ContactsNs.Person = js.native
  /**
  		 * Returns `true` if the app has contacts access.
  		 */
  def hasContactsPermissions(): scala.Boolean = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Removes a group from the address book.
  		 */
  def removeGroup(group: titaniumLib.TitaniumNs.ContactsNs.Group): scala.Unit = js.native
  /**
  		 * Removes a contact from the address book.
  		 */
  def removePerson(person: titaniumLib.TitaniumNs.ContactsNs.Person): scala.Unit = js.native
  /**
  		 * If authorization is unknown, will bring up a dialog requesting permission.
  		 */
  def requestAuthorization(callback: js.Function1[/* param0 */ titaniumLib.ContactsAuthorizationResponse, _]): scala.Unit = js.native
  /**
  		 * Requests for contacts access.
  		 */
  def requestContactsPermissions(callback: js.Function1[/* param0 */ titaniumLib.ContactsAuthorizationResponse, _]): scala.Unit = js.native
  /**
  		 * Reverts all changes made by the previous save to the address book. Deprecated for >= iOS9.
  		 */
  def revert(): scala.Unit = js.native
  /**
  		 * Commits all pending changes to the underlying contacts database.
  		 */
  def save(contacts: js.Array[titaniumLib.TitaniumNs.ContactsNs.Person]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Contacts.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Contacts.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Contacts.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  		 * Displays a picker that allows a person to be selected.
  		 */
  def showContacts(params: titaniumLib.showContactsParams): scala.Unit = js.native
}

