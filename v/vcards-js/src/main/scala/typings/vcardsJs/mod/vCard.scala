package typings.vcardsJs.mod

import typings.std.Date
import typings.vcardsJs.vcardsJsStrings.F
import typings.vcardsJs.vcardsJsStrings.M
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait vCard extends js.Object {
  
  /**
    * Anniversary
    */
  var anniversary: Date = js.native
  
  /**
    * Date of birth
    */
  var birthday: Date = js.native
  
  /**
    * Cell phone number
    */
  var cellPhone: String = js.native
  
  /**
    * The address for private electronic mail communication
    */
  var email: String = js.native
  
  /**
    * First name
    */
  var firstName: String = js.native
  
  /**
    * Formatted name string associated with the vCard object (will automatically populate if not set)
    */
  var formattedName: String = js.native
  
  /**
    * Gender.
    */
  var gender: M | F = js.native
  
  /**
    * Get formatted vCard
    * @return Formatted vCard in VCF format
    */
  def getFormattedString(): String = js.native
  
  /**
    * Get major version of the vCard format
    */
  def getMajorVersion(): Double = js.native
  
  /**
    * Home mailing address
    */
  var homeAddress: Address = js.native
  
  /**
    * Home facsimile
    */
  var homeFax: String = js.native
  
  /**
    * Home phone
    */
  var homePhone: String = js.native
  
  /**
    * Whether or not this contact should be shown as a company
    */
  var isOrganization: Boolean = js.native
  
  /**
    * Last name
    */
  var lastName: String = js.native
  
  /**
    * Logo
    */
  var logo: Photo = js.native
  
  /**
    * Middle name
    */
  var middleName: String = js.native
  
  /**
    * Prefix for individual's name
    */
  var namePrefix: String = js.native
  
  /**
    * Suffix for individual's name
    */
  var nameSuffix: String = js.native
  
  /**
    * Nickname of individual
    */
  var nickname: String = js.native
  
  /**
    * Specifies supplemental information or a comment that is associated with the vCard
    */
  var note: String = js.native
  
  /**
    * The name and optionally the unit(s) of the organization associated with the vCard object
    */
  var organization: String = js.native
  
  /**
    * Other cell phone number or pager
    */
  var pagerPhone: String = js.native
  
  /**
    * Individual's photo
    */
  var photo: Photo = js.native
  
  /**
    * The role, occupation, or business category of the vCard object within an organization
    */
  var role: String = js.native
  
  /**
    * Save formatted vCard to file
    * @param filename - The file path
    */
  def saveToFile(filename: String): Unit = js.native
  
  /**
    * Social URLs attached to the vCard object (ex: Facebook, Twitter, LinkedIn)
    */
  var socialUrls: SocialUrls = js.native
  
  /**
    * A URL that can be used to get the latest version of this vCard
    */
  var source: String = js.native
  
  /**
    * Specifies the job title, functional position or function of the individual within an organization
    */
  var title: String = js.native
  
  /**
    * Specifies a value that represents a persistent, globally unique identifier associated with the vCard
    */
  var uid: String = js.native
  
  /**
    * URL pointing to a website that represents the person in some way
    */
  var url: String = js.native
  
  /**
    * vCard version
    */
  var version: String = js.native
  
  /**
    * Work mailing address
    */
  var workAddress: Address = js.native
  
  /**
    * The address for work-related electronic mail communication
    */
  var workEmail: String = js.native
  
  /**
    * Work facsimile
    */
  var workFax: String = js.native
  
  /**
    * Work phone
    */
  var workPhone: String = js.native
  
  /**
    * URL pointing to a website that represents the person's work in some way
    */
  var workUrl: String = js.native
}
object vCard {
  
  @scala.inline
  def apply(
    anniversary: Date,
    birthday: Date,
    cellPhone: String,
    email: String,
    firstName: String,
    formattedName: String,
    gender: M | F,
    getFormattedString: () => String,
    getMajorVersion: () => Double,
    homeAddress: Address,
    homeFax: String,
    homePhone: String,
    isOrganization: Boolean,
    lastName: String,
    logo: Photo,
    middleName: String,
    namePrefix: String,
    nameSuffix: String,
    nickname: String,
    note: String,
    organization: String,
    pagerPhone: String,
    photo: Photo,
    role: String,
    saveToFile: String => Unit,
    socialUrls: SocialUrls,
    source: String,
    title: String,
    uid: String,
    url: String,
    version: String,
    workAddress: Address,
    workEmail: String,
    workFax: String,
    workPhone: String,
    workUrl: String
  ): vCard = {
    val __obj = js.Dynamic.literal(anniversary = anniversary.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], cellPhone = cellPhone.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], formattedName = formattedName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], getFormattedString = js.Any.fromFunction0(getFormattedString), getMajorVersion = js.Any.fromFunction0(getMajorVersion), homeAddress = homeAddress.asInstanceOf[js.Any], homeFax = homeFax.asInstanceOf[js.Any], homePhone = homePhone.asInstanceOf[js.Any], isOrganization = isOrganization.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any], namePrefix = namePrefix.asInstanceOf[js.Any], nameSuffix = nameSuffix.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], pagerPhone = pagerPhone.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], saveToFile = js.Any.fromFunction1(saveToFile), socialUrls = socialUrls.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], workAddress = workAddress.asInstanceOf[js.Any], workEmail = workEmail.asInstanceOf[js.Any], workFax = workFax.asInstanceOf[js.Any], workPhone = workPhone.asInstanceOf[js.Any], workUrl = workUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[vCard]
  }
  
  @scala.inline
  implicit class vCardOps[Self <: vCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnniversary(value: Date): Self = this.set("anniversary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthday(value: Date): Self = this.set("birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellPhone(value: String): Self = this.set("cellPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedName(value: String): Self = this.set("formattedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGender(value: M | F): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFormattedString(value: () => String): Self = this.set("getFormattedString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMajorVersion(value: () => Double): Self = this.set("getMajorVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHomeAddress(value: Address): Self = this.set("homeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeFax(value: String): Self = this.set("homeFax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePhone(value: String): Self = this.set("homePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOrganization(value: Boolean): Self = this.set("isOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: Photo): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefix(value: String): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameSuffix(value: String): Self = this.set("nameSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerPhone(value: String): Self = this.set("pagerPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto(value: Photo): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveToFile(value: String => Unit): Self = this.set("saveToFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSocialUrls(value: SocialUrls): Self = this.set("socialUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddress(value: Address): Self = this.set("workAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkEmail(value: String): Self = this.set("workEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkFax(value: String): Self = this.set("workFax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkPhone(value: String): Self = this.set("workPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkUrl(value: String): Self = this.set("workUrl", value.asInstanceOf[js.Any])
  }
}
