package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.conferenceRecordingMod.RecordingContext
import typings.twilio.conferenceRecordingMod.RecordingListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.participantMod.ParticipantContext
import typings.twilio.participantMod.ParticipantListInstance
import typings.twilio.twilioStrings.completed_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conferenceMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference", "ConferenceContext")
  @js.native
  open class ConferenceContext protected () extends StObject {
    /**
      * Initialize the ConferenceContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource(s) to fetch
      * @param sid - The unique string that identifies this resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a ConferenceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConferenceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceInstance, Any]): js.Promise[ConferenceInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def participants(sid: String): ParticipantContext = js.native
    @JSName("participants")
    var participants_Original: ParticipantListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def recordings(sid: String): RecordingContext = js.native
    @JSName("recordings")
    var recordings_Original: RecordingListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ConferenceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConferenceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceInstance, Any]): js.Promise[ConferenceInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceInstance, Any]
    ): js.Promise[ConferenceInstance] = js.native
    def update(opts: ConferenceInstanceUpdateOptions): js.Promise[ConferenceInstance] = js.native
    def update(
      opts: ConferenceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferenceInstance, Any]
    ): js.Promise[ConferenceInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference", "ConferenceInstance")
  @js.native
  open class ConferenceInstance protected () extends SerializableClass {
    /**
      * Initialize the ConferenceContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created this resource
      * @param sid - The unique string that identifies this resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: ConferencePayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: ConferenceContext = js.native
    
    var accountSid: String = js.native
    
    var apiVersion: String = js.native
    
    var callSidEndingConference: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a ConferenceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ConferenceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConferenceInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * Access the participants
      */
    def participants(): ParticipantListInstance = js.native
    
    var reasonConferenceEnded: ConferenceReasonConferenceEnded = js.native
    
    /**
      * Access the recordings
      */
    def recordings(): RecordingListInstance = js.native
    
    var region: String = js.native
    
    var sid: String = js.native
    
    var status: ConferenceStatus = js.native
    
    var subresourceUris: String = js.native
    
    /**
      * update a ConferenceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ConferenceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConferenceInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ConferenceInstance] = js.native
    def update(opts: ConferenceInstanceUpdateOptions): js.Promise[ConferenceInstance] = js.native
    def update(
      opts: ConferenceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ConferenceInstance] = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the ConferenceList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created this resource
    */
  inline def ConferenceList(version: typings.twilio.v2010Mod.^, accountSid: String): ConferenceListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("ConferenceList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[ConferenceListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/conference", "ConferencePage")
  @js.native
  open class ConferencePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, ConferencePayload, ConferenceResource, ConferenceInstance] {
    /**
      * Initialize the ConferencePage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: ConferenceSolution
    ) = this()
    
    /**
      * Build an instance of ConferenceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ConferencePayload): ConferenceInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property announceMethod - he HTTP method used to call announce_url
    * @property announceUrl - The URL we should call to announce something into the conference
    * @property status - The new status of the resource
    */
  trait ConferenceInstanceUpdateOptions extends StObject {
    
    var announceMethod: js.UndefOr[String] = js.undefined
    
    var announceUrl: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[ConferenceUpdateStatus] = js.undefined
  }
  object ConferenceInstanceUpdateOptions {
    
    inline def apply(): ConferenceInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceInstanceUpdateOptions]
    }
    
    extension [Self <: ConferenceInstanceUpdateOptions](x: Self) {
      
      inline def setAnnounceMethod(value: String): Self = StObject.set(x, "announceMethod", value.asInstanceOf[js.Any])
      
      inline def setAnnounceMethodUndefined: Self = StObject.set(x, "announceMethod", js.undefined)
      
      inline def setAnnounceUrl(value: String): Self = StObject.set(x, "announceUrl", value.asInstanceOf[js.Any])
      
      inline def setAnnounceUrlUndefined: Self = StObject.set(x, "announceUrl", js.undefined)
      
      inline def setStatus(value: ConferenceUpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait ConferenceListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ConferenceContext = js.native
    
    /**
      * Streams ConferenceInstance records from the API.
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
          /* item */ ConferenceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ConferenceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ConferenceListInstanceEachOptions): Unit = js.native
    def each(
      opts: ConferenceListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ConferenceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a conference
      *
      * @param sid - The unique string that identifies this resource
      */
    def get(sid: String): ConferenceContext = js.native
    
    /**
      * Retrieve a single target page of ConferenceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ConferencePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]): js.Promise[ConferencePage] = js.native
    def getPage(targetUrl: String): js.Promise[ConferencePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]
    ): js.Promise[ConferencePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]
    ): js.Promise[ConferencePage] = js.native
    
    /**
      * Lists ConferenceInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ConferenceInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConferenceInstance], Any]): js.Promise[js.Array[ConferenceInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConferenceInstance], Any]
    ): js.Promise[js.Array[ConferenceInstance]] = js.native
    def list(opts: ConferenceListInstanceOptions): js.Promise[js.Array[ConferenceInstance]] = js.native
    def list(
      opts: ConferenceListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ConferenceInstance], Any]
    ): js.Promise[js.Array[ConferenceInstance]] = js.native
    
    /**
      * Retrieve a single page of ConferenceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ConferencePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]): js.Promise[ConferencePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]): js.Promise[ConferencePage] = js.native
    def page(opts: ConferenceListInstancePageOptions): js.Promise[ConferencePage] = js.native
    def page(
      opts: ConferenceListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ConferencePage, Any]
    ): js.Promise[ConferencePage] = js.native
    
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
    * @property dateCreated - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedAfter - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedBefore - The `YYYY-MM-DD` value of the resources to read
    * @property dateUpdated - The `YYYY-MM-DD` value of the resources to read
    * @property dateUpdatedAfter - The `YYYY-MM-DD` value of the resources to read
    * @property dateUpdatedBefore - The `YYYY-MM-DD` value of the resources to read
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The string that identifies the Conference resources to read
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
    * @property status - The status of the resources to read
    */
  trait ConferenceListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ConferenceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdated: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[ConferenceStatus] = js.undefined
  }
  object ConferenceListInstanceEachOptions {
    
    inline def apply(): ConferenceListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceListInstanceEachOptions]
    }
    
    extension [Self <: ConferenceListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ConferenceInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedAfter(value: js.Date): Self = StObject.set(x, "dateUpdatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedAfterUndefined: Self = StObject.set(x, "dateUpdatedAfter", js.undefined)
      
      inline def setDateUpdatedBefore(value: js.Date): Self = StObject.set(x, "dateUpdatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedBeforeUndefined: Self = StObject.set(x, "dateUpdatedBefore", js.undefined)
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: ConferenceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property dateCreated - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedAfter - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedBefore - The `YYYY-MM-DD` value of the resources to read
    * @property dateUpdated - The `YYYY-MM-DD` value of the resources to read
    * @property dateUpdatedAfter - The `YYYY-MM-DD` value of the resources to read
    * @property dateUpdatedBefore - The `YYYY-MM-DD` value of the resources to read
    * @property friendlyName - The string that identifies the Conference resources to read
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
    * @property status - The status of the resources to read
    */
  trait ConferenceListInstanceOptions extends StObject {
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdated: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[ConferenceStatus] = js.undefined
  }
  object ConferenceListInstanceOptions {
    
    inline def apply(): ConferenceListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceListInstanceOptions]
    }
    
    extension [Self <: ConferenceListInstanceOptions](x: Self) {
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedAfter(value: js.Date): Self = StObject.set(x, "dateUpdatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedAfterUndefined: Self = StObject.set(x, "dateUpdatedAfter", js.undefined)
      
      inline def setDateUpdatedBefore(value: js.Date): Self = StObject.set(x, "dateUpdatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedBeforeUndefined: Self = StObject.set(x, "dateUpdatedBefore", js.undefined)
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: ConferenceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property dateCreated - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedAfter - The `YYYY-MM-DD` value of the resources to read
    * @property dateCreatedBefore - The `YYYY-MM-DD` value of the resources to read
    * @property dateUpdated - The `YYYY-MM-DD` value of the resources to read
    * @property dateUpdatedAfter - The `YYYY-MM-DD` value of the resources to read
    * @property dateUpdatedBefore - The `YYYY-MM-DD` value of the resources to read
    * @property friendlyName - The string that identifies the Conference resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - The status of the resources to read
    */
  trait ConferenceListInstancePageOptions extends StObject {
    
    var dateCreated: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateCreatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdated: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdatedAfter: js.UndefOr[js.Date] = js.undefined
    
    var dateUpdatedBefore: js.UndefOr[js.Date] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[ConferenceStatus] = js.undefined
  }
  object ConferenceListInstancePageOptions {
    
    inline def apply(): ConferenceListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceListInstancePageOptions]
    }
    
    extension [Self <: ConferenceListInstancePageOptions](x: Self) {
      
      inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfter(value: js.Date): Self = StObject.set(x, "dateCreatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedAfterUndefined: Self = StObject.set(x, "dateCreatedAfter", js.undefined)
      
      inline def setDateCreatedBefore(value: js.Date): Self = StObject.set(x, "dateCreatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateCreatedBeforeUndefined: Self = StObject.set(x, "dateCreatedBefore", js.undefined)
      
      inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
      
      inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedAfter(value: js.Date): Self = StObject.set(x, "dateUpdatedAfter", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedAfterUndefined: Self = StObject.set(x, "dateUpdatedAfter", js.undefined)
      
      inline def setDateUpdatedBefore(value: js.Date): Self = StObject.set(x, "dateUpdatedBefore", value.asInstanceOf[js.Any])
      
      inline def setDateUpdatedBeforeUndefined: Self = StObject.set(x, "dateUpdatedBefore", js.undefined)
      
      inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: ConferenceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait ConferencePayload
    extends StObject
       with ConferenceResource {
    
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
  object ConferencePayload {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      call_sid_ending_conference: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      reason_conference_ended: ConferenceReasonConferenceEnded,
      region: String,
      sid: String,
      status: ConferenceStatus,
      subresource_uris: String,
      uri: String
    ): ConferencePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], call_sid_ending_conference = call_sid_ending_conference.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], reason_conference_ended = reason_conference_ended.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConferencePayload]
    }
    
    extension [Self <: ConferencePayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`conference-ended-via-api`
    - typings.twilio.twilioStrings.`participant-with-end-conference-on-exit-left`
    - typings.twilio.twilioStrings.`participant-with-end-conference-on-exit-kicked`
    - typings.twilio.twilioStrings.`last-participant-kicked`
    - typings.twilio.twilioStrings.`last-participant-left`
  */
  trait ConferenceReasonConferenceEnded extends StObject
  object ConferenceReasonConferenceEnded {
    
    inline def `conference-ended-via-api`: typings.twilio.twilioStrings.`conference-ended-via-api` = "conference-ended-via-api".asInstanceOf[typings.twilio.twilioStrings.`conference-ended-via-api`]
    
    inline def `last-participant-kicked`: typings.twilio.twilioStrings.`last-participant-kicked` = "last-participant-kicked".asInstanceOf[typings.twilio.twilioStrings.`last-participant-kicked`]
    
    inline def `last-participant-left`: typings.twilio.twilioStrings.`last-participant-left` = "last-participant-left".asInstanceOf[typings.twilio.twilioStrings.`last-participant-left`]
    
    inline def `participant-with-end-conference-on-exit-kicked`: typings.twilio.twilioStrings.`participant-with-end-conference-on-exit-kicked` = "participant-with-end-conference-on-exit-kicked".asInstanceOf[typings.twilio.twilioStrings.`participant-with-end-conference-on-exit-kicked`]
    
    inline def `participant-with-end-conference-on-exit-left`: typings.twilio.twilioStrings.`participant-with-end-conference-on-exit-left` = "participant-with-end-conference-on-exit-left".asInstanceOf[typings.twilio.twilioStrings.`participant-with-end-conference-on-exit-left`]
  }
  
  trait ConferenceResource extends StObject {
    
    var account_sid: String
    
    var api_version: String
    
    var call_sid_ending_conference: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var reason_conference_ended: ConferenceReasonConferenceEnded
    
    var region: String
    
    var sid: String
    
    var status: ConferenceStatus
    
    var subresource_uris: String
    
    var uri: String
  }
  object ConferenceResource {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      call_sid_ending_conference: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      reason_conference_ended: ConferenceReasonConferenceEnded,
      region: String,
      sid: String,
      status: ConferenceStatus,
      subresource_uris: String,
      uri: String
    ): ConferenceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], call_sid_ending_conference = call_sid_ending_conference.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], reason_conference_ended = reason_conference_ended.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConferenceResource]
    }
    
    extension [Self <: ConferenceResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setCall_sid_ending_conference(value: String): Self = StObject.set(x, "call_sid_ending_conference", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setReason_conference_ended(value: ConferenceReasonConferenceEnded): Self = StObject.set(x, "reason_conference_ended", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ConferenceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubresource_uris(value: String): Self = StObject.set(x, "subresource_uris", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConferenceSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object ConferenceSolution {
    
    inline def apply(): ConferenceSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConferenceSolution]
    }
    
    extension [Self <: ConferenceSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.init
    - typings.twilio.twilioStrings.`in-progress`
    - typings.twilio.twilioStrings.completed_
  */
  trait ConferenceStatus extends StObject
  object ConferenceStatus {
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def `in-progress`: typings.twilio.twilioStrings.`in-progress` = "in-progress".asInstanceOf[typings.twilio.twilioStrings.`in-progress`]
    
    inline def init: typings.twilio.twilioStrings.init = "init".asInstanceOf[typings.twilio.twilioStrings.init]
  }
  
  type ConferenceUpdateStatus = completed_
}
