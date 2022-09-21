package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionChannelParticipantMod {
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction/interactionChannel/interactionChannelParticipant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction/interactionChannel/interactionChannelParticipant", "InteractionChannelParticipantContext")
  @js.native
  open class InteractionChannelParticipantContext protected () extends StObject {
    /**
      * Initialize the InteractionChannelParticipantContext
      *
      * @param version - Version of the resource
      * @param interactionSid - The Interaction Sid for this channel.
      * @param channelSid - The Channel Sid for this Participant.
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.flexApiV1Mod.^, interactionSid: String, channelSid: String, sid: String) = this()
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a InteractionChannelParticipantInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: InteractionChannelParticipantInstanceUpdateOptions): js.Promise[InteractionChannelParticipantInstance] = js.native
    def update(
      opts: InteractionChannelParticipantInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelParticipantInstance, Any]
    ): js.Promise[InteractionChannelParticipantInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction/interactionChannel/interactionChannelParticipant", "InteractionChannelParticipantInstance")
  @js.native
  open class InteractionChannelParticipantInstance protected () extends SerializableClass {
    /**
      * Initialize the InteractionChannelParticipantContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param interactionSid - The Interaction Sid for this channel.
      * @param channelSid - The Channel Sid for this Participant.
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.flexApiV1Mod.^,
      payload: InteractionChannelParticipantPayload,
      interactionSid: String,
      channelSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: InteractionChannelParticipantContext = js.native
    
    var channelSid: String = js.native
    
    var interactionSid: String = js.native
    
    var sid: String = js.native
    
    var `type`: InteractionChannelParticipantType = js.native
    
    /**
      * update a InteractionChannelParticipantInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: InteractionChannelParticipantInstanceUpdateOptions): js.Promise[InteractionChannelParticipantInstance] = js.native
    def update(
      opts: InteractionChannelParticipantInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[InteractionChannelParticipantInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the InteractionChannelParticipantList
    *
    * @param version - Version of the resource
    * @param interactionSid - The Interaction Sid for this channel.
    * @param channelSid - The Channel Sid for this Participant.
    */
  inline def InteractionChannelParticipantList(version: typings.twilio.flexApiV1Mod.^, interactionSid: String, channelSid: String): InteractionChannelParticipantListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("InteractionChannelParticipantList")(version.asInstanceOf[js.Any], interactionSid.asInstanceOf[js.Any], channelSid.asInstanceOf[js.Any])).asInstanceOf[InteractionChannelParticipantListInstance]
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction/interactionChannel/interactionChannelParticipant", "InteractionChannelParticipantPage")
  @js.native
  open class InteractionChannelParticipantPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.flexApiV1Mod.^, 
          InteractionChannelParticipantPayload, 
          InteractionChannelParticipantResource, 
          InteractionChannelParticipantInstance
        ] {
    /**
      * Initialize the InteractionChannelParticipantPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.flexApiV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: InteractionChannelParticipantSolution
    ) = this()
    
    /**
      * Build an instance of InteractionChannelParticipantInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: InteractionChannelParticipantPayload): InteractionChannelParticipantInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property status - The Participant's status.
    */
  trait InteractionChannelParticipantInstanceUpdateOptions extends StObject {
    
    var status: InteractionChannelParticipantStatus
  }
  object InteractionChannelParticipantInstanceUpdateOptions {
    
    inline def apply(status: InteractionChannelParticipantStatus): InteractionChannelParticipantInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionChannelParticipantInstanceUpdateOptions]
    }
    
    extension [Self <: InteractionChannelParticipantInstanceUpdateOptions](x: Self) {
      
      inline def setStatus(value: InteractionChannelParticipantStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InteractionChannelParticipantListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): InteractionChannelParticipantContext = js.native
    
    /**
      * create a InteractionChannelParticipantInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: InteractionChannelParticipantListInstanceCreateOptions): js.Promise[InteractionChannelParticipantInstance] = js.native
    def create(
      opts: InteractionChannelParticipantListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ InteractionChannelParticipantInstance, Any]
    ): js.Promise[InteractionChannelParticipantInstance] = js.native
    
    /**
      * Streams InteractionChannelParticipantInstance records from the API.
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
          /* item */ InteractionChannelParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ InteractionChannelParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: InteractionChannelParticipantListInstanceEachOptions): Unit = js.native
    def each(
      opts: InteractionChannelParticipantListInstanceEachOptions,
      callback: js.Function2[
          /* item */ InteractionChannelParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a interaction_channel_participant
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): InteractionChannelParticipantContext = js.native
    
    /**
      * Retrieve a single target page of InteractionChannelParticipantInstance records
      * from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[InteractionChannelParticipantPage] = js.native
    def getPage(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelParticipantPage, Any]
    ): js.Promise[InteractionChannelParticipantPage] = js.native
    def getPage(targetUrl: String): js.Promise[InteractionChannelParticipantPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelParticipantPage, Any]
    ): js.Promise[InteractionChannelParticipantPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelParticipantPage, Any]
    ): js.Promise[InteractionChannelParticipantPage] = js.native
    
    /**
      * Lists InteractionChannelParticipantInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[InteractionChannelParticipantInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[InteractionChannelParticipantInstance], 
          Any
        ]
    ): js.Promise[js.Array[InteractionChannelParticipantInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[InteractionChannelParticipantInstance], 
          Any
        ]
    ): js.Promise[js.Array[InteractionChannelParticipantInstance]] = js.native
    def list(opts: InteractionChannelParticipantListInstanceOptions): js.Promise[js.Array[InteractionChannelParticipantInstance]] = js.native
    def list(
      opts: InteractionChannelParticipantListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[InteractionChannelParticipantInstance], 
          Any
        ]
    ): js.Promise[js.Array[InteractionChannelParticipantInstance]] = js.native
    
    /**
      * Retrieve a single page of InteractionChannelParticipantInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[InteractionChannelParticipantPage] = js.native
    def page(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelParticipantPage, Any]
    ): js.Promise[InteractionChannelParticipantPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelParticipantPage, Any]
    ): js.Promise[InteractionChannelParticipantPage] = js.native
    def page(opts: InteractionChannelParticipantListInstancePageOptions): js.Promise[InteractionChannelParticipantPage] = js.native
    def page(
      opts: InteractionChannelParticipantListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelParticipantPage, Any]
    ): js.Promise[InteractionChannelParticipantPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property mediaProperties - JSON representing the Media Properties for the new Participant.
    * @property type - Participant type.
    */
  trait InteractionChannelParticipantListInstanceCreateOptions extends StObject {
    
    var mediaProperties: js.Object
    
    var `type`: InteractionChannelParticipantType
  }
  object InteractionChannelParticipantListInstanceCreateOptions {
    
    inline def apply(mediaProperties: js.Object, `type`: InteractionChannelParticipantType): InteractionChannelParticipantListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(mediaProperties = mediaProperties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionChannelParticipantListInstanceCreateOptions]
    }
    
    extension [Self <: InteractionChannelParticipantListInstanceCreateOptions](x: Self) {
      
      inline def setMediaProperties(value: js.Object): Self = StObject.set(x, "mediaProperties", value.asInstanceOf[js.Any])
      
      inline def setType(value: InteractionChannelParticipantType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
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
  trait InteractionChannelParticipantListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ InteractionChannelParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InteractionChannelParticipantListInstanceEachOptions {
    
    inline def apply(): InteractionChannelParticipantListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelParticipantListInstanceEachOptions]
    }
    
    extension [Self <: InteractionChannelParticipantListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ InteractionChannelParticipantInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait InteractionChannelParticipantListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InteractionChannelParticipantListInstanceOptions {
    
    inline def apply(): InteractionChannelParticipantListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelParticipantListInstanceOptions]
    }
    
    extension [Self <: InteractionChannelParticipantListInstanceOptions](x: Self) {
      
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
  trait InteractionChannelParticipantListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object InteractionChannelParticipantListInstancePageOptions {
    
    inline def apply(): InteractionChannelParticipantListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelParticipantListInstancePageOptions]
    }
    
    extension [Self <: InteractionChannelParticipantListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait InteractionChannelParticipantPayload
    extends StObject
       with InteractionChannelParticipantResource
       with TwilioResponsePayload
  object InteractionChannelParticipantPayload {
    
    inline def apply(
      channel_sid: String,
      first_page_uri: String,
      interaction_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      `type`: InteractionChannelParticipantType,
      uri: String,
      url: String
    ): InteractionChannelParticipantPayload = {
      val __obj = js.Dynamic.literal(channel_sid = channel_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], interaction_sid = interaction_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionChannelParticipantPayload]
    }
  }
  
  trait InteractionChannelParticipantResource extends StObject {
    
    var channel_sid: String
    
    var interaction_sid: String
    
    var sid: String
    
    var `type`: InteractionChannelParticipantType
    
    var url: String
  }
  object InteractionChannelParticipantResource {
    
    inline def apply(
      channel_sid: String,
      interaction_sid: String,
      sid: String,
      `type`: InteractionChannelParticipantType,
      url: String
    ): InteractionChannelParticipantResource = {
      val __obj = js.Dynamic.literal(channel_sid = channel_sid.asInstanceOf[js.Any], interaction_sid = interaction_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionChannelParticipantResource]
    }
    
    extension [Self <: InteractionChannelParticipantResource](x: Self) {
      
      inline def setChannel_sid(value: String): Self = StObject.set(x, "channel_sid", value.asInstanceOf[js.Any])
      
      inline def setInteraction_sid(value: String): Self = StObject.set(x, "interaction_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setType(value: InteractionChannelParticipantType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractionChannelParticipantSolution extends StObject {
    
    var channelSid: js.UndefOr[String] = js.undefined
    
    var interactionSid: js.UndefOr[String] = js.undefined
  }
  object InteractionChannelParticipantSolution {
    
    inline def apply(): InteractionChannelParticipantSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelParticipantSolution]
    }
    
    extension [Self <: InteractionChannelParticipantSolution](x: Self) {
      
      inline def setChannelSid(value: String): Self = StObject.set(x, "channelSid", value.asInstanceOf[js.Any])
      
      inline def setChannelSidUndefined: Self = StObject.set(x, "channelSid", js.undefined)
      
      inline def setInteractionSid(value: String): Self = StObject.set(x, "interactionSid", value.asInstanceOf[js.Any])
      
      inline def setInteractionSidUndefined: Self = StObject.set(x, "interactionSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.closed
    - typings.twilio.twilioStrings.wrapup
  */
  trait InteractionChannelParticipantStatus extends StObject
  object InteractionChannelParticipantStatus {
    
    inline def closed: typings.twilio.twilioStrings.closed = "closed".asInstanceOf[typings.twilio.twilioStrings.closed]
    
    inline def wrapup: typings.twilio.twilioStrings.wrapup = "wrapup".asInstanceOf[typings.twilio.twilioStrings.wrapup]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.supervisor
    - typings.twilio.twilioStrings.customer
    - typings.twilio.twilioStrings.external
    - typings.twilio.twilioStrings.agent
    - typings.twilio.twilioStrings.unknown_
  */
  trait InteractionChannelParticipantType extends StObject
  object InteractionChannelParticipantType {
    
    inline def agent: typings.twilio.twilioStrings.agent = "agent".asInstanceOf[typings.twilio.twilioStrings.agent]
    
    inline def customer: typings.twilio.twilioStrings.customer = "customer".asInstanceOf[typings.twilio.twilioStrings.customer]
    
    inline def external: typings.twilio.twilioStrings.external = "external".asInstanceOf[typings.twilio.twilioStrings.external]
    
    inline def supervisor: typings.twilio.twilioStrings.supervisor = "supervisor".asInstanceOf[typings.twilio.twilioStrings.supervisor]
    
    inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  }
}
