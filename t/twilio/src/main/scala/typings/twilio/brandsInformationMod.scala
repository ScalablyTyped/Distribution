package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brandsInformationMod {
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/brandsInformation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/brandsInformation", "BrandsInformationContext")
  @js.native
  open class BrandsInformationContext protected () extends StObject {
    /**
      * Initialize the BrandsInformationContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      */
    def this(version: typings.twilio.trustedCommsMod.^) = this()
    
    /**
      * fetch a BrandsInformationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BrandsInformationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandsInformationInstance, Any]): js.Promise[BrandsInformationInstance] = js.native
    def fetch(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandsInformationInstance, Any]
    ): js.Promise[BrandsInformationInstance] = js.native
    def fetch(opts: BrandsInformationInstanceFetchOptions): js.Promise[BrandsInformationInstance] = js.native
    def fetch(
      opts: BrandsInformationInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandsInformationInstance, Any]
    ): js.Promise[BrandsInformationInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/brandsInformation", "BrandsInformationInstance")
  @js.native
  open class BrandsInformationInstance protected () extends SerializableClass {
    /**
      * Initialize the BrandsInformationContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.trustedCommsMod.^, payload: BrandsInformationPayload) = this()
    
    /* private */ var _proxy: BrandsInformationContext = js.native
    
    /**
      * fetch a BrandsInformationInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BrandsInformationInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BrandsInformationInstance] = js.native
    def fetch(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BrandsInformationInstance] = js.native
    def fetch(opts: BrandsInformationInstanceFetchOptions): js.Promise[BrandsInformationInstance] = js.native
    def fetch(
      opts: BrandsInformationInstanceFetchOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[BrandsInformationInstance] = js.native
    
    var fileLink: String = js.native
    
    var fileLinkTtlInSeconds: String = js.native
    
    var updateTime: js.Date = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the BrandsInformationList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def BrandsInformationList(version: typings.twilio.trustedCommsMod.^): BrandsInformationListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("BrandsInformationList")(version.asInstanceOf[js.Any]).asInstanceOf[BrandsInformationListInstance]
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/brandsInformation", "BrandsInformationPage")
  @js.native
  open class BrandsInformationPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trustedCommsMod.^, 
          BrandsInformationPayload, 
          BrandsInformationResource, 
          BrandsInformationInstance
        ] {
    /**
      * Initialize the BrandsInformationPage
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
      solution: BrandsInformationSolution
    ) = this()
    
    /**
      * Build an instance of BrandsInformationInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BrandsInformationPayload): BrandsInformationInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to fetch
    *
    * @property ifNoneMatch - Standard `If-None-Match` HTTP header
    */
  trait BrandsInformationInstanceFetchOptions extends StObject {
    
    var ifNoneMatch: js.UndefOr[String] = js.undefined
  }
  object BrandsInformationInstanceFetchOptions {
    
    inline def apply(): BrandsInformationInstanceFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrandsInformationInstanceFetchOptions]
    }
    
    extension [Self <: BrandsInformationInstanceFetchOptions](x: Self) {
      
      inline def setIfNoneMatch(value: String): Self = StObject.set(x, "ifNoneMatch", value.asInstanceOf[js.Any])
      
      inline def setIfNoneMatchUndefined: Self = StObject.set(x, "ifNoneMatch", js.undefined)
    }
  }
  
  @js.native
  trait BrandsInformationListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): BrandsInformationContext = js.native
    
    /**
      * Constructs a brands_information
      */
    def get(): BrandsInformationContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait BrandsInformationPayload
    extends StObject
       with BrandsInformationResource
       with TwilioResponsePayload
  object BrandsInformationPayload {
    
    inline def apply(
      file_link: String,
      file_link_ttl_in_seconds: String,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      update_time: js.Date,
      uri: String,
      url: String
    ): BrandsInformationPayload = {
      val __obj = js.Dynamic.literal(file_link = file_link.asInstanceOf[js.Any], file_link_ttl_in_seconds = file_link_ttl_in_seconds.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandsInformationPayload]
    }
  }
  
  trait BrandsInformationResource extends StObject {
    
    var file_link: String
    
    var file_link_ttl_in_seconds: String
    
    var update_time: js.Date
    
    var url: String
  }
  object BrandsInformationResource {
    
    inline def apply(file_link: String, file_link_ttl_in_seconds: String, update_time: js.Date, url: String): BrandsInformationResource = {
      val __obj = js.Dynamic.literal(file_link = file_link.asInstanceOf[js.Any], file_link_ttl_in_seconds = file_link_ttl_in_seconds.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandsInformationResource]
    }
    
    extension [Self <: BrandsInformationResource](x: Self) {
      
      inline def setFile_link(value: String): Self = StObject.set(x, "file_link", value.asInstanceOf[js.Any])
      
      inline def setFile_link_ttl_in_seconds(value: String): Self = StObject.set(x, "file_link_ttl_in_seconds", value.asInstanceOf[js.Any])
      
      inline def setUpdate_time(value: js.Date): Self = StObject.set(x, "update_time", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrandsInformationSolution extends StObject
}
