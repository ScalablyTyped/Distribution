package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playbackGrantMod {
  
  @JSImport("twilio/lib/rest/media/v1/playerStreamer/playbackGrant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/media/v1/playerStreamer/playbackGrant", "PlaybackGrantContext")
  @js.native
  open class PlaybackGrantContext protected () extends StObject {
    /**
      * Initialize the PlaybackGrantContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.mediaV1Mod.^, sid: String) = this()
    
    /**
      * create a PlaybackGrantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[PlaybackGrantInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ PlaybackGrantInstance, Any]): js.Promise[PlaybackGrantInstance] = js.native
    def create(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ PlaybackGrantInstance, Any]
    ): js.Promise[PlaybackGrantInstance] = js.native
    def create(opts: PlaybackGrantInstanceCreateOptions): js.Promise[PlaybackGrantInstance] = js.native
    def create(
      opts: PlaybackGrantInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ PlaybackGrantInstance, Any]
    ): js.Promise[PlaybackGrantInstance] = js.native
    
    /**
      * fetch a PlaybackGrantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PlaybackGrantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ PlaybackGrantInstance, Any]): js.Promise[PlaybackGrantInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/media/v1/playerStreamer/playbackGrant", "PlaybackGrantInstance")
  @js.native
  open class PlaybackGrantInstance protected () extends SerializableClass {
    /**
      * Initialize the PlaybackGrantContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the PlayerStreamer associated with this PlaybackGrant.
      */
    def this(version: typings.twilio.mediaV1Mod.^, payload: PlaybackGrantPayload, sid: String) = this()
    
    /* private */ var _proxy: PlaybackGrantContext = js.native
    
    var accountSid: String = js.native
    
    /**
      * create a PlaybackGrantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[PlaybackGrantInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PlaybackGrantInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PlaybackGrantInstance] = js.native
    def create(opts: PlaybackGrantInstanceCreateOptions): js.Promise[PlaybackGrantInstance] = js.native
    def create(
      opts: PlaybackGrantInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[PlaybackGrantInstance] = js.native
    
    var dateCreated: js.Date = js.native
    
    /**
      * fetch a PlaybackGrantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PlaybackGrantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PlaybackGrantInstance] = js.native
    
    var grant: Any = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the PlaybackGrantList
    *
    * @param version - Version of the resource
    * @param sid - The unique string that identifies the PlayerStreamer associated with this PlaybackGrant.
    */
  inline def PlaybackGrantList(version: typings.twilio.mediaV1Mod.^, sid: String): PlaybackGrantListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("PlaybackGrantList")(version.asInstanceOf[js.Any], sid.asInstanceOf[js.Any])).asInstanceOf[PlaybackGrantListInstance]
  
  @JSImport("twilio/lib/rest/media/v1/playerStreamer/playbackGrant", "PlaybackGrantPage")
  @js.native
  open class PlaybackGrantPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.mediaV1Mod.^, 
          PlaybackGrantPayload, 
          PlaybackGrantResource, 
          PlaybackGrantInstance
        ] {
    /**
      * Initialize the PlaybackGrantPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.mediaV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: PlaybackGrantSolution
    ) = this()
    
    /**
      * Build an instance of PlaybackGrantInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: PlaybackGrantPayload): PlaybackGrantInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property accessControlAllowOrigin - The full URL that is authorized to play back the livestream
    * @property ttl - The time to live of the PlaybackGrant
    */
  trait PlaybackGrantInstanceCreateOptions extends StObject {
    
    var accessControlAllowOrigin: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object PlaybackGrantInstanceCreateOptions {
    
    inline def apply(): PlaybackGrantInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaybackGrantInstanceCreateOptions]
    }
    
    extension [Self <: PlaybackGrantInstanceCreateOptions](x: Self) {
      
      inline def setAccessControlAllowOrigin(value: String): Self = StObject.set(x, "accessControlAllowOrigin", value.asInstanceOf[js.Any])
      
      inline def setAccessControlAllowOriginUndefined: Self = StObject.set(x, "accessControlAllowOrigin", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait PlaybackGrantListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): PlaybackGrantContext = js.native
    
    /**
      * Constructs a playback_grant
      */
    def get(): PlaybackGrantContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait PlaybackGrantPayload
    extends StObject
       with PlaybackGrantResource
       with TwilioResponsePayload
  object PlaybackGrantPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      first_page_uri: String,
      grant: js.Object,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): PlaybackGrantPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], grant = grant.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackGrantPayload]
    }
  }
  
  trait PlaybackGrantResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var grant: js.Object
    
    var sid: String
    
    var url: String
  }
  object PlaybackGrantResource {
    
    inline def apply(account_sid: String, date_created: js.Date, grant: js.Object, sid: String, url: String): PlaybackGrantResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], grant = grant.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlaybackGrantResource]
    }
    
    extension [Self <: PlaybackGrantResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setGrant(value: js.Object): Self = StObject.set(x, "grant", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlaybackGrantSolution extends StObject {
    
    var sid: js.UndefOr[String] = js.undefined
  }
  object PlaybackGrantSolution {
    
    inline def apply(): PlaybackGrantSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaybackGrantSolution]
    }
    
    extension [Self <: PlaybackGrantSolution](x: Self) {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    }
  }
}
