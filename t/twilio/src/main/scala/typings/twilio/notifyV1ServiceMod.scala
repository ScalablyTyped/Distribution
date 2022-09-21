package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.serviceNotificationMod.NotificationListInstance
import typings.twilio.v1ServiceBindingMod.BindingContext
import typings.twilio.v1ServiceBindingMod.BindingListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notifyV1ServiceMod {
  
  @JSImport("twilio/lib/rest/notify/v1/service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/notify/v1/service", "ServiceContext")
  @js.native
  open class ServiceContext protected () extends StObject {
    /**
      * Initialize the ServiceContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.notifyV1Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def bindings(sid: String): BindingContext = js.native
    @JSName("bindings")
    var bindings_Original: BindingListInstance = js.native
    
    /**
      * fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    
    var notifications: NotificationListInstance = js.native
    
    /**
      * remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ServiceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: ServiceInstanceUpdateOptions): js.Promise[ServiceInstance] = js.native
    def update(
      opts: ServiceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServiceInstance, Any]
    ): js.Promise[ServiceInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/notify/v1/service", "ServiceInstance")
  @js.native
  open class ServiceInstance protected () extends SerializableClass {
    /**
      * Initialize the ServiceContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.notifyV1Mod.^, payload: ServicePayload, sid: String) = this()
    
    /* private */ var _proxy: ServiceContext = js.native
    
    var accountSid: String = js.native
    
    var alexaSkillId: String = js.native
    
    var apnCredentialSid: String = js.native
    
    /**
      * Access the bindings
      */
    def bindings(): BindingListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var defaultAlexaNotificationProtocolVersion: String = js.native
    
    var defaultApnNotificationProtocolVersion: String = js.native
    
    var defaultFcmNotificationProtocolVersion: String = js.native
    
    var defaultGcmNotificationProtocolVersion: String = js.native
    
    var deliveryCallbackEnabled: Boolean = js.native
    
    var deliveryCallbackUrl: String = js.native
    
    var facebookMessengerPageId: String = js.native
    
    var fcmCredentialSid: String = js.native
    
    /**
      * fetch a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[ServiceInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    
    var friendlyName: String = js.native
    
    var gcmCredentialSid: String = js.native
    
    var links: String = js.native
    
    var logEnabled: Boolean = js.native
    
    var messagingServiceSid: String = js.native
    
    /**
      * Access the notifications
      */
    def notifications(): NotificationListInstance = js.native
    
    /**
      * remove a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sid: String = js.native
    
    /**
      * update a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[ServiceInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[ServiceInstance] = js.native
    def update(opts: ServiceInstanceUpdateOptions): js.Promise[ServiceInstance] = js.native
    def update(
      opts: ServiceInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[ServiceInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the ServiceList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def ServiceList(version: typings.twilio.notifyV1Mod.^): ServiceListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("ServiceList")(version.asInstanceOf[js.Any]).asInstanceOf[ServiceListInstance]
  
  @JSImport("twilio/lib/rest/notify/v1/service", "ServicePage")
  @js.native
  open class ServicePage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.notifyV1Mod.^, ServicePayload, ServiceResource, ServiceInstance] {
    /**
      * Initialize the ServicePage
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
      solution: ServiceSolution
    ) = this()
    
    /**
      * Build an instance of ServiceInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: ServicePayload): ServiceInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property alexaSkillId - Deprecated
    * @property apnCredentialSid - The SID of the Credential to use for APN Bindings
    * @property defaultAlexaNotificationProtocolVersion - Deprecated
    * @property defaultApnNotificationProtocolVersion - The protocol version to use for sending APNS notifications
    * @property defaultFcmNotificationProtocolVersion - The protocol version to use for sending FCM notifications
    * @property defaultGcmNotificationProtocolVersion - The protocol version to use for sending GCM notifications
    * @property deliveryCallbackEnabled - Enable delivery callbacks
    * @property deliveryCallbackUrl - Webhook URL
    * @property facebookMessengerPageId - Deprecated
    * @property fcmCredentialSid - The SID of the Credential to use for FCM Bindings
    * @property friendlyName - A string to describe the resource
    * @property gcmCredentialSid - The SID of the Credential to use for GCM Bindings
    * @property logEnabled - Whether to log notifications
    * @property messagingServiceSid - The SID of the Messaging Service to use for SMS Bindings
    */
  trait ServiceInstanceUpdateOptions extends StObject {
    
    var alexaSkillId: js.UndefOr[String] = js.undefined
    
    var apnCredentialSid: js.UndefOr[String] = js.undefined
    
    var defaultAlexaNotificationProtocolVersion: js.UndefOr[String] = js.undefined
    
    var defaultApnNotificationProtocolVersion: js.UndefOr[String] = js.undefined
    
    var defaultFcmNotificationProtocolVersion: js.UndefOr[String] = js.undefined
    
    var defaultGcmNotificationProtocolVersion: js.UndefOr[String] = js.undefined
    
    var deliveryCallbackEnabled: js.UndefOr[Boolean] = js.undefined
    
    var deliveryCallbackUrl: js.UndefOr[String] = js.undefined
    
    var facebookMessengerPageId: js.UndefOr[String] = js.undefined
    
    var fcmCredentialSid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var gcmCredentialSid: js.UndefOr[String] = js.undefined
    
    var logEnabled: js.UndefOr[Boolean] = js.undefined
    
    var messagingServiceSid: js.UndefOr[String] = js.undefined
  }
  object ServiceInstanceUpdateOptions {
    
    inline def apply(): ServiceInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceInstanceUpdateOptions]
    }
    
    extension [Self <: ServiceInstanceUpdateOptions](x: Self) {
      
      inline def setAlexaSkillId(value: String): Self = StObject.set(x, "alexaSkillId", value.asInstanceOf[js.Any])
      
      inline def setAlexaSkillIdUndefined: Self = StObject.set(x, "alexaSkillId", js.undefined)
      
      inline def setApnCredentialSid(value: String): Self = StObject.set(x, "apnCredentialSid", value.asInstanceOf[js.Any])
      
      inline def setApnCredentialSidUndefined: Self = StObject.set(x, "apnCredentialSid", js.undefined)
      
      inline def setDefaultAlexaNotificationProtocolVersion(value: String): Self = StObject.set(x, "defaultAlexaNotificationProtocolVersion", value.asInstanceOf[js.Any])
      
      inline def setDefaultAlexaNotificationProtocolVersionUndefined: Self = StObject.set(x, "defaultAlexaNotificationProtocolVersion", js.undefined)
      
      inline def setDefaultApnNotificationProtocolVersion(value: String): Self = StObject.set(x, "defaultApnNotificationProtocolVersion", value.asInstanceOf[js.Any])
      
      inline def setDefaultApnNotificationProtocolVersionUndefined: Self = StObject.set(x, "defaultApnNotificationProtocolVersion", js.undefined)
      
      inline def setDefaultFcmNotificationProtocolVersion(value: String): Self = StObject.set(x, "defaultFcmNotificationProtocolVersion", value.asInstanceOf[js.Any])
      
      inline def setDefaultFcmNotificationProtocolVersionUndefined: Self = StObject.set(x, "defaultFcmNotificationProtocolVersion", js.undefined)
      
      inline def setDefaultGcmNotificationProtocolVersion(value: String): Self = StObject.set(x, "defaultGcmNotificationProtocolVersion", value.asInstanceOf[js.Any])
      
      inline def setDefaultGcmNotificationProtocolVersionUndefined: Self = StObject.set(x, "defaultGcmNotificationProtocolVersion", js.undefined)
      
      inline def setDeliveryCallbackEnabled(value: Boolean): Self = StObject.set(x, "deliveryCallbackEnabled", value.asInstanceOf[js.Any])
      
      inline def setDeliveryCallbackEnabledUndefined: Self = StObject.set(x, "deliveryCallbackEnabled", js.undefined)
      
      inline def setDeliveryCallbackUrl(value: String): Self = StObject.set(x, "deliveryCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setDeliveryCallbackUrlUndefined: Self = StObject.set(x, "deliveryCallbackUrl", js.undefined)
      
      inline def setFacebookMessengerPageId(value: String): Self = StObject.set(x, "facebookMessengerPageId", value.asInstanceOf[js.Any])
      
      inline def setFacebookMessengerPageIdUndefined: Self = StObject.set(x, "facebookMessengerPageId", js.undefined)
      
      inline def setFcmCredentialSid(value: String): Self = StObject.set(x, "fcmCredentialSid", value.asInstanceOf[js.Any])
      
      inline def setFcmCredentialSidUndefined: Self = StObject.set(x, "fcmCredentialSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setGcmCredentialSid(value: String): Self = StObject.set(x, "gcmCredentialSid", value.asInstanceOf[js.Any])
      
      inline def setGcmCredentialSidUndefined: Self = StObject.set(x, "gcmCredentialSid", js.undefined)
      
      inline def setLogEnabled(value: Boolean): Self = StObject.set(x, "logEnabled", value.asInstanceOf[js.Any])
      
      inline def setLogEnabledUndefined: Self = StObject.set(x, "logEnabled", js.undefined)
      
      inline def setMessagingServiceSid(value: String): Self = StObject.set(x, "messagingServiceSid", value.asInstanceOf[js.Any])
      
      inline def setMessagingServiceSidUndefined: Self = StObject.set(x, "messagingServiceSid", js.undefined)
    }
  }
  
  @js.native
  trait ServiceListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): ServiceContext = js.native
    
    /**
      * create a ServiceInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[ServiceInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ ServiceInstance, Any]): js.Promise[ServiceInstance] = js.native
    def create(opts: ServiceListInstanceCreateOptions): js.Promise[ServiceInstance] = js.native
    def create(
      opts: ServiceListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ ServiceInstance, Any]
    ): js.Promise[ServiceInstance] = js.native
    
    /**
      * Streams ServiceInstance records from the API.
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
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: ServiceListInstanceEachOptions): Unit = js.native
    def each(
      opts: ServiceListInstanceEachOptions,
      callback: js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a service
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): ServiceContext = js.native
    
    /**
      * Retrieve a single target page of ServiceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[ServicePage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def getPage(targetUrl: String): js.Promise[ServicePage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]
    ): js.Promise[ServicePage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    
    /**
      * Lists ServiceInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]
    ): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(opts: ServiceListInstanceOptions): js.Promise[js.Array[ServiceInstance]] = js.native
    def list(
      opts: ServiceListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[ServiceInstance], Any]
    ): js.Promise[js.Array[ServiceInstance]] = js.native
    
    /**
      * Retrieve a single page of ServiceInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[ServicePage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]): js.Promise[ServicePage] = js.native
    def page(opts: ServiceListInstancePageOptions): js.Promise[ServicePage] = js.native
    def page(
      opts: ServiceListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ ServicePage, Any]
    ): js.Promise[ServicePage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property alexaSkillId - Deprecated
    * @property apnCredentialSid - The SID of the Credential to use for APN Bindings
    * @property defaultAlexaNotificationProtocolVersion - Deprecated
    * @property defaultApnNotificationProtocolVersion - The protocol version to use for sending APNS notifications
    * @property defaultFcmNotificationProtocolVersion - The protocol version to use for sending FCM notifications
    * @property defaultGcmNotificationProtocolVersion - The protocol version to use for sending GCM notifications
    * @property deliveryCallbackEnabled - Enable delivery callbacks
    * @property deliveryCallbackUrl - Webhook URL
    * @property facebookMessengerPageId - Deprecated
    * @property fcmCredentialSid - The SID of the Credential to use for FCM Bindings
    * @property friendlyName - A string to describe the resource
    * @property gcmCredentialSid - The SID of the Credential to use for GCM Bindings
    * @property logEnabled - Whether to log notifications
    * @property messagingServiceSid - The SID of the Messaging Service to use for SMS Bindings
    */
  trait ServiceListInstanceCreateOptions extends StObject {
    
    var alexaSkillId: js.UndefOr[String] = js.undefined
    
    var apnCredentialSid: js.UndefOr[String] = js.undefined
    
    var defaultAlexaNotificationProtocolVersion: js.UndefOr[String] = js.undefined
    
    var defaultApnNotificationProtocolVersion: js.UndefOr[String] = js.undefined
    
    var defaultFcmNotificationProtocolVersion: js.UndefOr[String] = js.undefined
    
    var defaultGcmNotificationProtocolVersion: js.UndefOr[String] = js.undefined
    
    var deliveryCallbackEnabled: js.UndefOr[Boolean] = js.undefined
    
    var deliveryCallbackUrl: js.UndefOr[String] = js.undefined
    
    var facebookMessengerPageId: js.UndefOr[String] = js.undefined
    
    var fcmCredentialSid: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var gcmCredentialSid: js.UndefOr[String] = js.undefined
    
    var logEnabled: js.UndefOr[Boolean] = js.undefined
    
    var messagingServiceSid: js.UndefOr[String] = js.undefined
  }
  object ServiceListInstanceCreateOptions {
    
    inline def apply(): ServiceListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceCreateOptions]
    }
    
    extension [Self <: ServiceListInstanceCreateOptions](x: Self) {
      
      inline def setAlexaSkillId(value: String): Self = StObject.set(x, "alexaSkillId", value.asInstanceOf[js.Any])
      
      inline def setAlexaSkillIdUndefined: Self = StObject.set(x, "alexaSkillId", js.undefined)
      
      inline def setApnCredentialSid(value: String): Self = StObject.set(x, "apnCredentialSid", value.asInstanceOf[js.Any])
      
      inline def setApnCredentialSidUndefined: Self = StObject.set(x, "apnCredentialSid", js.undefined)
      
      inline def setDefaultAlexaNotificationProtocolVersion(value: String): Self = StObject.set(x, "defaultAlexaNotificationProtocolVersion", value.asInstanceOf[js.Any])
      
      inline def setDefaultAlexaNotificationProtocolVersionUndefined: Self = StObject.set(x, "defaultAlexaNotificationProtocolVersion", js.undefined)
      
      inline def setDefaultApnNotificationProtocolVersion(value: String): Self = StObject.set(x, "defaultApnNotificationProtocolVersion", value.asInstanceOf[js.Any])
      
      inline def setDefaultApnNotificationProtocolVersionUndefined: Self = StObject.set(x, "defaultApnNotificationProtocolVersion", js.undefined)
      
      inline def setDefaultFcmNotificationProtocolVersion(value: String): Self = StObject.set(x, "defaultFcmNotificationProtocolVersion", value.asInstanceOf[js.Any])
      
      inline def setDefaultFcmNotificationProtocolVersionUndefined: Self = StObject.set(x, "defaultFcmNotificationProtocolVersion", js.undefined)
      
      inline def setDefaultGcmNotificationProtocolVersion(value: String): Self = StObject.set(x, "defaultGcmNotificationProtocolVersion", value.asInstanceOf[js.Any])
      
      inline def setDefaultGcmNotificationProtocolVersionUndefined: Self = StObject.set(x, "defaultGcmNotificationProtocolVersion", js.undefined)
      
      inline def setDeliveryCallbackEnabled(value: Boolean): Self = StObject.set(x, "deliveryCallbackEnabled", value.asInstanceOf[js.Any])
      
      inline def setDeliveryCallbackEnabledUndefined: Self = StObject.set(x, "deliveryCallbackEnabled", js.undefined)
      
      inline def setDeliveryCallbackUrl(value: String): Self = StObject.set(x, "deliveryCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setDeliveryCallbackUrlUndefined: Self = StObject.set(x, "deliveryCallbackUrl", js.undefined)
      
      inline def setFacebookMessengerPageId(value: String): Self = StObject.set(x, "facebookMessengerPageId", value.asInstanceOf[js.Any])
      
      inline def setFacebookMessengerPageIdUndefined: Self = StObject.set(x, "facebookMessengerPageId", js.undefined)
      
      inline def setFcmCredentialSid(value: String): Self = StObject.set(x, "fcmCredentialSid", value.asInstanceOf[js.Any])
      
      inline def setFcmCredentialSidUndefined: Self = StObject.set(x, "fcmCredentialSid", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setGcmCredentialSid(value: String): Self = StObject.set(x, "gcmCredentialSid", value.asInstanceOf[js.Any])
      
      inline def setGcmCredentialSidUndefined: Self = StObject.set(x, "gcmCredentialSid", js.undefined)
      
      inline def setLogEnabled(value: Boolean): Self = StObject.set(x, "logEnabled", value.asInstanceOf[js.Any])
      
      inline def setLogEnabledUndefined: Self = StObject.set(x, "logEnabled", js.undefined)
      
      inline def setMessagingServiceSid(value: String): Self = StObject.set(x, "messagingServiceSid", value.asInstanceOf[js.Any])
      
      inline def setMessagingServiceSidUndefined: Self = StObject.set(x, "messagingServiceSid", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - The string that identifies the Service resources to read
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
  trait ServiceListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ ServiceInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ServiceListInstanceEachOptions {
    
    inline def apply(): ServiceListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceEachOptions]
    }
    
    extension [Self <: ServiceListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ ServiceInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - The string that identifies the Service resources to read
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
  trait ServiceListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ServiceListInstanceOptions {
    
    inline def apply(): ServiceListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstanceOptions]
    }
    
    extension [Self <: ServiceListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - The string that identifies the Service resources to read
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    */
  trait ServiceListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ServiceListInstancePageOptions {
    
    inline def apply(): ServiceListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceListInstancePageOptions]
    }
    
    extension [Self <: ServiceListInstancePageOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ServicePayload
    extends StObject
       with ServiceResource
       with TwilioResponsePayload
  object ServicePayload {
    
    inline def apply(
      account_sid: String,
      alexa_skill_id: String,
      apn_credential_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      default_alexa_notification_protocol_version: String,
      default_apn_notification_protocol_version: String,
      default_fcm_notification_protocol_version: String,
      default_gcm_notification_protocol_version: String,
      delivery_callback_enabled: Boolean,
      delivery_callback_url: String,
      facebook_messenger_page_id: String,
      fcm_credential_sid: String,
      first_page_uri: String,
      friendly_name: String,
      gcm_credential_sid: String,
      links: String,
      log_enabled: Boolean,
      messaging_service_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      uri: String,
      url: String
    ): ServicePayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], alexa_skill_id = alexa_skill_id.asInstanceOf[js.Any], apn_credential_sid = apn_credential_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_alexa_notification_protocol_version = default_alexa_notification_protocol_version.asInstanceOf[js.Any], default_apn_notification_protocol_version = default_apn_notification_protocol_version.asInstanceOf[js.Any], default_fcm_notification_protocol_version = default_fcm_notification_protocol_version.asInstanceOf[js.Any], default_gcm_notification_protocol_version = default_gcm_notification_protocol_version.asInstanceOf[js.Any], delivery_callback_enabled = delivery_callback_enabled.asInstanceOf[js.Any], delivery_callback_url = delivery_callback_url.asInstanceOf[js.Any], facebook_messenger_page_id = facebook_messenger_page_id.asInstanceOf[js.Any], fcm_credential_sid = fcm_credential_sid.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], gcm_credential_sid = gcm_credential_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], log_enabled = log_enabled.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServicePayload]
    }
  }
  
  trait ServiceResource extends StObject {
    
    var account_sid: String
    
    var alexa_skill_id: String
    
    var apn_credential_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var default_alexa_notification_protocol_version: String
    
    var default_apn_notification_protocol_version: String
    
    var default_fcm_notification_protocol_version: String
    
    var default_gcm_notification_protocol_version: String
    
    var delivery_callback_enabled: Boolean
    
    var delivery_callback_url: String
    
    var facebook_messenger_page_id: String
    
    var fcm_credential_sid: String
    
    var friendly_name: String
    
    var gcm_credential_sid: String
    
    var links: String
    
    var log_enabled: Boolean
    
    var messaging_service_sid: String
    
    var sid: String
    
    var url: String
  }
  object ServiceResource {
    
    inline def apply(
      account_sid: String,
      alexa_skill_id: String,
      apn_credential_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      default_alexa_notification_protocol_version: String,
      default_apn_notification_protocol_version: String,
      default_fcm_notification_protocol_version: String,
      default_gcm_notification_protocol_version: String,
      delivery_callback_enabled: Boolean,
      delivery_callback_url: String,
      facebook_messenger_page_id: String,
      fcm_credential_sid: String,
      friendly_name: String,
      gcm_credential_sid: String,
      links: String,
      log_enabled: Boolean,
      messaging_service_sid: String,
      sid: String,
      url: String
    ): ServiceResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], alexa_skill_id = alexa_skill_id.asInstanceOf[js.Any], apn_credential_sid = apn_credential_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], default_alexa_notification_protocol_version = default_alexa_notification_protocol_version.asInstanceOf[js.Any], default_apn_notification_protocol_version = default_apn_notification_protocol_version.asInstanceOf[js.Any], default_fcm_notification_protocol_version = default_fcm_notification_protocol_version.asInstanceOf[js.Any], default_gcm_notification_protocol_version = default_gcm_notification_protocol_version.asInstanceOf[js.Any], delivery_callback_enabled = delivery_callback_enabled.asInstanceOf[js.Any], delivery_callback_url = delivery_callback_url.asInstanceOf[js.Any], facebook_messenger_page_id = facebook_messenger_page_id.asInstanceOf[js.Any], fcm_credential_sid = fcm_credential_sid.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], gcm_credential_sid = gcm_credential_sid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], log_enabled = log_enabled.asInstanceOf[js.Any], messaging_service_sid = messaging_service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceResource]
    }
    
    extension [Self <: ServiceResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAlexa_skill_id(value: String): Self = StObject.set(x, "alexa_skill_id", value.asInstanceOf[js.Any])
      
      inline def setApn_credential_sid(value: String): Self = StObject.set(x, "apn_credential_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDefault_alexa_notification_protocol_version(value: String): Self = StObject.set(x, "default_alexa_notification_protocol_version", value.asInstanceOf[js.Any])
      
      inline def setDefault_apn_notification_protocol_version(value: String): Self = StObject.set(x, "default_apn_notification_protocol_version", value.asInstanceOf[js.Any])
      
      inline def setDefault_fcm_notification_protocol_version(value: String): Self = StObject.set(x, "default_fcm_notification_protocol_version", value.asInstanceOf[js.Any])
      
      inline def setDefault_gcm_notification_protocol_version(value: String): Self = StObject.set(x, "default_gcm_notification_protocol_version", value.asInstanceOf[js.Any])
      
      inline def setDelivery_callback_enabled(value: Boolean): Self = StObject.set(x, "delivery_callback_enabled", value.asInstanceOf[js.Any])
      
      inline def setDelivery_callback_url(value: String): Self = StObject.set(x, "delivery_callback_url", value.asInstanceOf[js.Any])
      
      inline def setFacebook_messenger_page_id(value: String): Self = StObject.set(x, "facebook_messenger_page_id", value.asInstanceOf[js.Any])
      
      inline def setFcm_credential_sid(value: String): Self = StObject.set(x, "fcm_credential_sid", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setGcm_credential_sid(value: String): Self = StObject.set(x, "gcm_credential_sid", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLog_enabled(value: Boolean): Self = StObject.set(x, "log_enabled", value.asInstanceOf[js.Any])
      
      inline def setMessaging_service_sid(value: String): Self = StObject.set(x, "messaging_service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceSolution extends StObject
}
