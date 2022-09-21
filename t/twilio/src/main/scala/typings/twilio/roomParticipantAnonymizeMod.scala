package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomParticipantAnonymizeMod {
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantAnonymize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantAnonymize", "AnonymizeContext")
  @js.native
  open class AnonymizeContext protected () extends StObject {
    /**
      * Initialize the AnonymizeContext
      *
      * @param version - Version of the resource
      * @param roomSid - The SID of the room with the participant to update
      * @param sid - The SID that identifies the resource to update
      */
    def this(version: typings.twilio.videoV1Mod.^, roomSid: String, sid: String) = this()
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a AnonymizeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AnonymizeInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ AnonymizeInstance, Any]): js.Promise[AnonymizeInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantAnonymize", "AnonymizeInstance")
  @js.native
  open class AnonymizeInstance protected () extends SerializableClass {
    /**
      * Initialize the AnonymizeContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param roomSid - The SID of the participant's room
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.videoV1Mod.^, payload: AnonymizePayload, roomSid: String, sid: String) = this()
    
    /* private */ var _proxy: AnonymizeContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var duration: Double = js.native
    
    var endTime: js.Date = js.native
    
    var identity: String = js.native
    
    var roomSid: String = js.native
    
    var sid: String = js.native
    
    var startTime: js.Date = js.native
    
    var status: AnonymizeStatus = js.native
    
    /**
      * update a AnonymizeInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AnonymizeInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AnonymizeInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AnonymizeList
    *
    * @param version - Version of the resource
    * @param roomSid - The SID of the participant's room
    * @param sid - The unique string that identifies the resource
    */
  inline def AnonymizeList(version: typings.twilio.videoV1Mod.^, roomSid: String, sid: String): AnonymizeListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AnonymizeList")(version.asInstanceOf[js.Any], roomSid.asInstanceOf[js.Any], sid.asInstanceOf[js.Any])).asInstanceOf[AnonymizeListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/room/roomParticipant/roomParticipantAnonymize", "AnonymizePage")
  @js.native
  open class AnonymizePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.videoV1Mod.^, AnonymizePayload, AnonymizeResource, AnonymizeInstance] {
    /**
      * Initialize the AnonymizePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AnonymizeSolution
    ) = this()
    
    /**
      * Build an instance of AnonymizeInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AnonymizePayload): AnonymizeInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AnonymizeListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AnonymizeContext = js.native
    
    /**
      * Constructs a anonymize
      */
    def get(): AnonymizeContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait AnonymizePayload
    extends StObject
       with AnonymizeResource
       with TwilioResponsePayload
  object AnonymizePayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      duration: Double,
      end_time: js.Date,
      first_page_uri: String,
      identity: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      room_sid: String,
      sid: String,
      start_time: js.Date,
      status: AnonymizeStatus,
      uri: String,
      url: String
    ): AnonymizePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnonymizePayload]
    }
  }
  
  trait AnonymizeResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var duration: Double
    
    var end_time: js.Date
    
    var identity: String
    
    var room_sid: String
    
    var sid: String
    
    var start_time: js.Date
    
    var status: AnonymizeStatus
    
    var url: String
  }
  object AnonymizeResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      duration: Double,
      end_time: js.Date,
      identity: String,
      room_sid: String,
      sid: String,
      start_time: js.Date,
      status: AnonymizeStatus,
      url: String
    ): AnonymizeResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnonymizeResource]
    }
    
    extension [Self <: AnonymizeResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEnd_time(value: js.Date): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setRoom_sid(value: String): Self = StObject.set(x, "room_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStart_time(value: js.Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: AnonymizeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnonymizeSolution extends StObject {
    
    var roomSid: js.UndefOr[String] = js.undefined
    
    var sid: js.UndefOr[String] = js.undefined
  }
  object AnonymizeSolution {
    
    inline def apply(): AnonymizeSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnonymizeSolution]
    }
    
    extension [Self <: AnonymizeSolution](x: Self) {
      
      inline def setRoomSid(value: String): Self = StObject.set(x, "roomSid", value.asInstanceOf[js.Any])
      
      inline def setRoomSidUndefined: Self = StObject.set(x, "roomSid", js.undefined)
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.connected
    - typings.twilio.twilioStrings.disconnected
  */
  trait AnonymizeStatus extends StObject
  object AnonymizeStatus {
    
    inline def connected: typings.twilio.twilioStrings.connected = "connected".asInstanceOf[typings.twilio.twilioStrings.connected]
    
    inline def disconnected: typings.twilio.twilioStrings.disconnected = "disconnected".asInstanceOf[typings.twilio.twilioStrings.disconnected]
  }
}
