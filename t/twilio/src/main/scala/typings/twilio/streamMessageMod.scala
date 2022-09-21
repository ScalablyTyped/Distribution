package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMessageMod {
  
  @JSImport("twilio/lib/rest/sync/v1/service/syncStream/streamMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/sync/v1/service/syncStream/streamMessage", "StreamMessageInstance")
  @js.native
  open class StreamMessageInstance protected () extends SerializableClass {
    /**
      * Initialize the StreamMessageContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Sync Service that the resource is associated with
      * @param streamSid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.syncV1Mod.^,
      payload: StreamMessagePayload,
      serviceSid: String,
      streamSid: String
    ) = this()
    
    var data: Any = js.native
    
    var sid: String = js.native
  }
  
  /**
    * Initialize the StreamMessageList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Sync Service that the resource is associated with
    * @param streamSid - The unique string that identifies the resource
    */
  inline def StreamMessageList(version: typings.twilio.syncV1Mod.^, serviceSid: String, streamSid: String): StreamMessageListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("StreamMessageList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], streamSid.asInstanceOf[js.Any])).asInstanceOf[StreamMessageListInstance]
  
  @JSImport("twilio/lib/rest/sync/v1/service/syncStream/streamMessage", "StreamMessagePage")
  @js.native
  open class StreamMessagePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.syncV1Mod.^, 
          StreamMessagePayload, 
          StreamMessageResource, 
          StreamMessageInstance
        ] {
    /**
      * Initialize the StreamMessagePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.syncV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: StreamMessageSolution
    ) = this()
    
    /**
      * Build an instance of StreamMessageInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: StreamMessagePayload): StreamMessageInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait StreamMessageListInstance extends StObject {
    
    /**
      * create a StreamMessageInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: StreamMessageListInstanceCreateOptions): js.Promise[StreamMessageInstance] = js.native
    def create(
      opts: StreamMessageListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ StreamMessageInstance, Any]
    ): js.Promise[StreamMessageInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property data - A JSON string that represents an arbitrary, schema-less object that makes up the Stream Message body
    */
  trait StreamMessageListInstanceCreateOptions extends StObject {
    
    var data: js.Object
  }
  object StreamMessageListInstanceCreateOptions {
    
    inline def apply(data: js.Object): StreamMessageListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamMessageListInstanceCreateOptions]
    }
    
    extension [Self <: StreamMessageListInstanceCreateOptions](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamMessagePayload
    extends StObject
       with StreamMessageResource
       with TwilioResponsePayload
  object StreamMessagePayload {
    
    inline def apply(
      data: js.Object,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String
    ): StreamMessagePayload = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamMessagePayload]
    }
  }
  
  trait StreamMessageResource extends StObject {
    
    var data: js.Object
    
    var sid: String
  }
  object StreamMessageResource {
    
    inline def apply(data: js.Object, sid: String): StreamMessageResource = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamMessageResource]
    }
    
    extension [Self <: StreamMessageResource](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamMessageSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
    
    var streamSid: js.UndefOr[String] = js.undefined
  }
  object StreamMessageSolution {
    
    inline def apply(): StreamMessageSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamMessageSolution]
    }
    
    extension [Self <: StreamMessageSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
      
      inline def setStreamSid(value: String): Self = StObject.set(x, "streamSid", value.asInstanceOf[js.Any])
      
      inline def setStreamSidUndefined: Self = StObject.set(x, "streamSid", js.undefined)
    }
  }
}
