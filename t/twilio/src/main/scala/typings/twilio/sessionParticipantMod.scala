package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.messageInteractionMod.MessageInteractionContext
import typings.twilio.messageInteractionMod.MessageInteractionListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionParticipantMod {
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/participant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/participant", "ParticipantContext")
  @js.native
  open class ParticipantContext protected () extends StObject {
    /**
      * Initialize the ParticipantContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the parent Service of the resource to fetch
      * @param sessionSid - The SID of the parent Session of the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.proxyV1Mod.^, serviceSid: String, sessionSid: String, sid: String) = this()
    
    /**
      * fetch a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ParticipantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]): js.Promise[ParticipantInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def messageInteractions(sid: String): MessageInteractionContext = js.native
    @JSName("messageInteractions")
    var messageInteractions_Original: MessageInteractionListInstance = js.native
    
    /**
      * remove a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/participant", "ParticipantInstance")
  @js.native
  open class ParticipantInstance protected () extends SerializableClass {
    /**
      * Initialize the ParticipantContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the resource's parent Service
      * @param sessionSid - The SID of the resource's parent Session
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.proxyV1Mod.^,
      payload: ParticipantPayload,
      serviceSid: String,
      sessionSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: ParticipantContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateDeleted: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ParticipantInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ParticipantInstance] = js.native
    
    var friendlyName: String = js.native
    
    var identifier: String = js.native
    
    var links: String = js.native
    
    /**
      * Access the messageInteractions
      */
    def messageInteractions(): MessageInteractionListInstance = js.native
    
    var proxyIdentifier: String = js.native
    
    var proxyIdentifierSid: String = js.native
    
    /**
      * remove a ParticipantInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sessionSid: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ParticipantList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the resource's parent Service
    * @param sessionSid - The SID of the resource's parent Session
    */
  inline def ParticipantList(version: typings.twilio.proxyV1Mod.^, serviceSid: String, sessionSid: String): ParticipantListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ParticipantList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], sessionSid.asInstanceOf[js.Any])).asInstanceOf[ParticipantListInstance]
  
  @JSImport("twilio/lib/rest/proxy/v1/service/session/participant", "ParticipantPage")
  @js.native
  open class ParticipantPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.proxyV1Mod.^, 
          ParticipantPayload, 
          ParticipantResource, 
          ParticipantInstance
        ] {
    /**
      * Initialize the ParticipantPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.proxyV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ParticipantSolution
    ) = this()
    
    /**
      * Build an instance of ParticipantInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ParticipantPayload): ParticipantInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait ParticipantListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ParticipantContext = js.native
    
    /**
      * create a ParticipantInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: ParticipantListInstanceCreateOptions): js.Promise[ParticipantInstance] = js.native
    def create(
      opts: ParticipantListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ParticipantInstance, Any]
    ): js.Promise[ParticipantInstance] = js.native
    
    /**
      * Streams ParticipantInstance records from the API.
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
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ParticipantListInstanceEachOptions): Unit = js.native
    def each(
      opts: ParticipantListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a participant
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ParticipantContext = js.native
    
    /**
      * Retrieve a single target page of ParticipantInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ParticipantPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]): js.Promise[ParticipantPage] = js.native
    def getPage(targetUrl: String): js.Promise[ParticipantPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]
    ): js.Promise[ParticipantPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]
    ): js.Promise[ParticipantPage] = js.native
    
    /**
      * Lists ParticipantInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ParticipantInstance], Any]
    ): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ParticipantInstance], Any]
    ): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(opts: ParticipantListInstanceOptions): js.Promise[js.Array[ParticipantInstance]] = js.native
    def list(
      opts: ParticipantListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ParticipantInstance], Any]
    ): js.Promise[js.Array[ParticipantInstance]] = js.native
    
    /**
      * Retrieve a single page of ParticipantInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ParticipantPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]): js.Promise[ParticipantPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]): js.Promise[ParticipantPage] = js.native
    def page(opts: ParticipantListInstancePageOptions): js.Promise[ParticipantPage] = js.native
    def page(
      opts: ParticipantListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ParticipantPage, Any]
    ): js.Promise[ParticipantPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property failOnParticipantConflict - An experimental parameter to override the ProxyAllowParticipantConflict account flag on a per-request basis.
    * @property friendlyName - The string that you assigned to describe the participant
    * @property identifier - The phone number of the Participant
    * @property proxyIdentifier - The proxy phone number to use for the Participant
    * @property proxyIdentifierSid - The Proxy Identifier Sid
    */
  trait ParticipantListInstanceCreateOptions extends StObject {
    
    var failOnParticipantConflict: js.UndefOr[Boolean] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var identifier: String
    
    var proxyIdentifier: js.UndefOr[String] = js.undefined
    
    var proxyIdentifierSid: js.UndefOr[String] = js.undefined
  }
  object ParticipantListInstanceCreateOptions {
    
    inline def apply(identifier: String): ParticipantListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantListInstanceCreateOptions]
    }
    
    extension [Self <: ParticipantListInstanceCreateOptions](x: Self) {
      
      inline def setFailOnParticipantConflict(value: Boolean): Self = StObject.set(x, "failOnParticipantConflict", value.asInstanceOf[js.Any])
      
      inline def setFailOnParticipantConflictUndefined: Self = StObject.set(x, "failOnParticipantConflict", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setProxyIdentifier(value: String): Self = StObject.set(x, "proxyIdentifier", value.asInstanceOf[js.Any])
      
      inline def setProxyIdentifierSid(value: String): Self = StObject.set(x, "proxyIdentifierSid", value.asInstanceOf[js.Any])
      
      inline def setProxyIdentifierSidUndefined: Self = StObject.set(x, "proxyIdentifierSid", js.undefined)
      
      inline def setProxyIdentifierUndefined: Self = StObject.set(x, "proxyIdentifier", js.undefined)
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
  trait ParticipantListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ParticipantInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ParticipantListInstanceEachOptions {
    
    inline def apply(): ParticipantListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstanceEachOptions]
    }
    
    extension [Self <: ParticipantListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ParticipantInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait ParticipantListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ParticipantListInstanceOptions {
    
    inline def apply(): ParticipantListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstanceOptions]
    }
    
    extension [Self <: ParticipantListInstanceOptions](x: Self) {
      
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
  trait ParticipantListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ParticipantListInstancePageOptions {
    
    inline def apply(): ParticipantListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantListInstancePageOptions]
    }
    
    extension [Self <: ParticipantListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ParticipantPayload
    extends StObject
       with ParticipantResource
       with TwilioResponsePayload
  object ParticipantPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_deleted: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      identifier: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      proxy_identifier: String,
      proxy_identifier_sid: String,
      service_sid: String,
      session_sid: String,
      sid: String,
      uri: String,
      url: String
    ): ParticipantPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_deleted = date_deleted.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], proxy_identifier = proxy_identifier.asInstanceOf[js.Any], proxy_identifier_sid = proxy_identifier_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], session_sid = session_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantPayload]
    }
  }
  
  trait ParticipantResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_deleted: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var identifier: String
    
    var links: String
    
    var proxy_identifier: String
    
    var proxy_identifier_sid: String
    
    var service_sid: String
    
    var session_sid: String
    
    var sid: String
    
    var url: String
  }
  object ParticipantResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_deleted: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      identifier: String,
      links: String,
      proxy_identifier: String,
      proxy_identifier_sid: String,
      service_sid: String,
      session_sid: String,
      sid: String,
      url: String
    ): ParticipantResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_deleted = date_deleted.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], proxy_identifier = proxy_identifier.asInstanceOf[js.Any], proxy_identifier_sid = proxy_identifier_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], session_sid = session_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParticipantResource]
    }
    
    extension [Self <: ParticipantResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_deleted(value: js.Date): Self = StObject.set(x, "date_deleted", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setProxy_identifier(value: String): Self = StObject.set(x, "proxy_identifier", value.asInstanceOf[js.Any])
      
      inline def setProxy_identifier_sid(value: String): Self = StObject.set(x, "proxy_identifier_sid", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSession_sid(value: String): Self = StObject.set(x, "session_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParticipantSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
    
    var sessionSid: js.UndefOr[String] = js.undefined
  }
  object ParticipantSolution {
    
    inline def apply(): ParticipantSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParticipantSolution]
    }
    
    extension [Self <: ParticipantSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
      
      inline def setSessionSid(value: String): Self = StObject.set(x, "sessionSid", value.asInstanceOf[js.Any])
      
      inline def setSessionSidUndefined: Self = StObject.set(x, "sessionSid", js.undefined)
    }
  }
}
