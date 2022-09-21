package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomParticipantSubscribeRuleMod {
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantSubscribeRule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantSubscribeRule", "SubscribeRulesInstance")
  @js.native
  open class SubscribeRulesInstance protected () extends SerializableClass {
    /**
      * Initialize the SubscribeRulesContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param roomSid - The SID of the Room resource for the Subscribe Rules
      * @param participantSid - The SID of the Participant resource for the Subscribe Rules
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      payload: SubscribeRulesPayload,
      roomSid: String,
      participantSid: String
    ) = this()
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var participantSid: String = js.native
    
    var roomSid: String = js.native
    
    var rules: js.Array[String] = js.native
  }
  
  /**
    * Initialize the SubscribeRulesList
    *
    * @param version - Version of the resource
    * @param roomSid - The SID of the Room resource for the Subscribe Rules
    * @param participantSid - The SID of the Participant resource for the Subscribe Rules
    */
  inline def SubscribeRulesList(version: typings.twilio.videoV1Mod.^, roomSid: String, participantSid: String): SubscribeRulesListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SubscribeRulesList")(version.asInstanceOf[js.Any], roomSid.asInstanceOf[js.Any], participantSid.asInstanceOf[js.Any])).asInstanceOf[SubscribeRulesListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantSubscribeRule", "SubscribeRulesPage")
  @js.native
  open class SubscribeRulesPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.videoV1Mod.^, 
          SubscribeRulesPayload, 
          SubscribeRulesResource, 
          SubscribeRulesInstance
        ] {
    /**
      * Initialize the SubscribeRulesPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SubscribeRulesSolution
    ) = this()
    
    /**
      * Build an instance of SubscribeRulesInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SubscribeRulesPayload): SubscribeRulesInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait SubscribeRulesListInstance extends StObject {
    
    /**
      * fetch a SubscribeRulesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SubscribeRulesInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SubscribeRulesInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SubscribeRulesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SubscribeRulesInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SubscribeRulesInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SubscribeRulesInstance] = js.native
    def update(opts: SubscribeRulesListInstanceUpdateOptions): js.Promise[SubscribeRulesInstance] = js.native
    def update(
      opts: SubscribeRulesListInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SubscribeRulesInstance] = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property rules - A JSON-encoded array of subscribe rules
    */
  trait SubscribeRulesListInstanceUpdateOptions extends StObject {
    
    var rules: js.UndefOr[js.Object] = js.undefined
  }
  object SubscribeRulesListInstanceUpdateOptions {
    
    inline def apply(): SubscribeRulesListInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeRulesListInstanceUpdateOptions]
    }
    
    extension [Self <: SubscribeRulesListInstanceUpdateOptions](x: Self) {
      
      inline def setRules(value: js.Object): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    }
  }
  
  trait SubscribeRulesPayload
    extends StObject
       with SubscribeRulesResource
       with TwilioResponsePayload
  object SubscribeRulesPayload {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      participant_sid: String,
      previous_page_uri: String,
      room_sid: String,
      rules: js.Array[String],
      uri: String
    ): SubscribeRulesPayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeRulesPayload]
    }
  }
  
  trait SubscribeRulesResource extends StObject {
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var participant_sid: String
    
    var room_sid: String
    
    var rules: js.Array[String]
  }
  object SubscribeRulesResource {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      participant_sid: String,
      room_sid: String,
      rules: js.Array[String]
    ): SubscribeRulesResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], participant_sid = participant_sid.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeRulesResource]
    }
    
    extension [Self <: SubscribeRulesResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setParticipant_sid(value: String): Self = StObject.set(x, "participant_sid", value.asInstanceOf[js.Any])
      
      inline def setRoom_sid(value: String): Self = StObject.set(x, "room_sid", value.asInstanceOf[js.Any])
      
      inline def setRules(value: js.Array[String]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: String*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
  
  trait SubscribeRulesSolution extends StObject {
    
    var participantSid: js.UndefOr[String] = js.undefined
    
    var roomSid: js.UndefOr[String] = js.undefined
  }
  object SubscribeRulesSolution {
    
    inline def apply(): SubscribeRulesSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeRulesSolution]
    }
    
    extension [Self <: SubscribeRulesSolution](x: Self) {
      
      inline def setParticipantSid(value: String): Self = StObject.set(x, "participantSid", value.asInstanceOf[js.Any])
      
      inline def setParticipantSidUndefined: Self = StObject.set(x, "participantSid", js.undefined)
      
      inline def setRoomSid(value: String): Self = StObject.set(x, "roomSid", value.asInstanceOf[js.Any])
      
      inline def setRoomSidUndefined: Self = StObject.set(x, "roomSid", js.undefined)
    }
  }
}
