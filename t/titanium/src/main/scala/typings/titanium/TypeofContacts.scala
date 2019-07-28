package typings.titanium

import typings.titanium.TitaniumNs.ContactsNs.Group
import typings.titanium.TitaniumNs.ContactsNs.Person
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofContacts extends js.Object {
  /**
  		 * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
  		 * indicating that the application is authorized to use the address book.
  		 */
  val AUTHORIZATION_AUTHORIZED: Double = js.native
  /**
  		 * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
  		 * indicating that the application is not authorized to use the address book.
  		 */
  val AUTHORIZATION_DENIED: Double = js.native
  /**
  		 * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
  		 * indicating that the application is not authorized to use the address book *and*
  		 * the user cannot change this application's status.
  		 */
  val AUTHORIZATION_RESTRICTED: Double = js.native
  /**
  		 * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
  		 * indicating that the authorization state is unknown.
  		 */
  val AUTHORIZATION_UNKNOWN: Double = js.native
  /**
  		 * Specifies that a contact is an organization.
  		 */
  val CONTACTS_KIND_ORGANIZATION: Double = js.native
  /**
  		 * Specifies that a contact is a person.
  		 */
  val CONTACTS_KIND_PERSON: Double = js.native
  /**
  		 * Specifies that group members will be sorted by first name.
  		 */
  val CONTACTS_SORT_FIRST_NAME: Double = js.native
  /**
  		 * Specifies that group members will be sorted by last name.
  		 */
  val CONTACTS_SORT_LAST_NAME: Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * Returns an authorization constant indicating if the application has access to the address book.
  		 */
  val contactsAuthorization: Double = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Contacts.Group>.
  		 */
  def createGroup(): Group = js.native
  def createGroup(parameters: js.Any): Group = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Contacts.Person>, and commits all pending
  		 * changes to the underlying contacts database.
  		 */
  def createPerson(): Person = js.native
  def createPerson(parameters: js.Any): Person = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets all groups.
  		 */
  def getAllGroups(): js.Array[Group] = js.native
  /**
  		 * Gets all people, unless a limit is specified.
  		 */
  def getAllPeople(limit: Double): js.Array[Person] = js.native
  /**
  		 * Gets the value of the <Titanium.Contacts.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Contacts.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Contacts.contactsAuthorization> property.
  		 */
  def getContactsAuthorization(): Double = js.native
  /**
  		 * Gets the group with the specified identifier.
  		 */
  def getGroupByID(id: Double): Group = js.native
  /**
  		 * Gets the group with the specified identifier.
  		 */
  def getGroupByIdentifier(id: String): Group = js.native
  /**
  		 * Gets the value of the <Titanium.Contacts.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets people with a `firstName`, `middleName` or `lastName` field, or a combination
  		 * of these fields, that match the specified name.
  		 */
  def getPeopleWithName(name: String): js.Array[Person] = js.native
  /**
  		 * Gets the person with the specified identifier.
  		 */
  def getPersonByID(id: Double): Person = js.native
  /**
  		 * Gets the person with the specified identifier.
  		 */
  def getPersonByIdentifier(id: Double): Person = js.native
  /**
  		 * Returns `true` if the app has contacts access.
  		 */
  def hasContactsPermissions(): Boolean = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Removes a group from the address book.
  		 */
  def removeGroup(group: Group): Unit = js.native
  /**
  		 * Removes a contact from the address book.
  		 */
  def removePerson(person: Person): Unit = js.native
  /**
  		 * If authorization is unknown, will bring up a dialog requesting permission.
  		 */
  def requestAuthorization(callback: js.Function1[/* param0 */ ContactsAuthorizationResponse, _]): Unit = js.native
  /**
  		 * Requests for contacts access.
  		 */
  def requestContactsPermissions(callback: js.Function1[/* param0 */ ContactsAuthorizationResponse, _]): Unit = js.native
  /**
  		 * Reverts all changes made by the previous save to the address book. Deprecated for >= iOS9.
  		 */
  def revert(): Unit = js.native
  /**
  		 * Commits all pending changes to the underlying contacts database.
  		 */
  def save(contacts: js.Array[Person]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Contacts.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Contacts.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Contacts.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  		 * Displays a picker that allows a person to be selected.
  		 */
  def showContacts(params: showContactsParams): Unit = js.native
}

