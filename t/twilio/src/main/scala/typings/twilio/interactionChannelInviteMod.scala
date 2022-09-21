package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.taskrouter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionChannelInviteMod {
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction/interactionChannel/interactionChannelInvite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction/interactionChannel/interactionChannelInvite", "InteractionChannelInviteInstance")
  @js.native
  open class InteractionChannelInviteInstance protected () extends SerializableClass {
    /**
      * Initialize the InteractionChannelInviteContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param interactionSid - The Interaction SID for this Channel
      * @param channelSid - The Channel SID for this Invite
      */
    def this(
      version: typings.twilio.flexApiV1Mod.^,
      payload: InteractionChannelInvitePayload,
      interactionSid: String,
      channelSid: String
    ) = this()
    
    var channelSid: String = js.native
    
    var interactionSid: String = js.native
    
    var routing: Any = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the InteractionChannelInviteList
    *
    * @param version - Version of the resource
    * @param interactionSid - The Interaction SID for this Channel
    * @param channelSid - The Channel SID for this Invite
    */
  inline def InteractionChannelInviteList(version: typings.twilio.flexApiV1Mod.^, interactionSid: String, channelSid: String): InteractionChannelInviteListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("InteractionChannelInviteList")(version.asInstanceOf[js.Any], interactionSid.asInstanceOf[js.Any], channelSid.asInstanceOf[js.Any])).asInstanceOf[InteractionChannelInviteListInstance]
  
  @JSImport("twilio/lib/rest/flexApi/v1/interaction/interactionChannel/interactionChannelInvite", "InteractionChannelInvitePage")
  @js.native
  open class InteractionChannelInvitePage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.flexApiV1Mod.^, 
          InteractionChannelInvitePayload, 
          InteractionChannelInviteResource, 
          InteractionChannelInviteInstance
        ] {
    /**
      * Initialize the InteractionChannelInvitePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.flexApiV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: InteractionChannelInviteSolution
    ) = this()
    
    /**
      * Build an instance of InteractionChannelInviteInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: InteractionChannelInvitePayload): InteractionChannelInviteInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.accept
    - typings.twilio.twilioStrings.decline
  */
  trait InteractionChannelInviteAction extends StObject
  object InteractionChannelInviteAction {
    
    inline def accept: typings.twilio.twilioStrings.accept = "accept".asInstanceOf[typings.twilio.twilioStrings.accept]
    
    inline def decline: typings.twilio.twilioStrings.decline = "decline".asInstanceOf[typings.twilio.twilioStrings.decline]
  }
  
  @js.native
  trait InteractionChannelInviteListInstance extends StObject {
    
    /**
      * create a InteractionChannelInviteInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: InteractionChannelInviteListInstanceCreateOptions): js.Promise[InteractionChannelInviteInstance] = js.native
    def create(
      opts: InteractionChannelInviteListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ InteractionChannelInviteInstance, Any]
    ): js.Promise[InteractionChannelInviteInstance] = js.native
    
    /**
      * Streams InteractionChannelInviteInstance records from the API.
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
          /* item */ InteractionChannelInviteInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ InteractionChannelInviteInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: InteractionChannelInviteListInstanceEachOptions): Unit = js.native
    def each(
      opts: InteractionChannelInviteListInstanceEachOptions,
      callback: js.Function2[
          /* item */ InteractionChannelInviteInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of InteractionChannelInviteInstance records from
      * the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[InteractionChannelInvitePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelInvitePage, Any]): js.Promise[InteractionChannelInvitePage] = js.native
    def getPage(targetUrl: String): js.Promise[InteractionChannelInvitePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelInvitePage, Any]
    ): js.Promise[InteractionChannelInvitePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelInvitePage, Any]
    ): js.Promise[InteractionChannelInvitePage] = js.native
    
    /**
      * Lists InteractionChannelInviteInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[InteractionChannelInviteInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[InteractionChannelInviteInstance], 
          Any
        ]
    ): js.Promise[js.Array[InteractionChannelInviteInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[InteractionChannelInviteInstance], 
          Any
        ]
    ): js.Promise[js.Array[InteractionChannelInviteInstance]] = js.native
    def list(opts: InteractionChannelInviteListInstanceOptions): js.Promise[js.Array[InteractionChannelInviteInstance]] = js.native
    def list(
      opts: InteractionChannelInviteListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[InteractionChannelInviteInstance], 
          Any
        ]
    ): js.Promise[js.Array[InteractionChannelInviteInstance]] = js.native
    
    /**
      * Retrieve a single page of InteractionChannelInviteInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[InteractionChannelInvitePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelInvitePage, Any]): js.Promise[InteractionChannelInvitePage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelInvitePage, Any]
    ): js.Promise[InteractionChannelInvitePage] = js.native
    def page(opts: InteractionChannelInviteListInstancePageOptions): js.Promise[InteractionChannelInvitePage] = js.native
    def page(
      opts: InteractionChannelInviteListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InteractionChannelInvitePage, Any]
    ): js.Promise[InteractionChannelInvitePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property routing - The Interaction's routing logic
    */
  trait InteractionChannelInviteListInstanceCreateOptions extends StObject {
    
    var routing: js.Object
  }
  object InteractionChannelInviteListInstanceCreateOptions {
    
    inline def apply(routing: js.Object): InteractionChannelInviteListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(routing = routing.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionChannelInviteListInstanceCreateOptions]
    }
    
    extension [Self <: InteractionChannelInviteListInstanceCreateOptions](x: Self) {
      
      inline def setRouting(value: js.Object): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
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
  trait InteractionChannelInviteListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ InteractionChannelInviteInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InteractionChannelInviteListInstanceEachOptions {
    
    inline def apply(): InteractionChannelInviteListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelInviteListInstanceEachOptions]
    }
    
    extension [Self <: InteractionChannelInviteListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ InteractionChannelInviteInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait InteractionChannelInviteListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InteractionChannelInviteListInstanceOptions {
    
    inline def apply(): InteractionChannelInviteListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelInviteListInstanceOptions]
    }
    
    extension [Self <: InteractionChannelInviteListInstanceOptions](x: Self) {
      
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
  trait InteractionChannelInviteListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object InteractionChannelInviteListInstancePageOptions {
    
    inline def apply(): InteractionChannelInviteListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelInviteListInstancePageOptions]
    }
    
    extension [Self <: InteractionChannelInviteListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait InteractionChannelInvitePayload
    extends StObject
       with InteractionChannelInviteResource
       with TwilioResponsePayload
  object InteractionChannelInvitePayload {
    
    inline def apply(
      channel_sid: String,
      first_page_uri: String,
      interaction_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      routing: js.Object,
      sid: String,
      uri: String,
      url: String
    ): InteractionChannelInvitePayload = {
      val __obj = js.Dynamic.literal(channel_sid = channel_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], interaction_sid = interaction_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], routing = routing.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionChannelInvitePayload]
    }
  }
  
  trait InteractionChannelInviteResource extends StObject {
    
    var channel_sid: String
    
    var interaction_sid: String
    
    var routing: js.Object
    
    var sid: String
    
    var url: String
  }
  object InteractionChannelInviteResource {
    
    inline def apply(channel_sid: String, interaction_sid: String, routing: js.Object, sid: String, url: String): InteractionChannelInviteResource = {
      val __obj = js.Dynamic.literal(channel_sid = channel_sid.asInstanceOf[js.Any], interaction_sid = interaction_sid.asInstanceOf[js.Any], routing = routing.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionChannelInviteResource]
    }
    
    extension [Self <: InteractionChannelInviteResource](x: Self) {
      
      inline def setChannel_sid(value: String): Self = StObject.set(x, "channel_sid", value.asInstanceOf[js.Any])
      
      inline def setInteraction_sid(value: String): Self = StObject.set(x, "interaction_sid", value.asInstanceOf[js.Any])
      
      inline def setRouting(value: js.Object): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractionChannelInviteSolution extends StObject {
    
    var channelSid: js.UndefOr[String] = js.undefined
    
    var interactionSid: js.UndefOr[String] = js.undefined
  }
  object InteractionChannelInviteSolution {
    
    inline def apply(): InteractionChannelInviteSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionChannelInviteSolution]
    }
    
    extension [Self <: InteractionChannelInviteSolution](x: Self) {
      
      inline def setChannelSid(value: String): Self = StObject.set(x, "channelSid", value.asInstanceOf[js.Any])
      
      inline def setChannelSidUndefined: Self = StObject.set(x, "channelSid", js.undefined)
      
      inline def setInteractionSid(value: String): Self = StObject.set(x, "interactionSid", value.asInstanceOf[js.Any])
      
      inline def setInteractionSidUndefined: Self = StObject.set(x, "interactionSid", js.undefined)
    }
  }
  
  type InteractionChannelInviteType = taskrouter
}
