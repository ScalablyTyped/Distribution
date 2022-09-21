package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trunkRecordingMod {
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/recording", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/recording", "RecordingContext")
  @js.native
  open class RecordingContext protected () extends StObject {
    /**
      * Initialize the RecordingContext
      *
      * @param version - Version of the resource
      * @param trunkSid - The SID of the Trunk from which to fetch the recording settings.
      */
    def this(version: typings.twilio.trunkingV1Mod.^, trunkSid: String) = this()
    
    /**
      * fetch a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RecordingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingInstance, Any]): js.Promise[RecordingInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[RecordingInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingInstance, Any]): js.Promise[RecordingInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingInstance, Any]
    ): js.Promise[RecordingInstance] = js.native
    def update(opts: RecordingInstanceUpdateOptions): js.Promise[RecordingInstance] = js.native
    def update(
      opts: RecordingInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ RecordingInstance, Any]
    ): js.Promise[RecordingInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/recording", "RecordingInstance")
  @js.native
  open class RecordingInstance protected () extends SerializableClass {
    /**
      * Initialize the RecordingContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param trunkSid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trunkingV1Mod.^, payload: RecordingPayload, trunkSid: String) = this()
    
    /* private */ var _proxy: RecordingContext = js.native
    
    /**
      * fetch a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[RecordingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RecordingInstance] = js.native
    
    var mode: RecordingRecordingMode = js.native
    
    var trim: RecordingRecordingTrim = js.native
    
    /**
      * update a RecordingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[RecordingInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RecordingInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[RecordingInstance] = js.native
    def update(opts: RecordingInstanceUpdateOptions): js.Promise[RecordingInstance] = js.native
    def update(
      opts: RecordingInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[RecordingInstance] = js.native
  }
  
  /**
    * Initialize the RecordingList
    *
    * @param version - Version of the resource
    * @param trunkSid - The unique string that identifies the resource
    */
  inline def RecordingList(version: typings.twilio.trunkingV1Mod.^, trunkSid: String): RecordingListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("RecordingList")(version.asInstanceOf[js.Any], trunkSid.asInstanceOf[js.Any])).asInstanceOf[RecordingListInstance]
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk/recording", "RecordingPage")
  @js.native
  open class RecordingPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.trunkingV1Mod.^, RecordingPayload, RecordingResource, RecordingInstance] {
    /**
      * Initialize the RecordingPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trunkingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: RecordingSolution
    ) = this()
    
    /**
      * Build an instance of RecordingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: RecordingPayload): RecordingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property mode - The recording mode for the trunk.
    * @property trim - The recording trim setting for the trunk.
    */
  trait RecordingInstanceUpdateOptions extends StObject {
    
    var mode: js.UndefOr[RecordingRecordingMode] = js.undefined
    
    var trim: js.UndefOr[RecordingRecordingTrim] = js.undefined
  }
  object RecordingInstanceUpdateOptions {
    
    inline def apply(): RecordingInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingInstanceUpdateOptions]
    }
    
    extension [Self <: RecordingInstanceUpdateOptions](x: Self) {
      
      inline def setMode(value: RecordingRecordingMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTrim(value: RecordingRecordingTrim): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  @js.native
  trait RecordingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): RecordingContext = js.native
    
    /**
      * Constructs a recording
      */
    def get(): RecordingContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait RecordingPayload
    extends StObject
       with RecordingResource
       with TwilioResponsePayload
  object RecordingPayload {
    
    inline def apply(
      first_page_uri: String,
      mode: RecordingRecordingMode,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      trim: RecordingRecordingTrim,
      uri: String
    ): RecordingPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingPayload]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`do-not-record`
    - typings.twilio.twilioStrings.`record-from-ringing`
    - typings.twilio.twilioStrings.`record-from-answer`
    - typings.twilio.twilioStrings.`record-from-ringing-dual`
    - typings.twilio.twilioStrings.`record-from-answer-dual`
  */
  trait RecordingRecordingMode extends StObject
  object RecordingRecordingMode {
    
    inline def `do-not-record`: typings.twilio.twilioStrings.`do-not-record` = "do-not-record".asInstanceOf[typings.twilio.twilioStrings.`do-not-record`]
    
    inline def `record-from-answer`: typings.twilio.twilioStrings.`record-from-answer` = "record-from-answer".asInstanceOf[typings.twilio.twilioStrings.`record-from-answer`]
    
    inline def `record-from-answer-dual`: typings.twilio.twilioStrings.`record-from-answer-dual` = "record-from-answer-dual".asInstanceOf[typings.twilio.twilioStrings.`record-from-answer-dual`]
    
    inline def `record-from-ringing`: typings.twilio.twilioStrings.`record-from-ringing` = "record-from-ringing".asInstanceOf[typings.twilio.twilioStrings.`record-from-ringing`]
    
    inline def `record-from-ringing-dual`: typings.twilio.twilioStrings.`record-from-ringing-dual` = "record-from-ringing-dual".asInstanceOf[typings.twilio.twilioStrings.`record-from-ringing-dual`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`trim-silence`
    - typings.twilio.twilioStrings.`do-not-trim`
  */
  trait RecordingRecordingTrim extends StObject
  object RecordingRecordingTrim {
    
    inline def `do-not-trim`: typings.twilio.twilioStrings.`do-not-trim` = "do-not-trim".asInstanceOf[typings.twilio.twilioStrings.`do-not-trim`]
    
    inline def `trim-silence`: typings.twilio.twilioStrings.`trim-silence` = "trim-silence".asInstanceOf[typings.twilio.twilioStrings.`trim-silence`]
  }
  
  trait RecordingResource extends StObject {
    
    var mode: RecordingRecordingMode
    
    var trim: RecordingRecordingTrim
  }
  object RecordingResource {
    
    inline def apply(mode: RecordingRecordingMode, trim: RecordingRecordingTrim): RecordingResource = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordingResource]
    }
    
    extension [Self <: RecordingResource](x: Self) {
      
      inline def setMode(value: RecordingRecordingMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setTrim(value: RecordingRecordingTrim): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordingSolution extends StObject {
    
    var trunkSid: js.UndefOr[String] = js.undefined
  }
  object RecordingSolution {
    
    inline def apply(): RecordingSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingSolution]
    }
    
    extension [Self <: RecordingSolution](x: Self) {
      
      inline def setTrunkSid(value: String): Self = StObject.set(x, "trunkSid", value.asInstanceOf[js.Any])
      
      inline def setTrunkSidUndefined: Self = StObject.set(x, "trunkSid", js.undefined)
    }
  }
}
