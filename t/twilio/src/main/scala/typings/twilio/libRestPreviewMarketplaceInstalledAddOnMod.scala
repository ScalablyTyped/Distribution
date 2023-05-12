package typings.twilio

import typings.std.Record
import typings.twilio.anon.Configuration
import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libRestPreviewMarketplaceInstalledAddOnInstalledAddOnExtensionMod.InstalledAddOnExtensionContext
import typings.twilio.libRestPreviewMarketplaceInstalledAddOnInstalledAddOnExtensionMod.InstalledAddOnExtensionListInstance
import typings.twilio.libRestPreviewMarketplaceMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMarketplaceInstalledAddOnMod {
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn", "InstalledAddOnContextImpl")
  @js.native
  open class InstalledAddOnContextImpl protected ()
    extends StObject
       with InstalledAddOnContext {
    def this(_version: default, sid: String) = this()
    
    /* protected */ var _extensions: js.UndefOr[InstalledAddOnExtensionListInstance] = js.native
    
    /* protected */ var _solution: InstalledAddOnContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def extensions: InstalledAddOnExtensionListInstance = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[InstalledAddOnInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[InstalledAddOnInstance], Any]
    ): js.Promise[InstalledAddOnInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[InstalledAddOnInstance], Any]
    ): js.Promise[InstalledAddOnInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn", "InstalledAddOnInstance")
  @js.native
  open class InstalledAddOnInstance protected () extends StObject {
    def this(_version: default, payload: InstalledAddOnResource) = this()
    def this(_version: default, payload: InstalledAddOnResource, sid: String) = this()
    
    /* protected */ var _context: js.UndefOr[InstalledAddOnContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: InstalledAddOnContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The SID of the [Account](https://www.twilio.com/docs/iam/api/account) that created the InstalledAddOn resource.
      */
    var accountSid: String = js.native
    
    /**
      * The JSON object that represents the current configuration of installed Add-on.
      */
    var configuration: Any = js.native
    
    /**
      * The date and time in GMT when the resource was created specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
      */
    var dateCreated: js.Date = js.native
    
    /**
      * The date and time in GMT when the resource was last updated specified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
      */
    var dateUpdated: js.Date = js.native
    
    /**
      * A short description of the Add-on\'s functionality.
      */
    var description: String = js.native
    
    /**
      * Access the extensions.
      */
    def extensions(): InstalledAddOnExtensionListInstance = js.native
    
    /**
      * Fetch a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed InstalledAddOnInstance
      */
    def fetch(): js.Promise[InstalledAddOnInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[InstalledAddOnInstance] = js.native
    
    /**
      * The string that you assigned to describe the resource.
      */
    var friendlyName: String = js.native
    
    /**
      * The URLs of related resources.
      */
    var links: Record[String, String] = js.native
    
    /**
      * Remove a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * The unique string that we created to identify the InstalledAddOn resource. This Sid can also be found in the Console on that specific Add-ons page as the \'Available Add-on Sid\'.
      */
    var sid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): Configuration = js.native
    
    /**
      * An application-defined string that uniquely identifies the resource.
      */
    var uniqueName: String = js.native
    
    /**
      * Update a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed InstalledAddOnInstance
      */
    def update(): js.Promise[InstalledAddOnInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[InstalledAddOnInstance] = js.native
    /**
      * Update a InstalledAddOnInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed InstalledAddOnInstance
      */
    def update(params: InstalledAddOnContextUpdateOptions): js.Promise[InstalledAddOnInstance] = js.native
    def update(
      params: InstalledAddOnContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[InstalledAddOnInstance] = js.native
    
    /**
      * The absolute URL of the resource.
      */
    var url: String = js.native
  }
  
  @js.native
  trait InstalledAddOnListInstance extends StObject {
    
    def apply(sid: String): InstalledAddOnContext = js.native
    
    var _solution: InstalledAddOnSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    /**
      * Create a InstalledAddOnInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed InstalledAddOnInstance
      */
    def create(params: InstalledAddOnListInstanceCreateOptions): js.Promise[InstalledAddOnInstance] = js.native
    def create(
      params: InstalledAddOnListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[InstalledAddOnInstance], Any]
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
      * @param { InstalledAddOnListInstanceEachOptions } [params] - Options for request
      * @param { function } [callback] - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ InstalledAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(params: InstalledAddOnListInstanceEachOptions): Unit = js.native
    def each(
      params: InstalledAddOnListInstanceEachOptions,
      callback: js.Function2[
          /* item */ InstalledAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def get(sid: String): InstalledAddOnContext = js.native
    
    /**
      * Retrieve a single target page of InstalledAddOnInstance records from the API.
      *
      * The request is executed immediately.
      *
      * @param { string } [targetUrl] - API-generated URL for the requested results page
      * @param { function } [callback] - Callback to handle list of records
      */
    def getPage(targetUrl: String): js.Promise[InstalledAddOnPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnPage, Any]
    ): js.Promise[InstalledAddOnPage] = js.native
    
    /**
      * Lists InstalledAddOnInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param { InstalledAddOnListInstanceOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[InstalledAddOnInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[InstalledAddOnInstance], Any]
    ): js.Promise[js.Array[InstalledAddOnInstance]] = js.native
    def list(params: InstalledAddOnListInstanceOptions): js.Promise[js.Array[InstalledAddOnInstance]] = js.native
    def list(
      params: InstalledAddOnListInstanceOptions,
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
      * @param { InstalledAddOnListInstancePageOptions } [params] - Options for request
      * @param { function } [callback] - Callback to handle list of records
      */
    def page(): js.Promise[InstalledAddOnPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnPage, Any]): js.Promise[InstalledAddOnPage] = js.native
    def page(params: InstalledAddOnListInstancePageOptions): js.Promise[InstalledAddOnPage] = js.native
    def page(
      params: InstalledAddOnListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnPage, Any]
    ): js.Promise[InstalledAddOnPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object InstalledAddOnListInstance {
    
    @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn", "InstalledAddOnListInstance")
    @js.native
    def apply(version: default): InstalledAddOnListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn", "InstalledAddOnPage")
  @js.native
  open class InstalledAddOnPage protected ()
    extends typings.twilio.libBasePageMod.default[default, InstalledAddOnPayload, InstalledAddOnResource, InstalledAddOnInstance] {
    /**
      * Initialize the InstalledAddOnPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: default,
      response: typings.twilio.libHttpResponseMod.default[String],
      solution: InstalledAddOnSolution
    ) = this()
    
    /**
      * Build an instance of InstalledAddOnInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: InstalledAddOnResource): InstalledAddOnInstance = js.native
  }
  
  @js.native
  trait InstalledAddOnContext extends StObject {
    
    def extensions(sid: String): InstalledAddOnExtensionContext = js.native
    @JSName("extensions")
    var extensions_Original: InstalledAddOnExtensionListInstance = js.native
    
    /**
      * Fetch a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed InstalledAddOnInstance
      */
    def fetch(): js.Promise[InstalledAddOnInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[InstalledAddOnInstance], Any]
    ): js.Promise[InstalledAddOnInstance] = js.native
    
    /**
      * Remove a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed boolean
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[Boolean], Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a InstalledAddOnInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed InstalledAddOnInstance
      */
    def update(): js.Promise[InstalledAddOnInstance] = js.native
    def update(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[InstalledAddOnInstance], Any]
    ): js.Promise[InstalledAddOnInstance] = js.native
    /**
      * Update a InstalledAddOnInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed InstalledAddOnInstance
      */
    def update(params: InstalledAddOnContextUpdateOptions): js.Promise[InstalledAddOnInstance] = js.native
    def update(
      params: InstalledAddOnContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[InstalledAddOnInstance], Any]
    ): js.Promise[InstalledAddOnInstance] = js.native
  }
  
  trait InstalledAddOnContextSolution extends StObject {
    
    var sid: String
  }
  object InstalledAddOnContextSolution {
    
    inline def apply(sid: String): InstalledAddOnContextSolution = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnContextSolution] (val x: Self) extends AnyVal {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstalledAddOnContextUpdateOptions extends StObject {
    
    /** Valid JSON object that conform to the configuration schema exposed by the associated AvailableAddOn resource. This is only required by Add-ons that need to be configured */
    var configuration: js.UndefOr[Any] = js.undefined
    
    /** An application-defined string that uniquely identifies the resource. This value must be unique within the Account. */
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object InstalledAddOnContextUpdateOptions {
    
    inline def apply(): InstalledAddOnContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstalledAddOnContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setConfiguration(value: Any): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait InstalledAddOnListInstanceCreateOptions extends StObject {
    
    /** Whether the Terms of Service were accepted. */
    var acceptTermsOfService: Boolean
    
    /** The SID of the AvaliableAddOn to install. */
    var availableAddOnSid: String
    
    /** The JSON object that represents the configuration of the new Add-on being installed. */
    var configuration: js.UndefOr[Any] = js.undefined
    
    /** An application-defined string that uniquely identifies the resource. This value must be unique within the Account. */
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
      
      inline def setConfiguration(value: Any): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait InstalledAddOnListInstanceEachOptions extends StObject {
    
    /** Function to process each record. If this and a positional callback are passed, this one will be used */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ InstalledAddOnInstance, 
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
  
  trait InstalledAddOnListInstanceOptions extends StObject {
    
    /** Upper limit for the number of records to return. list() guarantees never to return more than limit. Default is no limit */
    var limit: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
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
  
  trait InstalledAddOnListInstancePageOptions extends StObject {
    
    /** Page Number, this value is simply for client state */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** How many resources to return in each list page. The default is 50, and the maximum is 1000. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** PageToken provided by the API */
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
       with TwilioResponsePayload {
    
    var installed_add_ons: js.Array[InstalledAddOnResource]
  }
  object InstalledAddOnPayload {
    
    inline def apply(
      first_page_uri: String,
      installed_add_ons: js.Array[InstalledAddOnResource],
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): InstalledAddOnPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], installed_add_ons = installed_add_ons.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnPayload] (val x: Self) extends AnyVal {
      
      inline def setInstalled_add_ons(value: js.Array[InstalledAddOnResource]): Self = StObject.set(x, "installed_add_ons", value.asInstanceOf[js.Any])
      
      inline def setInstalled_add_onsVarargs(value: InstalledAddOnResource*): Self = StObject.set(x, "installed_add_ons", js.Array(value*))
    }
  }
  
  trait InstalledAddOnResource extends StObject {
    
    var account_sid: String
    
    var configuration: Any
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var description: String
    
    var friendly_name: String
    
    var links: Record[String, String]
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object InstalledAddOnResource {
    
    inline def apply(
      account_sid: String,
      configuration: Any,
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      friendly_name: String,
      links: Record[String, String],
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
      
      inline def setConfiguration(value: Any): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstalledAddOnSolution extends StObject
}
