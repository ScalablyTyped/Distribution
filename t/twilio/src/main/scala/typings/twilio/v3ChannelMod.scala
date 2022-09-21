package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v3ChannelMod {
  
  @JSImport("twilio/lib/rest/chat/v3/channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/chat/v3/channel", "ChannelContext")
  @js.native
  open class ChannelContext protected () extends StObject {
    /**
      * Initialize the ChannelContext
      *
      * @param version - Version of the resource
      * @param serviceSid - Service Sid.
      * @param sid - A string that uniquely identifies this Channel.
      */
    def this(version: typings.twilio.v3Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelInstance, Any]): js.Promise[ChannelInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelInstance, Any]): js.Promise[ChannelInstance] = js.native
    def update(opts: ChannelInstanceUpdateOptions): js.Promise[ChannelInstance] = js.native
    def update(
      opts: ChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelInstance, Any]
    ): js.Promise[ChannelInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/chat/v3/channel", "ChannelInstance")
  @js.native
  open class ChannelInstance protected () extends SerializableClass {
    /**
      * Initialize the ChannelContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - Service Sid.
      * @param sid - A string that uniquely identifies this Channel.
      */
    def this(version: typings.twilio.v3Mod.^, payload: ChannelPayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: ChannelContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: String = js.native
    
    var createdBy: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var friendlyName: String = js.native
    
    var membersCount: Double = js.native
    
    var messagesCount: Double = js.native
    
    var messagingServiceSid: String = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var `type`: ChannelChannelType = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ChannelInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ChannelInstance] = js.native
    def update(opts: ChannelInstanceUpdateOptions): js.Promise[ChannelInstance] = js.native
    def update(
      opts: ChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ChannelInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ChannelList
    *
    * @param version - Version of the resource
    */
  inline def ChannelList(version: typings.twilio.v3Mod.^): ChannelListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ChannelList")(version.asInstanceOf[js.Any]).asInstanceOf[ChannelListInstance]
  
  @JSImport("twilio/lib/rest/chat/v3/channel", "ChannelPage")
  @js.native
  open class ChannelPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v3Mod.^, ChannelPayload, ChannelResource, ChannelInstance] {
    /**
      * Initialize the ChannelPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v3Mod.^,
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.public
    - typings.twilio.twilioStrings.`private`
  */
  trait ChannelChannelType extends StObject
  object ChannelChannelType {
    
    inline def `private`: typings.twilio.twilioStrings.`private` = "private".asInstanceOf[typings.twilio.twilioStrings.`private`]
    
    inline def public: typings.twilio.twilioStrings.public = "public".asInstanceOf[typings.twilio.twilioStrings.public]
  }
  
  /**
    * Options to pass to update
    *
    * @property messagingServiceSid - The unique ID of the Messaging Service this channel belongs to.
    * @property type - The Type for this Channel to migrate to.
    * @property xTwilioWebhookEnabled - The X-Twilio-Webhook-Enabled HTTP request header
    */
  trait ChannelInstanceUpdateOptions extends StObject {
    
    var messagingServiceSid: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[ChannelChannelType] = js.undefined
    
    var xTwilioWebhookEnabled: js.UndefOr[ChannelWebhookEnabledType] = js.undefined
  }
  object ChannelInstanceUpdateOptions {
    
    inline def apply(): ChannelInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelInstanceUpdateOptions]
    }
    
    extension [Self <: ChannelInstanceUpdateOptions](x: Self) {
      
      inline def setMessagingServiceSid(value: String): Self = StObject.set(x, "messagingServiceSid", value.asInstanceOf[js.Any])
      
      inline def setMessagingServiceSidUndefined: Self = StObject.set(x, "messagingServiceSid", js.undefined)
      
      inline def setType(value: ChannelChannelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXTwilioWebhookEnabled(value: ChannelWebhookEnabledType): Self = StObject.set(x, "xTwilioWebhookEnabled", value.asInstanceOf[js.Any])
      
      inline def setXTwilioWebhookEnabledUndefined: Self = StObject.set(x, "xTwilioWebhookEnabled", js.undefined)
    }
  }
  
  @js.native
  trait ChannelListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ChannelContext = js.native
    
    /**
      * Constructs a channel
      *
      * @param serviceSid - Service Sid.
      * @param sid - A string that uniquely identifies this Channel.
      */
    def get(serviceSid: String, sid: String): ChannelContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait ChannelPayload
    extends StObject
       with ChannelResource
       with TwilioResponsePayload
  object ChannelPayload {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      created_by: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      members_count: Double,
      messages_count: Double,
      messaging_service_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      `type`: ChannelChannelType,
      unique_name: String,
      uri: String,
      url: String
    ): ChannelPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], members_count = members_count.asInstanceOf[js.Any], messages_count = messages_count.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelPayload]
    }
  }
  
  trait ChannelResource extends StObject {
    
    var account_sid: String
    
    var attributes: String
    
    var created_by: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var members_count: Double
    
    var messages_count: Double
    
    var messaging_service_sid: String
    
    var service_sid: String
    
    var sid: String
    
    var `type`: ChannelChannelType
    
    var unique_name: String
    
    var url: String
  }
  object ChannelResource {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      created_by: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      members_count: Double,
      messages_count: Double,
      messaging_service_sid: String,
      service_sid: String,
      sid: String,
      `type`: ChannelChannelType,
      unique_name: String,
      url: String
    ): ChannelResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], members_count = members_count.asInstanceOf[js.Any], messages_count = messages_count.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelResource]
    }
    
    extension [Self <: ChannelResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setMembers_count(value: Double): Self = StObject.set(x, "members_count", value.asInstanceOf[js.Any])
      
      inline def setMessages_count(value: Double): Self = StObject.set(x, "messages_count", value.asInstanceOf[js.Any])
      
      inline def setMessaging_service_sid(value: String): Self = StObject.set(x, "messaging_service_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setType(value: ChannelChannelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`true`
    - typings.twilio.twilioStrings.`false`
  */
  trait ChannelWebhookEnabledType extends StObject
  object ChannelWebhookEnabledType {
    
    inline def `false`: typings.twilio.twilioStrings.`false` = "false".asInstanceOf[typings.twilio.twilioStrings.`false`]
    
    inline def `true`: typings.twilio.twilioStrings.`true` = "true".asInstanceOf[typings.twilio.twilioStrings.`true`]
  }
}
