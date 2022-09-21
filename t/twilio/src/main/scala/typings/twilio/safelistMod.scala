package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safelistMod {
  
  @JSImport("twilio/lib/rest/verify/v2/safelist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/safelist", "SafelistContext")
  @js.native
  open class SafelistContext protected () extends StObject {
    /**
      * Initialize the SafelistContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param phoneNumber - The phone number to be fetched from SafeList.
      */
    def this(version: typings.twilio.verifyV2Mod.^, phoneNumber: String) = this()
    
    /**
      * fetch a SafelistInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SafelistInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SafelistInstance, Any]): js.Promise[SafelistInstance] = js.native
    
    /**
      * remove a SafelistInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SafelistInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/safelist", "SafelistInstance")
  @js.native
  open class SafelistInstance protected () extends SerializableClass {
    /**
      * Initialize the SafelistContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param phoneNumber - The phone number to be fetched from SafeList.
      */
    def this(version: typings.twilio.verifyV2Mod.^, payload: SafelistPayload, phoneNumber: String) = this()
    
    /* private */ var _proxy: SafelistContext = js.native
    
    /**
      * fetch a SafelistInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SafelistInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SafelistInstance] = js.native
    
    var phoneNumber: String = js.native
    
    /**
      * remove a SafelistInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SafelistList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def SafelistList(version: typings.twilio.verifyV2Mod.^): SafelistListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SafelistList")(version.asInstanceOf[js.Any]).asInstanceOf[SafelistListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/safelist", "SafelistPage")
  @js.native
  open class SafelistPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.verifyV2Mod.^, SafelistPayload, SafelistResource, SafelistInstance] {
    /**
      * Initialize the SafelistPage
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
      solution: SafelistSolution
    ) = this()
    
    /**
      * Build an instance of SafelistInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SafelistPayload): SafelistInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait SafelistListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SafelistContext = js.native
    
    /**
      * create a SafelistInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SafelistListInstanceCreateOptions): js.Promise[SafelistInstance] = js.native
    def create(
      opts: SafelistListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SafelistInstance, Any]
    ): js.Promise[SafelistInstance] = js.native
    
    /**
      * Constructs a safelist
      *
      * @param phoneNumber - The phone number to be fetched from SafeList.
      */
    def get(phoneNumber: String): SafelistContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property phoneNumber - The phone number to be added in SafeList.
    */
  trait SafelistListInstanceCreateOptions extends StObject {
    
    var phoneNumber: String
  }
  object SafelistListInstanceCreateOptions {
    
    inline def apply(phoneNumber: String): SafelistListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafelistListInstanceCreateOptions]
    }
    
    extension [Self <: SafelistListInstanceCreateOptions](x: Self) {
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait SafelistPayload
    extends StObject
       with SafelistResource
       with TwilioResponsePayload
  object SafelistPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): SafelistPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafelistPayload]
    }
  }
  
  trait SafelistResource extends StObject {
    
    var phone_number: String
    
    var sid: String
    
    var url: String
  }
  object SafelistResource {
    
    inline def apply(phone_number: String, sid: String, url: String): SafelistResource = {
      val __obj = js.Dynamic.literal(phone_number = phone_number.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafelistResource]
    }
    
    extension [Self <: SafelistResource](x: Self) {
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SafelistSolution extends StObject
}
