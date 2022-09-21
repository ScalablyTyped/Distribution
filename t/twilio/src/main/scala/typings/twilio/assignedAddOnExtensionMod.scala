package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assignedAddOnExtensionMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/incomingPhoneNumber/assignedAddOn/assignedAddOnExtension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/incomingPhoneNumber/assignedAddOn/assignedAddOnExtension", "AssignedAddOnExtensionContext")
  @js.native
  open class AssignedAddOnExtensionContext protected () extends StObject {
    /**
      * Initialize the AssignedAddOnExtensionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param resourceSid - The SID of the Phone Number to which the Add-on is assigned
      * @param assignedAddOnSid - The SID that uniquely identifies the assigned Add-on installation
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      accountSid: String,
      resourceSid: String,
      assignedAddOnSid: String,
      sid: String
    ) = this()
    
    /**
      * fetch a AssignedAddOnExtensionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssignedAddOnExtensionInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnExtensionInstance, Any]
    ): js.Promise[AssignedAddOnExtensionInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/incomingPhoneNumber/assignedAddOn/assignedAddOnExtension", "AssignedAddOnExtensionInstance")
  @js.native
  open class AssignedAddOnExtensionInstance protected () extends SerializableClass {
    /**
      * Initialize the AssignedAddOnExtensionContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param resourceSid - The SID of the Phone Number to which the Add-on is assigned
      * @param assignedAddOnSid - The SID that uniquely identifies the assigned Add-on installation
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: AssignedAddOnExtensionPayload,
      accountSid: String,
      resourceSid: String,
      assignedAddOnSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: AssignedAddOnExtensionContext = js.native
    
    var accountSid: String = js.native
    
    var assignedAddOnSid: String = js.native
    
    var enabled: Boolean = js.native
    
    /**
      * fetch a AssignedAddOnExtensionInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssignedAddOnExtensionInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssignedAddOnExtensionInstance] = js.native
    
    var friendlyName: String = js.native
    
    var productName: String = js.native
    
    var resourceSid: String = js.native
    
    var sid: String = js.native
    
    var uniqueName: String = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the AssignedAddOnExtensionList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param resourceSid - The SID of the Phone Number to which the Add-on is assigned
    * @param assignedAddOnSid - The SID that uniquely identifies the assigned Add-on installation
    */
  inline def AssignedAddOnExtensionList(
    version: typings.twilio.v2010Mod.^,
    accountSid: String,
    resourceSid: String,
    assignedAddOnSid: String
  ): AssignedAddOnExtensionListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AssignedAddOnExtensionList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], resourceSid.asInstanceOf[js.Any], assignedAddOnSid.asInstanceOf[js.Any])).asInstanceOf[AssignedAddOnExtensionListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/incomingPhoneNumber/assignedAddOn/assignedAddOnExtension", "AssignedAddOnExtensionPage")
  @js.native
  open class AssignedAddOnExtensionPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          AssignedAddOnExtensionPayload, 
          AssignedAddOnExtensionResource, 
          AssignedAddOnExtensionInstance
        ] {
    /**
      * Initialize the AssignedAddOnExtensionPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AssignedAddOnExtensionSolution
    ) = this()
    
    /**
      * Build an instance of AssignedAddOnExtensionInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AssignedAddOnExtensionPayload): AssignedAddOnExtensionInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AssignedAddOnExtensionListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AssignedAddOnExtensionContext = js.native
    
    /**
      * Streams AssignedAddOnExtensionInstance records from the API.
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
          /* item */ AssignedAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AssignedAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AssignedAddOnExtensionListInstanceEachOptions): Unit = js.native
    def each(
      opts: AssignedAddOnExtensionListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AssignedAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a assigned_add_on_extension
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): AssignedAddOnExtensionContext = js.native
    
    /**
      * Retrieve a single target page of AssignedAddOnExtensionInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AssignedAddOnExtensionPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnExtensionPage, Any]): js.Promise[AssignedAddOnExtensionPage] = js.native
    def getPage(targetUrl: String): js.Promise[AssignedAddOnExtensionPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnExtensionPage, Any]
    ): js.Promise[AssignedAddOnExtensionPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnExtensionPage, Any]
    ): js.Promise[AssignedAddOnExtensionPage] = js.native
    
    /**
      * Lists AssignedAddOnExtensionInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AssignedAddOnExtensionInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AssignedAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[js.Array[AssignedAddOnExtensionInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AssignedAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[js.Array[AssignedAddOnExtensionInstance]] = js.native
    def list(opts: AssignedAddOnExtensionListInstanceOptions): js.Promise[js.Array[AssignedAddOnExtensionInstance]] = js.native
    def list(
      opts: AssignedAddOnExtensionListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[AssignedAddOnExtensionInstance], 
          Any
        ]
    ): js.Promise[js.Array[AssignedAddOnExtensionInstance]] = js.native
    
    /**
      * Retrieve a single page of AssignedAddOnExtensionInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AssignedAddOnExtensionPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnExtensionPage, Any]): js.Promise[AssignedAddOnExtensionPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnExtensionPage, Any]
    ): js.Promise[AssignedAddOnExtensionPage] = js.native
    def page(opts: AssignedAddOnExtensionListInstancePageOptions): js.Promise[AssignedAddOnExtensionPage] = js.native
    def page(
      opts: AssignedAddOnExtensionListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnExtensionPage, Any]
    ): js.Promise[AssignedAddOnExtensionPage] = js.native
    
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
  trait AssignedAddOnExtensionListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AssignedAddOnExtensionInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AssignedAddOnExtensionListInstanceEachOptions {
    
    inline def apply(): AssignedAddOnExtensionListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignedAddOnExtensionListInstanceEachOptions]
    }
    
    extension [Self <: AssignedAddOnExtensionListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AssignedAddOnExtensionInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AssignedAddOnExtensionListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AssignedAddOnExtensionListInstanceOptions {
    
    inline def apply(): AssignedAddOnExtensionListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignedAddOnExtensionListInstanceOptions]
    }
    
    extension [Self <: AssignedAddOnExtensionListInstanceOptions](x: Self) {
      
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
  trait AssignedAddOnExtensionListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AssignedAddOnExtensionListInstancePageOptions {
    
    inline def apply(): AssignedAddOnExtensionListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignedAddOnExtensionListInstancePageOptions]
    }
    
    extension [Self <: AssignedAddOnExtensionListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait AssignedAddOnExtensionPayload
    extends StObject
       with AssignedAddOnExtensionResource {
    
    // DEPRECTATED: end: any;
    var first_page_uri: String
    
    var meta: js.UndefOr[Key] = js.undefined
    
    // DEPRECTATED: last_page_uri: string;
    var next_page_uri: String
    
    // DEPRECTATED: num_pages: number;
    var page: Double
    
    var page_size: Double
    
    var previous_page_uri: String
  }
  object AssignedAddOnExtensionPayload {
    
    inline def apply(
      account_sid: String,
      assigned_add_on_sid: String,
      enabled: Boolean,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      product_name: String,
      resource_sid: String,
      sid: String,
      unique_name: String,
      uri: String
    ): AssignedAddOnExtensionPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assigned_add_on_sid = assigned_add_on_sid.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any], resource_sid = resource_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssignedAddOnExtensionPayload]
    }
    
    extension [Self <: AssignedAddOnExtensionPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssignedAddOnExtensionResource extends StObject {
    
    var account_sid: String
    
    var assigned_add_on_sid: String
    
    var enabled: Boolean
    
    var friendly_name: String
    
    var product_name: String
    
    var resource_sid: String
    
    var sid: String
    
    var unique_name: String
    
    var uri: String
  }
  object AssignedAddOnExtensionResource {
    
    inline def apply(
      account_sid: String,
      assigned_add_on_sid: String,
      enabled: Boolean,
      friendly_name: String,
      product_name: String,
      resource_sid: String,
      sid: String,
      unique_name: String,
      uri: String
    ): AssignedAddOnExtensionResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assigned_add_on_sid = assigned_add_on_sid.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], product_name = product_name.asInstanceOf[js.Any], resource_sid = resource_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssignedAddOnExtensionResource]
    }
    
    extension [Self <: AssignedAddOnExtensionResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssigned_add_on_sid(value: String): Self = StObject.set(x, "assigned_add_on_sid", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setProduct_name(value: String): Self = StObject.set(x, "product_name", value.asInstanceOf[js.Any])
      
      inline def setResource_sid(value: String): Self = StObject.set(x, "resource_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssignedAddOnExtensionSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var assignedAddOnSid: js.UndefOr[String] = js.undefined
    
    var resourceSid: js.UndefOr[String] = js.undefined
  }
  object AssignedAddOnExtensionSolution {
    
    inline def apply(): AssignedAddOnExtensionSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignedAddOnExtensionSolution]
    }
    
    extension [Self <: AssignedAddOnExtensionSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setAssignedAddOnSid(value: String): Self = StObject.set(x, "assignedAddOnSid", value.asInstanceOf[js.Any])
      
      inline def setAssignedAddOnSidUndefined: Self = StObject.set(x, "assignedAddOnSid", js.undefined)
      
      inline def setResourceSid(value: String): Self = StObject.set(x, "resourceSid", value.asInstanceOf[js.Any])
      
      inline def setResourceSidUndefined: Self = StObject.set(x, "resourceSid", js.undefined)
    }
  }
}
