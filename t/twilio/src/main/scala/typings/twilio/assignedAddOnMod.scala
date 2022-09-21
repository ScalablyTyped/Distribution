package typings.twilio

import typings.twilio.anon.Key
import typings.twilio.assignedAddOnExtensionMod.AssignedAddOnExtensionContext
import typings.twilio.assignedAddOnExtensionMod.AssignedAddOnExtensionListInstance
import typings.twilio.interfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assignedAddOnMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/incomingPhoneNumber/assignedAddOn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account/incomingPhoneNumber/assignedAddOn", "AssignedAddOnContext")
  @js.native
  open class AssignedAddOnContext protected () extends StObject {
    /**
      * Initialize the AssignedAddOnContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param accountSid - The SID of the Account that created the resource to fetch
      * @param resourceSid - The SID of the Phone Number that installed this Add-on
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.v2010Mod.^, accountSid: String, resourceSid: String, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def extensions(sid: String): AssignedAddOnExtensionContext = js.native
    @JSName("extensions")
    var extensions_Original: AssignedAddOnExtensionListInstance = js.native
    
    /**
      * fetch a AssignedAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssignedAddOnInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnInstance, Any]): js.Promise[AssignedAddOnInstance] = js.native
    
    /**
      * remove a AssignedAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account/incomingPhoneNumber/assignedAddOn", "AssignedAddOnInstance")
  @js.native
  open class AssignedAddOnInstance protected () extends SerializableClass {
    /**
      * Initialize the AssignedAddOnContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param accountSid - The SID of the Account that created the resource
      * @param resourceSid - The SID of the Phone Number that installed this Add-on
      * @param sid - The unique string that identifies the resource
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      payload: AssignedAddOnPayload,
      accountSid: String,
      resourceSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: AssignedAddOnContext = js.native
    
    var accountSid: String = js.native
    
    var configuration: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var description: String = js.native
    
    /**
      * Access the extensions
      */
    def extensions(): AssignedAddOnExtensionListInstance = js.native
    
    /**
      * fetch a AssignedAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AssignedAddOnInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AssignedAddOnInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a AssignedAddOnInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var resourceSid: String = js.native
    
    var sid: String = js.native
    
    var subresourceUris: String = js.native
    
    var uniqueName: String = js.native
    
    var uri: String = js.native
  }
  
  /**
    * Initialize the AssignedAddOnList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param resourceSid - The SID of the Phone Number that installed this Add-on
    */
  inline def AssignedAddOnList(version: typings.twilio.v2010Mod.^, accountSid: String, resourceSid: String): AssignedAddOnListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AssignedAddOnList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], resourceSid.asInstanceOf[js.Any])).asInstanceOf[AssignedAddOnListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account/incomingPhoneNumber/assignedAddOn", "AssignedAddOnPage")
  @js.native
  open class AssignedAddOnPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.v2010Mod.^, 
          AssignedAddOnPayload, 
          AssignedAddOnResource, 
          AssignedAddOnInstance
        ] {
    /**
      * Initialize the AssignedAddOnPage
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
      solution: AssignedAddOnSolution
    ) = this()
    
    /**
      * Build an instance of AssignedAddOnInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AssignedAddOnPayload): AssignedAddOnInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait AssignedAddOnListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AssignedAddOnContext = js.native
    
    /**
      * create a AssignedAddOnInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: AssignedAddOnListInstanceCreateOptions): js.Promise[AssignedAddOnInstance] = js.native
    def create(
      opts: AssignedAddOnListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ AssignedAddOnInstance, Any]
    ): js.Promise[AssignedAddOnInstance] = js.native
    
    /**
      * Streams AssignedAddOnInstance records from the API.
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
          /* item */ AssignedAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AssignedAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AssignedAddOnListInstanceEachOptions): Unit = js.native
    def each(
      opts: AssignedAddOnListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AssignedAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a assigned_add_on
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): AssignedAddOnContext = js.native
    
    /**
      * Retrieve a single target page of AssignedAddOnInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AssignedAddOnPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnPage, Any]): js.Promise[AssignedAddOnPage] = js.native
    def getPage(targetUrl: String): js.Promise[AssignedAddOnPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnPage, Any]
    ): js.Promise[AssignedAddOnPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnPage, Any]
    ): js.Promise[AssignedAddOnPage] = js.native
    
    /**
      * Lists AssignedAddOnInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AssignedAddOnInstance]] = js.native
    def list(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssignedAddOnInstance], Any]
    ): js.Promise[js.Array[AssignedAddOnInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssignedAddOnInstance], Any]
    ): js.Promise[js.Array[AssignedAddOnInstance]] = js.native
    def list(opts: AssignedAddOnListInstanceOptions): js.Promise[js.Array[AssignedAddOnInstance]] = js.native
    def list(
      opts: AssignedAddOnListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AssignedAddOnInstance], Any]
    ): js.Promise[js.Array[AssignedAddOnInstance]] = js.native
    
    /**
      * Retrieve a single page of AssignedAddOnInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AssignedAddOnPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnPage, Any]): js.Promise[AssignedAddOnPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnPage, Any]
    ): js.Promise[AssignedAddOnPage] = js.native
    def page(opts: AssignedAddOnListInstancePageOptions): js.Promise[AssignedAddOnPage] = js.native
    def page(
      opts: AssignedAddOnListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AssignedAddOnPage, Any]
    ): js.Promise[AssignedAddOnPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property installedAddOnSid - The SID that identifies the Add-on installation
    */
  trait AssignedAddOnListInstanceCreateOptions extends StObject {
    
    var installedAddOnSid: String
  }
  object AssignedAddOnListInstanceCreateOptions {
    
    inline def apply(installedAddOnSid: String): AssignedAddOnListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(installedAddOnSid = installedAddOnSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssignedAddOnListInstanceCreateOptions]
    }
    
    extension [Self <: AssignedAddOnListInstanceCreateOptions](x: Self) {
      
      inline def setInstalledAddOnSid(value: String): Self = StObject.set(x, "installedAddOnSid", value.asInstanceOf[js.Any])
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
  trait AssignedAddOnListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AssignedAddOnInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AssignedAddOnListInstanceEachOptions {
    
    inline def apply(): AssignedAddOnListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignedAddOnListInstanceEachOptions]
    }
    
    extension [Self <: AssignedAddOnListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AssignedAddOnInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait AssignedAddOnListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object AssignedAddOnListInstanceOptions {
    
    inline def apply(): AssignedAddOnListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignedAddOnListInstanceOptions]
    }
    
    extension [Self <: AssignedAddOnListInstanceOptions](x: Self) {
      
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
  trait AssignedAddOnListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object AssignedAddOnListInstancePageOptions {
    
    inline def apply(): AssignedAddOnListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignedAddOnListInstancePageOptions]
    }
    
    extension [Self <: AssignedAddOnListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait AssignedAddOnPayload
    extends StObject
       with AssignedAddOnResource {
    
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
  object AssignedAddOnPayload {
    
    inline def apply(
      account_sid: String,
      configuration: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      resource_sid: String,
      sid: String,
      subresource_uris: String,
      unique_name: String,
      uri: String
    ): AssignedAddOnPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], resource_sid = resource_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssignedAddOnPayload]
    }
    
    extension [Self <: AssignedAddOnPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssignedAddOnResource extends StObject {
    
    var account_sid: String
    
    var configuration: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var description: String
    
    var friendly_name: String
    
    var resource_sid: String
    
    var sid: String
    
    var subresource_uris: String
    
    var unique_name: String
    
    var uri: String
  }
  object AssignedAddOnResource {
    
    inline def apply(
      account_sid: String,
      configuration: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      description: String,
      friendly_name: String,
      resource_sid: String,
      sid: String,
      subresource_uris: String,
      unique_name: String,
      uri: String
    ): AssignedAddOnResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], resource_sid = resource_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssignedAddOnResource]
    }
    
    extension [Self <: AssignedAddOnResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setConfiguration(value: js.Object): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setResource_sid(value: String): Self = StObject.set(x, "resource_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSubresource_uris(value: String): Self = StObject.set(x, "subresource_uris", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssignedAddOnSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var resourceSid: js.UndefOr[String] = js.undefined
  }
  object AssignedAddOnSolution {
    
    inline def apply(): AssignedAddOnSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssignedAddOnSolution]
    }
    
    extension [Self <: AssignedAddOnSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setResourceSid(value: String): Self = StObject.set(x, "resourceSid", value.asInstanceOf[js.Any])
      
      inline def setResourceSidUndefined: Self = StObject.set(x, "resourceSid", js.undefined)
    }
  }
}
