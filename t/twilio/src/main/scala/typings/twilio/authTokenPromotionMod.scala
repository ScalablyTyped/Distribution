package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authTokenPromotionMod {
  
  @JSImport("twilio/lib/rest/accounts/v1/authTokenPromotion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/accounts/v1/authTokenPromotion", "AuthTokenPromotionContext")
  @js.native
  open class AuthTokenPromotionContext protected () extends StObject {
    /**
      * Initialize the AuthTokenPromotionContext
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.v1Mod.^) = this()
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a AuthTokenPromotionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AuthTokenPromotionInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ AuthTokenPromotionInstance, Any]): js.Promise[AuthTokenPromotionInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/accounts/v1/authTokenPromotion", "AuthTokenPromotionInstance")
  @js.native
  open class AuthTokenPromotionInstance protected () extends SerializableClass {
    /**
      * Initialize the AuthTokenPromotionContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.v1Mod.^, payload: AuthTokenPromotionPayload) = this()
    
    /* private */ var _proxy: AuthTokenPromotionContext = js.native
    
    var accountSid: String = js.native
    
    var authToken: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * update a AuthTokenPromotionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AuthTokenPromotionInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AuthTokenPromotionInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AuthTokenPromotionList
    *
    * @param version - Version of the resource
    */
  inline def AuthTokenPromotionList(version: typings.twilio.v1Mod.^): AuthTokenPromotionListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("AuthTokenPromotionList")(version.asInstanceOf[js.Any]).asInstanceOf[AuthTokenPromotionListInstance]
  
  @JSImport("twilio/lib/rest/accounts/v1/authTokenPromotion", "AuthTokenPromotionPage")
  @js.native
  open class AuthTokenPromotionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v1Mod.^, 
          AuthTokenPromotionPayload, 
          AuthTokenPromotionResource, 
          AuthTokenPromotionInstance
        ] {
    /**
      * Initialize the AuthTokenPromotionPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AuthTokenPromotionSolution
    ) = this()
    
    /**
      * Build an instance of AuthTokenPromotionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AuthTokenPromotionPayload): AuthTokenPromotionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AuthTokenPromotionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AuthTokenPromotionContext = js.native
    
    /**
      * Constructs a auth_token_promotion
      */
    def get(): AuthTokenPromotionContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait AuthTokenPromotionPayload
    extends StObject
       with AuthTokenPromotionResource
       with TwilioResponsePayload
  object AuthTokenPromotionPayload {
    
    inline def apply(
      account_sid: String,
      auth_token: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String
    ): AuthTokenPromotionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], auth_token = auth_token.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthTokenPromotionPayload]
    }
  }
  
  trait AuthTokenPromotionResource extends StObject {
    
    var account_sid: String
    
    var auth_token: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var url: String
  }
  object AuthTokenPromotionResource {
    
    inline def apply(account_sid: String, auth_token: String, date_created: js.Date, date_updated: js.Date, url: String): AuthTokenPromotionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], auth_token = auth_token.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthTokenPromotionResource]
    }
    
    extension [Self <: AuthTokenPromotionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAuth_token(value: String): Self = StObject.set(x, "auth_token", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthTokenPromotionSolution extends StObject
}
