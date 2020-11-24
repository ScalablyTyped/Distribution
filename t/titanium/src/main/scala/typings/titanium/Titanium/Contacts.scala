package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level Contacts module, used for accessing and modifying the system contacts address book.
  */
@JSGlobal("Titanium.Contacts")
@js.native
object Contacts extends js.Object {
  
  /**
    * An object which represents a group in the system contacts address book.
    */
  @js.native
  trait Group extends Proxy {
    
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
      * Identifier of the group.
      */
    val identifier: String = js.native
    
    /**
      * Gets people that are members of this group.
      */
    def members(): js.Array[Person] = js.native
    
    /**
      * Name of this group.
      */
    var name: String = js.native
    
    /**
      * Record identifier of the group. Single value. Deprecated for iOS 9 and later.
      */
    var recordId: Double = js.native
    
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
  trait Person extends Proxy {
    
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
  }
}
