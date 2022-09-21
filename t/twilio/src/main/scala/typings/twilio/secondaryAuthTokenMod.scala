package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secondaryAuthTokenMod {
  
  @JSImport("twilio/lib/rest/accounts/v1/secondaryAuthToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/accounts/v1/secondaryAuthToken", "SecondaryAuthTokenContext")
  @js.native
  open class SecondaryAuthTokenContext protected () extends StObject {
    /**
      * Initialize the SecondaryAuthTokenContext
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.v1Mod.^) = this()
    
    /**
      * create a SecondaryAuthTokenInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[SecondaryAuthTokenInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ SecondaryAuthTokenInstance, Any]): js.Promise[SecondaryAuthTokenInstance] = js.native
    
    /**
      * remove a SecondaryAuthTokenInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SecondaryAuthTokenInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/accounts/v1/secondaryAuthToken", "SecondaryAuthTokenInstance")
  @js.native
  open class SecondaryAuthTokenInstance protected () extends SerializableClass {
    /**
      * Initialize the SecondaryAuthTokenContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.v1Mod.^, payload: SecondaryAuthTokenPayload) = this()
    
    /* private */ var _proxy: SecondaryAuthTokenContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * create a SecondaryAuthTokenInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[SecondaryAuthTokenInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SecondaryAuthTokenInstance] = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * remove a SecondaryAuthTokenInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var secondaryAuthToken: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SecondaryAuthTokenList
    *
    * @param version - Version of the resource
    */
  inline def SecondaryAuthTokenList(version: typings.twilio.v1Mod.^): SecondaryAuthTokenListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SecondaryAuthTokenList")(version.asInstanceOf[js.Any]).asInstanceOf[SecondaryAuthTokenListInstance]
  
  @JSImport("twilio/lib/rest/accounts/v1/secondaryAuthToken", "SecondaryAuthTokenPage")
  @js.native
  open class SecondaryAuthTokenPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v1Mod.^, 
          SecondaryAuthTokenPayload, 
          SecondaryAuthTokenResource, 
          SecondaryAuthTokenInstance
        ] {
    /**
      * Initialize the SecondaryAuthTokenPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SecondaryAuthTokenSolution
    ) = this()
    
    /**
      * Build an instance of SecondaryAuthTokenInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SecondaryAuthTokenPayload): SecondaryAuthTokenInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait SecondaryAuthTokenListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SecondaryAuthTokenContext = js.native
    
    /**
      * Constructs a secondary_auth_token
      */
    def get(): SecondaryAuthTokenContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait SecondaryAuthTokenPayload
    extends StObject
       with SecondaryAuthTokenResource
       with TwilioResponsePayload
  object SecondaryAuthTokenPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      secondary_auth_token: String,
      uri: String,
      url: String
    ): SecondaryAuthTokenPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], secondary_auth_token = secondary_auth_token.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecondaryAuthTokenPayload]
    }
  }
  
  trait SecondaryAuthTokenResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var secondary_auth_token: String
    
    var url: String
  }
  object SecondaryAuthTokenResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      secondary_auth_token: String,
      url: String
    ): SecondaryAuthTokenResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], secondary_auth_token = secondary_auth_token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecondaryAuthTokenResource]
    }
    
    extension [Self <: SecondaryAuthTokenResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setSecondary_auth_token(value: String): Self = StObject.set(x, "secondary_auth_token", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecondaryAuthTokenSolution extends StObject
}
