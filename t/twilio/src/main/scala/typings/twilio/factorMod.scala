package typings.twilio

import typings.twilio.anon.Alg
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.unverified_
import typings.twilio.twilioStrings.verified_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factorMod {
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/factor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/factor", "FactorContext")
  @js.native
  open class FactorContext protected () extends StObject {
    /**
      * Initialize the FactorContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param serviceSid - Service Sid.
      * @param identity - Unique external identifier of the Entity
      * @param sid - A string that uniquely identifies this Factor.
      */
    def this(version: typings.twilio.verifyV2Mod.^, serviceSid: String, identity: String, sid: String) = this()
    
    /**
      * fetch a FactorInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FactorInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FactorInstance, Any]): js.Promise[FactorInstance] = js.native
    
    /**
      * remove a FactorInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ FactorInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a FactorInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[FactorInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ FactorInstance, Any]): js.Promise[FactorInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FactorInstance, Any]): js.Promise[FactorInstance] = js.native
    def update(opts: FactorInstanceUpdateOptions): js.Promise[FactorInstance] = js.native
    def update(
      opts: FactorInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FactorInstance, Any]
    ): js.Promise[FactorInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/factor", "FactorInstance")
  @js.native
  open class FactorInstance protected () extends SerializableClass {
    /**
      * Initialize the FactorContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param serviceSid - Service Sid.
      * @param identity - Unique external identifier of the Entity
      * @param sid - A string that uniquely identifies this Factor.
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      payload: FactorPayload,
      serviceSid: String,
      identity: String,
      sid: String
    ) = this()
    
    /* private */ var _proxy: FactorContext = js.native
    
    var accountSid: String = js.native
    
    var config: Any = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var entitySid: String = js.native
    
    var factorType: FactorFactorTypes = js.native
    
    /**
      * fetch a FactorInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FactorInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FactorInstance] = js.native
    
    var friendlyName: String = js.native
    
    var identity: String = js.native
    
    var metadata: Any = js.native
    
    /**
      * remove a FactorInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var serviceSid: String = js.native
    
    var sid: String = js.native
    
    var status: FactorFactorStatuses = js.native
    
    /**
      * update a FactorInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[FactorInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FactorInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FactorInstance] = js.native
    def update(opts: FactorInstanceUpdateOptions): js.Promise[FactorInstance] = js.native
    def update(
      opts: FactorInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[FactorInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the FactorList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    * @param serviceSid - Service Sid.
    * @param identity - Unique external identifier of the Entity
    */
  inline def FactorList(version: typings.twilio.verifyV2Mod.^, serviceSid: String, identity: String): FactorListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("FactorList")(version.asInstanceOf[js.Any], serviceSid.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[FactorListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/service/entity/factor", "FactorPage")
  @js.native
  open class FactorPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.verifyV2Mod.^, FactorPayload, FactorResource, FactorInstance] {
    /**
      * Initialize the FactorPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FactorSolution
    ) = this()
    
    /**
      * Build an instance of FactorInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FactorPayload): FactorInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.unverified_
    - typings.twilio.twilioStrings.verified_
  */
  trait FactorFactorStatuses extends StObject
  object FactorFactorStatuses {
    
    inline def unverified: unverified_ = "unverified".asInstanceOf[unverified_]
    
    inline def verified: verified_ = "verified".asInstanceOf[verified_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.push
    - typings.twilio.twilioStrings.totp
  */
  trait FactorFactorTypes extends StObject
  object FactorFactorTypes {
    
    inline def push: typings.twilio.twilioStrings.push = "push".asInstanceOf[typings.twilio.twilioStrings.push]
    
    inline def totp: typings.twilio.twilioStrings.totp = "totp".asInstanceOf[typings.twilio.twilioStrings.totp]
  }
  
  /**
    * Options to pass to update
    *
    * @property authPayload - Optional payload to verify the Factor for the first time
    * @property config.alg - The algorithm used to derive the TOTP codes
    * @property config.codeLength - Number of digits for generated TOTP codes
    * @property config.notificationPlatform - The transport technology used to generate the Notification Token
    * @property config.notificationToken - For APN, the device token. For FCM, the registration token
    * @property config.sdkVersion - The Verify Push SDK version used to configure the factor
    * @property config.skew - The number of past and future time-steps valid at a given time
    * @property config.timeStep - How often, in seconds, are TOTP codes generated
    * @property friendlyName - The friendly name of this Factor
    */
  trait FactorInstanceUpdateOptions extends StObject {
    
    var authPayload: js.UndefOr[String] = js.undefined
    
    var config: js.UndefOr[Alg] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object FactorInstanceUpdateOptions {
    
    inline def apply(): FactorInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FactorInstanceUpdateOptions]
    }
    
    extension [Self <: FactorInstanceUpdateOptions](x: Self) {
      
      inline def setAuthPayload(value: String): Self = StObject.set(x, "authPayload", value.asInstanceOf[js.Any])
      
      inline def setAuthPayloadUndefined: Self = StObject.set(x, "authPayload", js.undefined)
      
      inline def setConfig(value: Alg): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  @js.native
  trait FactorListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FactorContext = js.native
    
    /**
      * Streams FactorInstance records from the API.
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
          /* item */ FactorInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ FactorInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: FactorListInstanceEachOptions): Unit = js.native
    def each(
      opts: FactorListInstanceEachOptions,
      callback: js.Function2[
          /* item */ FactorInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a factor
      *
      * @param sid - A string that uniquely identifies this Factor.
      */
    def get(sid: String): FactorContext = js.native
    
    /**
      * Retrieve a single target page of FactorInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[FactorPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ FactorPage, Any]): js.Promise[FactorPage] = js.native
    def getPage(targetUrl: String): js.Promise[FactorPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FactorPage, Any]
    ): js.Promise[FactorPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FactorPage, Any]): js.Promise[FactorPage] = js.native
    
    /**
      * Lists FactorInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[FactorInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FactorInstance], Any]): js.Promise[js.Array[FactorInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FactorInstance], Any]
    ): js.Promise[js.Array[FactorInstance]] = js.native
    def list(opts: FactorListInstanceOptions): js.Promise[js.Array[FactorInstance]] = js.native
    def list(
      opts: FactorListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[FactorInstance], Any]
    ): js.Promise[js.Array[FactorInstance]] = js.native
    
    /**
      * Retrieve a single page of FactorInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[FactorPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ FactorPage, Any]): js.Promise[FactorPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ FactorPage, Any]): js.Promise[FactorPage] = js.native
    def page(opts: FactorListInstancePageOptions): js.Promise[FactorPage] = js.native
    def page(
      opts: FactorListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ FactorPage, Any]
    ): js.Promise[FactorPage] = js.native
    
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
  trait FactorListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ FactorInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FactorListInstanceEachOptions {
    
    inline def apply(): FactorListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FactorListInstanceEachOptions]
    }
    
    extension [Self <: FactorListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ FactorInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait FactorListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object FactorListInstanceOptions {
    
    inline def apply(): FactorListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FactorListInstanceOptions]
    }
    
    extension [Self <: FactorListInstanceOptions](x: Self) {
      
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
  trait FactorListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object FactorListInstancePageOptions {
    
    inline def apply(): FactorListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FactorListInstancePageOptions]
    }
    
    extension [Self <: FactorListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.apn
    - typings.twilio.twilioStrings.fcm
    - typings.twilio.twilioStrings.none
  */
  trait FactorNotificationPlatforms extends StObject
  object FactorNotificationPlatforms {
    
    inline def apn: typings.twilio.twilioStrings.apn = "apn".asInstanceOf[typings.twilio.twilioStrings.apn]
    
    inline def fcm: typings.twilio.twilioStrings.fcm = "fcm".asInstanceOf[typings.twilio.twilioStrings.fcm]
    
    inline def none: typings.twilio.twilioStrings.none = "none".asInstanceOf[typings.twilio.twilioStrings.none]
  }
  
  trait FactorPayload
    extends StObject
       with FactorResource
       with TwilioResponsePayload
  object FactorPayload {
    
    inline def apply(
      account_sid: String,
      config: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      entity_sid: String,
      factor_type: FactorFactorTypes,
      first_page_uri: String,
      friendly_name: String,
      identity: String,
      metadata: js.Object,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      service_sid: String,
      sid: String,
      status: FactorFactorStatuses,
      uri: String,
      url: String
    ): FactorPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], entity_sid = entity_sid.asInstanceOf[js.Any], factor_type = factor_type.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FactorPayload]
    }
  }
  
  trait FactorResource extends StObject {
    
    var account_sid: String
    
    var config: js.Object
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var entity_sid: String
    
    var factor_type: FactorFactorTypes
    
    var friendly_name: String
    
    var identity: String
    
    var metadata: js.Object
    
    var service_sid: String
    
    var sid: String
    
    var status: FactorFactorStatuses
    
    var url: String
  }
  object FactorResource {
    
    inline def apply(
      account_sid: String,
      config: js.Object,
      date_created: js.Date,
      date_updated: js.Date,
      entity_sid: String,
      factor_type: FactorFactorTypes,
      friendly_name: String,
      identity: String,
      metadata: js.Object,
      service_sid: String,
      sid: String,
      status: FactorFactorStatuses,
      url: String
    ): FactorResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], entity_sid = entity_sid.asInstanceOf[js.Any], factor_type = factor_type.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FactorResource]
    }
    
    extension [Self <: FactorResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEntity_sid(value: String): Self = StObject.set(x, "entity_sid", value.asInstanceOf[js.Any])
      
      inline def setFactor_type(value: FactorFactorTypes): Self = StObject.set(x, "factor_type", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setService_sid(value: String): Self = StObject.set(x, "service_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: FactorFactorStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FactorSolution extends StObject {
    
    var identity: js.UndefOr[String] = js.undefined
    
    var serviceSid: js.UndefOr[String] = js.undefined
  }
  object FactorSolution {
    
    inline def apply(): FactorSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FactorSolution]
    }
    
    extension [Self <: FactorSolution](x: Self) {
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
      
      inline def setServiceSidUndefined: Self = StObject.set(x, "serviceSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.sha1
    - typings.twilio.twilioStrings.sha256
    - typings.twilio.twilioStrings.sha512
  */
  trait FactorTotpAlgorithms extends StObject
  object FactorTotpAlgorithms {
    
    inline def sha1: typings.twilio.twilioStrings.sha1 = "sha1".asInstanceOf[typings.twilio.twilioStrings.sha1]
    
    inline def sha256: typings.twilio.twilioStrings.sha256 = "sha256".asInstanceOf[typings.twilio.twilioStrings.sha256]
    
    inline def sha512: typings.twilio.twilioStrings.sha512 = "sha512".asInstanceOf[typings.twilio.twilioStrings.sha512]
  }
}
