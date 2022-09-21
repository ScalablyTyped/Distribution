package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object currentCallMod {
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/currentCall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/currentCall", "CurrentCallContext")
  @js.native
  open class CurrentCallContext protected () extends StObject {
    /**
      * Initialize the CurrentCallContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.trustedCommsMod.^) = this()
    
    /**
      * fetch a CurrentCallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CurrentCallInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CurrentCallInstance, Any]): js.Promise[CurrentCallInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CurrentCallInstance, Any]
    ): js.Promise[CurrentCallInstance] = js.native
    def fetch(opts: CurrentCallInstanceFetchOptions): js.Promise[CurrentCallInstance] = js.native
    def fetch(
      opts: CurrentCallInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CurrentCallInstance, Any]
    ): js.Promise[CurrentCallInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/currentCall", "CurrentCallInstance")
  @js.native
  open class CurrentCallInstance protected () extends SerializableClass {
    /**
      * Initialize the CurrentCallContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.trustedCommsMod.^, payload: CurrentCallPayload) = this()
    
    /* private */ var _proxy: CurrentCallContext = js.native
    
    var bgColor: String = js.native
    
    var caller: String = js.native
    
    var createdAt: js.Date = js.native
    
    /**
      * fetch a CurrentCallInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CurrentCallInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CurrentCallInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CurrentCallInstance] = js.native
    def fetch(opts: CurrentCallInstanceFetchOptions): js.Promise[CurrentCallInstance] = js.native
    def fetch(
      opts: CurrentCallInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[CurrentCallInstance] = js.native
    
    var fontColor: String = js.native
    
    var from: String = js.native
    
    var logo: String = js.native
    
    var manager: String = js.native
    
    var reason: String = js.native
    
    var shieldImg: String = js.native
    
    var sid: String = js.native
    
    var status: String = js.native
    
    var to: String = js.native
    
    var url: String = js.native
    
    var useCase: String = js.native
  }
  
  /**
    * Initialize the CurrentCallList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def CurrentCallList(version: typings.twilio.trustedCommsMod.^): CurrentCallListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CurrentCallList")(version.asInstanceOf[js.Any]).asInstanceOf[CurrentCallListInstance]
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/currentCall", "CurrentCallPage")
  @js.native
  open class CurrentCallPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trustedCommsMod.^, 
          CurrentCallPayload, 
          CurrentCallResource, 
          CurrentCallInstance
        ] {
    /**
      * Initialize the CurrentCallPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trustedCommsMod.^,
      response: typings.twilio.responseMod.^[String],
      solution: CurrentCallSolution
    ) = this()
    
    /**
      * Build an instance of CurrentCallInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CurrentCallPayload): CurrentCallInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property xXcnamSensitivePhoneNumberFrom - The originating Phone Number
    * @property xXcnamSensitivePhoneNumberTo - The terminating Phone Number
    */
  trait CurrentCallInstanceFetchOptions extends StObject {
    
    var xXcnamSensitivePhoneNumberFrom: js.UndefOr[String] = js.undefined
    
    var xXcnamSensitivePhoneNumberTo: js.UndefOr[String] = js.undefined
  }
  object CurrentCallInstanceFetchOptions {
    
    inline def apply(): CurrentCallInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrentCallInstanceFetchOptions]
    }
    
    extension [Self <: CurrentCallInstanceFetchOptions](x: Self) {
      
      inline def setXXcnamSensitivePhoneNumberFrom(value: String): Self = StObject.set(x, "xXcnamSensitivePhoneNumberFrom", value.asInstanceOf[js.Any])
      
      inline def setXXcnamSensitivePhoneNumberFromUndefined: Self = StObject.set(x, "xXcnamSensitivePhoneNumberFrom", js.undefined)
      
      inline def setXXcnamSensitivePhoneNumberTo(value: String): Self = StObject.set(x, "xXcnamSensitivePhoneNumberTo", value.asInstanceOf[js.Any])
      
      inline def setXXcnamSensitivePhoneNumberToUndefined: Self = StObject.set(x, "xXcnamSensitivePhoneNumberTo", js.undefined)
    }
  }
  
  @js.native
  trait CurrentCallListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CurrentCallContext = js.native
    
    /**
      * Constructs a current_call
      */
    def get(): CurrentCallContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait CurrentCallPayload
    extends StObject
       with CurrentCallResource
       with TwilioResponsePayload
  object CurrentCallPayload {
    
    inline def apply(
      bg_color: String,
      caller: String,
      created_at: js.Date,
      first_page_uri: String,
      font_color: String,
      from: String,
      logo: String,
      manager: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      reason: String,
      shield_img: String,
      sid: String,
      status: String,
      to: String,
      uri: String,
      url: String,
      use_case: String
    ): CurrentCallPayload = {
      val __obj = js.Dynamic.literal(bg_color = bg_color.asInstanceOf[js.Any], caller = caller.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], font_color = font_color.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], shield_img = shield_img.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_case = use_case.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentCallPayload]
    }
  }
  
  trait CurrentCallResource extends StObject {
    
    var bg_color: String
    
    var caller: String
    
    var created_at: js.Date
    
    var font_color: String
    
    var from: String
    
    var logo: String
    
    var manager: String
    
    var reason: String
    
    var shield_img: String
    
    var sid: String
    
    var status: String
    
    var to: String
    
    var url: String
    
    var use_case: String
  }
  object CurrentCallResource {
    
    inline def apply(
      bg_color: String,
      caller: String,
      created_at: js.Date,
      font_color: String,
      from: String,
      logo: String,
      manager: String,
      reason: String,
      shield_img: String,
      sid: String,
      status: String,
      to: String,
      url: String,
      use_case: String
    ): CurrentCallResource = {
      val __obj = js.Dynamic.literal(bg_color = bg_color.asInstanceOf[js.Any], caller = caller.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], font_color = font_color.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], shield_img = shield_img.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_case = use_case.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentCallResource]
    }
    
    extension [Self <: CurrentCallResource](x: Self) {
      
      inline def setBg_color(value: String): Self = StObject.set(x, "bg_color", value.asInstanceOf[js.Any])
      
      inline def setCaller(value: String): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setFont_color(value: String): Self = StObject.set(x, "font_color", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setManager(value: String): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setShield_img(value: String): Self = StObject.set(x, "shield_img", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUse_case(value: String): Self = StObject.set(x, "use_case", value.asInstanceOf[js.Any])
    }
  }
  
  trait CurrentCallSolution extends StObject
}
