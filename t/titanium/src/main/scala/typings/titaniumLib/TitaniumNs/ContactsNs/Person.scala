package typings
package titaniumLib.TitaniumNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a contact record for a person or organization in the system contacts
		 * address book.
		 */

trait Person
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Addresses for the person. Multi-value. Read-only on Android.
  			 */
  var address: js.Any
  /**
  			 * Alternate birthday of the person. Single Dictionary.
  			 */
  var alternateBirthday: js.Any
  /**
  			 * Date of birth of the person. Single value.
  			 */
  var birthday: java.lang.String
  /**
  			 * Date and time that the person record was created. Single value. Deprecated since iOS 9.
  			 */
  val created: java.lang.String
  /**
  			 * Dates associated with the person. Multi-value.
  			 */
  var date: js.Any
  /**
  			 * Department of the person. Single value.
  			 */
  var department: java.lang.String
  /**
  			 * Email addresses for the person. Multi-value. Read-only on Android.
  			 */
  var email: js.Any
  /**
  			 * First name of the person. Single value.
  			 */
  var firstName: java.lang.String
  /**
  			 * Phonetic first name of the person.  Single value.
  			 */
  var firstPhonetic: java.lang.String
  /**
  			 * Localized full name of the person. Single value. Read-only on Android.
  			 */
  val fullName: java.lang.String
  /**
  			 * Record identifier of the person. Single value.
  			 */
  val id: scala.Double
  /**
  			 * Identifier of the person.
  			 */
  val identifier: java.lang.String
  /**
  			 * Image for the person. Single value. Read-only for >= iOS9
  			 */
  var image: titaniumLib.TitaniumNs.Blob
  /**
  			 * Instant messenger information of the person. Multi-value.
  			 */
  var instantMessage: js.Any
  /**
  			 * Job title of the person. Single value.
  			 */
  var jobTitle: java.lang.String
  /**
  			 * Determines the type of information the person record contains; either person or organization.
  			 * Read-only on Android.
  			 */
  var kind: scala.Double
  /**
  			 * Last name of the person. Single value.
  			 */
  var lastName: java.lang.String
  /**
  			 * Phonetic last name of the person. Single value.
  			 */
  var lastPhonetic: java.lang.String
  /**
  			 * Middle name of the person. Single value.
  			 */
  var middleName: java.lang.String
  /**
  			 * Phonetic middle name of the person. Single value.
  			 */
  var middlePhonetic: java.lang.String
  /**
  			 * Date and time that the person record was last modified. Single value. Deprecated since iOS 9.
  			 */
  val modified: java.lang.String
  /**
  			 * Nickname of the person. Single value.
  			 */
  var nickname: java.lang.String
  /**
  			 * Notes for the person. Single value.
  			 */
  var note: java.lang.String
  /**
  			 * Organization to which the person belongs. Single value.
  			 */
  var organization: java.lang.String
  /**
  			 * Phone numbers for the person. Multi-value. Read-only on Android.
  			 */
  var phone: js.Any
  /**
  			 * Prefix for the person. Single value.
  			 */
  val prefix: java.lang.String
  /**
  			 * Record identifier of the person. Single value. Deprecated since iOS 9.
  			 */
  var recordId: scala.Double
  /**
  			 * Names of people to which the person is related. Multi-value.
  			 */
  var relatedNames: js.Any
  /**
  			 * Social profile information of the person. Multi-value.
  			 */
  var socialProfile: js.Any
  /**
  			 * Suffix for the person. Single value.
  			 */
  val suffix: java.lang.String
  /**
  			 * URLs of webpages associated with the person. Multi-value.
  			 */
  var url: js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.address> property.
  			 */
  def getAddress(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.alternateBirthday> property.
  			 */
  def getAlternateBirthday(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.birthday> property.
  			 */
  def getBirthday(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.created> property.
  			 */
  def getCreated(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.date> property.
  			 */
  def getDate(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.department> property.
  			 */
  def getDepartment(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.email> property.
  			 */
  def getEmail(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.firstName> property.
  			 */
  def getFirstName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.firstPhonetic> property.
  			 */
  def getFirstPhonetic(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.fullName> property.
  			 */
  def getFullName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.id> property.
  			 */
  def getId(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.identifier> property.
  			 */
  def getIdentifier(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.image> property.
  			 */
  def getImage(): titaniumLib.TitaniumNs.Blob
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.instantMessage> property.
  			 */
  def getInstantMessage(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.jobTitle> property.
  			 */
  def getJobTitle(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.kind> property.
  			 */
  def getKind(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.lastName> property.
  			 */
  def getLastName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.lastPhonetic> property.
  			 */
  def getLastPhonetic(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.middleName> property.
  			 */
  def getMiddleName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.middlePhonetic> property.
  			 */
  def getMiddlePhonetic(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.modified> property.
  			 */
  def getModified(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.nickname> property.
  			 */
  def getNickname(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.note> property.
  			 */
  def getNote(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.organization> property.
  			 */
  def getOrganization(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.phone> property.
  			 */
  def getPhone(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.prefix> property.
  			 */
  def getPrefix(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.recordId> property.
  			 */
  def getRecordId(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.relatedNames> property.
  			 */
  def getRelatedNames(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.socialProfile> property.
  			 */
  def getSocialProfile(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.suffix> property.
  			 */
  def getSuffix(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.url> property.
  			 */
  def getUrl(): js.Any
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.address> property.
  			 */
  def setAddress(address: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.alternateBirthday> property.
  			 */
  def setAlternateBirthday(alternateBirthday: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.birthday> property.
  			 */
  def setBirthday(birthday: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.date> property.
  			 */
  def setDate(date: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.department> property.
  			 */
  def setDepartment(department: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.email> property.
  			 */
  def setEmail(email: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.firstName> property.
  			 */
  def setFirstName(firstName: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.firstPhonetic> property.
  			 */
  def setFirstPhonetic(firstPhonetic: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.image> property.
  			 */
  def setImage(image: titaniumLib.TitaniumNs.Blob): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.instantMessage> property.
  			 */
  def setInstantMessage(instantMessage: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.jobTitle> property.
  			 */
  def setJobTitle(jobTitle: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.kind> property.
  			 */
  def setKind(kind: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.lastName> property.
  			 */
  def setLastName(lastName: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.lastPhonetic> property.
  			 */
  def setLastPhonetic(lastPhonetic: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.middleName> property.
  			 */
  def setMiddleName(middleName: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.middlePhonetic> property.
  			 */
  def setMiddlePhonetic(middlePhonetic: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.nickname> property.
  			 */
  def setNickname(nickname: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.note> property.
  			 */
  def setNote(note: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.organization> property.
  			 */
  def setOrganization(organization: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.phone> property.
  			 */
  def setPhone(phone: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.recordId> property.
  			 */
  def setRecordId(recordId: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.relatedNames> property.
  			 */
  def setRelatedNames(relatedNames: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.socialProfile> property.
  			 */
  def setSocialProfile(socialProfile: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.url> property.
  			 */
  def setUrl(url: js.Any): scala.Unit
}

