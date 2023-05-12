package typings.twilio

import typings.twilio.anon.AvailableAddOnSid
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewMarketplaceMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMarketplaceAvailableAddOnAvailableAddOnExtensionMod {
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn/availableAddOnExtension", "AvailableAddOnExtensionContextImpl")
  @js.native
  open class AvailableAddOnExtensionContextImpl protected ()
    extends StObject
       with AvailableAddOnExtensionContext {
    def this(_version: default, availableAddOnSid: String, sid: String) = this()
    
    /* protected */ var _solution: AvailableAddOnExtensionContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn/availableAddOnExtension", "AvailableAddOnExtensionInstance")
  @js.native
  open class AvailableAddOnExtensionInstance protected () extends StObject {
    def this(_version: default, payload: AvailableAddOnExtensionResource, availableAddOnSid: String) = this()
    def this(
      _version: default,
      payload: AvailableAddOnExtensionResource,
      availableAddOnSid: String,
      sid: String
    ) = this()
    
    /* protected */ var _context: js.UndefOr[AvailableAddOnExtensionContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: AvailableAddOnExtensionContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The SID of the AvailableAddOn resource to which this extension applies.
      */
    var availableAddOnSid: String = js.native
    
    /**
      * Fetch a AvailableAddOnExtensionInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AvailableAddOnExtensionInstance
      */
    def fetch(): js.Promise[AvailableAddOnExtensionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[AvailableAddOnExtensionInstance] = js.native
    
    /**
      * The string that you assigned to describe the resource.
      */
    var friendlyName: String = js.native
    
    /**
      * The name of the Product this Extension is used within.
      */
    var productName: String = js.native
    
    /**
      * The unique string that we created to identify the AvailableAddOnExtension resource.
      */
    var sid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): AvailableAddOnSid = js.native
    
    /**
      * An application-defined string that uniquely identifies the resource.
      */
    var uniqueName: String = js.native
    
    /**
      * The absolute URL of the resource.
      */
    var url: String = js.native
  }
  
  @js.native
  trait AvailableAddOnExtensionListInstance extends StObject {
    
    def apply(sid: String): AvailableAddOnExtensionContext = js.native
    
    var _solution: AvailableAddOnExtensionSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Streams AvailableAddOnExtensionInstance records from the API.
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
      * @param { AvailableAddOnExtensionListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ AvailableAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: AvailableAddOnExtensionListInstanceEachOptions): Unit = js.native
    def each(
      params: AvailableAddOnExtensionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AvailableAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): AvailableAddOnExtensionContext = js.native
    
    /**
      * Retrieve a single target page of AvailableAddOnExtensionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[AvailableAddOnExtensionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnExtensionPage, Any]
    ): js.Promise[AvailableAddOnExtensionPage] = js.native
    
    /**
      * Lists AvailableAddOnExtensionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { AvailableAddOnExtensionListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AvailableAddOnExtensionInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AvailableAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[js.Array[AvailableAddOnExtensionInstance]] = js.native
    def list(params: AvailableAddOnExtensionListInstanceOptions): js.Promise[js.Array[AvailableAddOnExtensionInstance]] = js.native
    def list(
      params: AvailableAddOnExtensionListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AvailableAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[js.Array[AvailableAddOnExtensionInstance]] = js.native
    
    /**
      * Retrieve a single page of AvailableAddOnExtensionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { AvailableAddOnExtensionListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[AvailableAddOnExtensionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnExtensionPage, Any]): js.Promise[AvailableAddOnExtensionPage] = js.native
    def page(params: AvailableAddOnExtensionListInstancePageOptions): js.Promise[AvailableAddOnExtensionPage] = js.native
    def page(
      params: AvailableAddOnExtensionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnExtensionPage, Any]
    ): js.Promise[AvailableAddOnExtensionPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object AvailableAddOnExtensionListInstance {
    
    @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn/availableAddOnExtension", "AvailableAddOnExtensionListInstance")
    @js.native
    def apply(version: default, availableAddOnSid: String): AvailableAddOnExtensionListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn/availableAddOnExtension", "AvailableAddOnExtensionPage")
  @js.native
  open class AvailableAddOnExtensionPage protected ()
    extends typings.twilio.libBasePageMod.default[
          default, 
          AvailableAddOnExtensionPayload, 
          AvailableAddOnExtensionResource, 
          AvailableAddOnExtensionInstance
        ] {
    /**
      * Initialize the AvailableAddOnExtensionPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: AvailableAddOnExtensionSolution
    ) = this()
    
    /**
      * Build an instance of AvailableAddOnExtensionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AvailableAddOnExtensionResource): AvailableAddOnExtensionInstance = js.native
  }
  
  @js.native
  trait AvailableAddOnExtensionContext extends StObject {
    
    /**
      * Fetch a AvailableAddOnExtensionInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed AvailableAddOnExtensionInstance
      */
    def fetch(): js.Promise[AvailableAddOnExtensionInstance] = js.native
    def fetch(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[AvailableAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[AvailableAddOnExtensionInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait AvailableAddOnExtensionContextSolution extends StObject {
    
    var availableAddOnSid: String
    
    var sid: String
  }
  object AvailableAddOnExtensionContextSolution {
    
    inline def apply(availableAddOnSid: String, sid: String): AvailableAddOnExtensionContextSolution = {
      val __obj = js.Dynamic.literal(availableAddOnSid = availableAddOnSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableAddOnExtensionContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnExtensionContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAvailableAddOnSid(value: String): Self = StObject.set(x, "availableAddOnSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvailableAddOnExtensionListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AvailableAddOnExtensionInstance, 
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
  object AvailableAddOnExtensionListInstanceEachOptions {
    
    inline def apply(): AvailableAddOnExtensionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailableAddOnExtensionListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnExtensionListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ AvailableAddOnExtensionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait AvailableAddOnExtensionListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AvailableAddOnExtensionListInstanceOptions {
    
    inline def apply(): AvailableAddOnExtensionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailableAddOnExtensionListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnExtensionListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait AvailableAddOnExtensionListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AvailableAddOnExtensionListInstancePageOptions {
    
    inline def apply(): AvailableAddOnExtensionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailableAddOnExtensionListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnExtensionListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait AvailableAddOnExtensionPayload
    extends StObject
       with TwilioResponsePayload {
    
    var extensions: js.Array[AvailableAddOnExtensionResource]
  }
  object AvailableAddOnExtensionPayload {
    
    inline def apply(
      extensions: js.Array[AvailableAddOnExtensionResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): AvailableAddOnExtensionPayload = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableAddOnExtensionPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnExtensionPayload] (val x: Self) extends AnyVal {
      
      inline def setExtensions(value: js.Array[AvailableAddOnExtensionResource]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: AvailableAddOnExtensionResource*): Self = StObject.set(x, "extensions", js.Array(value*))
    }
  }
  
  trait AvailableAddOnExtensionResource extends StObject {
    
    var available_add_on_sid: String
    
    var friendly_name: String
    
    var product_name: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object AvailableAddOnExtensionResource {
    
    inline def apply(
      available_add_on_sid: String,
      friendly_name: String,
      product_name: String,
      sid: String,
      unique_name: String,
      url: String
    ): AvailableAddOnExtensionResource = {
      val __obj = js.Dynamic.literal(available_add_on_sid = available_add_on_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableAddOnExtensionResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnExtensionResource] (val x: Self) extends AnyVal {
      
      inline def setAvailable_add_on_sid(value: String): Self = StObject.set(x, "available_add_on_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvailableAddOnExtensionSolution extends StObject {
    
    var availableAddOnSid: String
  }
  object AvailableAddOnExtensionSolution {
    
    inline def apply(availableAddOnSid: String): AvailableAddOnExtensionSolution = {
      val __obj = js.Dynamic.literal(availableAddOnSid = availableAddOnSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableAddOnExtensionSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnExtensionSolution] (val x: Self) extends AnyVal {
      
      inline def setAvailableAddOnSid(value: String): Self = StObject.set(x, "availableAddOnSid", value.asInstanceOf[js.Any])
    }
  }
}
