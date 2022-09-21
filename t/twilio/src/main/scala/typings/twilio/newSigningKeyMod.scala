package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newSigningKeyMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/newSigningKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/newSigningKey", "NewSigningKeyInstance")
  @js.native
  open class NewSigningKeyInstance protected () extends SerializableClass {
    /**
      * Initialize the NewSigningKeyContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - A 34 character string that uniquely identifies this resource.
      */
    def this(version: typings.twilio.v2010Mod.^, payload: NewSigningKeyPayload, accountSid: String) = this()
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var friendlyName: String = js.native
    
    var secret: String = js.native
    
    var sid: String = js.native
  }
  
  /**
    * Initialize the NewSigningKeyList
    *
    * @param version - Version of the resource
    * @param accountSid - A 34 character string that uniquely identifies this resource.
    */
  inline def NewSigningKeyList(version: typings.twilio.v2010Mod.^, accountSid: String): NewSigningKeyListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("NewSigningKeyList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[NewSigningKeyListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/newSigningKey", "NewSigningKeyPage")
  @js.native
  open class NewSigningKeyPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          NewSigningKeyPayload, 
          NewSigningKeyResource, 
          NewSigningKeyInstance
        ] {
    /**
      * Initialize the NewSigningKeyPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: NewSigningKeySolution
    ) = this()
    
    /**
      * Build an instance of NewSigningKeyInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: NewSigningKeyPayload): NewSigningKeyInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait NewSigningKeyListInstance extends StObject {
    
    /**
      * create a NewSigningKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[NewSigningKeyInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ NewSigningKeyInstance, Any]): js.Promise[NewSigningKeyInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ NewSigningKeyInstance, Any]
    ): js.Promise[NewSigningKeyInstance] = js.native
    def create(opts: NewSigningKeyListInstanceCreateOptions): js.Promise[NewSigningKeyInstance] = js.native
    def create(
      opts: NewSigningKeyListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ NewSigningKeyInstance, Any]
    ): js.Promise[NewSigningKeyInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - A string to describe the resource
    */
  trait NewSigningKeyListInstanceCreateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object NewSigningKeyListInstanceCreateOptions {
    
    inline def apply(): NewSigningKeyListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewSigningKeyListInstanceCreateOptions]
    }
    
    extension [Self <: NewSigningKeyListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  trait NewSigningKeyPayload
    extends StObject
       with NewSigningKeyResource
       with TwilioResponsePayload
  object NewSigningKeyPayload {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      secret: String,
      sid: String,
      uri: String
    ): NewSigningKeyPayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewSigningKeyPayload]
    }
  }
  
  trait NewSigningKeyResource extends StObject {
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var secret: String
    
    var sid: String
  }
  object NewSigningKeyResource {
    
    inline def apply(date_created: js.Date, date_updated: js.Date, friendly_name: String, secret: String, sid: String): NewSigningKeyResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewSigningKeyResource]
    }
    
    extension [Self <: NewSigningKeyResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewSigningKeySolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object NewSigningKeySolution {
    
    inline def apply(): NewSigningKeySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewSigningKeySolution]
    }
    
    extension [Self <: NewSigningKeySolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
