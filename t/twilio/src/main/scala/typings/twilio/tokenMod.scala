package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/token", "TokenInstance")
  @js.native
  open class TokenInstance protected () extends SerializableClass {
    /**
      * Initialize the TokenContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: TokenPayload, accountSid: String) = this()
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var iceServers: js.Array[String] = js.native
    
    var password: String = js.native
    
    var ttl: String = js.native
    
    var username: String = js.native
  }
  
  /**
    * Initialize the TokenList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    */
  inline def TokenList(version: typings.twilio.v2010Mod.^, accountSid: String): TokenListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TokenList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[TokenListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/token", "TokenPage")
  @js.native
  open class TokenPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, TokenPayload, TokenResource, TokenInstance] {
    /**
      * Initialize the TokenPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TokenSolution
    ) = this()
    
    /**
      * Build an instance of TokenInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TokenPayload): TokenInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait TokenListInstance extends StObject {
    
    /**
      * create a TokenInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[TokenInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ TokenInstance, Any]): js.Promise[TokenInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ TokenInstance, Any]): js.Promise[TokenInstance] = js.native
    def create(opts: TokenListInstanceCreateOptions): js.Promise[TokenInstance] = js.native
    def create(
      opts: TokenListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TokenInstance, Any]
    ): js.Promise[TokenInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property ttl - The duration in seconds the credentials are valid
    */
  trait TokenListInstanceCreateOptions extends StObject {
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object TokenListInstanceCreateOptions {
    
    inline def apply(): TokenListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenListInstanceCreateOptions]
    }
    
    extension [Self <: TokenListInstanceCreateOptions](x: Self) {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait TokenPayload
    extends StObject
       with TokenResource
       with TwilioResponsePayload
  object TokenPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      ice_servers: js.Array[String],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      password: String,
      previous_page_uri: String,
      ttl: String,
      uri: String,
      username: String
    ): TokenPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], ice_servers = ice_servers.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenPayload]
    }
  }
  
  trait TokenResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var ice_servers: js.Array[String]
    
    var password: String
    
    var ttl: String
    
    var username: String
  }
  object TokenResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      ice_servers: js.Array[String],
      password: String,
      ttl: String,
      username: String
    ): TokenResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], ice_servers = ice_servers.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenResource]
    }
    
    extension [Self <: TokenResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setIce_servers(value: js.Array[String]): Self = StObject.set(x, "ice_servers", value.asInstanceOf[js.Any])
      
      inline def setIce_serversVarargs(value: String*): Self = StObject.set(x, "ice_servers", js.Array(value*))
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object TokenSolution {
    
    inline def apply(): TokenSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenSolution]
    }
    
    extension [Self <: TokenSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
