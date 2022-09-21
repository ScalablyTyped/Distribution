package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.anon.Name
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.twilioStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/stream", "StreamContext")
  @js.native
  open class StreamContext protected () extends StObject {
    /**
      * Initialize the StreamContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created this resource
      * @param callSid - The SID of the Call the resource is associated with
      * @param sid - The SID of the Stream resource, or the `name`
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, callSid: String, sid: String) = this()
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a StreamInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: StreamInstanceUpdateOptions): js.Promise[StreamInstance] = js.native
    def update(
      opts: StreamInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ StreamInstance, Any]
    ): js.Promise[StreamInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/stream", "StreamInstance")
  @js.native
  open class StreamInstance protected () extends SerializableClass {
    /**
      * Initialize the StreamContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created this resource
      * @param callSid - The SID of the Call the resource is associated with
      * @param sid - The SID of the Stream resource, or the `name`
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: StreamPayload,
      accountSid: String,
      callSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: StreamContext = js.native
    
    var accountSid: String = js.native
    
    var callSid: String = js.native
    
    var dateUpdated: js.Date = js.native
    
    var name: String = js.native
    
    var sid: String = js.native
    
    var status: StreamStatus = js.native
    
    /**
      * update a StreamInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: StreamInstanceUpdateOptions): js.Promise[StreamInstance] = js.native
    def update(
      opts: StreamInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[StreamInstance] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the StreamList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created this resource
    * @param callSid - The SID of the Call the resource is associated with
    */
  inline def StreamList(version: typings.twilio.v2010Mod.^, accountSid: String, callSid: String): StreamListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("StreamList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], callSid.asInstanceOf[js.Any])).asInstanceOf[StreamListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/call/stream", "StreamPage")
  @js.native
  open class StreamPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, StreamPayload, StreamResource, StreamInstance] {
    /**
      * Initialize the StreamPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: StreamSolution
    ) = this()
    
    /**
      * Build an instance of StreamInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: StreamPayload): StreamInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property status - The status. Must have the value `stopped`
    */
  trait StreamInstanceUpdateOptions extends StObject {
    
    var status: StreamUpdateStatus
  }
  object StreamInstanceUpdateOptions {
    
    inline def apply(status: StreamUpdateStatus): StreamInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamInstanceUpdateOptions]
    }
    
    extension [Self <: StreamInstanceUpdateOptions](x: Self) {
      
      inline def setStatus(value: StreamUpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StreamListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): StreamContext = js.native
    
    /**
      * create a StreamInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: StreamListInstanceCreateOptions): js.Promise[StreamInstance] = js.native
    def create(
      opts: StreamListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ StreamInstance, Any]
    ): js.Promise[StreamInstance] = js.native
    
    /**
      * Constructs a stream
      *
      * @param sid - The SID of the Stream resource, or the `name`
      */
    def get(sid: String): StreamContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property name - The name of this resource
    * @property parameter1.name - Parameter name
    * @property parameter1.value - Parameter value
    * @property parameter10.name - Parameter name
    * @property parameter10.value - Parameter value
    * @property parameter11.name - Parameter name
    * @property parameter11.value - Parameter value
    * @property parameter12.name - Parameter name
    * @property parameter12.value - Parameter value
    * @property parameter13.name - Parameter name
    * @property parameter13.value - Parameter value
    * @property parameter14.name - Parameter name
    * @property parameter14.value - Parameter value
    * @property parameter15.name - Parameter name
    * @property parameter15.value - Parameter value
    * @property parameter16.name - Parameter name
    * @property parameter16.value - Parameter value
    * @property parameter17.name - Parameter name
    * @property parameter17.value - Parameter value
    * @property parameter18.name - Parameter name
    * @property parameter18.value - Parameter value
    * @property parameter19.name - Parameter name
    * @property parameter19.value - Parameter value
    * @property parameter2.name - Parameter name
    * @property parameter2.value - Parameter value
    * @property parameter20.name - Parameter name
    * @property parameter20.value - Parameter value
    * @property parameter21.name - Parameter name
    * @property parameter21.value - Parameter value
    * @property parameter22.name - Parameter name
    * @property parameter22.value - Parameter value
    * @property parameter23.name - Parameter name
    * @property parameter23.value - Parameter value
    * @property parameter24.name - Parameter name
    * @property parameter24.value - Parameter value
    * @property parameter25.name - Parameter name
    * @property parameter25.value - Parameter value
    * @property parameter26.name - Parameter name
    * @property parameter26.value - Parameter value
    * @property parameter27.name - Parameter name
    * @property parameter27.value - Parameter value
    * @property parameter28.name - Parameter name
    * @property parameter28.value - Parameter value
    * @property parameter29.name - Parameter name
    * @property parameter29.value - Parameter value
    * @property parameter3.name - Parameter name
    * @property parameter3.value - Parameter value
    * @property parameter30.name - Parameter name
    * @property parameter30.value - Parameter value
    * @property parameter31.name - Parameter name
    * @property parameter31.value - Parameter value
    * @property parameter32.name - Parameter name
    * @property parameter32.value - Parameter value
    * @property parameter33.name - Parameter name
    * @property parameter33.value - Parameter value
    * @property parameter34.name - Parameter name
    * @property parameter34.value - Parameter value
    * @property parameter35.name - Parameter name
    * @property parameter35.value - Parameter value
    * @property parameter36.name - Parameter name
    * @property parameter36.value - Parameter value
    * @property parameter37.name - Parameter name
    * @property parameter37.value - Parameter value
    * @property parameter38.name - Parameter name
    * @property parameter38.value - Parameter value
    * @property parameter39.name - Parameter name
    * @property parameter39.value - Parameter value
    * @property parameter4.name - Parameter name
    * @property parameter4.value - Parameter value
    * @property parameter40.name - Parameter name
    * @property parameter40.value - Parameter value
    * @property parameter41.name - Parameter name
    * @property parameter41.value - Parameter value
    * @property parameter42.name - Parameter name
    * @property parameter42.value - Parameter value
    * @property parameter43.name - Parameter name
    * @property parameter43.value - Parameter value
    * @property parameter44.name - Parameter name
    * @property parameter44.value - Parameter value
    * @property parameter45.name - Parameter name
    * @property parameter45.value - Parameter value
    * @property parameter46.name - Parameter name
    * @property parameter46.value - Parameter value
    * @property parameter47.name - Parameter name
    * @property parameter47.value - Parameter value
    * @property parameter48.name - Parameter name
    * @property parameter48.value - Parameter value
    * @property parameter49.name - Parameter name
    * @property parameter49.value - Parameter value
    * @property parameter5.name - Parameter name
    * @property parameter5.value - Parameter value
    * @property parameter50.name - Parameter name
    * @property parameter50.value - Parameter value
    * @property parameter51.name - Parameter name
    * @property parameter51.value - Parameter value
    * @property parameter52.name - Parameter name
    * @property parameter52.value - Parameter value
    * @property parameter53.name - Parameter name
    * @property parameter53.value - Parameter value
    * @property parameter54.name - Parameter name
    * @property parameter54.value - Parameter value
    * @property parameter55.name - Parameter name
    * @property parameter55.value - Parameter value
    * @property parameter56.name - Parameter name
    * @property parameter56.value - Parameter value
    * @property parameter57.name - Parameter name
    * @property parameter57.value - Parameter value
    * @property parameter58.name - Parameter name
    * @property parameter58.value - Parameter value
    * @property parameter59.name - Parameter name
    * @property parameter59.value - Parameter value
    * @property parameter6.name - Parameter name
    * @property parameter6.value - Parameter value
    * @property parameter60.name - Parameter name
    * @property parameter60.value - Parameter value
    * @property parameter61.name - Parameter name
    * @property parameter61.value - Parameter value
    * @property parameter62.name - Parameter name
    * @property parameter62.value - Parameter value
    * @property parameter63.name - Parameter name
    * @property parameter63.value - Parameter value
    * @property parameter64.name - Parameter name
    * @property parameter64.value - Parameter value
    * @property parameter65.name - Parameter name
    * @property parameter65.value - Parameter value
    * @property parameter66.name - Parameter name
    * @property parameter66.value - Parameter value
    * @property parameter67.name - Parameter name
    * @property parameter67.value - Parameter value
    * @property parameter68.name - Parameter name
    * @property parameter68.value - Parameter value
    * @property parameter69.name - Parameter name
    * @property parameter69.value - Parameter value
    * @property parameter7.name - Parameter name
    * @property parameter7.value - Parameter value
    * @property parameter70.name - Parameter name
    * @property parameter70.value - Parameter value
    * @property parameter71.name - Parameter name
    * @property parameter71.value - Parameter value
    * @property parameter72.name - Parameter name
    * @property parameter72.value - Parameter value
    * @property parameter73.name - Parameter name
    * @property parameter73.value - Parameter value
    * @property parameter74.name - Parameter name
    * @property parameter74.value - Parameter value
    * @property parameter75.name - Parameter name
    * @property parameter75.value - Parameter value
    * @property parameter76.name - Parameter name
    * @property parameter76.value - Parameter value
    * @property parameter77.name - Parameter name
    * @property parameter77.value - Parameter value
    * @property parameter78.name - Parameter name
    * @property parameter78.value - Parameter value
    * @property parameter79.name - Parameter name
    * @property parameter79.value - Parameter value
    * @property parameter8.name - Parameter name
    * @property parameter8.value - Parameter value
    * @property parameter80.name - Parameter name
    * @property parameter80.value - Parameter value
    * @property parameter81.name - Parameter name
    * @property parameter81.value - Parameter value
    * @property parameter82.name - Parameter name
    * @property parameter82.value - Parameter value
    * @property parameter83.name - Parameter name
    * @property parameter83.value - Parameter value
    * @property parameter84.name - Parameter name
    * @property parameter84.value - Parameter value
    * @property parameter85.name - Parameter name
    * @property parameter85.value - Parameter value
    * @property parameter86.name - Parameter name
    * @property parameter86.value - Parameter value
    * @property parameter87.name - Parameter name
    * @property parameter87.value - Parameter value
    * @property parameter88.name - Parameter name
    * @property parameter88.value - Parameter value
    * @property parameter89.name - Parameter name
    * @property parameter89.value - Parameter value
    * @property parameter9.name - Parameter name
    * @property parameter9.value - Parameter value
    * @property parameter90.name - Parameter name
    * @property parameter90.value - Parameter value
    * @property parameter91.name - Parameter name
    * @property parameter91.value - Parameter value
    * @property parameter92.name - Parameter name
    * @property parameter92.value - Parameter value
    * @property parameter93.name - Parameter name
    * @property parameter93.value - Parameter value
    * @property parameter94.name - Parameter name
    * @property parameter94.value - Parameter value
    * @property parameter95.name - Parameter name
    * @property parameter95.value - Parameter value
    * @property parameter96.name - Parameter name
    * @property parameter96.value - Parameter value
    * @property parameter97.name - Parameter name
    * @property parameter97.value - Parameter value
    * @property parameter98.name - Parameter name
    * @property parameter98.value - Parameter value
    * @property parameter99.name - Parameter name
    * @property parameter99.value - Parameter value
    * @property statusCallback - Absolute URL of the status callback.
    * @property statusCallbackMethod - The http method for the status_callback.
    * @property track - One of `inbound_track`, `outbound_track`, `both_tracks`.
    * @property url - Url where WebSocket connection will be established.
    */
  trait StreamListInstanceCreateOptions extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var parameter1: js.UndefOr[Name] = js.undefined
    
    var parameter10: js.UndefOr[Name] = js.undefined
    
    var parameter11: js.UndefOr[Name] = js.undefined
    
    var parameter12: js.UndefOr[Name] = js.undefined
    
    var parameter13: js.UndefOr[Name] = js.undefined
    
    var parameter14: js.UndefOr[Name] = js.undefined
    
    var parameter15: js.UndefOr[Name] = js.undefined
    
    var parameter16: js.UndefOr[Name] = js.undefined
    
    var parameter17: js.UndefOr[Name] = js.undefined
    
    var parameter18: js.UndefOr[Name] = js.undefined
    
    var parameter19: js.UndefOr[Name] = js.undefined
    
    var parameter2: js.UndefOr[Name] = js.undefined
    
    var parameter20: js.UndefOr[Name] = js.undefined
    
    var parameter21: js.UndefOr[Name] = js.undefined
    
    var parameter22: js.UndefOr[Name] = js.undefined
    
    var parameter23: js.UndefOr[Name] = js.undefined
    
    var parameter24: js.UndefOr[Name] = js.undefined
    
    var parameter25: js.UndefOr[Name] = js.undefined
    
    var parameter26: js.UndefOr[Name] = js.undefined
    
    var parameter27: js.UndefOr[Name] = js.undefined
    
    var parameter28: js.UndefOr[Name] = js.undefined
    
    var parameter29: js.UndefOr[Name] = js.undefined
    
    var parameter3: js.UndefOr[Name] = js.undefined
    
    var parameter30: js.UndefOr[Name] = js.undefined
    
    var parameter31: js.UndefOr[Name] = js.undefined
    
    var parameter32: js.UndefOr[Name] = js.undefined
    
    var parameter33: js.UndefOr[Name] = js.undefined
    
    var parameter34: js.UndefOr[Name] = js.undefined
    
    var parameter35: js.UndefOr[Name] = js.undefined
    
    var parameter36: js.UndefOr[Name] = js.undefined
    
    var parameter37: js.UndefOr[Name] = js.undefined
    
    var parameter38: js.UndefOr[Name] = js.undefined
    
    var parameter39: js.UndefOr[Name] = js.undefined
    
    var parameter4: js.UndefOr[Name] = js.undefined
    
    var parameter40: js.UndefOr[Name] = js.undefined
    
    var parameter41: js.UndefOr[Name] = js.undefined
    
    var parameter42: js.UndefOr[Name] = js.undefined
    
    var parameter43: js.UndefOr[Name] = js.undefined
    
    var parameter44: js.UndefOr[Name] = js.undefined
    
    var parameter45: js.UndefOr[Name] = js.undefined
    
    var parameter46: js.UndefOr[Name] = js.undefined
    
    var parameter47: js.UndefOr[Name] = js.undefined
    
    var parameter48: js.UndefOr[Name] = js.undefined
    
    var parameter49: js.UndefOr[Name] = js.undefined
    
    var parameter5: js.UndefOr[Name] = js.undefined
    
    var parameter50: js.UndefOr[Name] = js.undefined
    
    var parameter51: js.UndefOr[Name] = js.undefined
    
    var parameter52: js.UndefOr[Name] = js.undefined
    
    var parameter53: js.UndefOr[Name] = js.undefined
    
    var parameter54: js.UndefOr[Name] = js.undefined
    
    var parameter55: js.UndefOr[Name] = js.undefined
    
    var parameter56: js.UndefOr[Name] = js.undefined
    
    var parameter57: js.UndefOr[Name] = js.undefined
    
    var parameter58: js.UndefOr[Name] = js.undefined
    
    var parameter59: js.UndefOr[Name] = js.undefined
    
    var parameter6: js.UndefOr[Name] = js.undefined
    
    var parameter60: js.UndefOr[Name] = js.undefined
    
    var parameter61: js.UndefOr[Name] = js.undefined
    
    var parameter62: js.UndefOr[Name] = js.undefined
    
    var parameter63: js.UndefOr[Name] = js.undefined
    
    var parameter64: js.UndefOr[Name] = js.undefined
    
    var parameter65: js.UndefOr[Name] = js.undefined
    
    var parameter66: js.UndefOr[Name] = js.undefined
    
    var parameter67: js.UndefOr[Name] = js.undefined
    
    var parameter68: js.UndefOr[Name] = js.undefined
    
    var parameter69: js.UndefOr[Name] = js.undefined
    
    var parameter7: js.UndefOr[Name] = js.undefined
    
    var parameter70: js.UndefOr[Name] = js.undefined
    
    var parameter71: js.UndefOr[Name] = js.undefined
    
    var parameter72: js.UndefOr[Name] = js.undefined
    
    var parameter73: js.UndefOr[Name] = js.undefined
    
    var parameter74: js.UndefOr[Name] = js.undefined
    
    var parameter75: js.UndefOr[Name] = js.undefined
    
    var parameter76: js.UndefOr[Name] = js.undefined
    
    var parameter77: js.UndefOr[Name] = js.undefined
    
    var parameter78: js.UndefOr[Name] = js.undefined
    
    var parameter79: js.UndefOr[Name] = js.undefined
    
    var parameter8: js.UndefOr[Name] = js.undefined
    
    var parameter80: js.UndefOr[Name] = js.undefined
    
    var parameter81: js.UndefOr[Name] = js.undefined
    
    var parameter82: js.UndefOr[Name] = js.undefined
    
    var parameter83: js.UndefOr[Name] = js.undefined
    
    var parameter84: js.UndefOr[Name] = js.undefined
    
    var parameter85: js.UndefOr[Name] = js.undefined
    
    var parameter86: js.UndefOr[Name] = js.undefined
    
    var parameter87: js.UndefOr[Name] = js.undefined
    
    var parameter88: js.UndefOr[Name] = js.undefined
    
    var parameter89: js.UndefOr[Name] = js.undefined
    
    var parameter9: js.UndefOr[Name] = js.undefined
    
    var parameter90: js.UndefOr[Name] = js.undefined
    
    var parameter91: js.UndefOr[Name] = js.undefined
    
    var parameter92: js.UndefOr[Name] = js.undefined
    
    var parameter93: js.UndefOr[Name] = js.undefined
    
    var parameter94: js.UndefOr[Name] = js.undefined
    
    var parameter95: js.UndefOr[Name] = js.undefined
    
    var parameter96: js.UndefOr[Name] = js.undefined
    
    var parameter97: js.UndefOr[Name] = js.undefined
    
    var parameter98: js.UndefOr[Name] = js.undefined
    
    var parameter99: js.UndefOr[Name] = js.undefined
    
    var statusCallback: js.UndefOr[String] = js.undefined
    
    var statusCallbackMethod: js.UndefOr[String] = js.undefined
    
    var track: js.UndefOr[StreamTrack] = js.undefined
    
    var url: String
  }
  object StreamListInstanceCreateOptions {
    
    inline def apply(url: String): StreamListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamListInstanceCreateOptions]
    }
    
    extension [Self <: StreamListInstanceCreateOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParameter1(value: Name): Self = StObject.set(x, "parameter1", value.asInstanceOf[js.Any])
      
      inline def setParameter10(value: Name): Self = StObject.set(x, "parameter10", value.asInstanceOf[js.Any])
      
      inline def setParameter10Undefined: Self = StObject.set(x, "parameter10", js.undefined)
      
      inline def setParameter11(value: Name): Self = StObject.set(x, "parameter11", value.asInstanceOf[js.Any])
      
      inline def setParameter11Undefined: Self = StObject.set(x, "parameter11", js.undefined)
      
      inline def setParameter12(value: Name): Self = StObject.set(x, "parameter12", value.asInstanceOf[js.Any])
      
      inline def setParameter12Undefined: Self = StObject.set(x, "parameter12", js.undefined)
      
      inline def setParameter13(value: Name): Self = StObject.set(x, "parameter13", value.asInstanceOf[js.Any])
      
      inline def setParameter13Undefined: Self = StObject.set(x, "parameter13", js.undefined)
      
      inline def setParameter14(value: Name): Self = StObject.set(x, "parameter14", value.asInstanceOf[js.Any])
      
      inline def setParameter14Undefined: Self = StObject.set(x, "parameter14", js.undefined)
      
      inline def setParameter15(value: Name): Self = StObject.set(x, "parameter15", value.asInstanceOf[js.Any])
      
      inline def setParameter15Undefined: Self = StObject.set(x, "parameter15", js.undefined)
      
      inline def setParameter16(value: Name): Self = StObject.set(x, "parameter16", value.asInstanceOf[js.Any])
      
      inline def setParameter16Undefined: Self = StObject.set(x, "parameter16", js.undefined)
      
      inline def setParameter17(value: Name): Self = StObject.set(x, "parameter17", value.asInstanceOf[js.Any])
      
      inline def setParameter17Undefined: Self = StObject.set(x, "parameter17", js.undefined)
      
      inline def setParameter18(value: Name): Self = StObject.set(x, "parameter18", value.asInstanceOf[js.Any])
      
      inline def setParameter18Undefined: Self = StObject.set(x, "parameter18", js.undefined)
      
      inline def setParameter19(value: Name): Self = StObject.set(x, "parameter19", value.asInstanceOf[js.Any])
      
      inline def setParameter19Undefined: Self = StObject.set(x, "parameter19", js.undefined)
      
      inline def setParameter1Undefined: Self = StObject.set(x, "parameter1", js.undefined)
      
      inline def setParameter2(value: Name): Self = StObject.set(x, "parameter2", value.asInstanceOf[js.Any])
      
      inline def setParameter20(value: Name): Self = StObject.set(x, "parameter20", value.asInstanceOf[js.Any])
      
      inline def setParameter20Undefined: Self = StObject.set(x, "parameter20", js.undefined)
      
      inline def setParameter21(value: Name): Self = StObject.set(x, "parameter21", value.asInstanceOf[js.Any])
      
      inline def setParameter21Undefined: Self = StObject.set(x, "parameter21", js.undefined)
      
      inline def setParameter22(value: Name): Self = StObject.set(x, "parameter22", value.asInstanceOf[js.Any])
      
      inline def setParameter22Undefined: Self = StObject.set(x, "parameter22", js.undefined)
      
      inline def setParameter23(value: Name): Self = StObject.set(x, "parameter23", value.asInstanceOf[js.Any])
      
      inline def setParameter23Undefined: Self = StObject.set(x, "parameter23", js.undefined)
      
      inline def setParameter24(value: Name): Self = StObject.set(x, "parameter24", value.asInstanceOf[js.Any])
      
      inline def setParameter24Undefined: Self = StObject.set(x, "parameter24", js.undefined)
      
      inline def setParameter25(value: Name): Self = StObject.set(x, "parameter25", value.asInstanceOf[js.Any])
      
      inline def setParameter25Undefined: Self = StObject.set(x, "parameter25", js.undefined)
      
      inline def setParameter26(value: Name): Self = StObject.set(x, "parameter26", value.asInstanceOf[js.Any])
      
      inline def setParameter26Undefined: Self = StObject.set(x, "parameter26", js.undefined)
      
      inline def setParameter27(value: Name): Self = StObject.set(x, "parameter27", value.asInstanceOf[js.Any])
      
      inline def setParameter27Undefined: Self = StObject.set(x, "parameter27", js.undefined)
      
      inline def setParameter28(value: Name): Self = StObject.set(x, "parameter28", value.asInstanceOf[js.Any])
      
      inline def setParameter28Undefined: Self = StObject.set(x, "parameter28", js.undefined)
      
      inline def setParameter29(value: Name): Self = StObject.set(x, "parameter29", value.asInstanceOf[js.Any])
      
      inline def setParameter29Undefined: Self = StObject.set(x, "parameter29", js.undefined)
      
      inline def setParameter2Undefined: Self = StObject.set(x, "parameter2", js.undefined)
      
      inline def setParameter3(value: Name): Self = StObject.set(x, "parameter3", value.asInstanceOf[js.Any])
      
      inline def setParameter30(value: Name): Self = StObject.set(x, "parameter30", value.asInstanceOf[js.Any])
      
      inline def setParameter30Undefined: Self = StObject.set(x, "parameter30", js.undefined)
      
      inline def setParameter31(value: Name): Self = StObject.set(x, "parameter31", value.asInstanceOf[js.Any])
      
      inline def setParameter31Undefined: Self = StObject.set(x, "parameter31", js.undefined)
      
      inline def setParameter32(value: Name): Self = StObject.set(x, "parameter32", value.asInstanceOf[js.Any])
      
      inline def setParameter32Undefined: Self = StObject.set(x, "parameter32", js.undefined)
      
      inline def setParameter33(value: Name): Self = StObject.set(x, "parameter33", value.asInstanceOf[js.Any])
      
      inline def setParameter33Undefined: Self = StObject.set(x, "parameter33", js.undefined)
      
      inline def setParameter34(value: Name): Self = StObject.set(x, "parameter34", value.asInstanceOf[js.Any])
      
      inline def setParameter34Undefined: Self = StObject.set(x, "parameter34", js.undefined)
      
      inline def setParameter35(value: Name): Self = StObject.set(x, "parameter35", value.asInstanceOf[js.Any])
      
      inline def setParameter35Undefined: Self = StObject.set(x, "parameter35", js.undefined)
      
      inline def setParameter36(value: Name): Self = StObject.set(x, "parameter36", value.asInstanceOf[js.Any])
      
      inline def setParameter36Undefined: Self = StObject.set(x, "parameter36", js.undefined)
      
      inline def setParameter37(value: Name): Self = StObject.set(x, "parameter37", value.asInstanceOf[js.Any])
      
      inline def setParameter37Undefined: Self = StObject.set(x, "parameter37", js.undefined)
      
      inline def setParameter38(value: Name): Self = StObject.set(x, "parameter38", value.asInstanceOf[js.Any])
      
      inline def setParameter38Undefined: Self = StObject.set(x, "parameter38", js.undefined)
      
      inline def setParameter39(value: Name): Self = StObject.set(x, "parameter39", value.asInstanceOf[js.Any])
      
      inline def setParameter39Undefined: Self = StObject.set(x, "parameter39", js.undefined)
      
      inline def setParameter3Undefined: Self = StObject.set(x, "parameter3", js.undefined)
      
      inline def setParameter4(value: Name): Self = StObject.set(x, "parameter4", value.asInstanceOf[js.Any])
      
      inline def setParameter40(value: Name): Self = StObject.set(x, "parameter40", value.asInstanceOf[js.Any])
      
      inline def setParameter40Undefined: Self = StObject.set(x, "parameter40", js.undefined)
      
      inline def setParameter41(value: Name): Self = StObject.set(x, "parameter41", value.asInstanceOf[js.Any])
      
      inline def setParameter41Undefined: Self = StObject.set(x, "parameter41", js.undefined)
      
      inline def setParameter42(value: Name): Self = StObject.set(x, "parameter42", value.asInstanceOf[js.Any])
      
      inline def setParameter42Undefined: Self = StObject.set(x, "parameter42", js.undefined)
      
      inline def setParameter43(value: Name): Self = StObject.set(x, "parameter43", value.asInstanceOf[js.Any])
      
      inline def setParameter43Undefined: Self = StObject.set(x, "parameter43", js.undefined)
      
      inline def setParameter44(value: Name): Self = StObject.set(x, "parameter44", value.asInstanceOf[js.Any])
      
      inline def setParameter44Undefined: Self = StObject.set(x, "parameter44", js.undefined)
      
      inline def setParameter45(value: Name): Self = StObject.set(x, "parameter45", value.asInstanceOf[js.Any])
      
      inline def setParameter45Undefined: Self = StObject.set(x, "parameter45", js.undefined)
      
      inline def setParameter46(value: Name): Self = StObject.set(x, "parameter46", value.asInstanceOf[js.Any])
      
      inline def setParameter46Undefined: Self = StObject.set(x, "parameter46", js.undefined)
      
      inline def setParameter47(value: Name): Self = StObject.set(x, "parameter47", value.asInstanceOf[js.Any])
      
      inline def setParameter47Undefined: Self = StObject.set(x, "parameter47", js.undefined)
      
      inline def setParameter48(value: Name): Self = StObject.set(x, "parameter48", value.asInstanceOf[js.Any])
      
      inline def setParameter48Undefined: Self = StObject.set(x, "parameter48", js.undefined)
      
      inline def setParameter49(value: Name): Self = StObject.set(x, "parameter49", value.asInstanceOf[js.Any])
      
      inline def setParameter49Undefined: Self = StObject.set(x, "parameter49", js.undefined)
      
      inline def setParameter4Undefined: Self = StObject.set(x, "parameter4", js.undefined)
      
      inline def setParameter5(value: Name): Self = StObject.set(x, "parameter5", value.asInstanceOf[js.Any])
      
      inline def setParameter50(value: Name): Self = StObject.set(x, "parameter50", value.asInstanceOf[js.Any])
      
      inline def setParameter50Undefined: Self = StObject.set(x, "parameter50", js.undefined)
      
      inline def setParameter51(value: Name): Self = StObject.set(x, "parameter51", value.asInstanceOf[js.Any])
      
      inline def setParameter51Undefined: Self = StObject.set(x, "parameter51", js.undefined)
      
      inline def setParameter52(value: Name): Self = StObject.set(x, "parameter52", value.asInstanceOf[js.Any])
      
      inline def setParameter52Undefined: Self = StObject.set(x, "parameter52", js.undefined)
      
      inline def setParameter53(value: Name): Self = StObject.set(x, "parameter53", value.asInstanceOf[js.Any])
      
      inline def setParameter53Undefined: Self = StObject.set(x, "parameter53", js.undefined)
      
      inline def setParameter54(value: Name): Self = StObject.set(x, "parameter54", value.asInstanceOf[js.Any])
      
      inline def setParameter54Undefined: Self = StObject.set(x, "parameter54", js.undefined)
      
      inline def setParameter55(value: Name): Self = StObject.set(x, "parameter55", value.asInstanceOf[js.Any])
      
      inline def setParameter55Undefined: Self = StObject.set(x, "parameter55", js.undefined)
      
      inline def setParameter56(value: Name): Self = StObject.set(x, "parameter56", value.asInstanceOf[js.Any])
      
      inline def setParameter56Undefined: Self = StObject.set(x, "parameter56", js.undefined)
      
      inline def setParameter57(value: Name): Self = StObject.set(x, "parameter57", value.asInstanceOf[js.Any])
      
      inline def setParameter57Undefined: Self = StObject.set(x, "parameter57", js.undefined)
      
      inline def setParameter58(value: Name): Self = StObject.set(x, "parameter58", value.asInstanceOf[js.Any])
      
      inline def setParameter58Undefined: Self = StObject.set(x, "parameter58", js.undefined)
      
      inline def setParameter59(value: Name): Self = StObject.set(x, "parameter59", value.asInstanceOf[js.Any])
      
      inline def setParameter59Undefined: Self = StObject.set(x, "parameter59", js.undefined)
      
      inline def setParameter5Undefined: Self = StObject.set(x, "parameter5", js.undefined)
      
      inline def setParameter6(value: Name): Self = StObject.set(x, "parameter6", value.asInstanceOf[js.Any])
      
      inline def setParameter60(value: Name): Self = StObject.set(x, "parameter60", value.asInstanceOf[js.Any])
      
      inline def setParameter60Undefined: Self = StObject.set(x, "parameter60", js.undefined)
      
      inline def setParameter61(value: Name): Self = StObject.set(x, "parameter61", value.asInstanceOf[js.Any])
      
      inline def setParameter61Undefined: Self = StObject.set(x, "parameter61", js.undefined)
      
      inline def setParameter62(value: Name): Self = StObject.set(x, "parameter62", value.asInstanceOf[js.Any])
      
      inline def setParameter62Undefined: Self = StObject.set(x, "parameter62", js.undefined)
      
      inline def setParameter63(value: Name): Self = StObject.set(x, "parameter63", value.asInstanceOf[js.Any])
      
      inline def setParameter63Undefined: Self = StObject.set(x, "parameter63", js.undefined)
      
      inline def setParameter64(value: Name): Self = StObject.set(x, "parameter64", value.asInstanceOf[js.Any])
      
      inline def setParameter64Undefined: Self = StObject.set(x, "parameter64", js.undefined)
      
      inline def setParameter65(value: Name): Self = StObject.set(x, "parameter65", value.asInstanceOf[js.Any])
      
      inline def setParameter65Undefined: Self = StObject.set(x, "parameter65", js.undefined)
      
      inline def setParameter66(value: Name): Self = StObject.set(x, "parameter66", value.asInstanceOf[js.Any])
      
      inline def setParameter66Undefined: Self = StObject.set(x, "parameter66", js.undefined)
      
      inline def setParameter67(value: Name): Self = StObject.set(x, "parameter67", value.asInstanceOf[js.Any])
      
      inline def setParameter67Undefined: Self = StObject.set(x, "parameter67", js.undefined)
      
      inline def setParameter68(value: Name): Self = StObject.set(x, "parameter68", value.asInstanceOf[js.Any])
      
      inline def setParameter68Undefined: Self = StObject.set(x, "parameter68", js.undefined)
      
      inline def setParameter69(value: Name): Self = StObject.set(x, "parameter69", value.asInstanceOf[js.Any])
      
      inline def setParameter69Undefined: Self = StObject.set(x, "parameter69", js.undefined)
      
      inline def setParameter6Undefined: Self = StObject.set(x, "parameter6", js.undefined)
      
      inline def setParameter7(value: Name): Self = StObject.set(x, "parameter7", value.asInstanceOf[js.Any])
      
      inline def setParameter70(value: Name): Self = StObject.set(x, "parameter70", value.asInstanceOf[js.Any])
      
      inline def setParameter70Undefined: Self = StObject.set(x, "parameter70", js.undefined)
      
      inline def setParameter71(value: Name): Self = StObject.set(x, "parameter71", value.asInstanceOf[js.Any])
      
      inline def setParameter71Undefined: Self = StObject.set(x, "parameter71", js.undefined)
      
      inline def setParameter72(value: Name): Self = StObject.set(x, "parameter72", value.asInstanceOf[js.Any])
      
      inline def setParameter72Undefined: Self = StObject.set(x, "parameter72", js.undefined)
      
      inline def setParameter73(value: Name): Self = StObject.set(x, "parameter73", value.asInstanceOf[js.Any])
      
      inline def setParameter73Undefined: Self = StObject.set(x, "parameter73", js.undefined)
      
      inline def setParameter74(value: Name): Self = StObject.set(x, "parameter74", value.asInstanceOf[js.Any])
      
      inline def setParameter74Undefined: Self = StObject.set(x, "parameter74", js.undefined)
      
      inline def setParameter75(value: Name): Self = StObject.set(x, "parameter75", value.asInstanceOf[js.Any])
      
      inline def setParameter75Undefined: Self = StObject.set(x, "parameter75", js.undefined)
      
      inline def setParameter76(value: Name): Self = StObject.set(x, "parameter76", value.asInstanceOf[js.Any])
      
      inline def setParameter76Undefined: Self = StObject.set(x, "parameter76", js.undefined)
      
      inline def setParameter77(value: Name): Self = StObject.set(x, "parameter77", value.asInstanceOf[js.Any])
      
      inline def setParameter77Undefined: Self = StObject.set(x, "parameter77", js.undefined)
      
      inline def setParameter78(value: Name): Self = StObject.set(x, "parameter78", value.asInstanceOf[js.Any])
      
      inline def setParameter78Undefined: Self = StObject.set(x, "parameter78", js.undefined)
      
      inline def setParameter79(value: Name): Self = StObject.set(x, "parameter79", value.asInstanceOf[js.Any])
      
      inline def setParameter79Undefined: Self = StObject.set(x, "parameter79", js.undefined)
      
      inline def setParameter7Undefined: Self = StObject.set(x, "parameter7", js.undefined)
      
      inline def setParameter8(value: Name): Self = StObject.set(x, "parameter8", value.asInstanceOf[js.Any])
      
      inline def setParameter80(value: Name): Self = StObject.set(x, "parameter80", value.asInstanceOf[js.Any])
      
      inline def setParameter80Undefined: Self = StObject.set(x, "parameter80", js.undefined)
      
      inline def setParameter81(value: Name): Self = StObject.set(x, "parameter81", value.asInstanceOf[js.Any])
      
      inline def setParameter81Undefined: Self = StObject.set(x, "parameter81", js.undefined)
      
      inline def setParameter82(value: Name): Self = StObject.set(x, "parameter82", value.asInstanceOf[js.Any])
      
      inline def setParameter82Undefined: Self = StObject.set(x, "parameter82", js.undefined)
      
      inline def setParameter83(value: Name): Self = StObject.set(x, "parameter83", value.asInstanceOf[js.Any])
      
      inline def setParameter83Undefined: Self = StObject.set(x, "parameter83", js.undefined)
      
      inline def setParameter84(value: Name): Self = StObject.set(x, "parameter84", value.asInstanceOf[js.Any])
      
      inline def setParameter84Undefined: Self = StObject.set(x, "parameter84", js.undefined)
      
      inline def setParameter85(value: Name): Self = StObject.set(x, "parameter85", value.asInstanceOf[js.Any])
      
      inline def setParameter85Undefined: Self = StObject.set(x, "parameter85", js.undefined)
      
      inline def setParameter86(value: Name): Self = StObject.set(x, "parameter86", value.asInstanceOf[js.Any])
      
      inline def setParameter86Undefined: Self = StObject.set(x, "parameter86", js.undefined)
      
      inline def setParameter87(value: Name): Self = StObject.set(x, "parameter87", value.asInstanceOf[js.Any])
      
      inline def setParameter87Undefined: Self = StObject.set(x, "parameter87", js.undefined)
      
      inline def setParameter88(value: Name): Self = StObject.set(x, "parameter88", value.asInstanceOf[js.Any])
      
      inline def setParameter88Undefined: Self = StObject.set(x, "parameter88", js.undefined)
      
      inline def setParameter89(value: Name): Self = StObject.set(x, "parameter89", value.asInstanceOf[js.Any])
      
      inline def setParameter89Undefined: Self = StObject.set(x, "parameter89", js.undefined)
      
      inline def setParameter8Undefined: Self = StObject.set(x, "parameter8", js.undefined)
      
      inline def setParameter9(value: Name): Self = StObject.set(x, "parameter9", value.asInstanceOf[js.Any])
      
      inline def setParameter90(value: Name): Self = StObject.set(x, "parameter90", value.asInstanceOf[js.Any])
      
      inline def setParameter90Undefined: Self = StObject.set(x, "parameter90", js.undefined)
      
      inline def setParameter91(value: Name): Self = StObject.set(x, "parameter91", value.asInstanceOf[js.Any])
      
      inline def setParameter91Undefined: Self = StObject.set(x, "parameter91", js.undefined)
      
      inline def setParameter92(value: Name): Self = StObject.set(x, "parameter92", value.asInstanceOf[js.Any])
      
      inline def setParameter92Undefined: Self = StObject.set(x, "parameter92", js.undefined)
      
      inline def setParameter93(value: Name): Self = StObject.set(x, "parameter93", value.asInstanceOf[js.Any])
      
      inline def setParameter93Undefined: Self = StObject.set(x, "parameter93", js.undefined)
      
      inline def setParameter94(value: Name): Self = StObject.set(x, "parameter94", value.asInstanceOf[js.Any])
      
      inline def setParameter94Undefined: Self = StObject.set(x, "parameter94", js.undefined)
      
      inline def setParameter95(value: Name): Self = StObject.set(x, "parameter95", value.asInstanceOf[js.Any])
      
      inline def setParameter95Undefined: Self = StObject.set(x, "parameter95", js.undefined)
      
      inline def setParameter96(value: Name): Self = StObject.set(x, "parameter96", value.asInstanceOf[js.Any])
      
      inline def setParameter96Undefined: Self = StObject.set(x, "parameter96", js.undefined)
      
      inline def setParameter97(value: Name): Self = StObject.set(x, "parameter97", value.asInstanceOf[js.Any])
      
      inline def setParameter97Undefined: Self = StObject.set(x, "parameter97", js.undefined)
      
      inline def setParameter98(value: Name): Self = StObject.set(x, "parameter98", value.asInstanceOf[js.Any])
      
      inline def setParameter98Undefined: Self = StObject.set(x, "parameter98", js.undefined)
      
      inline def setParameter99(value: Name): Self = StObject.set(x, "parameter99", value.asInstanceOf[js.Any])
      
      inline def setParameter99Undefined: Self = StObject.set(x, "parameter99", js.undefined)
      
      inline def setParameter9Undefined: Self = StObject.set(x, "parameter9", js.undefined)
      
      inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
      
      inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
      
      inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
      
      inline def setTrack(value: StreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait StreamPayload
    extends StObject
       with StreamResource {
    
    // DEPRECTATED: end: any;
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    // DEPRECTATED: last_page_uri: string;
    var next_page_uri: String
    
    // DEPRECTATED: num_pages: number;
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
  }
  object StreamPayload {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      date_updated: js.Date,
      first_page_uri: String,
      name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status: StreamStatus,
      uri: String
    ): StreamPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamPayload]
    }
    
    extension [Self <: StreamPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamResource extends StObject {
    
    var account_sid: String
    
    var call_sid: String
    
    var date_updated: js.Date
    
    var name: String
    
    var sid: String
    
    var status: StreamStatus
    
    var uri: String
  }
  object StreamResource {
    
    inline def apply(
      account_sid: String,
      call_sid: String,
      date_updated: js.Date,
      name: String,
      sid: String,
      status: StreamStatus,
      uri: String
    ): StreamResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], call_sid = call_sid.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamResource]
    }
    
    extension [Self <: StreamResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_sid(value: String): Self = StObject.set(x, "call_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: StreamStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var callSid: js.UndefOr[String] = js.undefined
  }
  object StreamSolution {
    
    inline def apply(): StreamSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamSolution]
    }
    
    extension [Self <: StreamSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setCallSid(value: String): Self = StObject.set(x, "callSid", value.asInstanceOf[js.Any])
      
      inline def setCallSidUndefined: Self = StObject.set(x, "callSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`in-progress`
    - typings.twilio.twilioStrings.stopped
  */
  trait StreamStatus extends StObject
  object StreamStatus {
    
    inline def `in-progress`: typings.twilio.twilioStrings.`in-progress` = "in-progress".asInstanceOf[typings.twilio.twilioStrings.`in-progress`]
    
    inline def stopped: typings.twilio.twilioStrings.stopped = "stopped".asInstanceOf[typings.twilio.twilioStrings.stopped]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.inbound_track
    - typings.twilio.twilioStrings.outbound_track
    - typings.twilio.twilioStrings.both_tracks
  */
  trait StreamTrack extends StObject
  object StreamTrack {
    
    inline def both_tracks: typings.twilio.twilioStrings.both_tracks = "both_tracks".asInstanceOf[typings.twilio.twilioStrings.both_tracks]
    
    inline def inbound_track: typings.twilio.twilioStrings.inbound_track = "inbound_track".asInstanceOf[typings.twilio.twilioStrings.inbound_track]
    
    inline def outbound_track: typings.twilio.twilioStrings.outbound_track = "outbound_track".asInstanceOf[typings.twilio.twilioStrings.outbound_track]
  }
  
  type StreamUpdateStatus = stopped
}
