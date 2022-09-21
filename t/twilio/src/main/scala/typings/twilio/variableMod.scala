package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variableMod {
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/variable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/variable", "VariableContext")
  @js.native
  open class VariableContext protected () extends StObject {
    /**
      * Initialize the VariableContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the Variable resource from
      * @param environmentSid - The SID of the Environment with the Variable resource to fetch
      * @param sid - The SID of the Variable resource to fetch
      */
    def this(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, environmentSid: String, sid: String) = this()
    
    /**
      * fetch a VariableInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[VariableInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ VariableInstance, Any]): js.Promise[VariableInstance] = js.native
    
    /**
      * remove a VariableInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ VariableInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a VariableInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[VariableInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ VariableInstance, Any]): js.Promise[VariableInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ VariableInstance, Any]): js.Promise[VariableInstance] = js.native
    def update(opts: VariableInstanceUpdateOptions): js.Promise[VariableInstance] = js.native
    def update(
      opts: VariableInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VariableInstance, Any]
    ): js.Promise[VariableInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/variable", "VariableInstance")
  @js.native
  open class VariableInstance protected () extends SerializableClass {
    /**
      * Initialize the VariableContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the Variable resource is associated with
      * @param environmentSid - The SID of the Environment in which the Variable exists
      * @param sid - The SID of the Variable resource to fetch
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      payload: VariablePayload,
      serviceSid: String,
      environmentSid: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: VariableContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var environmentSid: String = js.native
    
    /**
      * fetch a VariableInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[VariableInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[VariableInstance] = js.native
    
    var key: String = js.native
    
    /**
      * remove a VariableInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    /**
      * update a VariableInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[VariableInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[VariableInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[VariableInstance] = js.native
    def update(opts: VariableInstanceUpdateOptions): js.Promise[VariableInstance] = js.native
    def update(
      opts: VariableInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[VariableInstance] = js.native
    
    var url: String = js.native
    
    var value: String = js.native
  }
  
  /**
    * Initialize the VariableList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the Variable resource is associated with
    * @param environmentSid - The SID of the Environment in which the Variable exists
    */
  inline def VariableList(version: typings.twilio.serverlessV1Mod.^, serviceSid: String, environmentSid: String): VariableListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("VariableList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], environmentSid.asInstanceOf[js.Any])).asInstanceOf[VariableListInstance]
  
  @JSImport("twilio/lib/rest/serverless/v1/service/environment/variable", "VariablePage")
  @js.native
  open class VariablePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.serverlessV1Mod.^, VariablePayload, VariableResource, VariableInstance] {
    /**
      * Initialize the VariablePage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.serverlessV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: VariableSolution
    ) = this()
    
    /**
      * Build an instance of VariableInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: VariablePayload): VariableInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property key - A string by which the Variable resource can be referenced
    * @property value - A string that contains the actual value of the Variable
    */
  trait VariableInstanceUpdateOptions extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object VariableInstanceUpdateOptions {
    
    inline def apply(): VariableInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VariableInstanceUpdateOptions]
    }
    
    extension [Self <: VariableInstanceUpdateOptions](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait VariableListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): VariableContext = js.native
    
    /**
      * create a VariableInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: VariableListInstanceCreateOptions): js.Promise[VariableInstance] = js.native
    def create(
      opts: VariableListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ VariableInstance, Any]
    ): js.Promise[VariableInstance] = js.native
    
    /**
      * Streams VariableInstance records from the API.
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
          /* item */ VariableInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ VariableInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: VariableListInstanceEachOptions): Unit = js.native
    def each(
      opts: VariableListInstanceEachOptions,
      callback: js.Function2[
          /* item */ VariableInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a variable
      *
      * @param sid - The SID of the Variable resource to fetch
      */
    def get(sid: String): VariableContext = js.native
    
    /**
      * Retrieve a single target page of VariableInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[VariablePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ VariablePage, Any]): js.Promise[VariablePage] = js.native
    def getPage(targetUrl: String): js.Promise[VariablePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VariablePage, Any]
    ): js.Promise[VariablePage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VariablePage, Any]
    ): js.Promise[VariablePage] = js.native
    
    /**
      * Lists VariableInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[VariableInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[VariableInstance], Any]): js.Promise[js.Array[VariableInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[VariableInstance], Any]
    ): js.Promise[js.Array[VariableInstance]] = js.native
    def list(opts: VariableListInstanceOptions): js.Promise[js.Array[VariableInstance]] = js.native
    def list(
      opts: VariableListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[VariableInstance], Any]
    ): js.Promise[js.Array[VariableInstance]] = js.native
    
    /**
      * Retrieve a single page of VariableInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[VariablePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ VariablePage, Any]): js.Promise[VariablePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ VariablePage, Any]): js.Promise[VariablePage] = js.native
    def page(opts: VariableListInstancePageOptions): js.Promise[VariablePage] = js.native
    def page(
      opts: VariableListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ VariablePage, Any]
    ): js.Promise[VariablePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property key - A string by which the Variable resource can be referenced
    * @property value - A string that contains the actual value of the Variable
    */
  trait VariableListInstanceCreateOptions extends StObject {
    
    var key: String
    
    var value: String
  }
  object VariableListInstanceCreateOptions {
    
    inline def apply(key: String, value: String): VariableListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariableListInstanceCreateOptions]
    }
    
    extension [Self <: VariableListInstanceCreateOptions](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
  trait VariableListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ VariableInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object VariableListInstanceEachOptions {
    
    inline def apply(): VariableListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VariableListInstanceEachOptions]
    }
    
    extension [Self <: VariableListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ VariableInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait VariableListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object VariableListInstanceOptions {
    
    inline def apply(): VariableListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VariableListInstanceOptions]
    }
    
    extension [Self <: VariableListInstanceOptions](x: Self) {
      
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
  trait VariableListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object VariableListInstancePageOptions {
    
    inline def apply(): VariableListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VariableListInstancePageOptions]
    }
    
    extension [Self <: VariableListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait VariablePayload
    extends StObject
       with VariableResource
       with TwilioResponsePayload
  object VariablePayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      environment_sid: String,
      first_page_uri: String,
      key: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      uri: String,
      url: String,
      value: String
    ): VariablePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], environment_sid = environment_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariablePayload]
    }
  }
  
  trait VariableResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var environment_sid: String
    
    var key: String
    
    var service_sid: String
    
    var sid: String
    
    var url: String
    
    var value: String
  }
  object VariableResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      environment_sid: String,
      key: String,
      service_sid: String,
      sid: String,
      url: String,
      value: String
    ): VariableResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], environment_sid = environment_sid.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariableResource]
    }
    
    extension [Self <: VariableResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEnvironment_sid(value: String): Self = StObject.set(x, "environment_sid", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait VariableSolution extends StObject {
    
    var environmentSid: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object VariableSolution {
    
    inline def apply(): VariableSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VariableSolution]
    }
    
    extension [Self <: VariableSolution](x: Self) {
      
      inline def setEnvironmentSid(value: String): Self = StObject.set(x, "environmentSid", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentSidUndefined: Self = StObject.set(x, "environmentSid", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
