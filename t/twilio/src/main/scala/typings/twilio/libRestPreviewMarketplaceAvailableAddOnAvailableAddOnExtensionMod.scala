package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMarketplaceAvailableAddOnAvailableAddOnExtensionMod {
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn/availableAddOnExtension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn/availableAddOnExtension", "AvailableAddOnExtensionContext")
  @js.native
  open class AvailableAddOnExtensionContext protected () extends StObject {
    /**
      * Initialize the AvailableAddOnExtensionContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param availableAddOnSid - The SID of the AvailableAddOn resource with the extension to fetch
      * @param sid - The SID of the AvailableAddOn Extension resource to fetch
      */
    def this(version: typings.twilio.libRestPreviewMarketplaceMod.^, availableAddOnSid: String, sid: String) = this()
    
    /**
      * fetch a AvailableAddOnExtensionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AvailableAddOnExtensionInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnExtensionInstance, Any]
    ): js.Promise[AvailableAddOnExtensionInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn/availableAddOnExtension", "AvailableAddOnExtensionInstance")
  @js.native
  open class AvailableAddOnExtensionInstance protected () extends SerializableClass {
    /**
      * Initialize the AvailableAddOnExtensionContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param availableAddOnSid - The SID of the AvailableAddOn resource to which this extension applies
      * @param sid - The SID of the AvailableAddOn Extension resource to fetch
      */
    def this(
      version: typings.twilio.libRestPreviewMarketplaceMod.^,
      payload: AvailableAddOnExtensionPayload,
      availableAddOnSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: AvailableAddOnExtensionContext = js.native
    
    var availableAddOnSid: String = js.native
    
    /**
      * fetch a AvailableAddOnExtensionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AvailableAddOnExtensionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AvailableAddOnExtensionInstance] = js.native
    
    var friendlyName: String = js.native
    
    var productName: String = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the AvailableAddOnExtensionList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param availableAddOnSid - The SID of the AvailableAddOn resource to which this extension applies
    */
  inline def AvailableAddOnExtensionList(version: typings.twilio.libRestPreviewMarketplaceMod.^, availableAddOnSid: String): AvailableAddOnExtensionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AvailableAddOnExtensionList")(version.asInstanceOf[js.Any], availableAddOnSid.asInstanceOf[js.Any])).asInstanceOf[AvailableAddOnExtensionListInstance]
  
  @JSImport("twilio/lib/rest/preview/marketplace/availableAddOn/availableAddOnExtension", "AvailableAddOnExtensionPage")
  @js.native
  open class AvailableAddOnExtensionPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewMarketplaceMod.^, 
          AvailableAddOnExtensionPayload, 
          AvailableAddOnExtensionResource, 
          AvailableAddOnExtensionInstance
        ] {
    /**
      * Initialize the AvailableAddOnExtensionPage
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
      solution: AvailableAddOnExtensionSolution
    ) = this()
    
    /**
      * Build an instance of AvailableAddOnExtensionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AvailableAddOnExtensionPayload): AvailableAddOnExtensionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AvailableAddOnExtensionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AvailableAddOnExtensionContext = js.native
    
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
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ AvailableAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AvailableAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AvailableAddOnExtensionListInstanceEachOptions): Unit = js.native
    def each(
      opts: AvailableAddOnExtensionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AvailableAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a available_add_on_extension
      *
      * @param sid - The SID of the AvailableAddOn Extension resource to fetch
      */
    def get(sid: String): AvailableAddOnExtensionContext = js.native
    
    /**
      * Retrieve a single target page of AvailableAddOnExtensionInstance records from
      * the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AvailableAddOnExtensionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnExtensionPage, Any]): js.Promise[AvailableAddOnExtensionPage] = js.native
    def getPage(targetUrl: String): js.Promise[AvailableAddOnExtensionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnExtensionPage, Any]
    ): js.Promise[AvailableAddOnExtensionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnExtensionPage, Any]
    ): js.Promise[AvailableAddOnExtensionPage] = js.native
    
    /**
      * Lists AvailableAddOnExtensionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AvailableAddOnExtensionInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AvailableAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[js.Array[AvailableAddOnExtensionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AvailableAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[js.Array[AvailableAddOnExtensionInstance]] = js.native
    def list(opts: AvailableAddOnExtensionListInstanceOptions): js.Promise[js.Array[AvailableAddOnExtensionInstance]] = js.native
    def list(
      opts: AvailableAddOnExtensionListInstanceOptions,
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
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AvailableAddOnExtensionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnExtensionPage, Any]): js.Promise[AvailableAddOnExtensionPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnExtensionPage, Any]
    ): js.Promise[AvailableAddOnExtensionPage] = js.native
    def page(opts: AvailableAddOnExtensionListInstancePageOptions): js.Promise[AvailableAddOnExtensionPage] = js.native
    def page(
      opts: AvailableAddOnExtensionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AvailableAddOnExtensionPage, Any]
    ): js.Promise[AvailableAddOnExtensionPage] = js.native
    
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
  trait AvailableAddOnExtensionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AvailableAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  trait AvailableAddOnExtensionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
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
  
  /**
    * Options to pass to page
    *
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait AvailableAddOnExtensionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
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
       with AvailableAddOnExtensionResource
       with TwilioResponsePayload
  object AvailableAddOnExtensionPayload {
    
    inline def apply(
      available_add_on_sid: String,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      product_name: String,
      sid: String,
      unique_name: String,
      uri: String,
      url: String
    ): AvailableAddOnExtensionPayload = {
      val __obj = js.Dynamic.literal(available_add_on_sid = available_add_on_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableAddOnExtensionPayload]
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
    
    var availableAddOnSid: js.UndefOr[String] = js.undefined
  }
  object AvailableAddOnExtensionSolution {
    
    inline def apply(): AvailableAddOnExtensionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailableAddOnExtensionSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableAddOnExtensionSolution] (val x: Self) extends AnyVal {
      
      inline def setAvailableAddOnSid(value: String): Self = StObject.set(x, "availableAddOnSid", value.asInstanceOf[js.Any])
      
      inline def setAvailableAddOnSidUndefined: Self = StObject.set(x, "availableAddOnSid", js.undefined)
    }
  }
}
