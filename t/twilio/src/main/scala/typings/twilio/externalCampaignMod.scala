package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalCampaignMod {
  
  @JSImport("twilio/lib/rest/messaging/v1/externalCampaign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/messaging/v1/externalCampaign", "ExternalCampaignInstance")
  @js.native
  open class ExternalCampaignInstance protected () extends SerializableClass {
    /**
      * Initialize the ExternalCampaignContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      */
    def this(version: typings.twilio.messagingV1Mod.^, payload: ExternalCampaignPayload) = this()
    
    var accountSid: String = js.native
    
    var campaignId: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var messagingServiceSid: String = js.native
    
    var sid: String = js.native
  }
  
  /**
    * Initialize the ExternalCampaignList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def ExternalCampaignList(version: typings.twilio.messagingV1Mod.^): ExternalCampaignListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ExternalCampaignList")(version.asInstanceOf[js.Any]).asInstanceOf[ExternalCampaignListInstance]
  
  @JSImport("twilio/lib/rest/messaging/v1/externalCampaign", "ExternalCampaignPage")
  @js.native
  open class ExternalCampaignPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.messagingV1Mod.^, 
          ExternalCampaignPayload, 
          ExternalCampaignResource, 
          ExternalCampaignInstance
        ] {
    /**
      * Initialize the ExternalCampaignPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.messagingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ExternalCampaignSolution
    ) = this()
    
    /**
      * Build an instance of ExternalCampaignInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ExternalCampaignPayload): ExternalCampaignInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ExternalCampaignListInstance extends StObject {
    
    /**
      * create a ExternalCampaignInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ExternalCampaignListInstanceCreateOptions): js.Promise[ExternalCampaignInstance] = js.native
    def create(
      opts: ExternalCampaignListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ExternalCampaignInstance, Any]
    ): js.Promise[ExternalCampaignInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property campaignId - ID of the preregistered campaign.
    * @property messagingServiceSid - The SID of the Messaging Service the resource is associated with
    */
  trait ExternalCampaignListInstanceCreateOptions extends StObject {
    
    var campaignId: String
    
    var messagingServiceSid: String
  }
  object ExternalCampaignListInstanceCreateOptions {
    
    inline def apply(campaignId: String, messagingServiceSid: String): ExternalCampaignListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(campaignId = campaignId.asInstanceOf[js.Any], messagingServiceSid = messagingServiceSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalCampaignListInstanceCreateOptions]
    }
    
    extension [Self <: ExternalCampaignListInstanceCreateOptions](x: Self) {
      
      inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
      
      inline def setMessagingServiceSid(value: String): Self = StObject.set(x, "messagingServiceSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalCampaignPayload
    extends StObject
       with ExternalCampaignResource
       with TwilioResponsePayload
  object ExternalCampaignPayload {
    
    inline def apply(
      account_sid: String,
      campaign_id: String,
      date_created: js.Date,
      first_page_uri: String,
      messaging_service_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String
    ): ExternalCampaignPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], campaign_id = campaign_id.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalCampaignPayload]
    }
  }
  
  trait ExternalCampaignResource extends StObject {
    
    var account_sid: String
    
    var campaign_id: String
    
    var date_created: js.Date
    
    var messaging_service_sid: String
    
    var sid: String
  }
  object ExternalCampaignResource {
    
    inline def apply(
      account_sid: String,
      campaign_id: String,
      date_created: js.Date,
      messaging_service_sid: String,
      sid: String
    ): ExternalCampaignResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], campaign_id = campaign_id.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalCampaignResource]
    }
    
    extension [Self <: ExternalCampaignResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCampaign_id(value: String): Self = StObject.set(x, "campaign_id", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setMessaging_service_sid(value: String): Self = StObject.set(x, "messaging_service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalCampaignSolution extends StObject
}
