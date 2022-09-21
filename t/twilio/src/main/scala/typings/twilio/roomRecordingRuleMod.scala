package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomRecordingRuleMod {
  
  @JSImport("twilio/lib/rest/video/v1/room/roomRecordingRule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/video/v1/room/roomRecordingRule", "RecordingRulesInstance")
  @js.native
  open class RecordingRulesInstance protected () extends SerializableClass {
    /**
      * Initialize the RecordingRulesContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param roomSid - The SID of the Room resource for the Recording Rules
      */
    def this(version: typings.twilio.videoV1Mod.^, payload: RecordingRulesPayload, roomSid: String) = this()
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var roomSid: String = js.native
    
    var rules: js.Array[String] = js.native
  }
  
  /**
    * Initialize the RecordingRulesList
    *
    * @param version - Version of the resource
    * @param roomSid - The SID of the Room resource for the Recording Rules
    */
  inline def RecordingRulesList(version: typings.twilio.videoV1Mod.^, roomSid: String): RecordingRulesListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("RecordingRulesList")(version.asInstanceOf[js.Any], roomSid.asInstanceOf[js.Any])).asInstanceOf[RecordingRulesListInstance]
  
  @JSImport("twilio/lib/rest/video/v1/room/roomRecordingRule", "RecordingRulesPage")
  @js.native
  open class RecordingRulesPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.videoV1Mod.^, 
          RecordingRulesPayload, 
          RecordingRulesResource, 
          RecordingRulesInstance
        ] {
    /**
      * Initialize the RecordingRulesPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.videoV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: RecordingRulesSolution
    ) = this()
    
    /**
      * Build an instance of RecordingRulesInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RecordingRulesPayload): RecordingRulesInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait RecordingRulesListInstance extends StObject {
    
    /**
      * fetch a RecordingRulesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RecordingRulesInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RecordingRulesInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a RecordingRulesInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[RecordingRulesInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RecordingRulesInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RecordingRulesInstance] = js.native
    def update(opts: RecordingRulesListInstanceUpdateOptions): js.Promise[RecordingRulesInstance] = js.native
    def update(
      opts: RecordingRulesListInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[RecordingRulesInstance] = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property rules - A JSON-encoded array of recording rules
    */
  trait RecordingRulesListInstanceUpdateOptions extends StObject {
    
    var rules: js.UndefOr[js.Object] = js.undefined
  }
  object RecordingRulesListInstanceUpdateOptions {
    
    inline def apply(): RecordingRulesListInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingRulesListInstanceUpdateOptions]
    }
    
    extension [Self <: RecordingRulesListInstanceUpdateOptions](x: Self) {
      
      inline def setRules(value: js.Object): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    }
  }
  
  trait RecordingRulesPayload
    extends StObject
       with RecordingRulesResource
       with TwilioResponsePayload
  object RecordingRulesPayload {
    
    inline def apply(
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      room_sid: String,
      rules: js.Array[String],
      uri: String
    ): RecordingRulesPayload = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingRulesPayload]
    }
  }
  
  trait RecordingRulesResource extends StObject {
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var room_sid: String
    
    var rules: js.Array[String]
  }
  object RecordingRulesResource {
    
    inline def apply(date_created: js.Date, date_updated: js.Date, room_sid: String, rules: js.Array[String]): RecordingRulesResource = {
      val __obj = js.Dynamic.literal(date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], room_sid = room_sid.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingRulesResource]
    }
    
    extension [Self <: RecordingRulesResource](x: Self) {
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setRoom_sid(value: String): Self = StObject.set(x, "room_sid", value.asInstanceOf[js.Any])
      
      inline def setRules(value: js.Array[String]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: String*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
  
  trait RecordingRulesSolution extends StObject {
    
    var roomSid: js.UndefOr[String] = js.undefined
  }
  object RecordingRulesSolution {
    
    inline def apply(): RecordingRulesSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingRulesSolution]
    }
    
    extension [Self <: RecordingRulesSolution](x: Self) {
      
      inline def setRoomSid(value: String): Self = StObject.set(x, "roomSid", value.asInstanceOf[js.Any])
      
      inline def setRoomSidUndefined: Self = StObject.set(x, "roomSid", js.undefined)
    }
  }
}
