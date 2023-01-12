package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import typings.twilio.libRestPreviewMarketplaceInstalledAddOnInstalledAddOnExtensionMod.InstalledAddOnExtensionContext
import typings.twilio.libRestPreviewMarketplaceInstalledAddOnInstalledAddOnExtensionMod.InstalledAddOnExtensionListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMarketplaceInstalledAddOnMod {
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn", "InstalledAddOnContext")
  @js.native
  open class InstalledAddOnContext protected () extends StObject {
    /**
      * Initialize the InstalledAddOnContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - The SID of the InstalledAddOn resource to fetch
      */
    def this(version: typings.twilio.libRestPreviewMarketplaceMod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def extensions(sid: String): InstalledAddOnExtensionContext = js.native
    @JSName("extensions")
    var extensions_Original: InstalledAddOnExtensionListInstance = js.native
    
    /**
      * fetch a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InstalledAddOnInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnInstance, Any]): js.Promise[InstalledAddOnInstance] = js.native
    
    /**
      * remove a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[InstalledAddOnInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnInstance, Any]): js.Promise[InstalledAddOnInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnInstance, Any]
    ): js.Promise[InstalledAddOnInstance] = js.native
    def update(opts: InstalledAddOnInstanceUpdateOptions): js.Promise[InstalledAddOnInstance] = js.native
    def update(
      opts: InstalledAddOnInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnInstance, Any]
    ): js.Promise[InstalledAddOnInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn", "InstalledAddOnInstance")
  @js.native
  open class InstalledAddOnInstance protected () extends SerializableClass {
    /**
      * Initialize the InstalledAddOnContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID of the InstalledAddOn resource to fetch
      */
    def this(
      version: typings.twilio.libRestPreviewMarketplaceMod.^,
      payload: InstalledAddOnPayload,
      sid: String
    ) = this()
    
    /* private */ var _proxy: InstalledAddOnContext = js.native
    
    var accountSid: String = js.native
    
    var configuration: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var description: String = js.native
    
    /**
      * Access the extensions
      */
    def extensions(): InstalledAddOnExtensionListInstance = js.native
    
    /**
      * fetch a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InstalledAddOnInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[InstalledAddOnInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    /**
      * remove a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[InstalledAddOnInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[InstalledAddOnInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[InstalledAddOnInstance] = js.native
    def update(opts: InstalledAddOnInstanceUpdateOptions): js.Promise[InstalledAddOnInstance] = js.native
    def update(
      opts: InstalledAddOnInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[InstalledAddOnInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the InstalledAddOnList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def InstalledAddOnList(version: typings.twilio.libRestPreviewMarketplaceMod.^): InstalledAddOnListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("InstalledAddOnList")(version.asInstanceOf[js.Any]).asInstanceOf[InstalledAddOnListInstance]
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn", "InstalledAddOnPage")
  @js.native
  open class InstalledAddOnPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewMarketplaceMod.^, 
          InstalledAddOnPayload, 
          InstalledAddOnResource, 
          InstalledAddOnInstance
        ] {
    /**
      * Initialize the InstalledAddOnPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.libRestPreviewMarketplaceMod.^,
      response: typings.twilio.libHttpResponseMod.^[String],
      solution: InstalledAddOnSolution
    ) = this()
    
    /**
      * Build an instance of InstalledAddOnInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: InstalledAddOnPayload): InstalledAddOnInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property configuration - The JSON object representing the configuration
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait InstalledAddOnInstanceUpdateOptions extends StObject {
    
    var configuration: js.UndefOr[js.Object] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object InstalledAddOnInstanceUpdateOptions {
    
    inline def apply(): InstalledAddOnInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstalledAddOnInstanceUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnInstanceUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setConfiguration(value: js.Object): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  @js.native
  trait InstalledAddOnListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): InstalledAddOnContext = js.native
    
    /**
      * create a InstalledAddOnInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: InstalledAddOnListInstanceCreateOptions): js.Promise[InstalledAddOnInstance] = js.native
    def create(
      opts: InstalledAddOnListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ InstalledAddOnInstance, Any]
    ): js.Promise[InstalledAddOnInstance] = js.native
    
    /**
      * Streams InstalledAddOnInstance records from the API.
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
          /* item */ InstalledAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ InstalledAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: InstalledAddOnListInstanceEachOptions): Unit = js.native
    def each(
      opts: InstalledAddOnListInstanceEachOptions,
      callback: js.Function2[
          /* item */ InstalledAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a installed_add_on
      *
      * @param sid - The SID of the InstalledAddOn resource to fetch
      */
    def get(sid: String): InstalledAddOnContext = js.native
    
    /**
      * Retrieve a single target page of InstalledAddOnInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[InstalledAddOnPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnPage, Any]): js.Promise[InstalledAddOnPage] = js.native
    def getPage(targetUrl: String): js.Promise[InstalledAddOnPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnPage, Any]
    ): js.Promise[InstalledAddOnPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnPage, Any]
    ): js.Promise[InstalledAddOnPage] = js.native
    
    /**
      * Lists InstalledAddOnInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[InstalledAddOnInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InstalledAddOnInstance], Any]
    ): js.Promise[js.Array[InstalledAddOnInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InstalledAddOnInstance], Any]
    ): js.Promise[js.Array[InstalledAddOnInstance]] = js.native
    def list(opts: InstalledAddOnListInstanceOptions): js.Promise[js.Array[InstalledAddOnInstance]] = js.native
    def list(
      opts: InstalledAddOnListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InstalledAddOnInstance], Any]
    ): js.Promise[js.Array[InstalledAddOnInstance]] = js.native
    
    /**
      * Retrieve a single page of InstalledAddOnInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[InstalledAddOnPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnPage, Any]): js.Promise[InstalledAddOnPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnPage, Any]
    ): js.Promise[InstalledAddOnPage] = js.native
    def page(opts: InstalledAddOnListInstancePageOptions): js.Promise[InstalledAddOnPage] = js.native
    def page(
      opts: InstalledAddOnListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnPage, Any]
    ): js.Promise[InstalledAddOnPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property acceptTermsOfService - Whether the Terms of Service were accepted
    * @property availableAddOnSid - The SID of the AvaliableAddOn to install
    * @property configuration - The JSON object representing the configuration
    * @property uniqueName - An application-defined string that uniquely identifies the resource
    */
  trait InstalledAddOnListInstanceCreateOptions extends StObject {
    
    var acceptTermsOfService: Boolean
    
    var availableAddOnSid: String
    
    var configuration: js.UndefOr[js.Object] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object InstalledAddOnListInstanceCreateOptions {
    
    inline def apply(acceptTermsOfService: Boolean, availableAddOnSid: String): InstalledAddOnListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(acceptTermsOfService = acceptTermsOfService.asInstanceOf[js.Any], availableAddOnSid = availableAddOnSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnListInstanceCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnListInstanceCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setAcceptTermsOfService(value: Boolean): Self = StObject.set(x, "acceptTermsOfService", value.asInstanceOf[js.Any])
      
      inline def setAvailableAddOnSid(value: String): Self = StObject.set(x, "availableAddOnSid", value.asInstanceOf[js.Any])
      
      inline def setConfiguration(value: js.Object): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
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
    */
  trait InstalledAddOnListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ InstalledAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InstalledAddOnListInstanceEachOptions {
    
    inline def apply(): InstalledAddOnListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstalledAddOnListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ InstalledAddOnInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait InstalledAddOnListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InstalledAddOnListInstanceOptions {
    
    inline def apply(): InstalledAddOnListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstalledAddOnListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnListInstanceOptions] (val x: Self) extends AnyVal {
      
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
  trait InstalledAddOnListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object InstalledAddOnListInstancePageOptions {
    
    inline def apply(): InstalledAddOnListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstalledAddOnListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait InstalledAddOnPayload
    extends StObject
       with InstalledAddOnResource
       with TwilioResponsePayload
  object InstalledAddOnPayload {
    
    inline def apply(
      account_sid: String,
      configuration: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): InstalledAddOnPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnPayload]
    }
  }
  
  trait InstalledAddOnResource extends StObject {
    
    var account_sid: String
    
    var configuration: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var description: String
    
    var friendly_name: String
    
    var links: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object InstalledAddOnResource {
    
    inline def apply(
      account_sid: String,
      configuration: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      friendly_name: String,
      links: String,
      sid: String,
      unique_name: String,
      url: String
    ): InstalledAddOnResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setConfiguration(value: js.Object): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstalledAddOnSolution extends StObject
}
