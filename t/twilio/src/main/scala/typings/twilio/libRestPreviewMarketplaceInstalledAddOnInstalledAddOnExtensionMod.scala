package typings.twilio

import typings.twilio.anon.Enabled
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewMarketplaceMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMarketplaceInstalledAddOnInstalledAddOnExtensionMod {
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn/installedAddOnExtension", "InstalledAddOnExtensionContextImpl")
  @js.native
  open class InstalledAddOnExtensionContextImpl protected ()
    extends StObject
       with InstalledAddOnExtensionContext {
    def this(_version: default, installedAddOnSid: String, sid: String) = this()
    
    /* protected */ var _solution: InstalledAddOnExtensionContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn/installedAddOnExtension", "InstalledAddOnExtensionInstance")
  @js.native
  open class InstalledAddOnExtensionInstance protected () extends StObject {
    def this(_version: default, payload: InstalledAddOnExtensionResource, installedAddOnSid: String) = this()
    def this(
      _version: default,
      payload: InstalledAddOnExtensionResource,
      installedAddOnSid: String,
      sid: String
    ) = this()
    
    /* protected */ var _context: js.UndefOr[InstalledAddOnExtensionContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: InstalledAddOnExtensionContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * Whether the Extension will be invoked.
      */
    var enabled: Boolean = js.native
    
    /**
      * Fetch a InstalledAddOnExtensionInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed InstalledAddOnExtensionInstance
      */
    def fetch(): js.Promise[InstalledAddOnExtensionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[InstalledAddOnExtensionInstance] = js.native
    
    /**
      * The string that you assigned to describe the resource.
      */
    var friendlyName: String = js.native
    
    /**
      * The SID of the InstalledAddOn resource to which this extension applies.
      */
    var installedAddOnSid: String = js.native
    
    /**
      * The name of the Product this Extension is used within.
      */
    var productName: String = js.native
    
    /**
      * The unique string that we created to identify the InstalledAddOn Extension resource.
      */
    var sid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): Enabled = js.native
    
    /**
      * An application-defined string that uniquely identifies the resource.
      */
    var uniqueName: String = js.native
    
    /**
      * Update a InstalledAddOnExtensionInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed InstalledAddOnExtensionInstance
      */
    def update(params: InstalledAddOnExtensionContextUpdateOptions): js.Promise[InstalledAddOnExtensionInstance] = js.native
    def update(
      params: InstalledAddOnExtensionContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[InstalledAddOnExtensionInstance] = js.native
    
    /**
      * The absolute URL of the resource.
      */
    var url: String = js.native
  }
  
  @js.native
  trait InstalledAddOnExtensionListInstance extends StObject {
    
    def apply(sid: String): InstalledAddOnExtensionContext = js.native
    
    var _solution: InstalledAddOnExtensionSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Streams InstalledAddOnExtensionInstance records from the API.
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
      * @param { InstalledAddOnExtensionListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ InstalledAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: InstalledAddOnExtensionListInstanceEachOptions): Unit = js.native
    def each(
      params: InstalledAddOnExtensionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ InstalledAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): InstalledAddOnExtensionContext = js.native
    
    /**
      * Retrieve a single target page of InstalledAddOnExtensionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[InstalledAddOnExtensionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnExtensionPage, Any]
    ): js.Promise[InstalledAddOnExtensionPage] = js.native
    
    /**
      * Lists InstalledAddOnExtensionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { InstalledAddOnExtensionListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[InstalledAddOnExtensionInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[InstalledAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[js.Array[InstalledAddOnExtensionInstance]] = js.native
    def list(params: InstalledAddOnExtensionListInstanceOptions): js.Promise[js.Array[InstalledAddOnExtensionInstance]] = js.native
    def list(
      params: InstalledAddOnExtensionListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[InstalledAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[js.Array[InstalledAddOnExtensionInstance]] = js.native
    
    /**
      * Retrieve a single page of InstalledAddOnExtensionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { InstalledAddOnExtensionListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[InstalledAddOnExtensionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnExtensionPage, Any]): js.Promise[InstalledAddOnExtensionPage] = js.native
    def page(params: InstalledAddOnExtensionListInstancePageOptions): js.Promise[InstalledAddOnExtensionPage] = js.native
    def page(
      params: InstalledAddOnExtensionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnExtensionPage, Any]
    ): js.Promise[InstalledAddOnExtensionPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object InstalledAddOnExtensionListInstance {
    
    @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn/installedAddOnExtension", "InstalledAddOnExtensionListInstance")
    @js.native
    def apply(version: default, installedAddOnSid: String): InstalledAddOnExtensionListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn/installedAddOnExtension", "InstalledAddOnExtensionPage")
  @js.native
  open class InstalledAddOnExtensionPage protected ()
    extends typings.twilio.libBasePageMod.default[
          default, 
          InstalledAddOnExtensionPayload, 
          InstalledAddOnExtensionResource, 
          InstalledAddOnExtensionInstance
        ] {
    /**
      * Initialize the InstalledAddOnExtensionPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: InstalledAddOnExtensionSolution
    ) = this()
    
    /**
      * Build an instance of InstalledAddOnExtensionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: InstalledAddOnExtensionResource): InstalledAddOnExtensionInstance = js.native
  }
  
  @js.native
  trait InstalledAddOnExtensionContext extends StObject {
    
    /**
      * Fetch a InstalledAddOnExtensionInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed InstalledAddOnExtensionInstance
      */
    def fetch(): js.Promise[InstalledAddOnExtensionInstance] = js.native
    def fetch(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[InstalledAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[InstalledAddOnExtensionInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a InstalledAddOnExtensionInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed InstalledAddOnExtensionInstance
      */
    def update(params: InstalledAddOnExtensionContextUpdateOptions): js.Promise[InstalledAddOnExtensionInstance] = js.native
    def update(
      params: InstalledAddOnExtensionContextUpdateOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* item */ js.UndefOr[InstalledAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[InstalledAddOnExtensionInstance] = js.native
  }
  
  trait InstalledAddOnExtensionContextSolution extends StObject {
    
    var installedAddOnSid: String
    
    var sid: String
  }
  object InstalledAddOnExtensionContextSolution {
    
    inline def apply(installedAddOnSid: String, sid: String): InstalledAddOnExtensionContextSolution = {
      val __obj = js.Dynamic.literal(installedAddOnSid = installedAddOnSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnExtensionContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnExtensionContextSolution] (val x: Self) extends AnyVal {
      
      inline def setInstalledAddOnSid(value: String): Self = StObject.set(x, "installedAddOnSid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstalledAddOnExtensionContextUpdateOptions extends StObject {
    
    /** Whether the Extension should be invoked. */
    var enabled: Boolean
  }
  object InstalledAddOnExtensionContextUpdateOptions {
    
    inline def apply(enabled: Boolean): InstalledAddOnExtensionContextUpdateOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnExtensionContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnExtensionContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstalledAddOnExtensionListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ InstalledAddOnExtensionInstance, 
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
  object InstalledAddOnExtensionListInstanceEachOptions {
    
    inline def apply(): InstalledAddOnExtensionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstalledAddOnExtensionListInstanceEachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnExtensionListInstanceEachOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(
        value: (/* item */ InstalledAddOnExtensionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  
  trait InstalledAddOnExtensionListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object InstalledAddOnExtensionListInstanceOptions {
    
    inline def apply(): InstalledAddOnExtensionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstalledAddOnExtensionListInstanceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnExtensionListInstanceOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait InstalledAddOnExtensionListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object InstalledAddOnExtensionListInstancePageOptions {
    
    inline def apply(): InstalledAddOnExtensionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstalledAddOnExtensionListInstancePageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnExtensionListInstancePageOptions] (val x: Self) extends AnyVal {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait InstalledAddOnExtensionPayload
    extends StObject
       with TwilioResponsePayload {
    
    var extensions: js.Array[InstalledAddOnExtensionResource]
  }
  object InstalledAddOnExtensionPayload {
    
    inline def apply(
      extensions: js.Array[InstalledAddOnExtensionResource],
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): InstalledAddOnExtensionPayload = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnExtensionPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnExtensionPayload] (val x: Self) extends AnyVal {
      
      inline def setExtensions(value: js.Array[InstalledAddOnExtensionResource]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: InstalledAddOnExtensionResource*): Self = StObject.set(x, "extensions", js.Array(value*))
    }
  }
  
  trait InstalledAddOnExtensionResource extends StObject {
    
    var enabled: Boolean
    
    var friendly_name: String
    
    var installed_add_on_sid: String
    
    var product_name: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object InstalledAddOnExtensionResource {
    
    inline def apply(
      enabled: Boolean,
      friendly_name: String,
      installed_add_on_sid: String,
      product_name: String,
      sid: String,
      unique_name: String,
      url: String
    ): InstalledAddOnExtensionResource = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], installed_add_on_sid = installed_add_on_sid.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnExtensionResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnExtensionResource] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setInstalled_add_on_sid(value: String): Self = StObject.set(x, "installed_add_on_sid", value.asInstanceOf[js.Any])
      
      inline def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstalledAddOnExtensionSolution extends StObject {
    
    var installedAddOnSid: String
  }
  object InstalledAddOnExtensionSolution {
    
    inline def apply(installedAddOnSid: String): InstalledAddOnExtensionSolution = {
      val __obj = js.Dynamic.literal(installedAddOnSid = installedAddOnSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnExtensionSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnExtensionSolution] (val x: Self) extends AnyVal {
      
      inline def setInstalledAddOnSid(value: String): Self = StObject.set(x, "installedAddOnSid", value.asInstanceOf[js.Any])
    }
  }
}
