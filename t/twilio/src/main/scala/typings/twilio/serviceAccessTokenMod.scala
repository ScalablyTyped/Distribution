package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.push
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceAccessTokenMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/accessToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/accessToken", "AccessTokenContext")
  @js.native
  open class AccessTokenContext protected () extends StObject {
    /**
      * Initialize the AccessTokenContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - Service Sid.
      * @param sid - A string that uniquely identifies this Access Token.
      */
    def this(version: typings.twilio.verifyV2Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a AccessTokenInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AccessTokenInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AccessTokenInstance, Any]): js.Promise[AccessTokenInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/service/accessToken", "AccessTokenInstance")
  @js.native
  open class AccessTokenInstance protected () extends SerializableClass {
    /**
      * Initialize the AccessTokenContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - Verify Service Sid.
      * @param sid - A string that uniquely identifies this Access Token.
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      payload: AccessTokenPayload,
      serviceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: AccessTokenContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var entityIdentity: String = js.native
    
    var factorFriendlyName: String = js.native
    
    var factorType: AccessTokenFactorTypes = js.native
    
    /**
      * fetch a AccessTokenInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AccessTokenInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AccessTokenInstance] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var token: String = js.native
    
    var ttl: Double = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AccessTokenList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - Verify Service Sid.
    */
  inline def AccessTokenList(version: typings.twilio.verifyV2Mod.^, serviceSid: String): AccessTokenListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AccessTokenList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[AccessTokenListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/accessToken", "AccessTokenPage")
  @js.native
  open class AccessTokenPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.verifyV2Mod.^, 
          AccessTokenPayload, 
          AccessTokenResource, 
          AccessTokenInstance
        ] {
    /**
      * Initialize the AccessTokenPage
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
      solution: AccessTokenSolution
    ) = this()
    
    /**
      * Build an instance of AccessTokenInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AccessTokenPayload): AccessTokenInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  type AccessTokenFactorTypes = push
  
  @js.native
  trait AccessTokenListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AccessTokenContext = js.native
    
    /**
      * create a AccessTokenInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: AccessTokenListInstanceCreateOptions): js.Promise[AccessTokenInstance] = js.native
    def create(
      opts: AccessTokenListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ AccessTokenInstance, Any]
    ): js.Promise[AccessTokenInstance] = js.native
    
    /**
      * Constructs a access_token
      *
      * @param sid - A string that uniquely identifies this Access Token.
      */
    def get(sid: String): AccessTokenContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property factorFriendlyName - The factor friendly name
    * @property factorType - The Type of this Factor
    * @property identity - Unique external identifier of the Entity
    * @property ttl - How long, in seconds, the access token is valid.
    */
  trait AccessTokenListInstanceCreateOptions extends StObject {
    
    var factorFriendlyName: js.UndefOr[String] = js.undefined
    
    var factorType: AccessTokenFactorTypes
    
    var identity: String
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object AccessTokenListInstanceCreateOptions {
    
    inline def apply(factorType: AccessTokenFactorTypes, identity: String): AccessTokenListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(factorType = factorType.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessTokenListInstanceCreateOptions]
    }
    
    extension [Self <: AccessTokenListInstanceCreateOptions](x: Self) {
      
      inline def setFactorFriendlyName(value: String): Self = StObject.set(x, "factorFriendlyName", value.asInstanceOf[js.Any])
      
      inline def setFactorFriendlyNameUndefined: Self = StObject.set(x, "factorFriendlyName", js.undefined)
      
      inline def setFactorType(value: AccessTokenFactorTypes): Self = StObject.set(x, "factorType", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait AccessTokenPayload
    extends StObject
       with AccessTokenResource
       with TwilioResponsePayload
  object AccessTokenPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      entity_identity: String,
      factor_friendly_name: String,
      factor_type: AccessTokenFactorTypes,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      token: String,
      ttl: Double,
      uri: String,
      url: String
    ): AccessTokenPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], entity_identity = entity_identity.asInstanceOf[js.Any], factor_friendly_name = factor_friendly_name.asInstanceOf[js.Any], factor_type = factor_type.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessTokenPayload]
    }
  }
  
  trait AccessTokenResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var entity_identity: String
    
    var factor_friendly_name: String
    
    var factor_type: AccessTokenFactorTypes
    
    var service_sid: String
    
    var sid: String
    
    var token: String
    
    var ttl: Double
    
    var url: String
  }
  object AccessTokenResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      entity_identity: String,
      factor_friendly_name: String,
      factor_type: AccessTokenFactorTypes,
      service_sid: String,
      sid: String,
      token: String,
      ttl: Double,
      url: String
    ): AccessTokenResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], entity_identity = entity_identity.asInstanceOf[js.Any], factor_friendly_name = factor_friendly_name.asInstanceOf[js.Any], factor_type = factor_type.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessTokenResource]
    }
    
    extension [Self <: AccessTokenResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setEntity_identity(value: String): Self = StObject.set(x, "entity_identity", value.asInstanceOf[js.Any])
      
      inline def setFactor_friendly_name(value: String): Self = StObject.set(x, "factor_friendly_name", value.asInstanceOf[js.Any])
      
      inline def setFactor_type(value: AccessTokenFactorTypes): Self = StObject.set(x, "factor_type", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccessTokenSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object AccessTokenSolution {
    
    inline def apply(): AccessTokenSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessTokenSolution]
    }
    
    extension [Self <: AccessTokenSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
