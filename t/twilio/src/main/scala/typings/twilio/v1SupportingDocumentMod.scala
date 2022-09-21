package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.approved_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1SupportingDocumentMod {
  
  @JSImport("twilio/lib/rest/trusthub/v1/supportingDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trusthub/v1/supportingDocument", "SupportingDocumentContext")
  @js.native
  open class SupportingDocumentContext protected () extends StObject {
    /**
      * Initialize the SupportingDocumentContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, sid: String) = this()
    
    /**
      * fetch a SupportingDocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SupportingDocumentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentInstance, Any]): js.Promise[SupportingDocumentInstance] = js.native
    
    /**
      * remove a SupportingDocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a SupportingDocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SupportingDocumentInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentInstance, Any]): js.Promise[SupportingDocumentInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentInstance, Any]
    ): js.Promise[SupportingDocumentInstance] = js.native
    def update(opts: SupportingDocumentInstanceUpdateOptions): js.Promise[SupportingDocumentInstance] = js.native
    def update(
      opts: SupportingDocumentInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentInstance, Any]
    ): js.Promise[SupportingDocumentInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/trusthub/v1/supportingDocument", "SupportingDocumentInstance")
  @js.native
  open class SupportingDocumentInstance protected () extends SerializableClass {
    /**
      * Initialize the SupportingDocumentContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trusthubV1Mod.^, payload: SupportingDocumentPayload, sid: String) = this()
    
    /* private */ var _proxy: SupportingDocumentContext = js.native
    
    var accountSid: String = js.native
    
    var attributes: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a SupportingDocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[SupportingDocumentInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SupportingDocumentInstance] = js.native
    
    var friendlyName: String = js.native
    
    var mimeType: String = js.native
    
    /**
      * remove a SupportingDocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var status: SupportingDocumentStatus = js.native
    
    var `type`: String = js.native
    
    /**
      * update a SupportingDocumentInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[SupportingDocumentInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SupportingDocumentInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[SupportingDocumentInstance] = js.native
    def update(opts: SupportingDocumentInstanceUpdateOptions): js.Promise[SupportingDocumentInstance] = js.native
    def update(
      opts: SupportingDocumentInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[SupportingDocumentInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the SupportingDocumentList
    *
    * @param version - Version of the resource
    */
  inline def SupportingDocumentList(version: typings.twilio.trusthubV1Mod.^): SupportingDocumentListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("SupportingDocumentList")(version.asInstanceOf[js.Any]).asInstanceOf[SupportingDocumentListInstance]
  
  @JSImport("twilio/lib/rest/trusthub/v1/supportingDocument", "SupportingDocumentPage")
  @js.native
  open class SupportingDocumentPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.trusthubV1Mod.^, 
          SupportingDocumentPayload, 
          SupportingDocumentResource, 
          SupportingDocumentInstance
        ] {
    /**
      * Initialize the SupportingDocumentPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trusthubV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: SupportingDocumentSolution
    ) = this()
    
    /**
      * Build an instance of SupportingDocumentInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: SupportingDocumentPayload): SupportingDocumentInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property attributes - The set of parameters that compose the Supporting Document resource
    * @property friendlyName - The string that you assigned to describe the resource
    */
  trait SupportingDocumentInstanceUpdateOptions extends StObject {
    
    var attributes: js.UndefOr[js.Object] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object SupportingDocumentInstanceUpdateOptions {
    
    inline def apply(): SupportingDocumentInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SupportingDocumentInstanceUpdateOptions]
    }
    
    extension [Self <: SupportingDocumentInstanceUpdateOptions](x: Self) {
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait SupportingDocumentListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): SupportingDocumentContext = js.native
    
    /**
      * create a SupportingDocumentInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: SupportingDocumentListInstanceCreateOptions): js.Promise[SupportingDocumentInstance] = js.native
    def create(
      opts: SupportingDocumentListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ SupportingDocumentInstance, Any]
    ): js.Promise[SupportingDocumentInstance] = js.native
    
    /**
      * Streams SupportingDocumentInstance records from the API.
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
          /* item */ SupportingDocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ SupportingDocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: SupportingDocumentListInstanceEachOptions): Unit = js.native
    def each(
      opts: SupportingDocumentListInstanceEachOptions,
      callback: js.Function2[
          /* item */ SupportingDocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a supporting_document
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): SupportingDocumentContext = js.native
    
    /**
      * Retrieve a single target page of SupportingDocumentInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[SupportingDocumentPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentPage, Any]): js.Promise[SupportingDocumentPage] = js.native
    def getPage(targetUrl: String): js.Promise[SupportingDocumentPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentPage, Any]
    ): js.Promise[SupportingDocumentPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentPage, Any]
    ): js.Promise[SupportingDocumentPage] = js.native
    
    /**
      * Lists SupportingDocumentInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[SupportingDocumentInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SupportingDocumentInstance], Any]
    ): js.Promise[js.Array[SupportingDocumentInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SupportingDocumentInstance], Any]
    ): js.Promise[js.Array[SupportingDocumentInstance]] = js.native
    def list(opts: SupportingDocumentListInstanceOptions): js.Promise[js.Array[SupportingDocumentInstance]] = js.native
    def list(
      opts: SupportingDocumentListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[SupportingDocumentInstance], Any]
    ): js.Promise[js.Array[SupportingDocumentInstance]] = js.native
    
    /**
      * Retrieve a single page of SupportingDocumentInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[SupportingDocumentPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentPage, Any]): js.Promise[SupportingDocumentPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentPage, Any]
    ): js.Promise[SupportingDocumentPage] = js.native
    def page(opts: SupportingDocumentListInstancePageOptions): js.Promise[SupportingDocumentPage] = js.native
    def page(
      opts: SupportingDocumentListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ SupportingDocumentPage, Any]
    ): js.Promise[SupportingDocumentPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property attributes - The set of parameters that compose the Supporting Documents resource
    * @property friendlyName - The string that you assigned to describe the resource
    * @property type - The type of the Supporting Document
    */
  trait SupportingDocumentListInstanceCreateOptions extends StObject {
    
    var attributes: js.UndefOr[js.Object] = js.undefined
    
    var friendlyName: String
    
    var `type`: String
  }
  object SupportingDocumentListInstanceCreateOptions {
    
    inline def apply(friendlyName: String, `type`: String): SupportingDocumentListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportingDocumentListInstanceCreateOptions]
    }
    
    extension [Self <: SupportingDocumentListInstanceCreateOptions](x: Self) {
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
  trait SupportingDocumentListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ SupportingDocumentInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SupportingDocumentListInstanceEachOptions {
    
    inline def apply(): SupportingDocumentListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SupportingDocumentListInstanceEachOptions]
    }
    
    extension [Self <: SupportingDocumentListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ SupportingDocumentInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait SupportingDocumentListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object SupportingDocumentListInstanceOptions {
    
    inline def apply(): SupportingDocumentListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SupportingDocumentListInstanceOptions]
    }
    
    extension [Self <: SupportingDocumentListInstanceOptions](x: Self) {
      
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
  trait SupportingDocumentListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object SupportingDocumentListInstancePageOptions {
    
    inline def apply(): SupportingDocumentListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SupportingDocumentListInstancePageOptions]
    }
    
    extension [Self <: SupportingDocumentListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait SupportingDocumentPayload
    extends StObject
       with SupportingDocumentResource
       with TwilioResponsePayload
  object SupportingDocumentPayload {
    
    inline def apply(
      account_sid: String,
      attributes: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      mime_type: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status: SupportingDocumentStatus,
      `type`: String,
      uri: String,
      url: String
    ): SupportingDocumentPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportingDocumentPayload]
    }
  }
  
  trait SupportingDocumentResource extends StObject {
    
    var account_sid: String
    
    var attributes: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var mime_type: String
    
    var sid: String
    
    var status: SupportingDocumentStatus
    
    var `type`: String
    
    var url: String
  }
  object SupportingDocumentResource {
    
    inline def apply(
      account_sid: String,
      attributes: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      mime_type: String,
      sid: String,
      status: SupportingDocumentStatus,
      `type`: String,
      url: String
    ): SupportingDocumentResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportingDocumentResource]
    }
    
    extension [Self <: SupportingDocumentResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: SupportingDocumentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SupportingDocumentSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.draft
    - typings.twilio.twilioStrings.`pending-review`
    - typings.twilio.twilioStrings.rejected
    - typings.twilio.twilioStrings.approved_
    - typings.twilio.twilioStrings.expired
    - typings.twilio.twilioStrings.`provisionally-approved`
  */
  trait SupportingDocumentStatus extends StObject
  object SupportingDocumentStatus {
    
    inline def approved: approved_ = "approved".asInstanceOf[approved_]
    
    inline def draft: typings.twilio.twilioStrings.draft = "draft".asInstanceOf[typings.twilio.twilioStrings.draft]
    
    inline def expired: typings.twilio.twilioStrings.expired = "expired".asInstanceOf[typings.twilio.twilioStrings.expired]
    
    inline def `pending-review`: typings.twilio.twilioStrings.`pending-review` = "pending-review".asInstanceOf[typings.twilio.twilioStrings.`pending-review`]
    
    inline def `provisionally-approved`: typings.twilio.twilioStrings.`provisionally-approved` = "provisionally-approved".asInstanceOf[typings.twilio.twilioStrings.`provisionally-approved`]
    
    inline def rejected: typings.twilio.twilioStrings.rejected = "rejected".asInstanceOf[typings.twilio.twilioStrings.rejected]
  }
}
