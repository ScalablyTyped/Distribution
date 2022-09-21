package typings.twilio

import typings.twilio.brandedChannelChannelMod.ChannelListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brandedChannelMod {
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/brandedChannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/brandedChannel", "BrandedChannelContext")
  @js.native
  open class BrandedChannelContext protected () extends StObject {
    /**
      * Initialize the BrandedChannelContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - Branded Channel Sid.
      */
    def this(version: typings.twilio.trustedCommsMod.^, sid: String) = this()
    
    var channels: ChannelListInstance = js.native
    
    /**
      * fetch a BrandedChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BrandedChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ BrandedChannelInstance, Any]): js.Promise[BrandedChannelInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/brandedChannel", "BrandedChannelInstance")
  @js.native
  open class BrandedChannelInstance protected () extends SerializableClass {
    /**
      * Initialize the BrandedChannelContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - Branded Channel Sid.
      */
    def this(version: typings.twilio.trustedCommsMod.^, payload: BrandedChannelPayload, sid: String) = this()
    
    /* private */ var _proxy: BrandedChannelContext = js.native
    
    var accountSid: String = js.native
    
    var brandSid: String = js.native
    
    var businessSid: String = js.native
    
    /**
      * Access the channels
      */
    def channels(): ChannelListInstance = js.native
    
    /**
      * fetch a BrandedChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BrandedChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BrandedChannelInstance] = js.native
    
    var links: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the BrandedChannelList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def BrandedChannelList(version: typings.twilio.trustedCommsMod.^): BrandedChannelListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("BrandedChannelList")(version.asInstanceOf[js.Any]).asInstanceOf[BrandedChannelListInstance]
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/brandedChannel", "BrandedChannelPage")
  @js.native
  open class BrandedChannelPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trustedCommsMod.^, 
          BrandedChannelPayload, 
          BrandedChannelResource, 
          BrandedChannelInstance
        ] {
    /**
      * Initialize the BrandedChannelPage
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
      solution: BrandedChannelSolution
    ) = this()
    
    /**
      * Build an instance of BrandedChannelInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BrandedChannelPayload): BrandedChannelInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait BrandedChannelListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): BrandedChannelContext = js.native
    
    /**
      * Constructs a branded_channel
      *
      * @param sid - Branded Channel Sid.
      */
    def get(sid: String): BrandedChannelContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait BrandedChannelPayload
    extends StObject
       with BrandedChannelResource
       with TwilioResponsePayload
  object BrandedChannelPayload {
    
    inline def apply(
      account_sid: String,
      brand_sid: String,
      business_sid: String,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): BrandedChannelPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], brand_sid = brand_sid.asInstanceOf[js.Any], business_sid = business_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandedChannelPayload]
    }
  }
  
  trait BrandedChannelResource extends StObject {
    
    var account_sid: String
    
    var brand_sid: String
    
    var business_sid: String
    
    var links: String
    
    var sid: String
    
    var url: String
  }
  object BrandedChannelResource {
    
    inline def apply(
      account_sid: String,
      brand_sid: String,
      business_sid: String,
      links: String,
      sid: String,
      url: String
    ): BrandedChannelResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], brand_sid = brand_sid.asInstanceOf[js.Any], business_sid = business_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandedChannelResource]
    }
    
    extension [Self <: BrandedChannelResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBrand_sid(value: String): Self = StObject.set(x, "brand_sid", value.asInstanceOf[js.Any])
      
      inline def setBusiness_sid(value: String): Self = StObject.set(x, "business_sid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrandedChannelSolution extends StObject
}
