package typings.vcardsJs

import org.scalablytyped.runtime.StringDictionary
import typings.vcardsJs.vcardsJsStrings.F
import typings.vcardsJs.vcardsJsStrings.M
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): vCard = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[vCard]
  
  @JSImport("vcards-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Address extends StObject {
    
    /**
      * City
      */
    var city: String
    
    /**
      * Country or region
      */
    var countryRegion: String
    
    /**
      * Represents the actual text that should be put on the mailing label when delivering a physical package
      */
    var label: String
    
    /**
      * Postal code
      */
    var postalCode: String
    
    /**
      * State or province
      */
    var stateProvince: String
    
    /**
      * Street address
      */
    var street: String
  }
  object Address {
    
    inline def apply(
      city: String,
      countryRegion: String,
      label: String,
      postalCode: String,
      stateProvince: String,
      street: String
    ): Address = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], stateProvince = stateProvince.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountryRegion(value: String): Self = StObject.set(x, "countryRegion", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setStateProvince(value: String): Self = StObject.set(x, "stateProvince", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    }
  }
  
  trait Photo extends StObject {
    
    /**
      * Attach a photo from a URL
      * @param   url       URL where photo can be found
      * @param  mediaType Media type of photo (JPEG, PNG, GIF)
      */
    def attachFromUrl(url: String, mediaType: String): Unit
    
    var base64: Boolean
    
    /**
      * Embed a photo from a file using base-64 encoding (not implemented yet)
      * @param  fileLocation - filename
      */
    def embedFromFile(fileLocation: String): Unit
    
    /**
      * Embed a photo from a base-64 string
      * @param  base64String - the base64 string
      * @param  mediaType - the media type
      */
    def embedFromString(base64String: String, mediaType: String): Unit
    
    var mediaType: String
    
    var url: String
  }
  object Photo {
    
    inline def apply(
      attachFromUrl: (String, String) => Unit,
      base64: Boolean,
      embedFromFile: String => Unit,
      embedFromString: (String, String) => Unit,
      mediaType: String,
      url: String
    ): Photo = {
      val __obj = js.Dynamic.literal(attachFromUrl = js.Any.fromFunction2(attachFromUrl), base64 = base64.asInstanceOf[js.Any], embedFromFile = js.Any.fromFunction1(embedFromFile), embedFromString = js.Any.fromFunction2(embedFromString), mediaType = mediaType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Photo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Photo] (val x: Self) extends AnyVal {
      
      inline def setAttachFromUrl(value: (String, String) => Unit): Self = StObject.set(x, "attachFromUrl", js.Any.fromFunction2(value))
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setEmbedFromFile(value: String => Unit): Self = StObject.set(x, "embedFromFile", js.Any.fromFunction1(value))
      
      inline def setEmbedFromString(value: (String, String) => Unit): Self = StObject.set(x, "embedFromString", js.Any.fromFunction2(value))
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocialUrls
    extends StObject
       with /* custom */ StringDictionary[String] {
    
    var facebook: String
    
    var flickr: String
    
    var linkedIn: String
    
    var twitter: String
  }
  object SocialUrls {
    
    inline def apply(facebook: String, flickr: String, linkedIn: String, twitter: String): SocialUrls = {
      val __obj = js.Dynamic.literal(facebook = facebook.asInstanceOf[js.Any], flickr = flickr.asInstanceOf[js.Any], linkedIn = linkedIn.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialUrls]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocialUrls] (val x: Self) extends AnyVal {
      
      inline def setFacebook(value: String): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
      
      inline def setFlickr(value: String): Self = StObject.set(x, "flickr", value.asInstanceOf[js.Any])
      
      inline def setLinkedIn(value: String): Self = StObject.set(x, "linkedIn", value.asInstanceOf[js.Any])
      
      inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    }
  }
  
  trait vCard extends StObject {
    
    /**
      * Anniversary
      */
    var anniversary: js.Date
    
    /**
      * Date of birth
      */
    var birthday: js.Date
    
    /**
      * Cell phone number
      */
    var cellPhone: String | js.Array[String]
    
    /**
      * The address for private electronic mail communication
      */
    var email: String | js.Array[String]
    
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
      * Get formatted vCard
      * @return Formatted vCard in VCF format
      */
    def getFormattedString(): String
    
    /**
      * Get major version of the vCard format
      */
    def getMajorVersion(): Double
    
    /**
      * Home mailing address
      */
    var homeAddress: Address
    
    /**
      * Home facsimile
      */
    var homeFax: String | js.Array[String]
    
    /**
      * Home phone
      */
    var homePhone: String | js.Array[String]
    
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
    
    var otherEmail: String | js.Array[String]
    
    var otherPhone: String | js.Array[String]
    
    /**
      * Other cell phone number or pager
      */
    var pagerPhone: String | js.Array[String]
    
    /**
      * Individual's photo
      */
    var photo: Photo
    
    /**
      * The role, occupation, or business category of the vCard object within an organization
      */
    var role: String
    
    /**
      * Save formatted vCard to file
      * @param filename - The file path
      */
    def saveToFile(filename: String): Unit
    
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
    var workEmail: String | js.Array[String]
    
    /**
      * Work facsimile
      */
    var workFax: String | js.Array[String]
    
    /**
      * Work phone
      */
    var workPhone: String | js.Array[String]
    
    /**
      * URL pointing to a website that represents the person's work in some way
      */
    var workUrl: String
  }
  object vCard {
    
    inline def apply(
      anniversary: js.Date,
      birthday: js.Date,
      cellPhone: String | js.Array[String],
      email: String | js.Array[String],
      firstName: String,
      formattedName: String,
      gender: M | F,
      getFormattedString: () => String,
      getMajorVersion: () => Double,
      homeAddress: Address,
      homeFax: String | js.Array[String],
      homePhone: String | js.Array[String],
      isOrganization: Boolean,
      lastName: String,
      logo: Photo,
      middleName: String,
      namePrefix: String,
      nameSuffix: String,
      nickname: String,
      note: String,
      organization: String,
      otherEmail: String | js.Array[String],
      otherPhone: String | js.Array[String],
      pagerPhone: String | js.Array[String],
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
      workEmail: String | js.Array[String],
      workFax: String | js.Array[String],
      workPhone: String | js.Array[String],
      workUrl: String
    ): vCard = {
      val __obj = js.Dynamic.literal(anniversary = anniversary.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], cellPhone = cellPhone.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], formattedName = formattedName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], getFormattedString = js.Any.fromFunction0(getFormattedString), getMajorVersion = js.Any.fromFunction0(getMajorVersion), homeAddress = homeAddress.asInstanceOf[js.Any], homeFax = homeFax.asInstanceOf[js.Any], homePhone = homePhone.asInstanceOf[js.Any], isOrganization = isOrganization.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any], namePrefix = namePrefix.asInstanceOf[js.Any], nameSuffix = nameSuffix.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], otherEmail = otherEmail.asInstanceOf[js.Any], otherPhone = otherPhone.asInstanceOf[js.Any], pagerPhone = pagerPhone.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], saveToFile = js.Any.fromFunction1(saveToFile), socialUrls = socialUrls.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], workAddress = workAddress.asInstanceOf[js.Any], workEmail = workEmail.asInstanceOf[js.Any], workFax = workFax.asInstanceOf[js.Any], workPhone = workPhone.asInstanceOf[js.Any], workUrl = workUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[vCard]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: vCard] (val x: Self) extends AnyVal {
      
      inline def setAnniversary(value: js.Date): Self = StObject.set(x, "anniversary", value.asInstanceOf[js.Any])
      
      inline def setBirthday(value: js.Date): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      inline def setCellPhone(value: String | js.Array[String]): Self = StObject.set(x, "cellPhone", value.asInstanceOf[js.Any])
      
      inline def setCellPhoneVarargs(value: String*): Self = StObject.set(x, "cellPhone", js.Array(value*))
      
      inline def setEmail(value: String | js.Array[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailVarargs(value: String*): Self = StObject.set(x, "email", js.Array(value*))
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setFormattedName(value: String): Self = StObject.set(x, "formattedName", value.asInstanceOf[js.Any])
      
      inline def setGender(value: M | F): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGetFormattedString(value: () => String): Self = StObject.set(x, "getFormattedString", js.Any.fromFunction0(value))
      
      inline def setGetMajorVersion(value: () => Double): Self = StObject.set(x, "getMajorVersion", js.Any.fromFunction0(value))
      
      inline def setHomeAddress(value: Address): Self = StObject.set(x, "homeAddress", value.asInstanceOf[js.Any])
      
      inline def setHomeFax(value: String | js.Array[String]): Self = StObject.set(x, "homeFax", value.asInstanceOf[js.Any])
      
      inline def setHomeFaxVarargs(value: String*): Self = StObject.set(x, "homeFax", js.Array(value*))
      
      inline def setHomePhone(value: String | js.Array[String]): Self = StObject.set(x, "homePhone", value.asInstanceOf[js.Any])
      
      inline def setHomePhoneVarargs(value: String*): Self = StObject.set(x, "homePhone", js.Array(value*))
      
      inline def setIsOrganization(value: Boolean): Self = StObject.set(x, "isOrganization", value.asInstanceOf[js.Any])
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setLogo(value: Photo): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNameSuffix(value: String): Self = StObject.set(x, "nameSuffix", value.asInstanceOf[js.Any])
      
      inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setOtherEmail(value: String | js.Array[String]): Self = StObject.set(x, "otherEmail", value.asInstanceOf[js.Any])
      
      inline def setOtherEmailVarargs(value: String*): Self = StObject.set(x, "otherEmail", js.Array(value*))
      
      inline def setOtherPhone(value: String | js.Array[String]): Self = StObject.set(x, "otherPhone", value.asInstanceOf[js.Any])
      
      inline def setOtherPhoneVarargs(value: String*): Self = StObject.set(x, "otherPhone", js.Array(value*))
      
      inline def setPagerPhone(value: String | js.Array[String]): Self = StObject.set(x, "pagerPhone", value.asInstanceOf[js.Any])
      
      inline def setPagerPhoneVarargs(value: String*): Self = StObject.set(x, "pagerPhone", js.Array(value*))
      
      inline def setPhoto(value: Photo): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setSaveToFile(value: String => Unit): Self = StObject.set(x, "saveToFile", js.Any.fromFunction1(value))
      
      inline def setSocialUrls(value: SocialUrls): Self = StObject.set(x, "socialUrls", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWorkAddress(value: Address): Self = StObject.set(x, "workAddress", value.asInstanceOf[js.Any])
      
      inline def setWorkEmail(value: String | js.Array[String]): Self = StObject.set(x, "workEmail", value.asInstanceOf[js.Any])
      
      inline def setWorkEmailVarargs(value: String*): Self = StObject.set(x, "workEmail", js.Array(value*))
      
      inline def setWorkFax(value: String | js.Array[String]): Self = StObject.set(x, "workFax", value.asInstanceOf[js.Any])
      
      inline def setWorkFaxVarargs(value: String*): Self = StObject.set(x, "workFax", js.Array(value*))
      
      inline def setWorkPhone(value: String | js.Array[String]): Self = StObject.set(x, "workPhone", value.asInstanceOf[js.Any])
      
      inline def setWorkPhoneVarargs(value: String*): Self = StObject.set(x, "workPhone", js.Array(value*))
      
      inline def setWorkUrl(value: String): Self = StObject.set(x, "workUrl", value.asInstanceOf[js.Any])
    }
  }
}
