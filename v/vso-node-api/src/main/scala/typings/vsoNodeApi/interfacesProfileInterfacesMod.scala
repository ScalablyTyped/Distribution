package typings.vsoNodeApi

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.anon.EnumValuesLarge
import typings.vsoNodeApi.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesProfileInterfacesMod {
  
  @js.native
  sealed trait AvatarSize extends StObject
  @JSImport("vso-node-api/interfaces/ProfileInterfaces", "AvatarSize")
  @js.native
  object AvatarSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AvatarSize & Double] = js.native
    
    @js.native
    sealed trait Large
      extends StObject
         with AvatarSize
    /* 2 */ val Large: typings.vsoNodeApi.interfacesProfileInterfacesMod.AvatarSize.Large & Double = js.native
    
    @js.native
    sealed trait Medium
      extends StObject
         with AvatarSize
    /* 1 */ val Medium: typings.vsoNodeApi.interfacesProfileInterfacesMod.AvatarSize.Medium & Double = js.native
    
    @js.native
    sealed trait Small
      extends StObject
         with AvatarSize
    /* 0 */ val Small: typings.vsoNodeApi.interfacesProfileInterfacesMod.AvatarSize.Small & Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.AttributeDescriptor")
    @js.native
    def AttributeDescriptor: Fields = js.native
    inline def AttributeDescriptor_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributeDescriptor")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.AttributesContainer")
    @js.native
    def AttributesContainer: Fields = js.native
    inline def AttributesContainer_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AttributesContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.Avatar")
    @js.native
    def Avatar: Fields = js.native
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.AvatarSize")
    @js.native
    def AvatarSize: EnumValuesLarge = js.native
    inline def AvatarSize_=(x: EnumValuesLarge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AvatarSize")(x.asInstanceOf[js.Any])
    
    inline def Avatar_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Avatar")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.CoreProfileAttribute")
    @js.native
    def CoreProfileAttribute: Fields = js.native
    inline def CoreProfileAttribute_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CoreProfileAttribute")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.Country")
    @js.native
    def Country: Fields = js.native
    inline def Country_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Country")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.CreateProfileContext")
    @js.native
    def CreateProfileContext: Fields = js.native
    inline def CreateProfileContext_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateProfileContext")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.GeoRegion")
    @js.native
    def GeoRegion: Fields = js.native
    inline def GeoRegion_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GeoRegion")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.Profile")
    @js.native
    def Profile: Fields = js.native
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.ProfileAttribute")
    @js.native
    def ProfileAttribute: Fields = js.native
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.ProfileAttributeBase")
    @js.native
    def ProfileAttributeBase: Fields = js.native
    inline def ProfileAttributeBase_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileAttributeBase")(x.asInstanceOf[js.Any])
    
    inline def ProfileAttribute_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileAttribute")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.ProfileRegion")
    @js.native
    def ProfileRegion: Fields = js.native
    inline def ProfileRegion_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileRegion")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProfileInterfaces", "TypeInfo.ProfileRegions")
    @js.native
    def ProfileRegions: Fields = js.native
    inline def ProfileRegions_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileRegions")(x.asInstanceOf[js.Any])
    
    inline def Profile_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Profile")(x.asInstanceOf[js.Any])
  }
  
  trait AttributeDescriptor extends StObject {
    
    var attributeName: String
    
    var containerName: String
  }
  object AttributeDescriptor {
    
    inline def apply(attributeName: String, containerName: String): AttributeDescriptor = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeDescriptor]
    }
    
    extension [Self <: AttributeDescriptor](x: Self) {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttributesContainer extends StObject {
    
    var attributes: StringDictionary[ProfileAttribute]
    
    var containerName: String
    
    var revision: Double
  }
  object AttributesContainer {
    
    inline def apply(attributes: StringDictionary[ProfileAttribute], containerName: String, revision: Double): AttributesContainer = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributesContainer]
    }
    
    extension [Self <: AttributesContainer](x: Self) {
      
      inline def setAttributes(value: StringDictionary[ProfileAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    }
  }
  
  trait Avatar extends StObject {
    
    var isAutoGenerated: Boolean
    
    var size: AvatarSize
    
    var timeStamp: js.Date
    
    var value: js.Array[Double]
  }
  object Avatar {
    
    inline def apply(isAutoGenerated: Boolean, size: AvatarSize, timeStamp: js.Date, value: js.Array[Double]): Avatar = {
      val __obj = js.Dynamic.literal(isAutoGenerated = isAutoGenerated.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatar]
    }
    
    extension [Self <: Avatar](x: Self) {
      
      inline def setIsAutoGenerated(value: Boolean): Self = StObject.set(x, "isAutoGenerated", value.asInstanceOf[js.Any])
      
      inline def setSize(value: AvatarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: js.Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type CoreProfileAttribute = ProfileAttributeBase[Any]
  
  trait Country extends StObject {
    
    var code: String
    
    var englishName: String
  }
  object Country {
    
    inline def apply(code: String, englishName: String): Country = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], englishName = englishName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setEnglishName(value: String): Self = StObject.set(x, "englishName", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateProfileContext extends StObject {
    
    var cIData: StringDictionary[Any]
    
    var contactWithOffers: Boolean
    
    var countryName: String
    
    var displayName: String
    
    var emailAddress: String
    
    var hasAccount: Boolean
    
    var language: String
    
    var phoneNumber: String
  }
  object CreateProfileContext {
    
    inline def apply(
      cIData: StringDictionary[Any],
      contactWithOffers: Boolean,
      countryName: String,
      displayName: String,
      emailAddress: String,
      hasAccount: Boolean,
      language: String,
      phoneNumber: String
    ): CreateProfileContext = {
      val __obj = js.Dynamic.literal(cIData = cIData.asInstanceOf[js.Any], contactWithOffers = contactWithOffers.asInstanceOf[js.Any], countryName = countryName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], hasAccount = hasAccount.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateProfileContext]
    }
    
    extension [Self <: CreateProfileContext](x: Self) {
      
      inline def setCIData(value: StringDictionary[Any]): Self = StObject.set(x, "cIData", value.asInstanceOf[js.Any])
      
      inline def setContactWithOffers(value: Boolean): Self = StObject.set(x, "contactWithOffers", value.asInstanceOf[js.Any])
      
      inline def setCountryName(value: String): Self = StObject.set(x, "countryName", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setHasAccount(value: Boolean): Self = StObject.set(x, "hasAccount", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeoRegion extends StObject {
    
    var regionCode: String
  }
  object GeoRegion {
    
    inline def apply(regionCode: String): GeoRegion = {
      val __obj = js.Dynamic.literal(regionCode = regionCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoRegion]
    }
    
    extension [Self <: GeoRegion](x: Self) {
      
      inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Profile extends StObject {
    
    var applicationContainer: AttributesContainer
    
    var coreAttributes: StringDictionary[CoreProfileAttribute]
    
    var coreRevision: Double
    
    var id: String
    
    var revision: Double
    
    var timeStamp: js.Date
  }
  object Profile {
    
    inline def apply(
      applicationContainer: AttributesContainer,
      coreAttributes: StringDictionary[CoreProfileAttribute],
      coreRevision: Double,
      id: String,
      revision: Double,
      timeStamp: js.Date
    ): Profile = {
      val __obj = js.Dynamic.literal(applicationContainer = applicationContainer.asInstanceOf[js.Any], coreAttributes = coreAttributes.asInstanceOf[js.Any], coreRevision = coreRevision.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    extension [Self <: Profile](x: Self) {
      
      inline def setApplicationContainer(value: AttributesContainer): Self = StObject.set(x, "applicationContainer", value.asInstanceOf[js.Any])
      
      inline def setCoreAttributes(value: StringDictionary[CoreProfileAttribute]): Self = StObject.set(x, "coreAttributes", value.asInstanceOf[js.Any])
      
      inline def setCoreRevision(value: Double): Self = StObject.set(x, "coreRevision", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: js.Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    }
  }
  
  type ProfileAttribute = ProfileAttributeBase[String]
  
  trait ProfileAttributeBase[T] extends StObject {
    
    var descriptor: AttributeDescriptor
    
    var revision: Double
    
    var timeStamp: js.Date
    
    var value: T
  }
  object ProfileAttributeBase {
    
    inline def apply[T](descriptor: AttributeDescriptor, revision: Double, timeStamp: js.Date, value: T): ProfileAttributeBase[T] = {
      val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileAttributeBase[T]]
    }
    
    extension [Self <: ProfileAttributeBase[?], T](x: Self & ProfileAttributeBase[T]) {
      
      inline def setDescriptor(value: AttributeDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: js.Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProfileRegion extends StObject {
    
    /**
      * The two-letter code defined in ISO 3166 for the country/region.
      */
    var code: String
    
    /**
      * Localized country/region name
      */
    var name: String
  }
  object ProfileRegion {
    
    inline def apply(code: String, name: String): ProfileRegion = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileRegion]
    }
    
    extension [Self <: ProfileRegion](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProfileRegions extends StObject {
    
    /**
      * List of country/region code with contact consent requirement type of notice
      */
    var noticeContactConsentRequirementRegions: js.Array[String]
    
    /**
      * List of country/region code with contact consent requirement type of opt-out
      */
    var optOutContactConsentRequirementRegions: js.Array[String]
    
    /**
      * List of country/regions
      */
    var regions: js.Array[ProfileRegion]
  }
  object ProfileRegions {
    
    inline def apply(
      noticeContactConsentRequirementRegions: js.Array[String],
      optOutContactConsentRequirementRegions: js.Array[String],
      regions: js.Array[ProfileRegion]
    ): ProfileRegions = {
      val __obj = js.Dynamic.literal(noticeContactConsentRequirementRegions = noticeContactConsentRequirementRegions.asInstanceOf[js.Any], optOutContactConsentRequirementRegions = optOutContactConsentRequirementRegions.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileRegions]
    }
    
    extension [Self <: ProfileRegions](x: Self) {
      
      inline def setNoticeContactConsentRequirementRegions(value: js.Array[String]): Self = StObject.set(x, "noticeContactConsentRequirementRegions", value.asInstanceOf[js.Any])
      
      inline def setNoticeContactConsentRequirementRegionsVarargs(value: String*): Self = StObject.set(x, "noticeContactConsentRequirementRegions", js.Array(value*))
      
      inline def setOptOutContactConsentRequirementRegions(value: js.Array[String]): Self = StObject.set(x, "optOutContactConsentRequirementRegions", value.asInstanceOf[js.Any])
      
      inline def setOptOutContactConsentRequirementRegionsVarargs(value: String*): Self = StObject.set(x, "optOutContactConsentRequirementRegions", js.Array(value*))
      
      inline def setRegions(value: js.Array[ProfileRegion]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      inline def setRegionsVarargs(value: ProfileRegion*): Self = StObject.set(x, "regions", js.Array(value*))
    }
  }
}
