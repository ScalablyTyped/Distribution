package typings.titanium.global.Titanium

import typings.titanium.ContactsAuthorizationResponse
import typings.titanium.Dictionary
import typings.titanium.Titanium.ContactsReloadEvent
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.showContactsParams
import typings.titanium.titaniumStrings.reload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Contacts {
  
  @JSGlobal("Titanium.Contacts")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
    * indicating that the application is authorized to use the address book.
    */
  @JSGlobal("Titanium.Contacts.AUTHORIZATION_AUTHORIZED")
  @js.native
  val AUTHORIZATION_AUTHORIZED: Double = js.native
  
  /**
    * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
    * indicating that the application is not authorized to use the address book.
    */
  @JSGlobal("Titanium.Contacts.AUTHORIZATION_DENIED")
  @js.native
  val AUTHORIZATION_DENIED: Double = js.native
  
  /**
    * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
    * indicating that the application is not authorized to use the address book *and*
    * the user cannot change this application's status.
    * @deprecated iOS 9 and later does not use this constant anymore. Use the other available constants instead.
    */
  @JSGlobal("Titanium.Contacts.AUTHORIZATION_RESTRICTED")
  @js.native
  val AUTHORIZATION_RESTRICTED: scala.Nothing = js.native
  
  /**
    * A [contactsAuthorization](Titanium.Contacts.contactsAuthorization) value
    * indicating that the authorization state is unknown.
    */
  @JSGlobal("Titanium.Contacts.AUTHORIZATION_UNKNOWN")
  @js.native
  val AUTHORIZATION_UNKNOWN: Double = js.native
  
  /**
    * Specifies that a contact is an organization.
    */
  @JSGlobal("Titanium.Contacts.CONTACTS_KIND_ORGANIZATION")
  @js.native
  val CONTACTS_KIND_ORGANIZATION: Double = js.native
  
  /**
    * Specifies that a contact is a person.
    */
  @JSGlobal("Titanium.Contacts.CONTACTS_KIND_PERSON")
  @js.native
  val CONTACTS_KIND_PERSON: Double = js.native
  
  /**
    * Specifies that group members will be sorted by first name.
    */
  @JSGlobal("Titanium.Contacts.CONTACTS_SORT_FIRST_NAME")
  @js.native
  val CONTACTS_SORT_FIRST_NAME: Double = js.native
  
  /**
    * Specifies that group members will be sorted by last name.
    */
  @JSGlobal("Titanium.Contacts.CONTACTS_SORT_LAST_NAME")
  @js.native
  val CONTACTS_SORT_LAST_NAME: Double = js.native
  
  /**
    * An object which represents a group in the system contacts address book.
    */
  @JSGlobal("Titanium.Contacts.Group")
  @js.native
  class Group ()
    extends typings.titanium.Titanium.Contacts.Group
  
  /**
    * An object that represents a contact record for a person or organization in the system contacts
    * address book.
    */
  @JSGlobal("Titanium.Contacts.Person")
  @js.native
  class Person ()
    extends typings.titanium.Titanium.Contacts.Person
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.addEventListener")
  @js.native
  def addEventListener_reload(
    name: reload,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Contacts, /* event */ ContactsReloadEvent, Unit]
  ): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Returns an authorization constant indicating if the application has access to the address book.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.contactsAuthorization")
  @js.native
  val contactsAuthorization: Double = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Contacts.Group>.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.createGroup")
  @js.native
  def createGroup(): typings.titanium.Titanium.Contacts.Group = js.native
  @JSGlobal("Titanium.Contacts.createGroup")
  @js.native
  def createGroup(parameters: Dictionary[typings.titanium.Titanium.Contacts.Group]): typings.titanium.Titanium.Contacts.Group = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Contacts.Person>, and commits all pending
    * changes to the underlying contacts database.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.createPerson")
  @js.native
  def createPerson(): typings.titanium.Titanium.Contacts.Person = js.native
  @JSGlobal("Titanium.Contacts.createPerson")
  @js.native
  def createPerson(parameters: Dictionary[typings.titanium.Titanium.Contacts.Person]): typings.titanium.Titanium.Contacts.Person = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Contacts.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.fireEvent")
  @js.native
  def fireEvent_reload(name: reload): Unit = js.native
  @JSGlobal("Titanium.Contacts.fireEvent")
  @js.native
  def fireEvent_reload(name: reload, event: ContactsReloadEvent): Unit = js.native
  
  /**
    * Gets all groups.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getAllGroups")
  @js.native
  def getAllGroups(): js.Array[typings.titanium.Titanium.Contacts.Group] = js.native
  
  /**
    * Gets all people, unless a limit is specified.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getAllPeople")
  @js.native
  def getAllPeople(limit: Double): js.Array[typings.titanium.Titanium.Contacts.Person] = js.native
  
  /**
    * Gets the value of the <Titanium.Contacts.apiName> property.
    * @deprecated Access <Titanium.Contacts.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Contacts.bubbleParent> property.
    * @deprecated Access <Titanium.Contacts.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Contacts.contactsAuthorization> property.
    * @deprecated Access <Titanium.Contacts.contactsAuthorization> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getContactsAuthorization")
  @js.native
  def getContactsAuthorization(): Double = js.native
  
  /**
    * Gets the group with the specified identifier.
    * @deprecated Use [Titanium.Contacts.getGroupByIdentifier](Titanium.Contacts.getGroupByIdentifier) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getGroupByID")
  @js.native
  def getGroupByID: scala.Nothing = js.native
  @scala.inline
  def getGroupByID_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getGroupByID")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the group with the specified identifier.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getGroupByIdentifier")
  @js.native
  def getGroupByIdentifier(id: String): typings.titanium.Titanium.Contacts.Group = js.native
  
  /**
    * Gets the value of the <Titanium.Contacts.includeNote> property.
    * @deprecated Access <Titanium.Contacts.includeNote> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getIncludeNote")
  @js.native
  def getIncludeNote(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Contacts.lifecycleContainer> property.
    * @deprecated Access <Titanium.Contacts.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets people with a `firstName`, `middleName` or `lastName` field, or a combination
    * of these fields, that match the specified name.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getPeopleWithName")
  @js.native
  def getPeopleWithName(name: String): js.Array[typings.titanium.Titanium.Contacts.Person] = js.native
  
  /**
    * Gets the person with the specified identifier.
    * @deprecated Use [Titanium.Contacts.getPersonByIdentifier](Titanium.Contacts.getPersonByIdentifier) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getPersonByID")
  @js.native
  def getPersonByID: scala.Nothing = js.native
  @scala.inline
  def getPersonByID_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPersonByID")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the person with the specified identifier.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.getPersonByIdentifier")
  @js.native
  def getPersonByIdentifier(id: Double): typings.titanium.Titanium.Contacts.Person = js.native
  
  /**
    * Returns `true` if the app has contacts access.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.hasContactsPermissions")
  @js.native
  def hasContactsPermissions(): Boolean = js.native
  
  /**
    * A boolean value that indicates whether to fetch the notes stored in contacts or not.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.includeNote")
  @js.native
  def includeNote: Boolean = js.native
  @scala.inline
  def includeNote_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("includeNote")(x.asInstanceOf[js.Any])
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.removeEventListener")
  @js.native
  def removeEventListener_reload(
    name: reload,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Contacts, /* event */ ContactsReloadEvent, Unit]
  ): Unit = js.native
  
  /**
    * Removes a group from the address book.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.removeGroup")
  @js.native
  def removeGroup(group: typings.titanium.Titanium.Contacts.Group): Unit = js.native
  
  /**
    * Removes a contact from the address book.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.removePerson")
  @js.native
  def removePerson(person: typings.titanium.Titanium.Contacts.Person): Unit = js.native
  
  /**
    * If authorization is unknown, will bring up a dialog requesting permission.
    * @deprecated Use [Titanium.Contacts.requestContactsPermissions](Titanium.Contacts.requestContactsPermissions) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.requestAuthorization")
  @js.native
  def requestAuthorization: scala.Nothing = js.native
  @scala.inline
  def requestAuthorization_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAuthorization")(x.asInstanceOf[js.Any])
  
  /**
    * Requests for contacts access.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.requestContactsPermissions")
  @js.native
  def requestContactsPermissions(callback: js.Function1[/* param0 */ ContactsAuthorizationResponse, Unit]): Unit = js.native
  
  /**
    * Reverts all changes made by the previous save to the address book. Deprecated for >= iOS9.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.revert")
  @js.native
  def revert(): Unit = js.native
  
  /**
    * Commits all pending changes to the underlying contacts database.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.save")
  @js.native
  def save(contacts: js.Array[typings.titanium.Titanium.Contacts.Person]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Contacts.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Contacts.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Contacts.includeNote> property.
    * @deprecated Set the value using <Titanium.Contacts.includeNote> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.setIncludeNote")
  @js.native
  def setIncludeNote(includeNote: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Contacts.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Contacts.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Contacts.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Displays a picker that allows a person to be selected.
    */
  /* static member */
  @JSGlobal("Titanium.Contacts.showContacts")
  @js.native
  def showContacts(params: showContactsParams): Unit = js.native
}
