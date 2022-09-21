package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.payloadMod.PayloadContext
import typings.twilio.payloadMod.PayloadListInstance
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.deleted_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addOnResultMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/recording/addOnResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/recording/addOnResult", "AddOnResultContext")
  @js.native
  open class AddOnResultContext protected () extends StObject {
    /**
      * Initialize the AddOnResultContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param referenceSid - The SID of the recording to which the result to fetch belongs
      * @param sid - The unique string that identifies the resource to fetch
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, referenceSid: String, sid: String) = this()
    
    /**
      * fetch a AddOnResultInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AddOnResultInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddOnResultInstance, Any]): js.Promise[AddOnResultInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def payloads(sid: String): PayloadContext = js.native
    @JSName("payloads")
    var payloads_Original: PayloadListInstance = js.native
    
    /**
      * remove a AddOnResultInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddOnResultInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/recording/addOnResult", "AddOnResultInstance")
  @js.native
  open class AddOnResultInstance protected () extends SerializableClass {
    /**
      * Initialize the AddOnResultContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param referenceSid - The SID of the recording to which the AddOnResult resource belongs
      * @param sid - The unique string that identifies the resource to fetch
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: AddOnResultPayload,
      accountSid: String,
      referenceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: AddOnResultContext = js.native
    
    var accountSid: String = js.native
    
    var addOnConfigurationSid: String = js.native
    
    var addOnSid: String = js.native
    
    var dateCompleted: js.Date = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a AddOnResultInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AddOnResultInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AddOnResultInstance] = js.native
    
    /**
      * Access the payloads
      */
    def payloads(): PayloadListInstance = js.native
    
    var referenceSid: String = js.native
    
    /**
      * remove a AddOnResultInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var status: AddOnResultStatus = js.native
    
    var subresourceUris: String = js.native
  }
  
  /**
    * Initialize the AddOnResultList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param referenceSid - The SID of the recording to which the AddOnResult resource belongs
    */
  inline def AddOnResultList(version: typings.twilio.v2010Mod.^, accountSid: String, referenceSid: String): AddOnResultListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AddOnResultList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], referenceSid.asInstanceOf[js.Any])).asInstanceOf[AddOnResultListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/recording/addOnResult", "AddOnResultPage")
  @js.native
  open class AddOnResultPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          AddOnResultPayload, 
          AddOnResultResource, 
          AddOnResultInstance
        ] {
    /**
      * Initialize the AddOnResultPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AddOnResultSolution
    ) = this()
    
    /**
      * Build an instance of AddOnResultInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AddOnResultPayload): AddOnResultInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AddOnResultListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AddOnResultContext = js.native
    
    /**
      * Streams AddOnResultInstance records from the API.
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
          /* item */ AddOnResultInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AddOnResultInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AddOnResultListInstanceEachOptions): Unit = js.native
    def each(
      opts: AddOnResultListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AddOnResultInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a add_on_result
      *
      * @param sid - The unique string that identifies the resource to fetch
      */
    def get(sid: String): AddOnResultContext = js.native
    
    /**
      * Retrieve a single target page of AddOnResultInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AddOnResultPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddOnResultPage, Any]): js.Promise[AddOnResultPage] = js.native
    def getPage(targetUrl: String): js.Promise[AddOnResultPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddOnResultPage, Any]
    ): js.Promise[AddOnResultPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddOnResultPage, Any]
    ): js.Promise[AddOnResultPage] = js.native
    
    /**
      * Lists AddOnResultInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AddOnResultInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AddOnResultInstance], Any]
    ): js.Promise[js.Array[AddOnResultInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AddOnResultInstance], Any]
    ): js.Promise[js.Array[AddOnResultInstance]] = js.native
    def list(opts: AddOnResultListInstanceOptions): js.Promise[js.Array[AddOnResultInstance]] = js.native
    def list(
      opts: AddOnResultListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AddOnResultInstance], Any]
    ): js.Promise[js.Array[AddOnResultInstance]] = js.native
    
    /**
      * Retrieve a single page of AddOnResultInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AddOnResultPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AddOnResultPage, Any]): js.Promise[AddOnResultPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AddOnResultPage, Any]): js.Promise[AddOnResultPage] = js.native
    def page(opts: AddOnResultListInstancePageOptions): js.Promise[AddOnResultPage] = js.native
    def page(
      opts: AddOnResultListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AddOnResultPage, Any]
    ): js.Promise[AddOnResultPage] = js.native
    
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
  trait AddOnResultListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AddOnResultInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AddOnResultListInstanceEachOptions {
    
    inline def apply(): AddOnResultListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOnResultListInstanceEachOptions]
    }
    
    extension [Self <: AddOnResultListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AddOnResultInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AddOnResultListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AddOnResultListInstanceOptions {
    
    inline def apply(): AddOnResultListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOnResultListInstanceOptions]
    }
    
    extension [Self <: AddOnResultListInstanceOptions](x: Self) {
      
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
  trait AddOnResultListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AddOnResultListInstancePageOptions {
    
    inline def apply(): AddOnResultListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOnResultListInstancePageOptions]
    }
    
    extension [Self <: AddOnResultListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait AddOnResultPayload
    extends StObject
       with AddOnResultResource
       with TwilioResponsePayload
  object AddOnResultPayload {
    
    inline def apply(
      account_sid: String,
      add_on_configuration_sid: String,
      add_on_sid: String,
      date_completed: js.Date,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      reference_sid: String,
      sid: String,
      status: AddOnResultStatus,
      subresource_uris: String,
      uri: String
    ): AddOnResultPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], add_on_configuration_sid = add_on_configuration_sid.asInstanceOf[js.Any], add_on_sid = add_on_sid.asInstanceOf[js.Any], date_completed = date_completed.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], reference_sid = reference_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOnResultPayload]
    }
  }
  
  trait AddOnResultResource extends StObject {
    
    var account_sid: String
    
    var add_on_configuration_sid: String
    
    var add_on_sid: String
    
    var date_completed: js.Date
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var reference_sid: String
    
    var sid: String
    
    var status: AddOnResultStatus
    
    var subresource_uris: String
  }
  object AddOnResultResource {
    
    inline def apply(
      account_sid: String,
      add_on_configuration_sid: String,
      add_on_sid: String,
      date_completed: js.Date,
      date_created: js.Date,
      date_updated: js.Date,
      reference_sid: String,
      sid: String,
      status: AddOnResultStatus,
      subresource_uris: String
    ): AddOnResultResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], add_on_configuration_sid = add_on_configuration_sid.asInstanceOf[js.Any], add_on_sid = add_on_sid.asInstanceOf[js.Any], date_completed = date_completed.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], reference_sid = reference_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOnResultResource]
    }
    
    extension [Self <: AddOnResultResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAdd_on_configuration_sid(value: String): Self = StObject.set(x, "add_on_configuration_sid", value.asInstanceOf[js.Any])
      
      inline def setAdd_on_sid(value: String): Self = StObject.set(x, "add_on_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_completed(value: js.Date): Self = StObject.set(x, "date_completed", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setReference_sid(value: String): Self = StObject.set(x, "reference_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: AddOnResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubresource_uris(value: String): Self = StObject.set(x, "subresource_uris", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddOnResultSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var referenceSid: js.UndefOr[String] = js.undefined
  }
  object AddOnResultSolution {
    
    inline def apply(): AddOnResultSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOnResultSolution]
    }
    
    extension [Self <: AddOnResultSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setReferenceSid(value: String): Self = StObject.set(x, "referenceSid", value.asInstanceOf[js.Any])
      
      inline def setReferenceSidUndefined: Self = StObject.set(x, "referenceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.canceled
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.deleted_
    - typings.twilio.twilioStrings.failed__
    - typings.twilio.twilioStrings.`in-progress`
    - typings.twilio.twilioStrings.init
    - typings.twilio.twilioStrings.processing
    - typings.twilio.twilioStrings.queued
  */
  trait AddOnResultStatus extends StObject
  object AddOnResultStatus {
    
    inline def canceled: typings.twilio.twilioStrings.canceled = "canceled".asInstanceOf[typings.twilio.twilioStrings.canceled]
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def deleted: deleted_ = "deleted".asInstanceOf[deleted_]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def `in-progress`: typings.twilio.twilioStrings.`in-progress` = "in-progress".asInstanceOf[typings.twilio.twilioStrings.`in-progress`]
    
    inline def init: typings.twilio.twilioStrings.init = "init".asInstanceOf[typings.twilio.twilioStrings.init]
    
    inline def processing: typings.twilio.twilioStrings.processing = "processing".asInstanceOf[typings.twilio.twilioStrings.processing]
    
    inline def queued: typings.twilio.twilioStrings.queued = "queued".asInstanceOf[typings.twilio.twilioStrings.queued]
  }
}
