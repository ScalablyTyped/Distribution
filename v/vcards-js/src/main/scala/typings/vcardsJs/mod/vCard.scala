package typings.vcardsJs.mod

import typings.std.Date
import typings.vcardsJs.vcardsJsStrings.F
import typings.vcardsJs.vcardsJsStrings.M
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait vCard extends js.Object {
  /**
    * Anniversary
    */
  var anniversary: Date
  /**
    * Date of birth
    */
  var birthday: Date
  /**
    * Cell phone number
    */
  var cellPhone: String
  /**
    * The address for private electronic mail communication
    */
  var email: String
  /**
    * First name
    */
  var firstName: String
  /**
    * Formatted name string associated with the vCard object (will automatically populate if not set)
    */
  var formattedName: String
  /**
    * Gender.
    */
  var gender: M | F
  /**
    * Home mailing address
    */
  var homeAddress: Address
  /**
    * Home facsimile
    */
  var homeFax: String
  /**
    * Home phone
    */
  var homePhone: String
  /**
    * Whether or not this contact should be shown as a company
    */
  var isOrganization: Boolean
  /**
    * Last name
    */
  var lastName: String
  /**
    * Logo
    */
  var logo: Photo
  /**
    * Middle name
    */
  var middleName: String
  /**
    * Prefix for individual's name
    */
  var namePrefix: String
  /**
    * Suffix for individual's name
    */
  var nameSuffix: String
  /**
    * Nickname of individual
    */
  var nickname: String
  /**
    * Specifies supplemental information or a comment that is associated with the vCard
    */
  var note: String
  /**
    * The name and optionally the unit(s) of the organization associated with the vCard object
    */
  var organization: String
  /**
    * Other cell phone number or pager
    */
  var pagerPhone: String
  /**
    * Individual's photo
    */
  var photo: Photo
  /**
    * The role, occupation, or business category of the vCard object within an organization
    */
  var role: String
  /**
    * Social URLs attached to the vCard object (ex: Facebook, Twitter, LinkedIn)
    */
  var socialUrls: SocialUrls
  /**
    * A URL that can be used to get the latest version of this vCard
    */
  var source: String
  /**
    * Specifies the job title, functional position or function of the individual within an organization
    */
  var title: String
  /**
    * Specifies a value that represents a persistent, globally unique identifier associated with the vCard
    */
  var uid: String
  /**
    * URL pointing to a website that represents the person in some way
    */
  var url: String
  /**
    * vCard version
    */
  var version: String
  /**
    * Work mailing address
    */
  var workAddress: Address
  /**
    * The address for work-related electronic mail communication
    */
  var workEmail: String
  /**
    * Work facsimile
    */
  var workFax: String
  /**
    * Work phone
    */
  var workPhone: String
  /**
    * URL pointing to a website that represents the person's work in some way
    */
  var workUrl: String
  /**
    * Get formatted vCard
    * @return Formatted vCard in VCF format
    */
  def getFormattedString(): String
  /**
    * Get major version of the vCard format
    */
  def getMajorVersion(): Double
  /**
    * Save formatted vCard to file
    * @param filename - The file path
    */
  def saveToFile(filename: String): Unit
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
}

