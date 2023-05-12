package typings.twilio

import typings.std.Record
import typings.twilio.anon.ConfigurationSchema
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewMarketplaceAvailableAddOnAvailableAddOnExtensionMod.AvailableAddOnExtensionContext
import typings.twilio.libRestPreviewMarketplaceAvailableAddOnAvailableAddOnExtensionMod.AvailableAddOnExtensionListInstance
import typings.twilio.libRestPreviewMarketplaceMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMarketplaceAvailableAddOnMod {
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn", "AvailableAddOnContextImpl")
  @js.native
  open class AvailableAddOnContextImpl protected ()
    extends StObject
       with AvailableAddOnContext {
    def this(_version: default, sid: String) = this()
    
    /* protected */ var _extensions: js.UndefOr[AvailableAddOnExtensionListInstance] = js.native
    
    /* protected */ var _solution: AvailableAddOnContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def extensions: AvailableAddOnExtensionListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn", "AvailableAddOnInstance")
  @js.native
  open class AvailableAddOnInstance protected () extends StObject {
    def this(_version: default, payload: AvailableAddOnResource) = this()
    def this(_version: default, payload: AvailableAddOnResource, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[AvailableAddOnContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: AvailableAddOnContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The JSON object with the configuration that must be provided when installing a given Add-on.
      */
    var configurationSchema: Any = js.native
    
    /**
      * A short description of the Add-on\'s functionality.
      */
    var description: String = js.native
    
    /**
      * Access the extensions.
      */
    def extensions(): AvailableAddOnExtensionListInstance = js.native
    
    /**
      * Fetch a AvailableAddOnInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AvailableAddOnInstance
      */
    def fetch(): js.Promise[AvailableAddOnInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[AvailableAddOnInstance] = js.native
    
    /**
      * The string that you assigned to describe the resource.
      */
    var friendlyName: String = js.native
    
    /**
      * The URLs of related resources.
      */
    var links: Record[String, String] = js.native
    
    /**
      * How customers are charged for using this Add-on.
      */
    var pricingType: String = js.native
    
    /**
      * The unique string that we created to identify the AvailableAddOn resource.
      */
    var sid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): ConfigurationSchema = js.native
    
    /**
      * The absolute URL of the resource.
      */
    var url: String = js.native
  }
  
  @js.native
  trait AvailableAddOnListInstance extends StObject {
    
    def apply(sid: String): AvailableAddOnContext = js.native
    
    var _solution: AvailableAddOnSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
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
      * @param { AvailableAddOnListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ AvailableAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: AvailableAddOnListInstanceEachOptions): Unit = js.native
    def each(
      params: AvailableAddOnListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AvailableAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): AvailableAddOnContext = js.native
    
    /**
      * Retrieve a single target page of AvailableAddOnInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[AvailableAddOnPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnPage, Any]
    ): js.Promise[AvailableAddOnPage] = js.native
    
    /**
      * Lists AvailableAddOnInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { AvailableAddOnListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AvailableAddOnInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AvailableAddOnInstance], Any]
    ): js.Promise[js.Array[AvailableAddOnInstance]] = js.native
    def list(params: AvailableAddOnListInstanceOptions): js.Promise[js.Array[AvailableAddOnInstance]] = js.native
    def list(
      params: AvailableAddOnListInstanceOptions,
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
      * @param { AvailableAddOnListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[AvailableAddOnPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnPage, Any]): js.Promise[AvailableAddOnPage] = js.native
    def page(params: AvailableAddOnListInstancePageOptions): js.Promise[AvailableAddOnPage] = js.native
    def page(
      params: AvailableAddOnListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnPage, Any]
    ): js.Promise[AvailableAddOnPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object AvailableAddOnListInstance {
    
    @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn", "AvailableAddOnListInstance")
    @js.native
    def apply(version: default): AvailableAddOnListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn", "AvailableAddOnPage")
  @js.native
  open class AvailableAddOnPage protected ()
    extends typings.twilio.libBasePageMod.default[default, AvailableAddOnPayload, AvailableAddOnResource, AvailableAddOnInstance] {
    /**
      * Initialize the AvailableAddOnPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: AvailableAddOnSolution
    ) = this()
    
    /**
      * Build an instance of AvailableAddOnInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AvailableAddOnResource): AvailableAddOnInstance = js.native
  }
  
  @js.native
  trait AvailableAddOnContext extends StObject {
    
    def extensions(sid: String): AvailableAddOnExtensionContext = js.native
    @JSName("extensions")
    var extensions_Original: AvailableAddOnExtensionListInstance = js.native
    
    /**
      * Fetch a AvailableAddOnInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AvailableAddOnInstance
      */
    def fetch(): js.Promise[AvailableAddOnInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[AvailableAddOnInstance], Any]
    ): js.Promise[AvailableAddOnInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait AvailableAddOnContextSolution extends StObject {
    
    var sid: String
  }
  object AvailableAddOnContextSolution {
    
    inline def apply(sid: String): AvailableAddOnContextSolution = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableAddOnContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnContextSolution] (val x: Self) extends AnyVal {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvailableAddOnListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AvailableAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** Function to be called upon completion of streaming */
    var done: js.UndefOr[js.Function] = js.undefined
    
    /** Upper limit for the number of records to return. each() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
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
  
  trait AvailableAddOnListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
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
  
  trait AvailableAddOnListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
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
       with TwilioResponsePayload {
    
    var available_add_ons: js.Array[AvailableAddOnResource]
  }
  object AvailableAddOnPayload {
    
    inline def apply(
      available_add_ons: js.Array[AvailableAddOnResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): AvailableAddOnPayload = {
      val __obj = js.Dynamic.literal(available_add_ons = available_add_ons.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableAddOnPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnPayload] (val x: Self) extends AnyVal {
      
      inline def setAvailable_add_ons(value: js.Array[AvailableAddOnResource]): Self = StObject.set(x, "available_add_ons", value.asInstanceOf[js.Any])
      
      inline def setAvailable_add_onsVarargs(value: AvailableAddOnResource*): Self = StObject.set(x, "available_add_ons", js.Array(value*))
    }
  }
  
  trait AvailableAddOnResource extends StObject {
    
    var configuration_schema: Any
    
    var description: String
    
    var friendly_name: String
    
    var links: Record[String, String]
    
    var pricing_type: String
    
    var sid: String
    
    var url: String
  }
  object AvailableAddOnResource {
    
    inline def apply(
      configuration_schema: Any,
      description: String,
      friendly_name: String,
      links: Record[String, String],
      pricing_type: String,
      sid: String,
      url: String
    ): AvailableAddOnResource = {
      val __obj = js.Dynamic.literal(configuration_schema = configuration_schema.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableAddOnResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnResource] (val x: Self) extends AnyVal {
      
      inline def setConfiguration_schema(value: Any): Self = StObject.set(x, "configuration_schema", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setPricing_type(value: String): Self = StObject.set(x, "pricing_type", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvailableAddOnSolution extends StObject
}
