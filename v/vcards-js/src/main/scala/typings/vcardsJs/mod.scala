package typings.vcardsJs

import typings.std.Date
import typings.vcardsJs.vcardsJsStrings.F
import typings.vcardsJs.vcardsJsStrings.M
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vcards-js", JSImport.Namespace)
  @js.native
  def apply(): vCard = js.native
  
  @js.native
  trait Address extends StObject {
    
    /**
      * City
      */
    var city: String = js.native
    
    /**
      * Country or region
      */
    var countryRegion: String = js.native
    
    /**
      * Represents the actual text that should be put on the mailing label when delivering a physical package
      */
    var label: String = js.native
    
    /**
      * Postal code
      */
    var postalCode: String = js.native
    
    /**
      * State or province
      */
    var stateProvince: String = js.native
    
    /**
      * Street address
      */
    var street: String = js.native
  }
  object Address {
    
    @scala.inline
    def apply(
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
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryRegion(value: String): Self = StObject.set(x, "countryRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateProvince(value: String): Self = StObject.set(x, "stateProvince", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Photo extends StObject {
    
    /**
      * Attach a photo from a URL
      * @param   url       URL where photo can be found
      * @param  mediaType Media type of photo (JPEG, PNG, GIF)
      */
    def attachFromUrl(url: String, mediaType: String): Unit = js.native
    
    var base64: Boolean = js.native
    
    /**
      * Embed a photo from a file using base-64 encoding (not implemented yet)
      * @param  fileLocation - filename
      */
    def embedFromFile(fileLocation: String): Unit = js.native
    
    /**
      * Embed a photo from a base-64 string
      * @param  base64String - the base64 string
      * @param  mediaType - the media type
      */
    def embedFromString(base64String: String, mediaType: String): Unit = js.native
    
    var mediaType: String = js.native
    
    var url: String = js.native
  }
  object Photo {
    
    @scala.inline
    def apply(
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
    implicit class PhotoMutableBuilder[Self <: Photo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachFromUrl(value: (String, String) => Unit): Self = StObject.set(x, "attachFromUrl", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbedFromFile(value: String => Unit): Self = StObject.set(x, "embedFromFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmbedFromString(value: (String, String) => Unit): Self = StObject.set(x, "embedFromString", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocialUrls extends StObject {
    
    var facebook: String = js.native
    
    var flickr: String = js.native
    
    var linkedIn: String = js.native
    
    var twitter: String = js.native
  }
  object SocialUrls {
    
    @scala.inline
    def apply(facebook: String, flickr: String, linkedIn: String, twitter: String): SocialUrls = {
      val __obj = js.Dynamic.literal(facebook = facebook.asInstanceOf[js.Any], flickr = flickr.asInstanceOf[js.Any], linkedIn = linkedIn.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialUrls]
    }
    
    @scala.inline
    implicit class SocialUrlsMutableBuilder[Self <: SocialUrls] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFacebook(value: String): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlickr(value: String): Self = StObject.set(x, "flickr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkedIn(value: String): Self = StObject.set(x, "linkedIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait vCard extends StObject {
    
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
    implicit class vCardMutableBuilder[Self <: vCard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnniversary(value: Date): Self = StObject.set(x, "anniversary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBirthday(value: Date): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPhone(value: String): Self = StObject.set(x, "cellPhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedName(value: String): Self = StObject.set(x, "formattedName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGender(value: M | F): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetFormattedString(value: () => String): Self = StObject.set(x, "getFormattedString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMajorVersion(value: () => Double): Self = StObject.set(x, "getMajorVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHomeAddress(value: Address): Self = StObject.set(x, "homeAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeFax(value: String): Self = StObject.set(x, "homeFax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomePhone(value: String): Self = StObject.set(x, "homePhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOrganization(value: Boolean): Self = StObject.set(x, "isOrganization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogo(value: Photo): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameSuffix(value: String): Self = StObject.set(x, "nameSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagerPhone(value: String): Self = StObject.set(x, "pagerPhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoto(value: Photo): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveToFile(value: String => Unit): Self = StObject.set(x, "saveToFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSocialUrls(value: SocialUrls): Self = StObject.set(x, "socialUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkAddress(value: Address): Self = StObject.set(x, "workAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkEmail(value: String): Self = StObject.set(x, "workEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkFax(value: String): Self = StObject.set(x, "workFax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkPhone(value: String): Self = StObject.set(x, "workPhone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkUrl(value: String): Self = StObject.set(x, "workUrl", value.asInstanceOf[js.Any])
    }
  }
}
