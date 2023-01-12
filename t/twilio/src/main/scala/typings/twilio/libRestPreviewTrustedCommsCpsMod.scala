package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewTrustedCommsCpsMod {
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/cps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/cps", "CpsContext")
  @js.native
  open class CpsContext protected () extends StObject {
    /**
      * Initialize the CpsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.libRestPreviewTrustedCommsMod.^) = this()
    
    /**
      * fetch a CpsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CpsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CpsInstance, Any]): js.Promise[CpsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CpsInstance, Any]): js.Promise[CpsInstance] = js.native
    def fetch(opts: CpsInstanceFetchOptions): js.Promise[CpsInstance] = js.native
    def fetch(
      opts: CpsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CpsInstance, Any]
    ): js.Promise[CpsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/cps", "CpsInstance")
  @js.native
  open class CpsInstance protected () extends SerializableClass {
    /**
      * Initialize the CpsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.libRestPreviewTrustedCommsMod.^, payload: CpsPayload) = this()
    
    /* private */ var _proxy: CpsContext = js.native
    
    var cpsUrl: String = js.native
    
    /**
      * fetch a CpsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CpsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CpsInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CpsInstance] = js.native
    def fetch(opts: CpsInstanceFetchOptions): js.Promise[CpsInstance] = js.native
    def fetch(
      opts: CpsInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[CpsInstance] = js.native
    
    var phoneNumber: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CpsList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def CpsList(version: typings.twilio.libRestPreviewTrustedCommsMod.^): CpsListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CpsList")(version.asInstanceOf[js.Any]).asInstanceOf[CpsListInstance]
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/cps", "CpsPage")
  @js.native
  open class CpsPage protected ()
    extends typings.twilio.libBasePageMod.^[typings.twilio.libRestPreviewTrustedCommsMod.^, CpsPayload, CpsResource, CpsInstance] {
    /**
      * Initialize the CpsPage
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
      version: typings.twilio.libRestPreviewTrustedCommsMod.^,
      response: typings.twilio.libHttpResponseMod.^[String],
      solution: CpsSolution
    ) = this()
    
    /**
      * Build an instance of CpsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CpsPayload): CpsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property xXcnamSensitivePhoneNumber - Phone number to retrieve CPS.
    */
  trait CpsInstanceFetchOptions extends StObject {
    
    var xXcnamSensitivePhoneNumber: js.UndefOr[String] = js.undefined
  }
  object CpsInstanceFetchOptions {
    
    inline def apply(): CpsInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CpsInstanceFetchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CpsInstanceFetchOptions] (val x: Self) extends AnyVal {
      
      inline def setXXcnamSensitivePhoneNumber(value: String): Self = StObject.set(x, "xXcnamSensitivePhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setXXcnamSensitivePhoneNumberUndefined: Self = StObject.set(x, "xXcnamSensitivePhoneNumber", js.undefined)
    }
  }
  
  @js.native
  trait CpsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CpsContext = js.native
    
    /**
      * Constructs a cps
      */
    def get(): CpsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait CpsPayload
    extends StObject
       with CpsResource
       with TwilioResponsePayload
  object CpsPayload {
    
    inline def apply(
      cps_url: String,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      previous_page_uri: String,
      uri: String,
      url: String
    ): CpsPayload = {
      val __obj = js.Dynamic.literal(cps_url = cps_url.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpsPayload]
    }
  }
  
  trait CpsResource extends StObject {
    
    var cps_url: String
    
    var phone_number: String
    
    var url: String
  }
  object CpsResource {
    
    inline def apply(cps_url: String, phone_number: String, url: String): CpsResource = {
      val __obj = js.Dynamic.literal(cps_url = cps_url.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpsResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CpsResource] (val x: Self) extends AnyVal {
      
      inline def setCps_url(value: String): Self = StObject.set(x, "cps_url", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CpsSolution extends StObject
}
