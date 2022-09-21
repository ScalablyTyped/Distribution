package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ServiceBindingMod {
  
  @JSImport("twilio/lib/rest/notify/v1/service/binding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/notify/v1/service/binding", "BindingContext")
  @js.native
  open class BindingContext protected () extends StObject {
    /**
      * Initialize the BindingContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - The SID of the Service to fetch the resource from
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.notifyV1Mod.^, serviceSid: String, sid: String) = this()
    
    /**
      * fetch a BindingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BindingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ BindingInstance, Any]): js.Promise[BindingInstance] = js.native
    
    /**
      * remove a BindingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ BindingInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/notify/v1/service/binding", "BindingInstance")
  @js.native
  open class BindingInstance protected () extends SerializableClass {
    /**
      * Initialize the BindingContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - The SID of the Service that the resource is associated with
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.notifyV1Mod.^, payload: BindingPayload, serviceSid: String, sid: String) = this()
    
    /* private */ var _proxy: BindingContext = js.native
    
    var accountSid: String = js.native
    
    var address: String = js.native
    
    var bindingType: String = js.native
    
    var credentialSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var endpoint: String = js.native
    
    /**
      * fetch a BindingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[BindingInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[BindingInstance] = js.native
    
    var identity: String = js.native
    
    var links: String = js.native
    
    var notificationProtocolVersion: String = js.native
    
    /**
      * remove a BindingInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var tags: js.Array[String] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the BindingList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - The SID of the Service that the resource is associated with
    */
  inline def BindingList(version: typings.twilio.notifyV1Mod.^, serviceSid: String): BindingListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("BindingList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any])).asInstanceOf[BindingListInstance]
  
  @JSImport("twilio/lib/rest/notify/v1/service/binding", "BindingPage")
  @js.native
  open class BindingPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.notifyV1Mod.^, BindingPayload, BindingResource, BindingInstance] {
    /**
      * Initialize the BindingPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.notifyV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: BindingSolution
    ) = this()
    
    /**
      * Build an instance of BindingInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: BindingPayload): BindingInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.apn
    - typings.twilio.twilioStrings.gcm
    - typings.twilio.twilioStrings.sms
    - typings.twilio.twilioStrings.fcm
    - typings.twilio.twilioStrings.`facebook-messenger`
    - typings.twilio.twilioStrings.alexa
  */
  trait BindingBindingType extends StObject
  object BindingBindingType {
    
    inline def alexa: typings.twilio.twilioStrings.alexa = "alexa".asInstanceOf[typings.twilio.twilioStrings.alexa]
    
    inline def apn: typings.twilio.twilioStrings.apn = "apn".asInstanceOf[typings.twilio.twilioStrings.apn]
    
    inline def `facebook-messenger`: typings.twilio.twilioStrings.`facebook-messenger` = "facebook-messenger".asInstanceOf[typings.twilio.twilioStrings.`facebook-messenger`]
    
    inline def fcm: typings.twilio.twilioStrings.fcm = "fcm".asInstanceOf[typings.twilio.twilioStrings.fcm]
    
    inline def gcm: typings.twilio.twilioStrings.gcm = "gcm".asInstanceOf[typings.twilio.twilioStrings.gcm]
    
    inline def sms: typings.twilio.twilioStrings.sms = "sms".asInstanceOf[typings.twilio.twilioStrings.sms]
  }
  
  @js.native
  trait BindingListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): BindingContext = js.native
    
    /**
      * create a BindingInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: BindingListInstanceCreateOptions): js.Promise[BindingInstance] = js.native
    def create(
      opts: BindingListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ BindingInstance, Any]
    ): js.Promise[BindingInstance] = js.native
    
    /**
      * Streams BindingInstance records from the API.
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
          /* item */ BindingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ BindingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: BindingListInstanceEachOptions): Unit = js.native
    def each(
      opts: BindingListInstanceEachOptions,
      callback: js.Function2[
          /* item */ BindingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a binding
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): BindingContext = js.native
    
    /**
      * Retrieve a single target page of BindingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[BindingPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ BindingPage, Any]): js.Promise[BindingPage] = js.native
    def getPage(targetUrl: String): js.Promise[BindingPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BindingPage, Any]
    ): js.Promise[BindingPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BindingPage, Any]): js.Promise[BindingPage] = js.native
    
    /**
      * Lists BindingInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[BindingInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BindingInstance], Any]): js.Promise[js.Array[BindingInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BindingInstance], Any]
    ): js.Promise[js.Array[BindingInstance]] = js.native
    def list(opts: BindingListInstanceOptions): js.Promise[js.Array[BindingInstance]] = js.native
    def list(
      opts: BindingListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[BindingInstance], Any]
    ): js.Promise[js.Array[BindingInstance]] = js.native
    
    /**
      * Retrieve a single page of BindingInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[BindingPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ BindingPage, Any]): js.Promise[BindingPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ BindingPage, Any]): js.Promise[BindingPage] = js.native
    def page(opts: BindingListInstancePageOptions): js.Promise[BindingPage] = js.native
    def page(
      opts: BindingListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ BindingPage, Any]
    ): js.Promise[BindingPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property address - The channel-specific address
    * @property bindingType - The type of the Binding
    * @property credentialSid - The SID of the Credential resource to be used to send notifications to this Binding
    * @property endpoint - Deprecated
    * @property identity - The `identity` value that identifies the new resource's User
    * @property notificationProtocolVersion - The protocol version to use to send the notification
    * @property tag - A tag that can be used to select the Bindings to notify
    */
  trait BindingListInstanceCreateOptions extends StObject {
    
    var address: String
    
    var bindingType: BindingBindingType
    
    var credentialSid: js.UndefOr[String] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var identity: String
    
    var notificationProtocolVersion: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object BindingListInstanceCreateOptions {
    
    inline def apply(address: String, bindingType: BindingBindingType, identity: String): BindingListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bindingType = bindingType.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindingListInstanceCreateOptions]
    }
    
    extension [Self <: BindingListInstanceCreateOptions](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBindingType(value: BindingBindingType): Self = StObject.set(x, "bindingType", value.asInstanceOf[js.Any])
      
      inline def setCredentialSid(value: String): Self = StObject.set(x, "credentialSid", value.asInstanceOf[js.Any])
      
      inline def setCredentialSidUndefined: Self = StObject.set(x, "credentialSid", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setNotificationProtocolVersion(value: String): Self = StObject.set(x, "notificationProtocolVersion", value.asInstanceOf[js.Any])
      
      inline def setNotificationProtocolVersionUndefined: Self = StObject.set(x, "notificationProtocolVersion", js.undefined)
      
      inline def setTag(value: String | js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value*))
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property endDate - Only include usage that occurred on or before this date
    * @property identity - The `identity` value of the resources to read
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
    * @property startDate - Only include usage that has occurred on or after this date
    * @property tag - Only list Bindings that have all of the specified Tags
    */
  trait BindingListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ BindingInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var identity: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var tag: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object BindingListInstanceEachOptions {
    
    inline def apply(): BindingListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindingListInstanceEachOptions]
    }
    
    extension [Self <: BindingListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ BindingInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setIdentity(value: String | js.Array[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityVarargs(value: String*): Self = StObject.set(x, "identity", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTag(value: String | js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value*))
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property endDate - Only include usage that occurred on or before this date
    * @property identity - The `identity` value of the resources to read
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
    * @property startDate - Only include usage that has occurred on or after this date
    * @property tag - Only list Bindings that have all of the specified Tags
    */
  trait BindingListInstanceOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var identity: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var tag: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object BindingListInstanceOptions {
    
    inline def apply(): BindingListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindingListInstanceOptions]
    }
    
    extension [Self <: BindingListInstanceOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setIdentity(value: String | js.Array[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityVarargs(value: String*): Self = StObject.set(x, "identity", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTag(value: String | js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value*))
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property endDate - Only include usage that occurred on or before this date
    * @property identity - The `identity` value of the resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property startDate - Only include usage that has occurred on or after this date
    * @property tag - Only list Bindings that have all of the specified Tags
    */
  trait BindingListInstancePageOptions extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var identity: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[js.Date] = js.undefined
    
    var tag: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object BindingListInstancePageOptions {
    
    inline def apply(): BindingListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindingListInstancePageOptions]
    }
    
    extension [Self <: BindingListInstancePageOptions](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setIdentity(value: String | js.Array[String]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityVarargs(value: String*): Self = StObject.set(x, "identity", js.Array(value*))
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTag(value: String | js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value*))
    }
  }
  
  trait BindingPayload
    extends StObject
       with BindingResource
       with TwilioResponsePayload
  object BindingPayload {
    
    inline def apply(
      account_sid: String,
      address: String,
      binding_type: String,
      credential_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      endpoint: String,
      first_page_uri: String,
      identity: String,
      links: String,
      next_page_uri: String,
      notification_protocol_version: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      tags: js.Array[String],
      uri: String,
      url: String
    ): BindingPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], binding_type = binding_type.asInstanceOf[js.Any], credential_sid = credential_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], notification_protocol_version = notification_protocol_version.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindingPayload]
    }
  }
  
  trait BindingResource extends StObject {
    
    var account_sid: String
    
    var address: String
    
    var binding_type: String
    
    var credential_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var endpoint: String
    
    var identity: String
    
    var links: String
    
    var notification_protocol_version: String
    
    var service_sid: String
    
    var sid: String
    
    var tags: js.Array[String]
    
    var url: String
  }
  object BindingResource {
    
    inline def apply(
      account_sid: String,
      address: String,
      binding_type: String,
      credential_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      endpoint: String,
      identity: String,
      links: String,
      notification_protocol_version: String,
      service_sid: String,
      sid: String,
      tags: js.Array[String],
      url: String
    ): BindingResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], binding_type = binding_type.asInstanceOf[js.Any], credential_sid = credential_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], notification_protocol_version = notification_protocol_version.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindingResource]
    }
    
    extension [Self <: BindingResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBinding_type(value: String): Self = StObject.set(x, "binding_type", value.asInstanceOf[js.Any])
      
      inline def setCredential_sid(value: String): Self = StObject.set(x, "credential_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setNotification_protocol_version(value: String): Self = StObject.set(x, "notification_protocol_version", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait BindingSolution extends StObject {
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object BindingSolution {
    
    inline def apply(): BindingSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindingSolution]
    }
    
    extension [Self <: BindingSolution](x: Self) {
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
}
