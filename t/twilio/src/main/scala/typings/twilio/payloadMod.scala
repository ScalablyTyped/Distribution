package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payloadMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/recording/addOnResult/payload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/recording/addOnResult/payload", "PayloadContext")
  @js.native
  open class PayloadContext protected () extends StObject {
    /**
      * Initialize the PayloadContext
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param referenceSid - The SID of the recording to which the AddOnResult resource that contains the payload to fetch belongs
      * @param addOnResultSid - The SID of the AddOnResult to which the payload to fetch belongs
      * @param sid - The unique string that identifies the resource to fetch
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      accountSid: String,
      referenceSid: String,
      addOnResultSid: String,
      sid: String
    ) = this()
    
    /**
      * fetch a PayloadInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PayloadInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ PayloadInstance, Any]): js.Promise[PayloadInstance] = js.native
    
    /**
      * remove a PayloadInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ PayloadInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/recording/addOnResult/payload", "PayloadInstance")
  @js.native
  open class PayloadInstance protected () extends SerializableClass {
    /**
      * Initialize the PayloadContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param referenceSid - The SID of the recording to which the AddOnResult resource that contains the payload belongs
      * @param addOnResultSid - The SID of the AddOnResult to which the payload belongs
      * @param sid - The unique string that identifies the resource to fetch
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: PayloadPayload,
      accountSid: String,
      referenceSid: String,
      addOnResultSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: PayloadContext = js.native
    
    var accountSid: String = js.native
    
    var addOnConfigurationSid: String = js.native
    
    var addOnResultSid: String = js.native
    
    var addOnSid: String = js.native
    
    var contentType: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a PayloadInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[PayloadInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[PayloadInstance] = js.native
    
    var label: String = js.native
    
    var referenceSid: String = js.native
    
    /**
      * remove a PayloadInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var subresourceUris: String = js.native
  }
  
  /**
    * Initialize the PayloadList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param referenceSid - The SID of the recording to which the AddOnResult resource that contains the payload belongs
    * @param addOnResultSid - The SID of the AddOnResult to which the payload belongs
    */
  inline def PayloadList(
    version: typings.twilio.v2010Mod.^,
    accountSid: String,
    referenceSid: String,
    addOnResultSid: String
  ): PayloadListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("PayloadList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], referenceSid.asInstanceOf[js.Any], addOnResultSid.asInstanceOf[js.Any])).asInstanceOf[PayloadListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/recording/addOnResult/payload", "PayloadPage")
  @js.native
  open class PayloadPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, PayloadPayload, PayloadResource, PayloadInstance] {
    /**
      * Initialize the PayloadPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: PayloadSolution
    ) = this()
    
    /**
      * Build an instance of PayloadInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: PayloadPayload): PayloadInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait PayloadListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): PayloadContext = js.native
    
    /**
      * Streams PayloadInstance records from the API.
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
          /* item */ PayloadInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ PayloadInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: PayloadListInstanceEachOptions): Unit = js.native
    def each(
      opts: PayloadListInstanceEachOptions,
      callback: js.Function2[
          /* item */ PayloadInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a payload
      *
      * @param sid - The unique string that identifies the resource to fetch
      */
    def get(sid: String): PayloadContext = js.native
    
    /**
      * Retrieve a single target page of PayloadInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[PayloadPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ PayloadPage, Any]): js.Promise[PayloadPage] = js.native
    def getPage(targetUrl: String): js.Promise[PayloadPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PayloadPage, Any]
    ): js.Promise[PayloadPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ PayloadPage, Any]): js.Promise[PayloadPage] = js.native
    
    /**
      * Lists PayloadInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[PayloadInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PayloadInstance], Any]): js.Promise[js.Array[PayloadInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PayloadInstance], Any]
    ): js.Promise[js.Array[PayloadInstance]] = js.native
    def list(opts: PayloadListInstanceOptions): js.Promise[js.Array[PayloadInstance]] = js.native
    def list(
      opts: PayloadListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[PayloadInstance], Any]
    ): js.Promise[js.Array[PayloadInstance]] = js.native
    
    /**
      * Retrieve a single page of PayloadInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[PayloadPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ PayloadPage, Any]): js.Promise[PayloadPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ PayloadPage, Any]): js.Promise[PayloadPage] = js.native
    def page(opts: PayloadListInstancePageOptions): js.Promise[PayloadPage] = js.native
    def page(
      opts: PayloadListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ PayloadPage, Any]
    ): js.Promise[PayloadPage] = js.native
    
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
  trait PayloadListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ PayloadInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PayloadListInstanceEachOptions {
    
    inline def apply(): PayloadListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayloadListInstanceEachOptions]
    }
    
    extension [Self <: PayloadListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ PayloadInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait PayloadListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PayloadListInstanceOptions {
    
    inline def apply(): PayloadListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayloadListInstanceOptions]
    }
    
    extension [Self <: PayloadListInstanceOptions](x: Self) {
      
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
  trait PayloadListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object PayloadListInstancePageOptions {
    
    inline def apply(): PayloadListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayloadListInstancePageOptions]
    }
    
    extension [Self <: PayloadListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait PayloadPayload
    extends StObject
       with PayloadResource
       with TwilioResponsePayload
  object PayloadPayload {
    
    inline def apply(
      account_sid: String,
      add_on_configuration_sid: String,
      add_on_result_sid: String,
      add_on_sid: String,
      content_type: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      label: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      reference_sid: String,
      sid: String,
      subresource_uris: String,
      uri: String
    ): PayloadPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], add_on_configuration_sid = add_on_configuration_sid.asInstanceOf[js.Any], add_on_result_sid = add_on_result_sid.asInstanceOf[js.Any], add_on_sid = add_on_sid.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], reference_sid = reference_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadPayload]
    }
  }
  
  trait PayloadResource extends StObject {
    
    var account_sid: String
    
    var add_on_configuration_sid: String
    
    var add_on_result_sid: String
    
    var add_on_sid: String
    
    var content_type: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var label: String
    
    var reference_sid: String
    
    var sid: String
    
    var subresource_uris: String
  }
  object PayloadResource {
    
    inline def apply(
      account_sid: String,
      add_on_configuration_sid: String,
      add_on_result_sid: String,
      add_on_sid: String,
      content_type: String,
      date_created: js.Date,
      date_updated: js.Date,
      label: String,
      reference_sid: String,
      sid: String,
      subresource_uris: String
    ): PayloadResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], add_on_configuration_sid = add_on_configuration_sid.asInstanceOf[js.Any], add_on_result_sid = add_on_result_sid.asInstanceOf[js.Any], add_on_sid = add_on_sid.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], reference_sid = reference_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadResource]
    }
    
    extension [Self <: PayloadResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAdd_on_configuration_sid(value: String): Self = StObject.set(x, "add_on_configuration_sid", value.asInstanceOf[js.Any])
      
      inline def setAdd_on_result_sid(value: String): Self = StObject.set(x, "add_on_result_sid", value.asInstanceOf[js.Any])
      
      inline def setAdd_on_sid(value: String): Self = StObject.set(x, "add_on_sid", value.asInstanceOf[js.Any])
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setReference_sid(value: String): Self = StObject.set(x, "reference_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSubresource_uris(value: String): Self = StObject.set(x, "subresource_uris", value.asInstanceOf[js.Any])
    }
  }
  
  trait PayloadSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var addOnResultSid: js.UndefOr[String] = js.undefined
    
    var referenceSid: js.UndefOr[String] = js.undefined
  }
  object PayloadSolution {
    
    inline def apply(): PayloadSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayloadSolution]
    }
    
    extension [Self <: PayloadSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setAddOnResultSid(value: String): Self = StObject.set(x, "addOnResultSid", value.asInstanceOf[js.Any])
      
      inline def setAddOnResultSidUndefined: Self = StObject.set(x, "addOnResultSid", js.undefined)
      
      inline def setReferenceSid(value: String): Self = StObject.set(x, "referenceSid", value.asInstanceOf[js.Any])
      
      inline def setReferenceSidUndefined: Self = StObject.set(x, "referenceSid", js.undefined)
    }
  }
}
