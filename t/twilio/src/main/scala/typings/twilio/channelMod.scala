package typings.twilio

import typings.twilio.channelMemberMod.MemberContext
import typings.twilio.channelMemberMod.MemberListInstance
import typings.twilio.channelMessageMod.MessageContext
import typings.twilio.channelMessageMod.MessageListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.inviteMod.InviteContext
import typings.twilio.inviteMod.InviteListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  @JSImport("twilio/lib/rest/chat/v1/service/channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/chat/v1/service/channel", "ChannelContext")
  @js.native
  open class ChannelContext protected () extends StObject {
    /**
      * Initialize the ChannelContext
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the resource from
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.chatV1Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelInstance, Any]): js.Promise[ChannelInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def invites(sid: String): InviteContext = js.native
    @JSName("invites")
    var invites_Original: InviteListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def members(sid: String): MemberContext = js.native
    @JSName("members")
    var members_Original: MemberListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def messages(sid: String): MessageContext = js.native
    @JSName("messages")
    var messages_Original: MessageListInstance = js.native
    
    /**
      * remove a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelInstance, Any]): js.Promise[ChannelInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelInstance, Any]): js.Promise[ChannelInstance] = js.native
    def update(opts: ChannelInstanceUpdateOptions): js.Promise[ChannelInstance] = js.native
    def update(
      opts: ChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelInstance, Any]
    ): js.Promise[ChannelInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/chat/v1/service/channel", "ChannelInstance")
  @js.native
  open class ChannelInstance protected () extends SerializableClass {
    /**
      * Initialize the ChannelContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.chatV1Mod.^, payload: ChannelPayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: ChannelContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: String = js.native
    
    var createdBy: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ChannelInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ChannelInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * Access the invites
      */
    def invites(): InviteListInstance = js.native
    
    var links: String = js.native
    
    /**
      * Access the members
      */
    def members(): MemberListInstance = js.native
    
    var membersCount: Double = js.native
    
    /**
      * Access the messages
      */
    def messages(): MessageListInstance = js.native
    
    var messagesCount: Double = js.native
    
    /**
      * remove a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var `type`: ChannelChannelType = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ChannelInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ChannelInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ChannelInstance] = js.native
    def update(opts: ChannelInstanceUpdateOptions): js.Promise[ChannelInstance] = js.native
    def update(
      opts: ChannelInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ChannelInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ChannelList
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    */
  inline def ChannelList(version: typings.twilio.chatV1Mod.^, serviceSid: String): ChannelListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ChannelList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[ChannelListInstance]
  
  @JSImport("twilio/lib/rest/chat/v1/service/channel", "ChannelPage")
  @js.native
  open class ChannelPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.chatV1Mod.^, ChannelPayload, ChannelResource, ChannelInstance] {
    /**
      * Initialize the ChannelPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.chatV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ChannelSolution
    ) = this()
    
    /**
      * Build an instance of ChannelInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ChannelPayload): ChannelInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.public
    - typings.twilio.twilioStrings.`private`
  */
  trait ChannelChannelType extends StObject
  object ChannelChannelType {
    
    inline def `private`: typings.twilio.twilioStrings.`private` = "private".asInstanceOf[typings.twilio.twilioStrings.`private`]
    
    inline def public: typings.twilio.twilioStrings.public = "public".asInstanceOf[typings.twilio.twilioStrings.public]
  }
  
  /**
    * Options to pass to update
    *
    * @property attributes - A valid JSON string that contains application-specific data
    * @property friendlyName - A string to describe the resource
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait ChannelInstanceUpdateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object ChannelInstanceUpdateOptions {
    
    inline def apply(): ChannelInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelInstanceUpdateOptions]
    }
    
    extension [Self <: ChannelInstanceUpdateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait ChannelListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ChannelContext = js.native
    
    /**
      * create a ChannelInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[ChannelInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ ChannelInstance, Any]): js.Promise[ChannelInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ ChannelInstance, Any]): js.Promise[ChannelInstance] = js.native
    def create(opts: ChannelListInstanceCreateOptions): js.Promise[ChannelInstance] = js.native
    def create(
      opts: ChannelListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ChannelInstance, Any]
    ): js.Promise[ChannelInstance] = js.native
    
    /**
      * Streams ChannelInstance records from the API.
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
          /* item */ ChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ChannelListInstanceEachOptions): Unit = js.native
    def each(
      opts: ChannelListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a channel
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ChannelContext = js.native
    
    /**
      * Retrieve a single target page of ChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ChannelPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]): js.Promise[ChannelPage] = js.native
    def getPage(targetUrl: String): js.Promise[ChannelPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]
    ): js.Promise[ChannelPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]): js.Promise[ChannelPage] = js.native
    
    /**
      * Lists ChannelInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ChannelInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ChannelInstance], Any]): js.Promise[js.Array[ChannelInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ChannelInstance], Any]
    ): js.Promise[js.Array[ChannelInstance]] = js.native
    def list(opts: ChannelListInstanceOptions): js.Promise[js.Array[ChannelInstance]] = js.native
    def list(
      opts: ChannelListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ChannelInstance], Any]
    ): js.Promise[js.Array[ChannelInstance]] = js.native
    
    /**
      * Retrieve a single page of ChannelInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ChannelPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]): js.Promise[ChannelPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]): js.Promise[ChannelPage] = js.native
    def page(opts: ChannelListInstancePageOptions): js.Promise[ChannelPage] = js.native
    def page(
      opts: ChannelListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ChannelPage, Any]
    ): js.Promise[ChannelPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property attributes - A valid JSON string that contains application-specific data
    * @property friendlyName - A string to describe the new resource
    * @property type - The visibility of the channel
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait ChannelListInstanceCreateOptions extends StObject {
    
    var attributes: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[ChannelChannelType] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object ChannelListInstanceCreateOptions {
    
    inline def apply(): ChannelListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelListInstanceCreateOptions]
    }
    
    extension [Self <: ChannelListInstanceCreateOptions](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setType(value: ChannelChannelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
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
    * @property type - The visibility of the channel to read
    */
  trait ChannelListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ChannelInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[ChannelChannelType | js.Array[ChannelChannelType]] = js.undefined
  }
  object ChannelListInstanceEachOptions {
    
    inline def apply(): ChannelListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelListInstanceEachOptions]
    }
    
    extension [Self <: ChannelListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ChannelInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setType(value: ChannelChannelType | js.Array[ChannelChannelType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: ChannelChannelType*): Self = StObject.set(x, "type", js.Array(value*))
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
    * @property type - The visibility of the channel to read
    */
  trait ChannelListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[ChannelChannelType | js.Array[ChannelChannelType]] = js.undefined
  }
  object ChannelListInstanceOptions {
    
    inline def apply(): ChannelListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelListInstanceOptions]
    }
    
    extension [Self <: ChannelListInstanceOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setType(value: ChannelChannelType | js.Array[ChannelChannelType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: ChannelChannelType*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property type - The visibility of the channel to read
    */
  trait ChannelListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[ChannelChannelType | js.Array[ChannelChannelType]] = js.undefined
  }
  object ChannelListInstancePageOptions {
    
    inline def apply(): ChannelListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelListInstancePageOptions]
    }
    
    extension [Self <: ChannelListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setType(value: ChannelChannelType | js.Array[ChannelChannelType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: ChannelChannelType*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  trait ChannelPayload
    extends StObject
       with ChannelResource
       with TwilioResponsePayload
  object ChannelPayload {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      created_by: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      members_count: Double,
      messages_count: Double,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      `type`: ChannelChannelType,
      unique_name: String,
      uri: String,
      url: String
    ): ChannelPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], members_count = members_count.asInstanceOf[js.Any], messages_count = messages_count.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelPayload]
    }
  }
  
  trait ChannelResource extends StObject {
    
    var account_sid: String
    
    var attributes: String
    
    var created_by: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var links: String
    
    var members_count: Double
    
    var messages_count: Double
    
    var service_sid: String
    
    var sid: String
    
    var `type`: ChannelChannelType
    
    var unique_name: String
    
    var url: String
  }
  object ChannelResource {
    
    inline def apply(
      account_sid: String,
      attributes: String,
      created_by: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      links: String,
      members_count: Double,
      messages_count: Double,
      service_sid: String,
      sid: String,
      `type`: ChannelChannelType,
      unique_name: String,
      url: String
    ): ChannelResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], members_count = members_count.asInstanceOf[js.Any], messages_count = messages_count.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelResource]
    }
    
    extension [Self <: ChannelResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMembers_count(value: Double): Self = StObject.set(x, "members_count", value.asInstanceOf[js.Any])
      
      inline def setMessages_count(value: Double): Self = StObject.set(x, "messages_count", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setType(value: ChannelChannelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object ChannelSolution {
    
    inline def apply(): ChannelSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelSolution]
    }
    
    extension [Self <: ChannelSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
