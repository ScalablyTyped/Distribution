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

object Person {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    address: js.Any,
    alternateBirthday: js.Any,
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    birthday: java.lang.String,
    bubbleParent: scala.Boolean,
    created: java.lang.String,
    date: js.Any,
    department: java.lang.String,
    email: js.Any,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    firstName: java.lang.String,
    firstPhonetic: java.lang.String,
    fullName: java.lang.String,
    getAddress: js.Function0[js.Any],
    getAlternateBirthday: js.Function0[js.Any],
    getApiName: js.Function0[java.lang.String],
    getBirthday: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getCreated: js.Function0[java.lang.String],
    getDate: js.Function0[js.Any],
    getDepartment: js.Function0[java.lang.String],
    getEmail: js.Function0[js.Any],
    getFirstName: js.Function0[java.lang.String],
    getFirstPhonetic: js.Function0[java.lang.String],
    getFullName: js.Function0[java.lang.String],
    getId: js.Function0[scala.Double],
    getIdentifier: js.Function0[java.lang.String],
    getImage: js.Function0[titaniumLib.TitaniumNs.Blob],
    getInstantMessage: js.Function0[js.Any],
    getJobTitle: js.Function0[java.lang.String],
    getKind: js.Function0[scala.Double],
    getLastName: js.Function0[java.lang.String],
    getLastPhonetic: js.Function0[java.lang.String],
    getMiddleName: js.Function0[java.lang.String],
    getMiddlePhonetic: js.Function0[java.lang.String],
    getModified: js.Function0[java.lang.String],
    getNickname: js.Function0[java.lang.String],
    getNote: js.Function0[java.lang.String],
    getOrganization: js.Function0[java.lang.String],
    getPhone: js.Function0[js.Any],
    getPrefix: js.Function0[java.lang.String],
    getRecordId: js.Function0[scala.Double],
    getRelatedNames: js.Function0[js.Any],
    getSocialProfile: js.Function0[js.Any],
    getSuffix: js.Function0[java.lang.String],
    getUrl: js.Function0[js.Any],
    id: scala.Double,
    identifier: java.lang.String,
    image: titaniumLib.TitaniumNs.Blob,
    instantMessage: js.Any,
    jobTitle: java.lang.String,
    kind: scala.Double,
    lastName: java.lang.String,
    lastPhonetic: java.lang.String,
    middleName: java.lang.String,
    middlePhonetic: java.lang.String,
    modified: java.lang.String,
    nickname: java.lang.String,
    note: java.lang.String,
    organization: java.lang.String,
    phone: js.Any,
    prefix: java.lang.String,
    recordId: scala.Double,
    relatedNames: js.Any,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setAddress: js.Function1[js.Any, scala.Unit],
    setAlternateBirthday: js.Function1[js.Any, scala.Unit],
    setBirthday: js.Function1[java.lang.String, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setDate: js.Function1[js.Any, scala.Unit],
    setDepartment: js.Function1[java.lang.String, scala.Unit],
    setEmail: js.Function1[js.Any, scala.Unit],
    setFirstName: js.Function1[java.lang.String, scala.Unit],
    setFirstPhonetic: js.Function1[java.lang.String, scala.Unit],
    setImage: js.Function1[titaniumLib.TitaniumNs.Blob, scala.Unit],
    setInstantMessage: js.Function1[js.Any, scala.Unit],
    setJobTitle: js.Function1[java.lang.String, scala.Unit],
    setKind: js.Function1[scala.Double, scala.Unit],
    setLastName: js.Function1[java.lang.String, scala.Unit],
    setLastPhonetic: js.Function1[java.lang.String, scala.Unit],
    setMiddleName: js.Function1[java.lang.String, scala.Unit],
    setMiddlePhonetic: js.Function1[java.lang.String, scala.Unit],
    setNickname: js.Function1[java.lang.String, scala.Unit],
    setNote: js.Function1[java.lang.String, scala.Unit],
    setOrganization: js.Function1[java.lang.String, scala.Unit],
    setPhone: js.Function1[js.Any, scala.Unit],
    setRecordId: js.Function1[scala.Double, scala.Unit],
    setRelatedNames: js.Function1[js.Any, scala.Unit],
    setSocialProfile: js.Function1[js.Any, scala.Unit],
    setUrl: js.Function1[js.Any, scala.Unit],
    socialProfile: js.Any,
    suffix: java.lang.String,
    url: js.Any,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Person = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("alternateBirthday")(alternateBirthday)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("birthday")(birthday)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("department")(department)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("firstName")(firstName)
    __obj.updateDynamic("firstPhonetic")(firstPhonetic)
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("getAddress")(getAddress)
    __obj.updateDynamic("getAlternateBirthday")(getAlternateBirthday)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBirthday")(getBirthday)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getCreated")(getCreated)
    __obj.updateDynamic("getDate")(getDate)
    __obj.updateDynamic("getDepartment")(getDepartment)
    __obj.updateDynamic("getEmail")(getEmail)
    __obj.updateDynamic("getFirstName")(getFirstName)
    __obj.updateDynamic("getFirstPhonetic")(getFirstPhonetic)
    __obj.updateDynamic("getFullName")(getFullName)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getIdentifier")(getIdentifier)
    __obj.updateDynamic("getImage")(getImage)
    __obj.updateDynamic("getInstantMessage")(getInstantMessage)
    __obj.updateDynamic("getJobTitle")(getJobTitle)
    __obj.updateDynamic("getKind")(getKind)
    __obj.updateDynamic("getLastName")(getLastName)
    __obj.updateDynamic("getLastPhonetic")(getLastPhonetic)
    __obj.updateDynamic("getMiddleName")(getMiddleName)
    __obj.updateDynamic("getMiddlePhonetic")(getMiddlePhonetic)
    __obj.updateDynamic("getModified")(getModified)
    __obj.updateDynamic("getNickname")(getNickname)
    __obj.updateDynamic("getNote")(getNote)
    __obj.updateDynamic("getOrganization")(getOrganization)
    __obj.updateDynamic("getPhone")(getPhone)
    __obj.updateDynamic("getPrefix")(getPrefix)
    __obj.updateDynamic("getRecordId")(getRecordId)
    __obj.updateDynamic("getRelatedNames")(getRelatedNames)
    __obj.updateDynamic("getSocialProfile")(getSocialProfile)
    __obj.updateDynamic("getSuffix")(getSuffix)
    __obj.updateDynamic("getUrl")(getUrl)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("instantMessage")(instantMessage)
    __obj.updateDynamic("jobTitle")(jobTitle)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("lastName")(lastName)
    __obj.updateDynamic("lastPhonetic")(lastPhonetic)
    __obj.updateDynamic("middleName")(middleName)
    __obj.updateDynamic("middlePhonetic")(middlePhonetic)
    __obj.updateDynamic("modified")(modified)
    __obj.updateDynamic("nickname")(nickname)
    __obj.updateDynamic("note")(note)
    __obj.updateDynamic("organization")(organization)
    __obj.updateDynamic("phone")(phone)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("recordId")(recordId)
    __obj.updateDynamic("relatedNames")(relatedNames)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setAddress")(setAddress)
    __obj.updateDynamic("setAlternateBirthday")(setAlternateBirthday)
    __obj.updateDynamic("setBirthday")(setBirthday)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setDate")(setDate)
    __obj.updateDynamic("setDepartment")(setDepartment)
    __obj.updateDynamic("setEmail")(setEmail)
    __obj.updateDynamic("setFirstName")(setFirstName)
    __obj.updateDynamic("setFirstPhonetic")(setFirstPhonetic)
    __obj.updateDynamic("setImage")(setImage)
    __obj.updateDynamic("setInstantMessage")(setInstantMessage)
    __obj.updateDynamic("setJobTitle")(setJobTitle)
    __obj.updateDynamic("setKind")(setKind)
    __obj.updateDynamic("setLastName")(setLastName)
    __obj.updateDynamic("setLastPhonetic")(setLastPhonetic)
    __obj.updateDynamic("setMiddleName")(setMiddleName)
    __obj.updateDynamic("setMiddlePhonetic")(setMiddlePhonetic)
    __obj.updateDynamic("setNickname")(setNickname)
    __obj.updateDynamic("setNote")(setNote)
    __obj.updateDynamic("setOrganization")(setOrganization)
    __obj.updateDynamic("setPhone")(setPhone)
    __obj.updateDynamic("setRecordId")(setRecordId)
    __obj.updateDynamic("setRelatedNames")(setRelatedNames)
    __obj.updateDynamic("setSocialProfile")(setSocialProfile)
    __obj.updateDynamic("setUrl")(setUrl)
    __obj.updateDynamic("socialProfile")(socialProfile)
    __obj.updateDynamic("suffix")(suffix)
    __obj.updateDynamic("url")(url)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Person]
  }
}

