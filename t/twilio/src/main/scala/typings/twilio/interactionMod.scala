package typings.twilio

import typings.twilio.interactionChannelMod.InteractionChannelContext
import typings.twilio.interactionChannelMod.InteractionChannelListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionMod {
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction", "InteractionContext")
  @js.native
  open class InteractionContext protected () extends StObject {
    /**
      * Initialize the InteractionContext
      *
      * @param version - Version of the resource
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.flexApiV1Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def channels(sid: String): InteractionChannelContext = js.native
    @JSName("channels")
    var channels_Original: InteractionChannelListInstance = js.native
    
    /**
      * fetch a InteractionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InteractionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionInstance, Any]): js.Promise[InteractionInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction", "InteractionInstance")
  @js.native
  open class InteractionInstance protected () extends SerializableClass {
    /**
      * Initialize the InteractionContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID that identifies the resource to fetch
      */
    def this(version: typings.twilio.flexApiV1Mod.^, payload: InteractionPayload, sid: String) = this()
    
    /* private */ var _proxy: InteractionContext = js.native
    
    var channel: Any = js.native
    
    /**
      * Access the channels
      */
    def channels(): InteractionChannelListInstance = js.native
    
    /**
      * fetch a InteractionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InteractionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[InteractionInstance] = js.native
    
    var links: String = js.native
    
    var routing: Any = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the InteractionList
    *
    * @param version - Version of the resource
    */
  inline def InteractionList(version: typings.twilio.flexApiV1Mod.^): InteractionListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("InteractionList")(version.asInstanceOf[js.Any]).asInstanceOf[InteractionListInstance]
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction", "InteractionPage")
  @js.native
  open class InteractionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.flexApiV1Mod.^, 
          InteractionPayload, 
          InteractionResource, 
          InteractionInstance
        ] {
    /**
      * Initialize the InteractionPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.flexApiV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: InteractionSolution
    ) = this()
    
    /**
      * Build an instance of InteractionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: InteractionPayload): InteractionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait InteractionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): InteractionContext = js.native
    
    /**
      * create a InteractionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: InteractionListInstanceCreateOptions): js.Promise[InteractionInstance] = js.native
    def create(
      opts: InteractionListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ InteractionInstance, Any]
    ): js.Promise[InteractionInstance] = js.native
    
    /**
      * Constructs a interaction
      *
      * @param sid - The SID that identifies the resource to fetch
      */
    def get(sid: String): InteractionContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property channel - The Interaction's channel
    * @property routing - The Interaction's routing logic
    */
  trait InteractionListInstanceCreateOptions extends StObject {
    
    var channel: js.Object
    
    var routing: js.Object
  }
  object InteractionListInstanceCreateOptions {
    
    inline def apply(channel: js.Object, routing: js.Object): InteractionListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], routing = routing.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionListInstanceCreateOptions]
    }
    
    extension [Self <: InteractionListInstanceCreateOptions](x: Self) {
      
      inline def setChannel(value: js.Object): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setRouting(value: js.Object): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractionPayload
    extends StObject
       with InteractionResource
       with TwilioResponsePayload
  object InteractionPayload {
    
    inline def apply(
      channel: js.Object,
      first_page_uri: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      routing: js.Object,
      sid: String,
      uri: String,
      url: String
    ): InteractionPayload = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], routing = routing.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionPayload]
    }
  }
  
  trait InteractionResource extends StObject {
    
    var channel: js.Object
    
    var links: String
    
    var routing: js.Object
    
    var sid: String
    
    var url: String
  }
  object InteractionResource {
    
    inline def apply(channel: js.Object, links: String, routing: js.Object, sid: String, url: String): InteractionResource = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], routing = routing.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionResource]
    }
    
    extension [Self <: InteractionResource](x: Self) {
      
      inline def setChannel(value: js.Object): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRouting(value: js.Object): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractionSolution extends StObject
}
