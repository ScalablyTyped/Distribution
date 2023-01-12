package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMarketplaceInstalledAddOnInstalledAddOnExtensionMod {
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn/installedAddOnExtension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn/installedAddOnExtension", "InstalledAddOnExtensionContext")
  @js.native
  open class InstalledAddOnExtensionContext protected () extends StObject {
    /**
      * Initialize the InstalledAddOnExtensionContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param installedAddOnSid - The SID of the InstalledAddOn resource with the extension to fetch
      * @param sid - The SID of the InstalledAddOn Extension resource to fetch
      */
    def this(version: typings.twilio.libRestPreviewMarketplaceMod.^, installedAddOnSid: String, sid: String) = this()
    
    /**
      * fetch a InstalledAddOnExtensionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InstalledAddOnExtensionInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnExtensionInstance, Any]
    ): js.Promise[InstalledAddOnExtensionInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a InstalledAddOnExtensionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: InstalledAddOnExtensionInstanceUpdateOptions): js.Promise[InstalledAddOnExtensionInstance] = js.native
    def update(
      opts: InstalledAddOnExtensionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnExtensionInstance, Any]
    ): js.Promise[InstalledAddOnExtensionInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn/installedAddOnExtension", "InstalledAddOnExtensionInstance")
  @js.native
  open class InstalledAddOnExtensionInstance protected () extends SerializableClass {
    /**
      * Initialize the InstalledAddOnExtensionContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param installedAddOnSid - The SID of the InstalledAddOn resource to which this extension applies
      * @param sid - The SID of the InstalledAddOn Extension resource to fetch
      */
    def this(
      version: typings.twilio.libRestPreviewMarketplaceMod.^,
      payload: InstalledAddOnExtensionPayload,
      installedAddOnSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: InstalledAddOnExtensionContext = js.native
    
    var enabled: Boolean = js.native
    
    /**
      * fetch a InstalledAddOnExtensionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[InstalledAddOnExtensionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[InstalledAddOnExtensionInstance] = js.native
    
    var friendlyName: String = js.native
    
    var installedAddOnSid: String = js.native
    
    var productName: String = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    /**
      * update a InstalledAddOnExtensionInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def update(opts: InstalledAddOnExtensionInstanceUpdateOptions): js.Promise[InstalledAddOnExtensionInstance] = js.native
    def update(
      opts: InstalledAddOnExtensionInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[InstalledAddOnExtensionInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the InstalledAddOnExtensionList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param installedAddOnSid - The SID of the InstalledAddOn resource to which this extension applies
    */
  inline def InstalledAddOnExtensionList(version: typings.twilio.libRestPreviewMarketplaceMod.^, installedAddOnSid: String): InstalledAddOnExtensionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("InstalledAddOnExtensionList")(version.asInstanceOf[js.Any], installedAddOnSid.asInstanceOf[js.Any])).asInstanceOf[InstalledAddOnExtensionListInstance]
  
  @JSImport("twilio/lib/rest/preview/marketplace/installedAddOn/installedAddOnExtension", "InstalledAddOnExtensionPage")
  @js.native
  open class InstalledAddOnExtensionPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewMarketplaceMod.^, 
          InstalledAddOnExtensionPayload, 
          InstalledAddOnExtensionResource, 
          InstalledAddOnExtensionInstance
        ] {
    /**
      * Initialize the InstalledAddOnExtensionPage
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
      solution: InstalledAddOnExtensionSolution
    ) = this()
    
    /**
      * Build an instance of InstalledAddOnExtensionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: InstalledAddOnExtensionPayload): InstalledAddOnExtensionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property enabled - Whether the Extension should be invoked
    */
  trait InstalledAddOnExtensionInstanceUpdateOptions extends StObject {
    
    var enabled: Boolean
  }
  object InstalledAddOnExtensionInstanceUpdateOptions {
    
    inline def apply(enabled: Boolean): InstalledAddOnExtensionInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnExtensionInstanceUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnExtensionInstanceUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InstalledAddOnExtensionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): InstalledAddOnExtensionContext = js.native
    
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ InstalledAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ InstalledAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: InstalledAddOnExtensionListInstanceEachOptions): Unit = js.native
    def each(
      opts: InstalledAddOnExtensionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ InstalledAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a installed_add_on_extension
      *
      * @param sid - The SID of the InstalledAddOn Extension resource to fetch
      */
    def get(sid: String): InstalledAddOnExtensionContext = js.native
    
    /**
      * Retrieve a single target page of InstalledAddOnExtensionInstance records from
      * the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[InstalledAddOnExtensionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnExtensionPage, Any]): js.Promise[InstalledAddOnExtensionPage] = js.native
    def getPage(targetUrl: String): js.Promise[InstalledAddOnExtensionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnExtensionPage, Any]
    ): js.Promise[InstalledAddOnExtensionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnExtensionPage, Any]
    ): js.Promise[InstalledAddOnExtensionPage] = js.native
    
    /**
      * Lists InstalledAddOnExtensionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[InstalledAddOnExtensionInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[InstalledAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[js.Array[InstalledAddOnExtensionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[InstalledAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[js.Array[InstalledAddOnExtensionInstance]] = js.native
    def list(opts: InstalledAddOnExtensionListInstanceOptions): js.Promise[js.Array[InstalledAddOnExtensionInstance]] = js.native
    def list(
      opts: InstalledAddOnExtensionListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[InstalledAddOnExtensionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnExtensionPage, Any]): js.Promise[InstalledAddOnExtensionPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnExtensionPage, Any]
    ): js.Promise[InstalledAddOnExtensionPage] = js.native
    def page(opts: InstalledAddOnExtensionListInstancePageOptions): js.Promise[InstalledAddOnExtensionPage] = js.native
    def page(
      opts: InstalledAddOnExtensionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ InstalledAddOnExtensionPage, Any]
    ): js.Promise[InstalledAddOnExtensionPage] = js.native
    
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
  trait InstalledAddOnExtensionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ InstalledAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  trait InstalledAddOnExtensionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait InstalledAddOnExtensionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
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
       with InstalledAddOnExtensionResource
       with TwilioResponsePayload
  object InstalledAddOnExtensionPayload {
    
    inline def apply(
      enabled: Boolean,
      first_page_uri: String,
      friendly_name: String,
      installed_add_on_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      product_name: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): InstalledAddOnExtensionPayload = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], installed_add_on_sid = installed_add_on_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstalledAddOnExtensionPayload]
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
    
    var installedAddOnSid: js.UndefOr[String] = js.undefined
  }
  object InstalledAddOnExtensionSolution {
    
    inline def apply(): InstalledAddOnExtensionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstalledAddOnExtensionSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstalledAddOnExtensionSolution] (val x: Self) extends AnyVal {
      
      inline def setInstalledAddOnSid(value: String): Self = StObject.set(x, "installedAddOnSid", value.asInstanceOf[js.Any])
      
      inline def setInstalledAddOnSidUndefined: Self = StObject.set(x, "installedAddOnSid", js.undefined)
    }
  }
}
