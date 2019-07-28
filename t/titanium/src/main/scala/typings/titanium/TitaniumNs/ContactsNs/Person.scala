package typings.titanium.TitaniumNs.ContactsNs

import typings.titanium.TitaniumNs.Blob
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a contact record for a person or organization in the system contacts
		 * address book.
		 */
trait Person extends Proxy {
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
  var birthday: String
  /**
  			 * Date and time that the person record was created. Single value. Deprecated since iOS 9.
  			 */
  val created: String
  /**
  			 * Dates associated with the person. Multi-value.
  			 */
  var date: js.Any
  /**
  			 * Department of the person. Single value.
  			 */
  var department: String
  /**
  			 * Email addresses for the person. Multi-value. Read-only on Android.
  			 */
  var email: js.Any
  /**
  			 * First name of the person. Single value.
  			 */
  var firstName: String
  /**
  			 * Phonetic first name of the person.  Single value.
  			 */
  var firstPhonetic: String
  /**
  			 * Localized full name of the person. Single value. Read-only on Android.
  			 */
  val fullName: String
  /**
  			 * Record identifier of the person. Single value.
  			 */
  val id: Double
  /**
  			 * Identifier of the person.
  			 */
  val identifier: String
  /**
  			 * Image for the person. Single value. Read-only for >= iOS9
  			 */
  var image: Blob
  /**
  			 * Instant messenger information of the person. Multi-value.
  			 */
  var instantMessage: js.Any
  /**
  			 * Job title of the person. Single value.
  			 */
  var jobTitle: String
  /**
  			 * Determines the type of information the person record contains; either person or organization.
  			 * Read-only on Android.
  			 */
  var kind: Double
  /**
  			 * Last name of the person. Single value.
  			 */
  var lastName: String
  /**
  			 * Phonetic last name of the person. Single value.
  			 */
  var lastPhonetic: String
  /**
  			 * Middle name of the person. Single value.
  			 */
  var middleName: String
  /**
  			 * Phonetic middle name of the person. Single value.
  			 */
  var middlePhonetic: String
  /**
  			 * Date and time that the person record was last modified. Single value. Deprecated since iOS 9.
  			 */
  val modified: String
  /**
  			 * Nickname of the person. Single value.
  			 */
  var nickname: String
  /**
  			 * Notes for the person. Single value.
  			 */
  var note: String
  /**
  			 * Organization to which the person belongs. Single value.
  			 */
  var organization: String
  /**
  			 * Phone numbers for the person. Multi-value. Read-only on Android.
  			 */
  var phone: js.Any
  /**
  			 * Prefix for the person. Single value.
  			 */
  val prefix: String
  /**
  			 * Record identifier of the person. Single value. Deprecated since iOS 9.
  			 */
  var recordId: Double
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
  val suffix: String
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
  def getBirthday(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.created> property.
  			 */
  def getCreated(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.date> property.
  			 */
  def getDate(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.department> property.
  			 */
  def getDepartment(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.email> property.
  			 */
  def getEmail(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.firstName> property.
  			 */
  def getFirstName(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.firstPhonetic> property.
  			 */
  def getFirstPhonetic(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.fullName> property.
  			 */
  def getFullName(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.id> property.
  			 */
  def getId(): Double
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.identifier> property.
  			 */
  def getIdentifier(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.image> property.
  			 */
  def getImage(): Blob
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.instantMessage> property.
  			 */
  def getInstantMessage(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.jobTitle> property.
  			 */
  def getJobTitle(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.kind> property.
  			 */
  def getKind(): Double
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.lastName> property.
  			 */
  def getLastName(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.lastPhonetic> property.
  			 */
  def getLastPhonetic(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.middleName> property.
  			 */
  def getMiddleName(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.middlePhonetic> property.
  			 */
  def getMiddlePhonetic(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.modified> property.
  			 */
  def getModified(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.nickname> property.
  			 */
  def getNickname(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.note> property.
  			 */
  def getNote(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.organization> property.
  			 */
  def getOrganization(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.phone> property.
  			 */
  def getPhone(): js.Any
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.prefix> property.
  			 */
  def getPrefix(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.recordId> property.
  			 */
  def getRecordId(): Double
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
  def getSuffix(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Person.url> property.
  			 */
  def getUrl(): js.Any
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.address> property.
  			 */
  def setAddress(address: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.alternateBirthday> property.
  			 */
  def setAlternateBirthday(alternateBirthday: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.birthday> property.
  			 */
  def setBirthday(birthday: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.date> property.
  			 */
  def setDate(date: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.department> property.
  			 */
  def setDepartment(department: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.email> property.
  			 */
  def setEmail(email: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.firstName> property.
  			 */
  def setFirstName(firstName: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.firstPhonetic> property.
  			 */
  def setFirstPhonetic(firstPhonetic: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.image> property.
  			 */
  def setImage(image: Blob): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.instantMessage> property.
  			 */
  def setInstantMessage(instantMessage: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.jobTitle> property.
  			 */
  def setJobTitle(jobTitle: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.kind> property.
  			 */
  def setKind(kind: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.lastName> property.
  			 */
  def setLastName(lastName: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.lastPhonetic> property.
  			 */
  def setLastPhonetic(lastPhonetic: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.middleName> property.
  			 */
  def setMiddleName(middleName: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.middlePhonetic> property.
  			 */
  def setMiddlePhonetic(middlePhonetic: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.nickname> property.
  			 */
  def setNickname(nickname: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.note> property.
  			 */
  def setNote(note: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.organization> property.
  			 */
  def setOrganization(organization: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.phone> property.
  			 */
  def setPhone(phone: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.recordId> property.
  			 */
  def setRecordId(recordId: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.relatedNames> property.
  			 */
  def setRelatedNames(relatedNames: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.socialProfile> property.
  			 */
  def setSocialProfile(socialProfile: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Person.url> property.
  			 */
  def setUrl(url: js.Any): Unit
}

object Person {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    address: js.Any,
    alternateBirthday: js.Any,
    apiName: String,
    applyProperties: js.Any => Unit,
    birthday: String,
    bubbleParent: Boolean,
    created: String,
    date: js.Any,
    department: String,
    email: js.Any,
    fireEvent: (String, js.Any) => Unit,
    firstName: String,
    firstPhonetic: String,
    fullName: String,
    getAddress: () => js.Any,
    getAlternateBirthday: () => js.Any,
    getApiName: () => String,
    getBirthday: () => String,
    getBubbleParent: () => Boolean,
    getCreated: () => String,
    getDate: () => js.Any,
    getDepartment: () => String,
    getEmail: () => js.Any,
    getFirstName: () => String,
    getFirstPhonetic: () => String,
    getFullName: () => String,
    getId: () => Double,
    getIdentifier: () => String,
    getImage: () => Blob,
    getInstantMessage: () => js.Any,
    getJobTitle: () => String,
    getKind: () => Double,
    getLastName: () => String,
    getLastPhonetic: () => String,
    getMiddleName: () => String,
    getMiddlePhonetic: () => String,
    getModified: () => String,
    getNickname: () => String,
    getNote: () => String,
    getOrganization: () => String,
    getPhone: () => js.Any,
    getPrefix: () => String,
    getRecordId: () => Double,
    getRelatedNames: () => js.Any,
    getSocialProfile: () => js.Any,
    getSuffix: () => String,
    getUrl: () => js.Any,
    id: Double,
    identifier: String,
    image: Blob,
    instantMessage: js.Any,
    jobTitle: String,
    kind: Double,
    lastName: String,
    lastPhonetic: String,
    middleName: String,
    middlePhonetic: String,
    modified: String,
    nickname: String,
    note: String,
    organization: String,
    phone: js.Any,
    prefix: String,
    recordId: Double,
    relatedNames: js.Any,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setAddress: js.Any => Unit,
    setAlternateBirthday: js.Any => Unit,
    setBirthday: String => Unit,
    setBubbleParent: Boolean => Unit,
    setDate: js.Any => Unit,
    setDepartment: String => Unit,
    setEmail: js.Any => Unit,
    setFirstName: String => Unit,
    setFirstPhonetic: String => Unit,
    setImage: Blob => Unit,
    setInstantMessage: js.Any => Unit,
    setJobTitle: String => Unit,
    setKind: Double => Unit,
    setLastName: String => Unit,
    setLastPhonetic: String => Unit,
    setMiddleName: String => Unit,
    setMiddlePhonetic: String => Unit,
    setNickname: String => Unit,
    setNote: String => Unit,
    setOrganization: String => Unit,
    setPhone: js.Any => Unit,
    setRecordId: Double => Unit,
    setRelatedNames: js.Any => Unit,
    setSocialProfile: js.Any => Unit,
    setUrl: js.Any => Unit,
    socialProfile: js.Any,
    suffix: String,
    url: js.Any,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Person = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), address = address, alternateBirthday = alternateBirthday, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), birthday = birthday, bubbleParent = bubbleParent, created = created, date = date, department = department, email = email, fireEvent = js.Any.fromFunction2(fireEvent), firstName = firstName, firstPhonetic = firstPhonetic, fullName = fullName, getAddress = js.Any.fromFunction0(getAddress), getAlternateBirthday = js.Any.fromFunction0(getAlternateBirthday), getApiName = js.Any.fromFunction0(getApiName), getBirthday = js.Any.fromFunction0(getBirthday), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getCreated = js.Any.fromFunction0(getCreated), getDate = js.Any.fromFunction0(getDate), getDepartment = js.Any.fromFunction0(getDepartment), getEmail = js.Any.fromFunction0(getEmail), getFirstName = js.Any.fromFunction0(getFirstName), getFirstPhonetic = js.Any.fromFunction0(getFirstPhonetic), getFullName = js.Any.fromFunction0(getFullName), getId = js.Any.fromFunction0(getId), getIdentifier = js.Any.fromFunction0(getIdentifier), getImage = js.Any.fromFunction0(getImage), getInstantMessage = js.Any.fromFunction0(getInstantMessage), getJobTitle = js.Any.fromFunction0(getJobTitle), getKind = js.Any.fromFunction0(getKind), getLastName = js.Any.fromFunction0(getLastName), getLastPhonetic = js.Any.fromFunction0(getLastPhonetic), getMiddleName = js.Any.fromFunction0(getMiddleName), getMiddlePhonetic = js.Any.fromFunction0(getMiddlePhonetic), getModified = js.Any.fromFunction0(getModified), getNickname = js.Any.fromFunction0(getNickname), getNote = js.Any.fromFunction0(getNote), getOrganization = js.Any.fromFunction0(getOrganization), getPhone = js.Any.fromFunction0(getPhone), getPrefix = js.Any.fromFunction0(getPrefix), getRecordId = js.Any.fromFunction0(getRecordId), getRelatedNames = js.Any.fromFunction0(getRelatedNames), getSocialProfile = js.Any.fromFunction0(getSocialProfile), getSuffix = js.Any.fromFunction0(getSuffix), getUrl = js.Any.fromFunction0(getUrl), id = id, identifier = identifier, image = image, instantMessage = instantMessage, jobTitle = jobTitle, kind = kind, lastName = lastName, lastPhonetic = lastPhonetic, middleName = middleName, middlePhonetic = middlePhonetic, modified = modified, nickname = nickname, note = note, organization = organization, phone = phone, prefix = prefix, recordId = recordId, relatedNames = relatedNames, removeEventListener = js.Any.fromFunction2(removeEventListener), setAddress = js.Any.fromFunction1(setAddress), setAlternateBirthday = js.Any.fromFunction1(setAlternateBirthday), setBirthday = js.Any.fromFunction1(setBirthday), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDate = js.Any.fromFunction1(setDate), setDepartment = js.Any.fromFunction1(setDepartment), setEmail = js.Any.fromFunction1(setEmail), setFirstName = js.Any.fromFunction1(setFirstName), setFirstPhonetic = js.Any.fromFunction1(setFirstPhonetic), setImage = js.Any.fromFunction1(setImage), setInstantMessage = js.Any.fromFunction1(setInstantMessage), setJobTitle = js.Any.fromFunction1(setJobTitle), setKind = js.Any.fromFunction1(setKind), setLastName = js.Any.fromFunction1(setLastName), setLastPhonetic = js.Any.fromFunction1(setLastPhonetic), setMiddleName = js.Any.fromFunction1(setMiddleName), setMiddlePhonetic = js.Any.fromFunction1(setMiddlePhonetic), setNickname = js.Any.fromFunction1(setNickname), setNote = js.Any.fromFunction1(setNote), setOrganization = js.Any.fromFunction1(setOrganization), setPhone = js.Any.fromFunction1(setPhone), setRecordId = js.Any.fromFunction1(setRecordId), setRelatedNames = js.Any.fromFunction1(setRelatedNames), setSocialProfile = js.Any.fromFunction1(setSocialProfile), setUrl = js.Any.fromFunction1(setUrl), socialProfile = socialProfile, suffix = suffix, url = url)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Person]
  }
}

