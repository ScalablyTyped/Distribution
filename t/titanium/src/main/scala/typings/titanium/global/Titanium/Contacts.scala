package typings.titanium.global.Titanium

import typings.titanium.ContactsAuthorizationResponse
import typings.titanium.Dictionary
import typings.titanium.Titanium.ContactsReloadEvent
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.showContactsParams
import typings.titanium.titaniumStrings.reload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The top-level Contacts module, used for accessing and modifying the system contacts address book.
  */
@JSGlobal("Titanium.Contacts")
@js.native
class Contacts ()
  extends typings.titanium.Titanium.Proxy

/**
  * The top-level Contacts module, used for accessing and modifying the system contacts address book.
  */
/* static members */
@JSGlobal("Titanium.Contacts")
@js.native
object Contacts extends js.Object {
  /**
    * An object which represents a group in the system contacts address book.
    */
  @js.native
  class Group ()
    extends typings.titanium.Titanium.Contacts.Group
  
  /**
    * An object that represents a contact record for a person or organization in the system contacts
    * address book.
    */
  @js.native
  class Person ()
    extends typings.titanium.Titanium.Contacts.Person
  
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
    * @deprecated iOS 9 and later does not use this constant anymore. Use the other available constants instead.
    */
  val AUTHORIZATION_RESTRICTED: scala.Nothing = js.native
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
    * A boolean value that indicates whether to fetch the notes stored in contacts or not.
    */
  var includeNote: Boolean = js.native
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_reload(
    name: reload,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ContactsReloadEvent, Unit]
  ): Unit = js.native
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  /**
    * Creates and returns an instance of <Titanium.Contacts.Group>.
    */
  def createGroup(): typings.titanium.Titanium.Contacts.Group = js.native
  def createGroup(parameters: Dictionary[typings.titanium.Titanium.Contacts.Group]): typings.titanium.Titanium.Contacts.Group = js.native
  /**
    * Creates and returns an instance of <Titanium.Contacts.Person>, and commits all pending
    * changes to the underlying contacts database.
    */
  def createPerson(): typings.titanium.Titanium.Contacts.Person = js.native
  def createPerson(parameters: Dictionary[typings.titanium.Titanium.Contacts.Person]): typings.titanium.Titanium.Contacts.Person = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_reload(name: reload): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_reload(name: reload, event: ContactsReloadEvent): Unit = js.native
  /**
    * Gets all groups.
    */
  def getAllGroups(): js.Array[typings.titanium.Titanium.Contacts.Group] = js.native
  /**
    * Gets all people, unless a limit is specified.
    */
  def getAllPeople(limit: Double): js.Array[typings.titanium.Titanium.Contacts.Person] = js.native
  /**
    * Gets the value of the <Titanium.Contacts.apiName> property.
    * @deprecated Access <Titanium.Contacts.apiName> instead.
    */
  def getApiName(): String = js.native
  /**
    * Gets the value of the <Titanium.Contacts.bubbleParent> property.
    * @deprecated Access <Titanium.Contacts.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Contacts.contactsAuthorization> property.
    * @deprecated Access <Titanium.Contacts.contactsAuthorization> instead.
    */
  def getContactsAuthorization(): Double = js.native
  /**
    * Gets the group with the specified identifier.
    */
  def getGroupByIdentifier(id: String): typings.titanium.Titanium.Contacts.Group = js.native
  /**
    * Gets the value of the <Titanium.Contacts.includeNote> property.
    * @deprecated Access <Titanium.Contacts.includeNote> instead.
    */
  def getIncludeNote(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Contacts.lifecycleContainer> property.
    * @deprecated Access <Titanium.Contacts.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
    * Gets people with a `firstName`, `middleName` or `lastName` field, or a combination
    * of these fields, that match the specified name.
    */
  def getPeopleWithName(name: String): js.Array[typings.titanium.Titanium.Contacts.Person] = js.native
  /**
    * Gets the person with the specified identifier.
    */
  def getPersonByIdentifier(id: Double): typings.titanium.Titanium.Contacts.Person = js.native
  /**
    * Returns `true` if the app has contacts access.
    */
  def hasContactsPermissions(): Boolean = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_reload(
    name: reload,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ContactsReloadEvent, Unit]
  ): Unit = js.native
  /**
    * Removes a group from the address book.
    */
  def removeGroup(group: typings.titanium.Titanium.Contacts.Group): Unit = js.native
  /**
    * Removes a contact from the address book.
    */
  def removePerson(person: typings.titanium.Titanium.Contacts.Person): Unit = js.native
  /**
    * Requests for contacts access.
    */
  def requestContactsPermissions(callback: js.Function1[/* param0 */ ContactsAuthorizationResponse, Unit]): Unit = js.native
  /**
    * Reverts all changes made by the previous save to the address book. Deprecated for >= iOS9.
    */
  def revert(): Unit = js.native
  /**
    * Commits all pending changes to the underlying contacts database.
    */
  def save(contacts: js.Array[typings.titanium.Titanium.Contacts.Person]): Unit = js.native
  /**
    * Sets the value of the <Titanium.Contacts.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Contacts.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.Contacts.includeNote> property.
    * @deprecated Set the value using <Titanium.Contacts.includeNote> instead.
    */
  def setIncludeNote(includeNote: Boolean): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Contacts.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Contacts.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
    * Displays a picker that allows a person to be selected.
    */
  def showContacts(params: showContactsParams): Unit = js.native
}

