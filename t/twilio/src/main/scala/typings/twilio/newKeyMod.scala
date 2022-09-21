package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newKeyMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/newKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/newKey", "NewKeyInstance")
  @js.native
  open class NewKeyInstance protected () extends SerializableClass {
    /**
      * Initialize the NewKeyContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - A 34 character string that uniquely identifies this resource.
      */
    def this(version: typings.twilio.v2010Mod.^, payload: NewKeyPayload, accountSid: String) = this()
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var friendlyName: String = js.native
    
    var secret: String = js.native
    
    var sid: String = js.native
  }
  
  /**
    * Initialize the NewKeyList
    *
    * @param version - Version of the resource
    * @param accountSid - A 34 character string that uniquely identifies this resource.
    */
  inline def NewKeyList(version: typings.twilio.v2010Mod.^, accountSid: String): NewKeyListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("NewKeyList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[NewKeyListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/newKey", "NewKeyPage")
  @js.native
  open class NewKeyPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, NewKeyPayload, NewKeyResource, NewKeyInstance] {
    /**
      * Initialize the NewKeyPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: NewKeySolution
    ) = this()
    
    /**
      * Build an instance of NewKeyInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: NewKeyPayload): NewKeyInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait NewKeyListInstance extends StObject {
    
    /**
      * create a NewKeyInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[NewKeyInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ NewKeyInstance, Any]): js.Promise[NewKeyInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ NewKeyInstance, Any]): js.Promise[NewKeyInstance] = js.native
    def create(opts: NewKeyListInstanceCreateOptions): js.Promise[NewKeyInstance] = js.native
    def create(
      opts: NewKeyListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ NewKeyInstance, Any]
    ): js.Promise[NewKeyInstance] = js.native
    
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
  trait NewKeyListInstanceCreateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object NewKeyListInstanceCreateOptions {
    
    inline def apply(): NewKeyListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewKeyListInstanceCreateOptions]
    }
    
    extension [Self <: NewKeyListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  trait NewKeyPayload
    extends StObject
       with NewKeyResource
       with TwilioResponsePayload
  object NewKeyPayload {
    
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
    ): NewKeyPayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewKeyPayload]
    }
  }
  
  trait NewKeyResource extends StObject {
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var secret: String
    
    var sid: String
  }
  object NewKeyResource {
    
    inline def apply(date_created: js.Date, date_updated: js.Date, friendly_name: String, secret: String, sid: String): NewKeyResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewKeyResource]
    }
    
    extension [Self <: NewKeyResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewKeySolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object NewKeySolution {
    
    inline def apply(): NewKeySolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewKeySolution]
    }
    
    extension [Self <: NewKeySolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
