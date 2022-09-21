package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notifyV1CredentialMod {
  
  @JSImport("twilio/lib/rest/notify/v1/credential", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/notify/v1/credential", "CredentialContext")
  @js.native
  open class CredentialContext protected () extends StObject {
    /**
      * Initialize the CredentialContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.notifyV1Mod.^, sid: String) = this()
    
    /**
      * fetch a CredentialInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CredentialInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialInstance, Any]): js.Promise[CredentialInstance] = js.native
    
    /**
      * remove a CredentialInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a CredentialInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[CredentialInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialInstance, Any]): js.Promise[CredentialInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialInstance, Any]
    ): js.Promise[CredentialInstance] = js.native
    def update(opts: CredentialInstanceUpdateOptions): js.Promise[CredentialInstance] = js.native
    def update(
      opts: CredentialInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialInstance, Any]
    ): js.Promise[CredentialInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/notify/v1/credential", "CredentialInstance")
  @js.native
  open class CredentialInstance protected () extends SerializableClass {
    /**
      * Initialize the CredentialContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.notifyV1Mod.^, payload: CredentialPayload, sid: String) = this()
    
    /* private */ var _proxy: CredentialContext = js.native
    
    var accountSid: String = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a CredentialInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[CredentialInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CredentialInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * remove a CredentialInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var sandbox: String = js.native
    
    var sid: String = js.native
    
    var `type`: CredentialPushService = js.native
    
    /**
      * update a CredentialInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[CredentialInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CredentialInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[CredentialInstance] = js.native
    def update(opts: CredentialInstanceUpdateOptions): js.Promise[CredentialInstance] = js.native
    def update(
      opts: CredentialInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[CredentialInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the CredentialList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def CredentialList(version: typings.twilio.notifyV1Mod.^): CredentialListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("CredentialList")(version.asInstanceOf[js.Any]).asInstanceOf[CredentialListInstance]
  
  @JSImport("twilio/lib/rest/notify/v1/credential", "CredentialPage")
  @js.native
  open class CredentialPage protected ()
    extends typings.twilio.pageMod.^[
          typings.twilio.notifyV1Mod.^, 
          CredentialPayload, 
          CredentialResource, 
          CredentialInstance
        ] {
    /**
      * Initialize the CredentialPage
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
      solution: CredentialSolution
    ) = this()
    
    /**
      * Build an instance of CredentialInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: CredentialPayload): CredentialInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property apiKey - [GCM only] The `Server key` of your project from Firebase console under Settings / Cloud messaging
    * @property certificate - [APN only] The URL-encoded representation of the certificate
    * @property friendlyName - A string to describe the resource
    * @property privateKey - [APN only] URL-encoded representation of the private key
    * @property sandbox - [APN only] Whether to send the credential to sandbox APNs
    * @property secret - [FCM only] The `Server key` of your project from Firebase console under Settings / Cloud messaging
    */
  trait CredentialInstanceUpdateOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var certificate: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var privateKey: js.UndefOr[String] = js.undefined
    
    var sandbox: js.UndefOr[Boolean] = js.undefined
    
    var secret: js.UndefOr[String] = js.undefined
  }
  object CredentialInstanceUpdateOptions {
    
    inline def apply(): CredentialInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialInstanceUpdateOptions]
    }
    
    extension [Self <: CredentialInstanceUpdateOptions](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    }
  }
  
  @js.native
  trait CredentialListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): CredentialContext = js.native
    
    /**
      * create a CredentialInstance
      *
      * @param opts - Options for request
      * @param callback - Callback to handle processed record
      */
    def create(opts: CredentialListInstanceCreateOptions): js.Promise[CredentialInstance] = js.native
    def create(
      opts: CredentialListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ CredentialInstance, Any]
    ): js.Promise[CredentialInstance] = js.native
    
    /**
      * Streams CredentialInstance records from the API.
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
          /* item */ CredentialInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ CredentialInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: CredentialListInstanceEachOptions): Unit = js.native
    def each(
      opts: CredentialListInstanceEachOptions,
      callback: js.Function2[
          /* item */ CredentialInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a credential
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): CredentialContext = js.native
    
    /**
      * Retrieve a single target page of CredentialInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[CredentialPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialPage, Any]): js.Promise[CredentialPage] = js.native
    def getPage(targetUrl: String): js.Promise[CredentialPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialPage, Any]
    ): js.Promise[CredentialPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialPage, Any]
    ): js.Promise[CredentialPage] = js.native
    
    /**
      * Lists CredentialInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[CredentialInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CredentialInstance], Any]): js.Promise[js.Array[CredentialInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CredentialInstance], Any]
    ): js.Promise[js.Array[CredentialInstance]] = js.native
    def list(opts: CredentialListInstanceOptions): js.Promise[js.Array[CredentialInstance]] = js.native
    def list(
      opts: CredentialListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[CredentialInstance], Any]
    ): js.Promise[js.Array[CredentialInstance]] = js.native
    
    /**
      * Retrieve a single page of CredentialInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[CredentialPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialPage, Any]): js.Promise[CredentialPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialPage, Any]): js.Promise[CredentialPage] = js.native
    def page(opts: CredentialListInstancePageOptions): js.Promise[CredentialPage] = js.native
    def page(
      opts: CredentialListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ CredentialPage, Any]
    ): js.Promise[CredentialPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property apiKey - [GCM only] The `Server key` of your project from Firebase console under Settings / Cloud messaging
    * @property certificate - [APN only] The URL-encoded representation of the certificate
    * @property friendlyName - A string to describe the resource
    * @property privateKey - [APN only] URL-encoded representation of the private key
    * @property sandbox - [APN only] Whether to send the credential to sandbox APNs
    * @property secret - [FCM only] The `Server key` of your project from Firebase console under Settings / Cloud messaging
    * @property type - The Credential type
    */
  trait CredentialListInstanceCreateOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var certificate: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var privateKey: js.UndefOr[String] = js.undefined
    
    var sandbox: js.UndefOr[Boolean] = js.undefined
    
    var secret: js.UndefOr[String] = js.undefined
    
    var `type`: CredentialPushService
  }
  object CredentialListInstanceCreateOptions {
    
    inline def apply(`type`: CredentialPushService): CredentialListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialListInstanceCreateOptions]
    }
    
    extension [Self <: CredentialListInstanceCreateOptions](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setType(value: CredentialPushService): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
  trait CredentialListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ CredentialInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CredentialListInstanceEachOptions {
    
    inline def apply(): CredentialListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialListInstanceEachOptions]
    }
    
    extension [Self <: CredentialListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ CredentialInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait CredentialListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object CredentialListInstanceOptions {
    
    inline def apply(): CredentialListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialListInstanceOptions]
    }
    
    extension [Self <: CredentialListInstanceOptions](x: Self) {
      
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
  trait CredentialListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object CredentialListInstancePageOptions {
    
    inline def apply(): CredentialListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialListInstancePageOptions]
    }
    
    extension [Self <: CredentialListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait CredentialPayload
    extends StObject
       with CredentialResource
       with TwilioResponsePayload
  object CredentialPayload {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sandbox: String,
      sid: String,
      `type`: CredentialPushService,
      uri: String,
      url: String
    ): CredentialPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialPayload]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.gcm
    - typings.twilio.twilioStrings.apn
    - typings.twilio.twilioStrings.fcm
  */
  trait CredentialPushService extends StObject
  object CredentialPushService {
    
    inline def apn: typings.twilio.twilioStrings.apn = "apn".asInstanceOf[typings.twilio.twilioStrings.apn]
    
    inline def fcm: typings.twilio.twilioStrings.fcm = "fcm".asInstanceOf[typings.twilio.twilioStrings.fcm]
    
    inline def gcm: typings.twilio.twilioStrings.gcm = "gcm".asInstanceOf[typings.twilio.twilioStrings.gcm]
  }
  
  trait CredentialResource extends StObject {
    
    var account_sid: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var sandbox: String
    
    var sid: String
    
    var `type`: CredentialPushService
    
    var url: String
  }
  object CredentialResource {
    
    inline def apply(
      account_sid: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      sandbox: String,
      sid: String,
      `type`: CredentialPushService,
      url: String
    ): CredentialResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialResource]
    }
    
    extension [Self <: CredentialResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setType(value: CredentialPushService): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CredentialSolution extends StObject
}
