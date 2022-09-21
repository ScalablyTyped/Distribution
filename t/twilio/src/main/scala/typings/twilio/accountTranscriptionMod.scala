package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.twilioStrings.completed_
import typings.twilio.twilioStrings.failed__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountTranscriptionMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/transcription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/transcription", "TranscriptionContext")
  @js.native
  open class TranscriptionContext protected () extends StObject {
    /**
      * Initialize the TranscriptionContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, sid: String) = this()
    
    /**
      * fetch a TranscriptionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TranscriptionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TranscriptionInstance, Any]): js.Promise[TranscriptionInstance] = js.native
    
    /**
      * remove a TranscriptionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ TranscriptionInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/transcription", "TranscriptionInstance")
  @js.native
  open class TranscriptionInstance protected () extends SerializableClass {
    /**
      * Initialize the TranscriptionContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, payload: TranscriptionPayload, accountSid: String, sid: String) = this()
    
    /* private */ var _proxy: TranscriptionContext = js.native
    
    var accountSid: String = js.native
    
    var apiVersion: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var duration: String = js.native
    
    /**
      * fetch a TranscriptionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TranscriptionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TranscriptionInstance] = js.native
    
    var price: Double = js.native
    
    var priceUnit: String = js.native
    
    var recordingSid: String = js.native
    
    /**
      * remove a TranscriptionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var status: TranscriptionStatus = js.native
    
    var transcriptionText: String = js.native
    
    var `type`: String = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the TranscriptionList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    */
  inline def TranscriptionList(version: typings.twilio.v2010Mod.^, accountSid: String): TranscriptionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TranscriptionList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[TranscriptionListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/transcription", "TranscriptionPage")
  @js.native
  open class TranscriptionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          TranscriptionPayload, 
          TranscriptionResource, 
          TranscriptionInstance
        ] {
    /**
      * Initialize the TranscriptionPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TranscriptionSolution
    ) = this()
    
    /**
      * Build an instance of TranscriptionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TranscriptionPayload): TranscriptionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait TranscriptionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TranscriptionContext = js.native
    
    /**
      * Streams TranscriptionInstance records from the API.
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
          /* item */ TranscriptionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TranscriptionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TranscriptionListInstanceEachOptions): Unit = js.native
    def each(
      opts: TranscriptionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TranscriptionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a transcription
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): TranscriptionContext = js.native
    
    /**
      * Retrieve a single target page of TranscriptionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TranscriptionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TranscriptionPage, Any]): js.Promise[TranscriptionPage] = js.native
    def getPage(targetUrl: String): js.Promise[TranscriptionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TranscriptionPage, Any]
    ): js.Promise[TranscriptionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TranscriptionPage, Any]
    ): js.Promise[TranscriptionPage] = js.native
    
    /**
      * Lists TranscriptionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TranscriptionInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TranscriptionInstance], Any]
    ): js.Promise[js.Array[TranscriptionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TranscriptionInstance], Any]
    ): js.Promise[js.Array[TranscriptionInstance]] = js.native
    def list(opts: TranscriptionListInstanceOptions): js.Promise[js.Array[TranscriptionInstance]] = js.native
    def list(
      opts: TranscriptionListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TranscriptionInstance], Any]
    ): js.Promise[js.Array[TranscriptionInstance]] = js.native
    
    /**
      * Retrieve a single page of TranscriptionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TranscriptionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TranscriptionPage, Any]): js.Promise[TranscriptionPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TranscriptionPage, Any]
    ): js.Promise[TranscriptionPage] = js.native
    def page(opts: TranscriptionListInstancePageOptions): js.Promise[TranscriptionPage] = js.native
    def page(
      opts: TranscriptionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TranscriptionPage, Any]
    ): js.Promise[TranscriptionPage] = js.native
    
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
  trait TranscriptionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TranscriptionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TranscriptionListInstanceEachOptions {
    
    inline def apply(): TranscriptionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranscriptionListInstanceEachOptions]
    }
    
    extension [Self <: TranscriptionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TranscriptionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait TranscriptionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TranscriptionListInstanceOptions {
    
    inline def apply(): TranscriptionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranscriptionListInstanceOptions]
    }
    
    extension [Self <: TranscriptionListInstanceOptions](x: Self) {
      
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
  trait TranscriptionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object TranscriptionListInstancePageOptions {
    
    inline def apply(): TranscriptionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranscriptionListInstancePageOptions]
    }
    
    extension [Self <: TranscriptionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait TranscriptionPayload
    extends StObject
       with TranscriptionResource {
    
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
  object TranscriptionPayload {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      date_created: js.Date,
      date_updated: js.Date,
      duration: String,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      price: Double,
      price_unit: String,
      recording_sid: String,
      sid: String,
      status: TranscriptionStatus,
      transcription_text: String,
      `type`: String,
      uri: String
    ): TranscriptionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], recording_sid = recording_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transcription_text = transcription_text.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranscriptionPayload]
    }
    
    extension [Self <: TranscriptionPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait TranscriptionResource extends StObject {
    
    var account_sid: String
    
    var api_version: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var duration: String
    
    var price: Double
    
    var price_unit: String
    
    var recording_sid: String
    
    var sid: String
    
    var status: TranscriptionStatus
    
    var transcription_text: String
    
    var `type`: String
    
    var uri: String
  }
  object TranscriptionResource {
    
    inline def apply(
      account_sid: String,
      api_version: String,
      date_created: js.Date,
      date_updated: js.Date,
      duration: String,
      price: Double,
      price_unit: String,
      recording_sid: String,
      sid: String,
      status: TranscriptionStatus,
      transcription_text: String,
      `type`: String,
      uri: String
    ): TranscriptionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], api_version = api_version.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_unit = price_unit.asInstanceOf[js.Any], recording_sid = recording_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transcription_text = transcription_text.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranscriptionResource]
    }
    
    extension [Self <: TranscriptionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPrice_unit(value: String): Self = StObject.set(x, "price_unit", value.asInstanceOf[js.Any])
      
      inline def setRecording_sid(value: String): Self = StObject.set(x, "recording_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: TranscriptionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTranscription_text(value: String): Self = StObject.set(x, "transcription_text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait TranscriptionSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object TranscriptionSolution {
    
    inline def apply(): TranscriptionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranscriptionSolution]
    }
    
    extension [Self <: TranscriptionSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`in-progress`
    - typings.twilio.twilioStrings.completed_
    - typings.twilio.twilioStrings.failed__
  */
  trait TranscriptionStatus extends StObject
  object TranscriptionStatus {
    
    inline def completed: completed_ = "completed".asInstanceOf[completed_]
    
    inline def failed: failed__ = "failed".asInstanceOf[failed__]
    
    inline def `in-progress`: typings.twilio.twilioStrings.`in-progress` = "in-progress".asInstanceOf[typings.twilio.twilioStrings.`in-progress`]
  }
}
