package typings.twilio

import typings.twilio.interactionChannelInviteMod.InteractionChannelInviteListInstance
import typings.twilio.interactionChannelParticipantMod.InteractionChannelParticipantContext
import typings.twilio.interactionChannelParticipantMod.InteractionChannelParticipantListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.active_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionChannelMod {
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction/interactionChannel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction/interactionChannel", "InteractionChannelContext")
  @js.native
  open class InteractionChannelContext protected () extends StObject {
    /**
      * Initialize the InteractionChannelContext
      *
      * @param version - Version of the resource
      * @param interactionSid - The unique string that identifies the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.flexApiV1Mod.^, interactionSid: String, sid: String) = this()
    
    /**
      * fetch a InteractionChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InteractionChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelInstance, Any]): js.Promise[InteractionChannelInstance] = js.native
    
    var invites: InteractionChannelInviteListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def participants(sid: String): InteractionChannelParticipantContext = js.native
    @JSName("participants")
    var participants_Original: InteractionChannelParticipantListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a InteractionChannelInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: InteractionChannelInstanceUpdateOptions): js.Promise[InteractionChannelInstance] = js.native
    def update(
      opts: InteractionChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelInstance, Any]
    ): js.Promise[InteractionChannelInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction/interactionChannel", "InteractionChannelInstance")
  @js.native
  open class InteractionChannelInstance protected () extends SerializableClass {
    /**
      * Initialize the InteractionChannelContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param interactionSid - The unique string that identifies the resource.
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.flexApiV1Mod.^,
      payload: InteractionChannelPayload,
      interactionSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: InteractionChannelContext = js.native
    
    var errorCode: Double = js.native
    
    var errorMessage: String = js.native
    
    /**
      * fetch a InteractionChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InteractionChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[InteractionChannelInstance] = js.native
    
    var interactionSid: String = js.native
    
    /**
      * Access the invites
      */
    def invites(): InteractionChannelInviteListInstance = js.native
    
    var links: String = js.native
    
    /**
      * Access the participants
      */
    def participants(): InteractionChannelParticipantListInstance = js.native
    
    var sid: String = js.native
    
    var status: InteractionChannelChannelStatus = js.native
    
    var `type`: InteractionChannelType = js.native
    
    /**
      * update a InteractionChannelInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: InteractionChannelInstanceUpdateOptions): js.Promise[InteractionChannelInstance] = js.native
    def update(
      opts: InteractionChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[InteractionChannelInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the InteractionChannelList
    *
    * @param version - Version of the resource
    * @param interactionSid - The unique string that identifies the resource.
    */
  inline def InteractionChannelList(version: typings.twilio.flexApiV1Mod.^, interactionSid: String): InteractionChannelListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("InteractionChannelList")(version.asInstanceOf[js.Any], interactionSid.asInstanceOf[js.Any])).asInstanceOf[InteractionChannelListInstance]
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction/interactionChannel", "InteractionChannelPage")
  @js.native
  open class InteractionChannelPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.flexApiV1Mod.^, 
          InteractionChannelPayload, 
          InteractionChannelResource, 
          InteractionChannelInstance
        ] {
    /**
      * Initialize the InteractionChannelPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.flexApiV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: InteractionChannelSolution
    ) = this()
    
    /**
      * Build an instance of InteractionChannelInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: InteractionChannelPayload): InteractionChannelInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.setup
    - typings.twilio.twilioStrings.active_
    - typings.twilio.twilioStrings.failed__
    - typings.twilio.twilioStrings.closed
  */
  trait InteractionChannelChannelStatus extends StObject
  object InteractionChannelChannelStatus {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def closed: typings.twilio.twilioStrings.closed = "closed".asInstanceOf[typings.twilio.twilioStrings.closed]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def setup: typings.twilio.twilioStrings.setup = "setup".asInstanceOf[typings.twilio.twilioStrings.setup]
  }
  
  /**
    * Options to pass to update
    *
    * @property routing - Optional. The state of associated tasks.
    * @property status - Required. The Interaction channels's status
    */
  trait InteractionChannelInstanceUpdateOptions extends StObject {
    
    var routing: js.UndefOr[js.Object] = js.undefined
    
    var status: InteractionChannelStatus
  }
  object InteractionChannelInstanceUpdateOptions {
    
    inline def apply(status: InteractionChannelStatus): InteractionChannelInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionChannelInstanceUpdateOptions]
    }
    
    extension [Self <: InteractionChannelInstanceUpdateOptions](x: Self) {
      
      inline def setRouting(value: js.Object): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
      
      inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
      
      inline def setStatus(value: InteractionChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InteractionChannelListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): InteractionChannelContext = js.native
    
    /**
      * Streams InteractionChannelInstance records from the API.
      *
      * This operation lazily loads records as efficiently as possible until the limit
      * is reached.
      *
      * The results are passed into the callback function, so this operation is memory
      * efficient.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ InteractionChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ InteractionChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: InteractionChannelListInstanceEachOptions): Unit = js.native
    def each(
      opts: InteractionChannelListInstanceEachOptions,
      callback: js.Function2[
          /* item */ InteractionChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a interaction_channel
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): InteractionChannelContext = js.native
    
    /**
      * Retrieve a single target page of InteractionChannelInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[InteractionChannelPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelPage, Any]): js.Promise[InteractionChannelPage] = js.native
    def getPage(targetUrl: String): js.Promise[InteractionChannelPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelPage, Any]
    ): js.Promise[InteractionChannelPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelPage, Any]
    ): js.Promise[InteractionChannelPage] = js.native
    
    /**
      * Lists InteractionChannelInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[InteractionChannelInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InteractionChannelInstance], Any]
    ): js.Promise[js.Array[InteractionChannelInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InteractionChannelInstance], Any]
    ): js.Promise[js.Array[InteractionChannelInstance]] = js.native
    def list(opts: InteractionChannelListInstanceOptions): js.Promise[js.Array[InteractionChannelInstance]] = js.native
    def list(
      opts: InteractionChannelListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InteractionChannelInstance], Any]
    ): js.Promise[js.Array[InteractionChannelInstance]] = js.native
    
    /**
      * Retrieve a single page of InteractionChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[InteractionChannelPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelPage, Any]): js.Promise[InteractionChannelPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelPage, Any]
    ): js.Promise[InteractionChannelPage] = js.native
    def page(opts: InteractionChannelListInstancePageOptions): js.Promise[InteractionChannelPage] = js.native
    def page(
      opts: InteractionChannelListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelPage, Any]
    ): js.Promise[InteractionChannelPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    */
  trait InteractionChannelListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ InteractionChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InteractionChannelListInstanceEachOptions {
    
    inline def apply(): InteractionChannelListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelListInstanceEachOptions]
    }
    
    extension [Self <: InteractionChannelListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ InteractionChannelInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    */
  trait InteractionChannelListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InteractionChannelListInstanceOptions {
    
    inline def apply(): InteractionChannelListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelListInstanceOptions]
    }
    
    extension [Self <: InteractionChannelListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait InteractionChannelListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object InteractionChannelListInstancePageOptions {
    
    inline def apply(): InteractionChannelListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelListInstancePageOptions]
    }
    
    extension [Self <: InteractionChannelListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait InteractionChannelPayload
    extends StObject
       with InteractionChannelResource
       with TwilioResponsePayload
  object InteractionChannelPayload {
    
    inline def apply(
      error_code: Double,
      error_message: String,
      first_page_uri: String,
      interaction_sid: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status: InteractionChannelChannelStatus,
      `type`: InteractionChannelType,
      uri: String,
      url: String
    ): InteractionChannelPayload = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], interaction_sid = interaction_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionChannelPayload]
    }
  }
  
  trait InteractionChannelResource extends StObject {
    
    var error_code: Double
    
    var error_message: String
    
    var interaction_sid: String
    
    var links: String
    
    var sid: String
    
    var status: InteractionChannelChannelStatus
    
    var `type`: InteractionChannelType
    
    var url: String
  }
  object InteractionChannelResource {
    
    inline def apply(
      error_code: Double,
      error_message: String,
      interaction_sid: String,
      links: String,
      sid: String,
      status: InteractionChannelChannelStatus,
      `type`: InteractionChannelType,
      url: String
    ): InteractionChannelResource = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], interaction_sid = interaction_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionChannelResource]
    }
    
    extension [Self <: InteractionChannelResource](x: Self) {
      
      inline def setError_code(value: Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
      
      inline def setInteraction_sid(value: String): Self = StObject.set(x, "interaction_sid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: InteractionChannelChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: InteractionChannelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractionChannelSolution extends StObject {
    
    var interactionSid: js.UndefOr[String] = js.undefined
  }
  object InteractionChannelSolution {
    
    inline def apply(): InteractionChannelSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelSolution]
    }
    
    extension [Self <: InteractionChannelSolution](x: Self) {
      
      inline def setInteractionSid(value: String): Self = StObject.set(x, "interactionSid", value.asInstanceOf[js.Any])
      
      inline def setInteractionSidUndefined: Self = StObject.set(x, "interactionSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.closed
    - typings.twilio.twilioStrings.wrapup
  */
  trait InteractionChannelStatus extends StObject
  object InteractionChannelStatus {
    
    inline def closed: typings.twilio.twilioStrings.closed = "closed".asInstanceOf[typings.twilio.twilioStrings.closed]
    
    inline def wrapup: typings.twilio.twilioStrings.wrapup = "wrapup".asInstanceOf[typings.twilio.twilioStrings.wrapup]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.voice
    - typings.twilio.twilioStrings.sms
    - typings.twilio.twilioStrings.email
    - typings.twilio.twilioStrings.web
    - typings.twilio.twilioStrings.whatsapp
    - typings.twilio.twilioStrings.chat
    - typings.twilio.twilioStrings.messenger
    - typings.twilio.twilioStrings.gbm
  */
  trait InteractionChannelType extends StObject
  object InteractionChannelType {
    
    inline def chat: typings.twilio.twilioStrings.chat = "chat".asInstanceOf[typings.twilio.twilioStrings.chat]
    
    inline def email: typings.twilio.twilioStrings.email = "email".asInstanceOf[typings.twilio.twilioStrings.email]
    
    inline def gbm: typings.twilio.twilioStrings.gbm = "gbm".asInstanceOf[typings.twilio.twilioStrings.gbm]
    
    inline def messenger: typings.twilio.twilioStrings.messenger = "messenger".asInstanceOf[typings.twilio.twilioStrings.messenger]
    
    inline def sms: typings.twilio.twilioStrings.sms = "sms".asInstanceOf[typings.twilio.twilioStrings.sms]
    
    inline def voice: typings.twilio.twilioStrings.voice = "voice".asInstanceOf[typings.twilio.twilioStrings.voice]
    
    inline def web: typings.twilio.twilioStrings.web = "web".asInstanceOf[typings.twilio.twilioStrings.web]
    
    inline def whatsapp: typings.twilio.twilioStrings.whatsapp = "whatsapp".asInstanceOf[typings.twilio.twilioStrings.whatsapp]
  }
}
