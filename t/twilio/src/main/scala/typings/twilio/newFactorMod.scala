package typings.twilio

import typings.twilio.anon.AppId
import typings.twilio.anon.PublicKey
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.unverified_
import typings.twilio.twilioStrings.verified_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newFactorMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/newFactor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/newFactor", "NewFactorInstance")
  @js.native
  open class NewFactorInstance protected () extends SerializableClass {
    /**
      * Initialize the NewFactorContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - Service Sid.
      * @param identity - Unique external identifier of the Entity
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      payload: NewFactorPayload,
      serviceSid: String,
      identity: String
    ) = this()
    
    var accountSid: String = js.native
    
    var binding: Any = js.native
    
    var config: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var entitySid: String = js.native
    
    var factorType: NewFactorFactorTypes = js.native
    
    var friendlyName: String = js.native
    
    var identity: String = js.native
    
    var metadata: Any = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var status: NewFactorFactorStatuses = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the NewFactorList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - Service Sid.
    * @param identity - Unique external identifier of the Entity
    */
  inline def NewFactorList(version: typings.twilio.verifyV2Mod.^, serviceSid: String, identity: String): NewFactorListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("NewFactorList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[NewFactorListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/newFactor", "NewFactorPage")
  @js.native
  open class NewFactorPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.verifyV2Mod.^, NewFactorPayload, NewFactorResource, NewFactorInstance] {
    /**
      * Initialize the NewFactorPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: NewFactorSolution
    ) = this()
    
    /**
      * Build an instance of NewFactorInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: NewFactorPayload): NewFactorInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.unverified_
    - typings.twilio.twilioStrings.verified_
  */
  trait NewFactorFactorStatuses extends StObject
  object NewFactorFactorStatuses {
    
    inline def unverified: unverified_ = "unverified".asInstanceOf[unverified_]
    
    inline def verified: verified_ = "verified".asInstanceOf[verified_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.push
    - typings.twilio.twilioStrings.totp
  */
  trait NewFactorFactorTypes extends StObject
  object NewFactorFactorTypes {
    
    inline def push: typings.twilio.twilioStrings.push = "push".asInstanceOf[typings.twilio.twilioStrings.push]
    
    inline def totp: typings.twilio.twilioStrings.totp = "totp".asInstanceOf[typings.twilio.twilioStrings.totp]
  }
  
  @js.native
  trait NewFactorListInstance extends StObject {
    
    /**
      * create a NewFactorInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: NewFactorListInstanceCreateOptions): js.Promise[NewFactorInstance] = js.native
    def create(
      opts: NewFactorListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ NewFactorInstance, Any]
    ): js.Promise[NewFactorInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property binding.alg - The algorithm used when `factor_type` is `push`
    * @property binding.publicKey - The public key encoded in Base64
    * @property binding.secret - The shared secret in Base32
    * @property config.alg - The algorithm used to derive the TOTP codes
    * @property config.appId - The ID that uniquely identifies your app in the Google or Apple store
    * @property config.codeLength - Number of digits for generated TOTP codes
    * @property config.notificationPlatform - The transport technology used to generate the Notification Token
    * @property config.notificationToken - For APN, the device token. For FCM, the registration token
    * @property config.sdkVersion - The Verify Push SDK version used to configure the factor
    * @property config.skew - The number of past and future time-steps valid at a given time
    * @property config.timeStep - How often, in seconds, are TOTP codes generated
    * @property factorType - The Type of this Factor
    * @property friendlyName - The friendly name of this Factor
    * @property metadata - Metadata of the factor.
    */
  trait NewFactorListInstanceCreateOptions extends StObject {
    
    var binding: js.UndefOr[PublicKey] = js.undefined
    
    var config: js.UndefOr[AppId] = js.undefined
    
    var factorType: NewFactorFactorTypes
    
    var friendlyName: String
    
    var metadata: js.UndefOr[js.Object] = js.undefined
  }
  object NewFactorListInstanceCreateOptions {
    
    inline def apply(factorType: NewFactorFactorTypes, friendlyName: String): NewFactorListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(factorType = factorType.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewFactorListInstanceCreateOptions]
    }
    
    extension [Self <: NewFactorListInstanceCreateOptions](x: Self) {
      
      inline def setBinding(value: PublicKey): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      inline def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
      
      inline def setConfig(value: AppId): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setFactorType(value: NewFactorFactorTypes): Self = StObject.set(x, "factorType", value.asInstanceOf[js.Any])
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.apn
    - typings.twilio.twilioStrings.fcm
    - typings.twilio.twilioStrings.none
  */
  trait NewFactorNotificationPlatforms extends StObject
  object NewFactorNotificationPlatforms {
    
    inline def apn: typings.twilio.twilioStrings.apn = "apn".asInstanceOf[typings.twilio.twilioStrings.apn]
    
    inline def fcm: typings.twilio.twilioStrings.fcm = "fcm".asInstanceOf[typings.twilio.twilioStrings.fcm]
    
    inline def none: typings.twilio.twilioStrings.none = "none".asInstanceOf[typings.twilio.twilioStrings.none]
  }
  
  trait NewFactorPayload
    extends StObject
       with NewFactorResource
       with TwilioResponsePayload
  object NewFactorPayload {
    
    inline def apply(
      account_sid: String,
      binding: js.Object,
      config: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      entity_sid: String,
      factor_type: NewFactorFactorTypes,
      first_page_uri: String,
      friendly_name: String,
      identity: String,
      metadata: js.Object,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      status: NewFactorFactorStatuses,
      uri: String,
      url: String
    ): NewFactorPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], binding = binding.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], entity_sid = entity_sid.asInstanceOf[js.Any], factor_type = factor_type.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewFactorPayload]
    }
  }
  
  trait NewFactorResource extends StObject {
    
    var account_sid: String
    
    var binding: js.Object
    
    var config: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var entity_sid: String
    
    var factor_type: NewFactorFactorTypes
    
    var friendly_name: String
    
    var identity: String
    
    var metadata: js.Object
    
    var service_sid: String
    
    var sid: String
    
    var status: NewFactorFactorStatuses
    
    var url: String
  }
  object NewFactorResource {
    
    inline def apply(
      account_sid: String,
      binding: js.Object,
      config: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      entity_sid: String,
      factor_type: NewFactorFactorTypes,
      friendly_name: String,
      identity: String,
      metadata: js.Object,
      service_sid: String,
      sid: String,
      status: NewFactorFactorStatuses,
      url: String
    ): NewFactorResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], binding = binding.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], entity_sid = entity_sid.asInstanceOf[js.Any], factor_type = factor_type.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewFactorResource]
    }
    
    extension [Self <: NewFactorResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBinding(value: js.Object): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEntity_sid(value: String): Self = StObject.set(x, "entity_sid", value.asInstanceOf[js.Any])
      
      inline def setFactor_type(value: NewFactorFactorTypes): Self = StObject.set(x, "factor_type", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: NewFactorFactorStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewFactorSolution extends StObject {
    
    var identity: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object NewFactorSolution {
    
    inline def apply(): NewFactorSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewFactorSolution]
    }
    
    extension [Self <: NewFactorSolution](x: Self) {
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.sha1
    - typings.twilio.twilioStrings.sha256
    - typings.twilio.twilioStrings.sha512
  */
  trait NewFactorTotpAlgorithms extends StObject
  object NewFactorTotpAlgorithms {
    
    inline def sha1: typings.twilio.twilioStrings.sha1 = "sha1".asInstanceOf[typings.twilio.twilioStrings.sha1]
    
    inline def sha256: typings.twilio.twilioStrings.sha256 = "sha256".asInstanceOf[typings.twilio.twilioStrings.sha256]
    
    inline def sha512: typings.twilio.twilioStrings.sha512 = "sha512".asInstanceOf[typings.twilio.twilioStrings.sha512]
  }
}
