package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.originationUrlMod.OriginationUrlContext
import typings.twilio.originationUrlMod.OriginationUrlListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.trunkCredentialListMod.CredentialListContext
import typings.twilio.trunkCredentialListMod.CredentialListListInstance
import typings.twilio.trunkIpAccessControlListMod.IpAccessControlListContext
import typings.twilio.trunkIpAccessControlListMod.IpAccessControlListListInstance
import typings.twilio.trunkPhoneNumberMod.PhoneNumberContext
import typings.twilio.trunkPhoneNumberMod.PhoneNumberListInstance
import typings.twilio.trunkRecordingMod.RecordingContext
import typings.twilio.trunkRecordingMod.RecordingListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1TrunkMod {
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk", "TrunkContext")
  @js.native
  open class TrunkContext protected () extends StObject {
    /**
      * Initialize the TrunkContext
      *
      * @param version - Version of the resource
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trunkingV1Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def credentialsLists(sid: String): CredentialListContext = js.native
    @JSName("credentialsLists")
    var credentialsLists_Original: CredentialListListInstance = js.native
    
    /**
      * fetch a TrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrunkInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkInstance, Any]): js.Promise[TrunkInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def ipAccessControlLists(sid: String): IpAccessControlListContext = js.native
    @JSName("ipAccessControlLists")
    var ipAccessControlLists_Original: IpAccessControlListListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def originationUrls(sid: String): OriginationUrlContext = js.native
    @JSName("originationUrls")
    var originationUrls_Original: OriginationUrlListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def phoneNumbers(sid: String): PhoneNumberContext = js.native
    @JSName("phoneNumbers")
    var phoneNumbers_Original: PhoneNumberListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def recordings(sid: String): RecordingContext = js.native
    @JSName("recordings")
    var recordings_Original: RecordingListInstance = js.native
    
    /**
      * remove a TrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkInstance, Any]): js.Promise[Boolean] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a TrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TrunkInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkInstance, Any]): js.Promise[TrunkInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkInstance, Any]): js.Promise[TrunkInstance] = js.native
    def update(opts: TrunkInstanceUpdateOptions): js.Promise[TrunkInstance] = js.native
    def update(
      opts: TrunkInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkInstance, Any]
    ): js.Promise[TrunkInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk", "TrunkInstance")
  @js.native
  open class TrunkInstance protected () extends SerializableClass {
    /**
      * Initialize the TrunkContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - The unique string that identifies the resource
      */
    def this(version: typings.twilio.trunkingV1Mod.^, payload: TrunkPayload, sid: String) = this()
    
    /* private */ var _proxy: TrunkContext = js.native
    
    var accountSid: String = js.native
    
    var authType: String = js.native
    
    var authTypeSet: js.Array[String] = js.native
    
    var cnamLookupEnabled: Boolean = js.native
    
    /**
      * Access the credentialsLists
      */
    def credentialsLists(): CredentialListListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var disasterRecoveryMethod: String = js.native
    
    var disasterRecoveryUrl: String = js.native
    
    var domainName: String = js.native
    
    /**
      * fetch a TrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TrunkInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrunkInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * Access the ipAccessControlLists
      */
    def ipAccessControlLists(): IpAccessControlListListInstance = js.native
    
    var links: String = js.native
    
    /**
      * Access the originationUrls
      */
    def originationUrls(): OriginationUrlListInstance = js.native
    
    /**
      * Access the phoneNumbers
      */
    def phoneNumbers(): PhoneNumberListInstance = js.native
    
    var recording: Any = js.native
    
    /**
      * Access the recordings
      */
    def recordings(): RecordingListInstance = js.native
    
    /**
      * remove a TrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def remove(): js.Promise[Boolean] = js.native
    def remove(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[Boolean] = js.native
    
    var secure: Boolean = js.native
    
    var sid: String = js.native
    
    var transferCallerId: TrunkTransferCallerId = js.native
    
    var transferMode: TrunkTransferSetting = js.native
    
    /**
      * update a TrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TrunkInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrunkInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TrunkInstance] = js.native
    def update(opts: TrunkInstanceUpdateOptions): js.Promise[TrunkInstance] = js.native
    def update(
      opts: TrunkInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TrunkInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the TrunkList
    *
    * @param version - Version of the resource
    */
  inline def TrunkList(version: typings.twilio.trunkingV1Mod.^): TrunkListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("TrunkList")(version.asInstanceOf[js.Any]).asInstanceOf[TrunkListInstance]
  
  @JSImport("twilio/lib/rest/trunking/v1/trunk", "TrunkPage")
  @js.native
  open class TrunkPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.trunkingV1Mod.^, TrunkPayload, TrunkResource, TrunkInstance] {
    /**
      * Initialize the TrunkPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.trunkingV1Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: TrunkSolution
    ) = this()
    
    /**
      * Build an instance of TrunkInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TrunkPayload): TrunkInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property cnamLookupEnabled - Whether Caller ID Name (CNAM) lookup should be enabled for the trunk
    * @property disasterRecoveryMethod - The HTTP method we should use to call the disaster_recovery_url
    * @property disasterRecoveryUrl - The HTTP URL that we should call if an error occurs while sending SIP traffic towards your configured Origination URL
    * @property domainName - The unique address you reserve on Twilio to which you route your SIP traffic
    * @property friendlyName - A string to describe the resource
    * @property secure - Whether Secure Trunking is enabled for the trunk
    * @property transferCallerId - Caller Id for transfer target
    * @property transferMode - The call transfer settings for the trunk
    */
  trait TrunkInstanceUpdateOptions extends StObject {
    
    var cnamLookupEnabled: js.UndefOr[Boolean] = js.undefined
    
    var disasterRecoveryMethod: js.UndefOr[String] = js.undefined
    
    var disasterRecoveryUrl: js.UndefOr[String] = js.undefined
    
    var domainName: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var transferCallerId: js.UndefOr[TrunkTransferCallerId] = js.undefined
    
    var transferMode: js.UndefOr[TrunkTransferSetting] = js.undefined
  }
  object TrunkInstanceUpdateOptions {
    
    inline def apply(): TrunkInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrunkInstanceUpdateOptions]
    }
    
    extension [Self <: TrunkInstanceUpdateOptions](x: Self) {
      
      inline def setCnamLookupEnabled(value: Boolean): Self = StObject.set(x, "cnamLookupEnabled", value.asInstanceOf[js.Any])
      
      inline def setCnamLookupEnabledUndefined: Self = StObject.set(x, "cnamLookupEnabled", js.undefined)
      
      inline def setDisasterRecoveryMethod(value: String): Self = StObject.set(x, "disasterRecoveryMethod", value.asInstanceOf[js.Any])
      
      inline def setDisasterRecoveryMethodUndefined: Self = StObject.set(x, "disasterRecoveryMethod", js.undefined)
      
      inline def setDisasterRecoveryUrl(value: String): Self = StObject.set(x, "disasterRecoveryUrl", value.asInstanceOf[js.Any])
      
      inline def setDisasterRecoveryUrlUndefined: Self = StObject.set(x, "disasterRecoveryUrl", js.undefined)
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setTransferCallerId(value: TrunkTransferCallerId): Self = StObject.set(x, "transferCallerId", value.asInstanceOf[js.Any])
      
      inline def setTransferCallerIdUndefined: Self = StObject.set(x, "transferCallerId", js.undefined)
      
      inline def setTransferMode(value: TrunkTransferSetting): Self = StObject.set(x, "transferMode", value.asInstanceOf[js.Any])
      
      inline def setTransferModeUndefined: Self = StObject.set(x, "transferMode", js.undefined)
    }
  }
  
  @js.native
  trait TrunkListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TrunkContext = js.native
    
    /**
      * create a TrunkInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[TrunkInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ TrunkInstance, Any]): js.Promise[TrunkInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ TrunkInstance, Any]): js.Promise[TrunkInstance] = js.native
    def create(opts: TrunkListInstanceCreateOptions): js.Promise[TrunkInstance] = js.native
    def create(
      opts: TrunkListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ TrunkInstance, Any]
    ): js.Promise[TrunkInstance] = js.native
    
    /**
      * Streams TrunkInstance records from the API.
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
          /* item */ TrunkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ TrunkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: TrunkListInstanceEachOptions): Unit = js.native
    def each(
      opts: TrunkListInstanceEachOptions,
      callback: js.Function2[
          /* item */ TrunkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a trunk
      *
      * @param sid - The unique string that identifies the resource
      */
    def get(sid: String): TrunkContext = js.native
    
    /**
      * Retrieve a single target page of TrunkInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[TrunkPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkPage, Any]): js.Promise[TrunkPage] = js.native
    def getPage(targetUrl: String): js.Promise[TrunkPage] = js.native
    def getPage(targetUrl: String, callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkPage, Any]): js.Promise[TrunkPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkPage, Any]): js.Promise[TrunkPage] = js.native
    
    /**
      * Lists TrunkInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[TrunkInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TrunkInstance], Any]): js.Promise[js.Array[TrunkInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TrunkInstance], Any]
    ): js.Promise[js.Array[TrunkInstance]] = js.native
    def list(opts: TrunkListInstanceOptions): js.Promise[js.Array[TrunkInstance]] = js.native
    def list(
      opts: TrunkListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[TrunkInstance], Any]
    ): js.Promise[js.Array[TrunkInstance]] = js.native
    
    /**
      * Retrieve a single page of TrunkInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[TrunkPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkPage, Any]): js.Promise[TrunkPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkPage, Any]): js.Promise[TrunkPage] = js.native
    def page(opts: TrunkListInstancePageOptions): js.Promise[TrunkPage] = js.native
    def page(
      opts: TrunkListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TrunkPage, Any]
    ): js.Promise[TrunkPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property cnamLookupEnabled - Whether Caller ID Name (CNAM) lookup should be enabled for the trunk
    * @property disasterRecoveryMethod - The HTTP method we should use to call the disaster_recovery_url
    * @property disasterRecoveryUrl - The HTTP URL that we should call if an error occurs while sending SIP traffic towards your configured Origination URL
    * @property domainName - The unique address you reserve on Twilio to which you route your SIP traffic
    * @property friendlyName - A string to describe the resource
    * @property secure - Whether Secure Trunking is enabled for the trunk
    * @property transferCallerId - Caller Id for transfer target
    * @property transferMode - The call transfer settings for the trunk
    */
  trait TrunkListInstanceCreateOptions extends StObject {
    
    var cnamLookupEnabled: js.UndefOr[Boolean] = js.undefined
    
    var disasterRecoveryMethod: js.UndefOr[String] = js.undefined
    
    var disasterRecoveryUrl: js.UndefOr[String] = js.undefined
    
    var domainName: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var transferCallerId: js.UndefOr[TrunkTransferCallerId] = js.undefined
    
    var transferMode: js.UndefOr[TrunkTransferSetting] = js.undefined
  }
  object TrunkListInstanceCreateOptions {
    
    inline def apply(): TrunkListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrunkListInstanceCreateOptions]
    }
    
    extension [Self <: TrunkListInstanceCreateOptions](x: Self) {
      
      inline def setCnamLookupEnabled(value: Boolean): Self = StObject.set(x, "cnamLookupEnabled", value.asInstanceOf[js.Any])
      
      inline def setCnamLookupEnabledUndefined: Self = StObject.set(x, "cnamLookupEnabled", js.undefined)
      
      inline def setDisasterRecoveryMethod(value: String): Self = StObject.set(x, "disasterRecoveryMethod", value.asInstanceOf[js.Any])
      
      inline def setDisasterRecoveryMethodUndefined: Self = StObject.set(x, "disasterRecoveryMethod", js.undefined)
      
      inline def setDisasterRecoveryUrl(value: String): Self = StObject.set(x, "disasterRecoveryUrl", value.asInstanceOf[js.Any])
      
      inline def setDisasterRecoveryUrlUndefined: Self = StObject.set(x, "disasterRecoveryUrl", js.undefined)
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setTransferCallerId(value: TrunkTransferCallerId): Self = StObject.set(x, "transferCallerId", value.asInstanceOf[js.Any])
      
      inline def setTransferCallerIdUndefined: Self = StObject.set(x, "transferCallerId", js.undefined)
      
      inline def setTransferMode(value: TrunkTransferSetting): Self = StObject.set(x, "transferMode", value.asInstanceOf[js.Any])
      
      inline def setTransferModeUndefined: Self = StObject.set(x, "transferMode", js.undefined)
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
  trait TrunkListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TrunkInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TrunkListInstanceEachOptions {
    
    inline def apply(): TrunkListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrunkListInstanceEachOptions]
    }
    
    extension [Self <: TrunkListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ TrunkInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
  trait TrunkListInstanceOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object TrunkListInstanceOptions {
    
    inline def apply(): TrunkListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrunkListInstanceOptions]
    }
    
    extension [Self <: TrunkListInstanceOptions](x: Self) {
      
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
  trait TrunkListInstancePageOptions extends StObject {
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object TrunkListInstancePageOptions {
    
    inline def apply(): TrunkListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrunkListInstancePageOptions]
    }
    
    extension [Self <: TrunkListInstancePageOptions](x: Self) {
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait TrunkPayload
    extends StObject
       with TrunkResource
       with TwilioResponsePayload
  object TrunkPayload {
    
    inline def apply(
      account_sid: String,
      auth_type: String,
      auth_type_set: js.Array[String],
      cnam_lookup_enabled: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      disaster_recovery_method: String,
      disaster_recovery_url: String,
      domain_name: String,
      first_page_uri: String,
      friendly_name: String,
      links: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      recording: js.Object,
      secure: Boolean,
      sid: String,
      transfer_caller_id: TrunkTransferCallerId,
      transfer_mode: TrunkTransferSetting,
      uri: String,
      url: String
    ): TrunkPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], auth_type = auth_type.asInstanceOf[js.Any], auth_type_set = auth_type_set.asInstanceOf[js.Any], cnam_lookup_enabled = cnam_lookup_enabled.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], disaster_recovery_method = disaster_recovery_method.asInstanceOf[js.Any], disaster_recovery_url = disaster_recovery_url.asInstanceOf[js.Any], domain_name = domain_name.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], transfer_caller_id = transfer_caller_id.asInstanceOf[js.Any], transfer_mode = transfer_mode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrunkPayload]
    }
  }
  
  trait TrunkResource extends StObject {
    
    var account_sid: String
    
    var auth_type: String
    
    var auth_type_set: js.Array[String]
    
    var cnam_lookup_enabled: Boolean
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var disaster_recovery_method: String
    
    var disaster_recovery_url: String
    
    var domain_name: String
    
    var friendly_name: String
    
    var links: String
    
    var recording: js.Object
    
    var secure: Boolean
    
    var sid: String
    
    var transfer_caller_id: TrunkTransferCallerId
    
    var transfer_mode: TrunkTransferSetting
    
    var url: String
  }
  object TrunkResource {
    
    inline def apply(
      account_sid: String,
      auth_type: String,
      auth_type_set: js.Array[String],
      cnam_lookup_enabled: Boolean,
      date_created: js.Date,
      date_updated: js.Date,
      disaster_recovery_method: String,
      disaster_recovery_url: String,
      domain_name: String,
      friendly_name: String,
      links: String,
      recording: js.Object,
      secure: Boolean,
      sid: String,
      transfer_caller_id: TrunkTransferCallerId,
      transfer_mode: TrunkTransferSetting,
      url: String
    ): TrunkResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], auth_type = auth_type.asInstanceOf[js.Any], auth_type_set = auth_type_set.asInstanceOf[js.Any], cnam_lookup_enabled = cnam_lookup_enabled.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], disaster_recovery_method = disaster_recovery_method.asInstanceOf[js.Any], disaster_recovery_url = disaster_recovery_url.asInstanceOf[js.Any], domain_name = domain_name.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], transfer_caller_id = transfer_caller_id.asInstanceOf[js.Any], transfer_mode = transfer_mode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrunkResource]
    }
    
    extension [Self <: TrunkResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAuth_type(value: String): Self = StObject.set(x, "auth_type", value.asInstanceOf[js.Any])
      
      inline def setAuth_type_set(value: js.Array[String]): Self = StObject.set(x, "auth_type_set", value.asInstanceOf[js.Any])
      
      inline def setAuth_type_setVarargs(value: String*): Self = StObject.set(x, "auth_type_set", js.Array(value*))
      
      inline def setCnam_lookup_enabled(value: Boolean): Self = StObject.set(x, "cnam_lookup_enabled", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDisaster_recovery_method(value: String): Self = StObject.set(x, "disaster_recovery_method", value.asInstanceOf[js.Any])
      
      inline def setDisaster_recovery_url(value: String): Self = StObject.set(x, "disaster_recovery_url", value.asInstanceOf[js.Any])
      
      inline def setDomain_name(value: String): Self = StObject.set(x, "domain_name", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: String): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRecording(value: js.Object): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setTransfer_caller_id(value: TrunkTransferCallerId): Self = StObject.set(x, "transfer_caller_id", value.asInstanceOf[js.Any])
      
      inline def setTransfer_mode(value: TrunkTransferSetting): Self = StObject.set(x, "transfer_mode", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrunkSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`from-transferee`
    - typings.twilio.twilioStrings.`from-transferor`
  */
  trait TrunkTransferCallerId extends StObject
  object TrunkTransferCallerId {
    
    inline def `from-transferee`: typings.twilio.twilioStrings.`from-transferee` = "from-transferee".asInstanceOf[typings.twilio.twilioStrings.`from-transferee`]
    
    inline def `from-transferor`: typings.twilio.twilioStrings.`from-transferor` = "from-transferor".asInstanceOf[typings.twilio.twilioStrings.`from-transferor`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.`disable-all`
    - typings.twilio.twilioStrings.`enable-all`
    - typings.twilio.twilioStrings.`sip-only`
  */
  trait TrunkTransferSetting extends StObject
  object TrunkTransferSetting {
    
    inline def `disable-all`: typings.twilio.twilioStrings.`disable-all` = "disable-all".asInstanceOf[typings.twilio.twilioStrings.`disable-all`]
    
    inline def `enable-all`: typings.twilio.twilioStrings.`enable-all` = "enable-all".asInstanceOf[typings.twilio.twilioStrings.`enable-all`]
    
    inline def `sip-only`: typings.twilio.twilioStrings.`sip-only` = "sip-only".asInstanceOf[typings.twilio.twilioStrings.`sip-only`]
  }
}
