package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brandedChannelChannelMod {
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/brandedChannel/channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/brandedChannel/channel", "ChannelInstance")
  @js.native
  open class ChannelInstance protected () extends SerializableClass {
    /**
      * Initialize the ChannelContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param brandedChannelSid - Branded Channel Sid.
      */
    def this(version: typings.twilio.trustedCommsMod.^, payload: ChannelPayload, brandedChannelSid: String) = this()
    
    var accountSid: String = js.native
    
    var brandSid: String = js.native
    
    var brandedChannelSid: String = js.native
    
    var businessSid: String = js.native
    
    var phoneNumber: String = js.native
    
    var phoneNumberSid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ChannelList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param brandedChannelSid - Branded Channel Sid.
    */
  inline def ChannelList(version: typings.twilio.trustedCommsMod.^, brandedChannelSid: String): ChannelListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ChannelList")(version.asInstanceOf[js.Any], brandedChannelSid.asInstanceOf[js.Any])).asInstanceOf[ChannelListInstance]
  
  @JSImport("twilio/lib/rest/preview/trusted_comms/brandedChannel/channel", "ChannelPage")
  @js.native
  open class ChannelPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.trustedCommsMod.^, ChannelPayload, ChannelResource, ChannelInstance] {
    /**
      * Initialize the ChannelPage
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
      solution: ChannelSolution
    ) = this()
    
    /**
      * Build an instance of ChannelInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ChannelPayload): ChannelInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ChannelListInstance extends StObject {
    
    /**
      * create a ChannelInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ChannelListInstanceCreateOptions): js.Promise[ChannelInstance] = js.native
    def create(
      opts: ChannelListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ChannelInstance, Any]
    ): js.Promise[ChannelInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property phoneNumberSid - Phone Number Sid to be branded.
    */
  trait ChannelListInstanceCreateOptions extends StObject {
    
    var phoneNumberSid: String
  }
  object ChannelListInstanceCreateOptions {
    
    inline def apply(phoneNumberSid: String): ChannelListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(phoneNumberSid = phoneNumberSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelListInstanceCreateOptions]
    }
    
    extension [Self <: ChannelListInstanceCreateOptions](x: Self) {
      
      inline def setPhoneNumberSid(value: String): Self = StObject.set(x, "phoneNumberSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelPayload
    extends StObject
       with ChannelResource
       with TwilioResponsePayload
  object ChannelPayload {
    
    inline def apply(
      account_sid: String,
      brand_sid: String,
      branded_channel_sid: String,
      business_sid: String,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      phone_number_sid: String,
      previous_page_uri: String,
      uri: String,
      url: String
    ): ChannelPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], brand_sid = brand_sid.asInstanceOf[js.Any], branded_channel_sid = branded_channel_sid.asInstanceOf[js.Any], business_sid = business_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], phone_number_sid = phone_number_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelPayload]
    }
  }
  
  trait ChannelResource extends StObject {
    
    var account_sid: String
    
    var brand_sid: String
    
    var branded_channel_sid: String
    
    var business_sid: String
    
    var phone_number: String
    
    var phone_number_sid: String
    
    var url: String
  }
  object ChannelResource {
    
    inline def apply(
      account_sid: String,
      brand_sid: String,
      branded_channel_sid: String,
      business_sid: String,
      phone_number: String,
      phone_number_sid: String,
      url: String
    ): ChannelResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], brand_sid = brand_sid.asInstanceOf[js.Any], branded_channel_sid = branded_channel_sid.asInstanceOf[js.Any], business_sid = business_sid.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], phone_number_sid = phone_number_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelResource]
    }
    
    extension [Self <: ChannelResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setBrand_sid(value: String): Self = StObject.set(x, "brand_sid", value.asInstanceOf[js.Any])
      
      inline def setBranded_channel_sid(value: String): Self = StObject.set(x, "branded_channel_sid", value.asInstanceOf[js.Any])
      
      inline def setBusiness_sid(value: String): Self = StObject.set(x, "business_sid", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_number_sid(value: String): Self = StObject.set(x, "phone_number_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelSolution extends StObject {
    
    var brandedChannelSid: js.UndefOr[String] = js.undefined
  }
  object ChannelSolution {
    
    inline def apply(): ChannelSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelSolution]
    }
    
    extension [Self <: ChannelSolution](x: Self) {
      
      inline def setBrandedChannelSid(value: String): Self = StObject.set(x, "brandedChannelSid", value.asInstanceOf[js.Any])
      
      inline def setBrandedChannelSidUndefined: Self = StObject.set(x, "brandedChannelSid", js.undefined)
    }
  }
}
