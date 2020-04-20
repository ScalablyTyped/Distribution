package typings.titanium.Titanium

import typings.titanium.ContactsAuthorizationResponse
import typings.titanium.Dictionary
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
class Contacts () extends Module

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
  class Group () extends Proxy {
    /**
    			 * Identifier of the group.
    			 */
    val identifier: String = js.native
    /**
    			 * Name of this group.
    			 */
    var name: String = js.native
    /**
    			 * Record identifier of the group. Single value. Deprecated for iOS 9 and later.
    			 */
    var recordId: Double = js.native
    /**
    			 * Adds a person to this group.
    			 */
    def add(person: Person): Unit = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Group.identifier> property.
    			 * @deprecated Access <Titanium.Contacts.Group.identifier> instead.
    			 */
    def getIdentifier(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Group.name> property.
    			 * @deprecated Access <Titanium.Contacts.Group.name> instead.
    			 */
    def getName(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Group.recordId> property.
    			 * @deprecated Access <Titanium.Contacts.Group.recordId> instead.
    			 */
    def getRecordId(): Double = js.native
    /**
    			 * Gets people that are members of this group.
    			 */
    def members(): js.Array[Person] = js.native
    /**
    			 * Removes a person from this group. For >= iOS9, it is not
    			 * required to call <Titanium.Contacts.save> after calling this method.
    			 */
    def remove(person: Person): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Group.name> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Group.name> instead.
    			 */
    def setName(name: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Group.recordId> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Group.recordId> instead.
    			 */
    def setRecordId(recordId: Double): Unit = js.native
    /**
    			 * Gets people that are members of this group, sorted in the specified order.
    			 */
    def sortedMembers(sortBy: Double): js.Array[Person] = js.native
  }
  
  /**
  		 * An object that represents a contact record for a person or organization in the system contacts
  		 * address book.
  		 */
  @js.native
  class Person () extends Proxy {
    /**
    			 * Addresses for the person. Multi-value. Read-only on Android.
    			 */
    var address: js.Any = js.native
    /**
    			 * Alternate birthday of the person. Single Dictionary.
    			 */
    var alternateBirthday: js.Any = js.native
    /**
    			 * Date of birth of the person. Single value.
    			 */
    var birthday: String = js.native
    /**
    			 * Date and time that the person record was created. Single value. Deprecated since iOS 9.
    			 */
    val created: String = js.native
    /**
    			 * Dates associated with the person. Multi-value.
    			 */
    var date: js.Any = js.native
    /**
    			 * Department of the person. Single value.
    			 */
    var department: String = js.native
    /**
    			 * Email addresses for the person. Multi-value. Read-only on Android.
    			 */
    var email: js.Any = js.native
    /**
    			 * First name of the person. Single value.
    			 */
    var firstName: String = js.native
    /**
    			 * Phonetic first name of the person.  Single value.
    			 */
    var firstPhonetic: String = js.native
    /**
    			 * Localized full name of the person. Single value. Read-only on Android.
    			 */
    val fullName: String = js.native
    /**
    			 * Record identifier of the person. Single value.
    			 */
    @JSName("id")
    val id_Person: Double = js.native
    /**
    			 * Identifier of the person.
    			 */
    val identifier: String = js.native
    /**
    			 * Image for the person. Single value. Read-only for >= iOS9
    			 */
    var image: Blob = js.native
    /**
    			 * Instant messenger information of the person. Multi-value.
    			 */
    var instantMessage: js.Any = js.native
    /**
    			 * Job title of the person. Single value.
    			 */
    var jobTitle: String = js.native
    /**
    			 * Determines the type of information the person record contains; either person or organization.
    			 * Read-only on Android.
    			 */
    var kind: Double = js.native
    /**
    			 * Last name of the person. Single value.
    			 */
    var lastName: String = js.native
    /**
    			 * Phonetic last name of the person. Single value.
    			 */
    var lastPhonetic: String = js.native
    /**
    			 * Middle name of the person. Single value.
    			 */
    var middleName: String = js.native
    /**
    			 * Phonetic middle name of the person. Single value.
    			 */
    var middlePhonetic: String = js.native
    /**
    			 * Date and time that the person record was last modified. Single value. Deprecated since iOS 9.
    			 */
    val modified: String = js.native
    /**
    			 * Nickname of the person. Single value.
    			 */
    var nickname: String = js.native
    /**
    			 * Notes for the person. Single value.
    			 */
    var note: String = js.native
    /**
    			 * Organization to which the person belongs. Single value.
    			 */
    var organization: String = js.native
    /**
    			 * Phone numbers for the person. Multi-value. Read-only on Android.
    			 */
    var phone: js.Any = js.native
    /**
    			 * Prefix for the person. Single value.
    			 */
    val prefix: String = js.native
    /**
    			 * Record identifier of the person. Single value. Deprecated since iOS 9.
    			 */
    var recordId: Double = js.native
    /**
    			 * Names of people to which the person is related. Multi-value.
    			 */
    var relatedNames: js.Any = js.native
    /**
    			 * Social profile information of the person. Multi-value.
    			 */
    var socialProfile: js.Any = js.native
    /**
    			 * Suffix for the person. Single value.
    			 */
    val suffix: String = js.native
    /**
    			 * URLs of webpages associated with the person. Multi-value.
    			 */
    var url: js.Any = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.address> property.
    			 * @deprecated Access <Titanium.Contacts.Person.address> instead.
    			 */
    def getAddress(): js.Any = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.alternateBirthday> property.
    			 * @deprecated Access <Titanium.Contacts.Person.alternateBirthday> instead.
    			 */
    def getAlternateBirthday(): js.Any = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.birthday> property.
    			 * @deprecated Access <Titanium.Contacts.Person.birthday> instead.
    			 */
    def getBirthday(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.created> property.
    			 * @deprecated Access <Titanium.Contacts.Person.created> instead.
    			 */
    def getCreated(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.date> property.
    			 * @deprecated Access <Titanium.Contacts.Person.date> instead.
    			 */
    def getDate(): js.Any = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.department> property.
    			 * @deprecated Access <Titanium.Contacts.Person.department> instead.
    			 */
    def getDepartment(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.email> property.
    			 * @deprecated Access <Titanium.Contacts.Person.email> instead.
    			 */
    def getEmail(): js.Any = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.firstName> property.
    			 * @deprecated Access <Titanium.Contacts.Person.firstName> instead.
    			 */
    def getFirstName(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.firstPhonetic> property.
    			 * @deprecated Access <Titanium.Contacts.Person.firstPhonetic> instead.
    			 */
    def getFirstPhonetic(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.fullName> property.
    			 * @deprecated Access <Titanium.Contacts.Person.fullName> instead.
    			 */
    def getFullName(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.id> property.
    			 * @deprecated Access <Titanium.Contacts.Person.id> instead.
    			 */
    def getId(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.identifier> property.
    			 * @deprecated Access <Titanium.Contacts.Person.identifier> instead.
    			 */
    def getIdentifier(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.image> property.
    			 * @deprecated Access <Titanium.Contacts.Person.image> instead.
    			 */
    def getImage(): Blob = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.instantMessage> property.
    			 * @deprecated Access <Titanium.Contacts.Person.instantMessage> instead.
    			 */
    def getInstantMessage(): js.Any = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.jobTitle> property.
    			 * @deprecated Access <Titanium.Contacts.Person.jobTitle> instead.
    			 */
    def getJobTitle(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.kind> property.
    			 * @deprecated Access <Titanium.Contacts.Person.kind> instead.
    			 */
    def getKind(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.lastName> property.
    			 * @deprecated Access <Titanium.Contacts.Person.lastName> instead.
    			 */
    def getLastName(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.lastPhonetic> property.
    			 * @deprecated Access <Titanium.Contacts.Person.lastPhonetic> instead.
    			 */
    def getLastPhonetic(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.middleName> property.
    			 * @deprecated Access <Titanium.Contacts.Person.middleName> instead.
    			 */
    def getMiddleName(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.middlePhonetic> property.
    			 * @deprecated Access <Titanium.Contacts.Person.middlePhonetic> instead.
    			 */
    def getMiddlePhonetic(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.modified> property.
    			 * @deprecated Access <Titanium.Contacts.Person.modified> instead.
    			 */
    def getModified(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.nickname> property.
    			 * @deprecated Access <Titanium.Contacts.Person.nickname> instead.
    			 */
    def getNickname(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.note> property.
    			 * @deprecated Access <Titanium.Contacts.Person.note> instead.
    			 */
    def getNote(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.organization> property.
    			 * @deprecated Access <Titanium.Contacts.Person.organization> instead.
    			 */
    def getOrganization(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.phone> property.
    			 * @deprecated Access <Titanium.Contacts.Person.phone> instead.
    			 */
    def getPhone(): js.Any = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.prefix> property.
    			 * @deprecated Access <Titanium.Contacts.Person.prefix> instead.
    			 */
    def getPrefix(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.recordId> property.
    			 * @deprecated Access <Titanium.Contacts.Person.recordId> instead.
    			 */
    def getRecordId(): Double = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.relatedNames> property.
    			 * @deprecated Access <Titanium.Contacts.Person.relatedNames> instead.
    			 */
    def getRelatedNames(): js.Any = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.socialProfile> property.
    			 * @deprecated Access <Titanium.Contacts.Person.socialProfile> instead.
    			 */
    def getSocialProfile(): js.Any = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.suffix> property.
    			 * @deprecated Access <Titanium.Contacts.Person.suffix> instead.
    			 */
    def getSuffix(): String = js.native
    /**
    			 * Gets the value of the <Titanium.Contacts.Person.url> property.
    			 * @deprecated Access <Titanium.Contacts.Person.url> instead.
    			 */
    def getUrl(): js.Any = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.address> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.address> instead.
    			 */
    def setAddress(address: js.Any): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.alternateBirthday> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.alternateBirthday> instead.
    			 */
    def setAlternateBirthday(alternateBirthday: js.Any): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.birthday> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.birthday> instead.
    			 */
    def setBirthday(birthday: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.date> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.date> instead.
    			 */
    def setDate(date: js.Any): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.department> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.department> instead.
    			 */
    def setDepartment(department: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.email> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.email> instead.
    			 */
    def setEmail(email: js.Any): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.firstName> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.firstName> instead.
    			 */
    def setFirstName(firstName: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.firstPhonetic> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.firstPhonetic> instead.
    			 */
    def setFirstPhonetic(firstPhonetic: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.image> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.image> instead.
    			 */
    def setImage(image: Blob): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.instantMessage> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.instantMessage> instead.
    			 */
    def setInstantMessage(instantMessage: js.Any): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.jobTitle> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.jobTitle> instead.
    			 */
    def setJobTitle(jobTitle: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.kind> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.kind> instead.
    			 */
    def setKind(kind: Double): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.lastName> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.lastName> instead.
    			 */
    def setLastName(lastName: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.lastPhonetic> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.lastPhonetic> instead.
    			 */
    def setLastPhonetic(lastPhonetic: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.middleName> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.middleName> instead.
    			 */
    def setMiddleName(middleName: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.middlePhonetic> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.middlePhonetic> instead.
    			 */
    def setMiddlePhonetic(middlePhonetic: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.nickname> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.nickname> instead.
    			 */
    def setNickname(nickname: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.note> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.note> instead.
    			 */
    def setNote(note: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.organization> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.organization> instead.
    			 */
    def setOrganization(organization: String): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.phone> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.phone> instead.
    			 */
    def setPhone(phone: js.Any): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.recordId> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.recordId> instead.
    			 */
    def setRecordId(recordId: Double): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.relatedNames> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.relatedNames> instead.
    			 */
    def setRelatedNames(relatedNames: js.Any): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.socialProfile> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.socialProfile> instead.
    			 */
    def setSocialProfile(socialProfile: js.Any): Unit = js.native
    /**
    			 * Sets the value of the <Titanium.Contacts.Person.url> property.
    			 * @deprecated Set the value using <Titanium.Contacts.Person.url> instead.
    			 */
    def setUrl(url: js.Any): Unit = js.native
  }
  
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
  def createGroup(): Group = js.native
  def createGroup(parameters: Dictionary[Group]): Group = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Contacts.Person>, and commits all pending
  		 * changes to the underlying contacts database.
  		 */
  def createPerson(): Person = js.native
  def createPerson(parameters: Dictionary[Person]): Person = js.native
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
  def getAllGroups(): js.Array[Group] = js.native
  /**
  		 * Gets all people, unless a limit is specified.
  		 */
  def getAllPeople(limit: Double): js.Array[Person] = js.native
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
  def getGroupByIdentifier(id: String): Group = js.native
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
  def getPeopleWithName(name: String): js.Array[Person] = js.native
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
  def removeGroup(group: Group): Unit = js.native
  /**
  		 * Removes a contact from the address book.
  		 */
  def removePerson(person: Person): Unit = js.native
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
  def save(contacts: js.Array[Person]): Unit = js.native
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

