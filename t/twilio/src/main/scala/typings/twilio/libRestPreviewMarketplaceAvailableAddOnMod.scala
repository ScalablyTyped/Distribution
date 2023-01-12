package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import typings.twilio.libRestPreviewMarketplaceAvailableAddOnAvailableAddOnExtensionMod.AvailableAddOnExtensionContext
import typings.twilio.libRestPreviewMarketplaceAvailableAddOnAvailableAddOnExtensionMod.AvailableAddOnExtensionListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMarketplaceAvailableAddOnMod {
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn", "AvailableAddOnContext")
  @js.native
  open class AvailableAddOnContext protected () extends StObject {
    /**
      * Initialize the AvailableAddOnContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param sid - The SID of the AvailableAddOn resource to fetch
      */
    def this(version: typings.twilio.libRestPreviewMarketplaceMod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def extensions(sid: String): AvailableAddOnExtensionContext = js.native
    @JSName("extensions")
    var extensions_Original: AvailableAddOnExtensionListInstance = js.native
    
    /**
      * fetch a AvailableAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AvailableAddOnInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnInstance, Any]): js.Promise[AvailableAddOnInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn", "AvailableAddOnInstance")
  @js.native
  open class AvailableAddOnInstance protected () extends SerializableClass {
    /**
      * Initialize the AvailableAddOnContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The SID of the AvailableAddOn resource to fetch
      */
    def this(
      version: typings.twilio.libRestPreviewMarketplaceMod.^,
      payload: AvailableAddOnPayload,
      sid: String
    ) = this()
    
    /* private */ var _proxy: AvailableAddOnContext = js.native
    
    var configurationSchema: Any = js.native
    
    var description: String = js.native
    
    /**
      * Access the extensions
      */
    def extensions(): AvailableAddOnExtensionListInstance = js.native
    
    /**
      * fetch a AvailableAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AvailableAddOnInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AvailableAddOnInstance] = js.native
    
    var friendlyName: String = js.native
    
    var links: String = js.native
    
    var pricingType: String = js.native
    
    var sid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AvailableAddOnList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    */
  inline def AvailableAddOnList(version: typings.twilio.libRestPreviewMarketplaceMod.^): AvailableAddOnListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("AvailableAddOnList")(version.asInstanceOf[js.Any]).asInstanceOf[AvailableAddOnListInstance]
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn", "AvailableAddOnPage")
  @js.native
  open class AvailableAddOnPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewMarketplaceMod.^, 
          AvailableAddOnPayload, 
          AvailableAddOnResource, 
          AvailableAddOnInstance
        ] {
    /**
      * Initialize the AvailableAddOnPage
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
      solution: AvailableAddOnSolution
    ) = this()
    
    /**
      * Build an instance of AvailableAddOnInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AvailableAddOnPayload): AvailableAddOnInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AvailableAddOnListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AvailableAddOnContext = js.native
    
    /**
      * Streams AvailableAddOnInstance records from the API.
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
          /* item */ AvailableAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AvailableAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AvailableAddOnListInstanceEachOptions): Unit = js.native
    def each(
      opts: AvailableAddOnListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AvailableAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a available_add_on
      *
      * @param sid - The SID of the AvailableAddOn resource to fetch
      */
    def get(sid: String): AvailableAddOnContext = js.native
    
    /**
      * Retrieve a single target page of AvailableAddOnInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AvailableAddOnPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnPage, Any]): js.Promise[AvailableAddOnPage] = js.native
    def getPage(targetUrl: String): js.Promise[AvailableAddOnPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnPage, Any]
    ): js.Promise[AvailableAddOnPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnPage, Any]
    ): js.Promise[AvailableAddOnPage] = js.native
    
    /**
      * Lists AvailableAddOnInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AvailableAddOnInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AvailableAddOnInstance], Any]
    ): js.Promise[js.Array[AvailableAddOnInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AvailableAddOnInstance], Any]
    ): js.Promise[js.Array[AvailableAddOnInstance]] = js.native
    def list(opts: AvailableAddOnListInstanceOptions): js.Promise[js.Array[AvailableAddOnInstance]] = js.native
    def list(
      opts: AvailableAddOnListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AvailableAddOnInstance], Any]
    ): js.Promise[js.Array[AvailableAddOnInstance]] = js.native
    
    /**
      * Retrieve a single page of AvailableAddOnInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AvailableAddOnPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnPage, Any]): js.Promise[AvailableAddOnPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnPage, Any]
    ): js.Promise[AvailableAddOnPage] = js.native
    def page(opts: AvailableAddOnListInstancePageOptions): js.Promise[AvailableAddOnPage] = js.native
    def page(
      opts: AvailableAddOnListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnPage, Any]
    ): js.Promise[AvailableAddOnPage] = js.native
    
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
  trait AvailableAddOnListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AvailableAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AvailableAddOnListInstanceEachOptions {
    
    inline def apply(): AvailableAddOnListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailableAddOnListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ AvailableAddOnInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AvailableAddOnListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AvailableAddOnListInstanceOptions {
    
    inline def apply(): AvailableAddOnListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailableAddOnListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnListInstanceOptions] (val x: Self) extends AnyVal {
      
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
  trait AvailableAddOnListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AvailableAddOnListInstancePageOptions {
    
    inline def apply(): AvailableAddOnListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailableAddOnListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait AvailableAddOnPayload
    extends StObject
       with AvailableAddOnResource
       with TwilioResponsePayload
  object AvailableAddOnPayload {
    
    inline def apply(
      configuration_schema: js.Object,
      description: String,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      pricing_type: String,
      sid: String,
      uri: String,
      url: String
    ): AvailableAddOnPayload = {
      val __obj = js.Dynamic.literal(configuration_schema = configuration_schema.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableAddOnPayload]
    }
  }
  
  trait AvailableAddOnResource extends StObject {
    
    var configuration_schema: js.Object
    
    var description: String
    
    var friendly_name: String
    
    var links: String
    
    var pricing_type: String
    
    var sid: String
    
    var url: String
  }
  object AvailableAddOnResource {
    
    inline def apply(
      configuration_schema: js.Object,
      description: String,
      friendly_name: String,
      links: String,
      pricing_type: String,
      sid: String,
      url: String
    ): AvailableAddOnResource = {
      val __obj = js.Dynamic.literal(configuration_schema = configuration_schema.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableAddOnResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnResource] (val x: Self) extends AnyVal {
      
      inline def setConfiguration_schema(value: js.Object): Self = StObject.set(x, "configuration_schema", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setPricing_type(value: String): Self = StObject.set(x, "pricing_type", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvailableAddOnSolution extends StObject
}
