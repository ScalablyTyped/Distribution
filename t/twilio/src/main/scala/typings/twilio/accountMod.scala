package typings.twilio

import typings.twilio.accountNotificationMod.NotificationContext
import typings.twilio.accountNotificationMod.NotificationListInstance
import typings.twilio.accountRecordingMod.RecordingContext
import typings.twilio.accountRecordingMod.RecordingListInstance
import typings.twilio.accountTranscriptionMod.TranscriptionContext
import typings.twilio.accountTranscriptionMod.TranscriptionListInstance
import typings.twilio.addressMod.AddressContext
import typings.twilio.addressMod.AddressListInstance
import typings.twilio.anon.Key
import typings.twilio.applicationMod.ApplicationContext
import typings.twilio.applicationMod.ApplicationListInstance
import typings.twilio.authorizedConnectAppMod.AuthorizedConnectAppContext
import typings.twilio.authorizedConnectAppMod.AuthorizedConnectAppListInstance
import typings.twilio.availablePhoneNumberMod.AvailablePhoneNumberCountryContext
import typings.twilio.availablePhoneNumberMod.AvailablePhoneNumberCountryListInstance
import typings.twilio.balanceMod.BalanceListInstance
import typings.twilio.callMod.CallContext
import typings.twilio.callMod.CallListInstance
import typings.twilio.conferenceMod.ConferenceContext
import typings.twilio.conferenceMod.ConferenceListInstance
import typings.twilio.connectAppMod.ConnectAppContext
import typings.twilio.connectAppMod.ConnectAppListInstance
import typings.twilio.incomingPhoneNumberMod.IncomingPhoneNumberContext
import typings.twilio.incomingPhoneNumberMod.IncomingPhoneNumberListInstance
import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.keyMod.KeyContext
import typings.twilio.keyMod.KeyListInstance
import typings.twilio.messageMod.MessageContext
import typings.twilio.messageMod.MessageListInstance
import typings.twilio.newKeyMod.NewKeyListInstance
import typings.twilio.newSigningKeyMod.NewSigningKeyListInstance
import typings.twilio.outgoingCallerIdMod.OutgoingCallerIdContext
import typings.twilio.outgoingCallerIdMod.OutgoingCallerIdListInstance
import typings.twilio.queueMod.QueueContext
import typings.twilio.queueMod.QueueListInstance
import typings.twilio.shortCodeMod.ShortCodeContext
import typings.twilio.shortCodeMod.ShortCodeListInstance
import typings.twilio.signingKeyMod.SigningKeyContext
import typings.twilio.signingKeyMod.SigningKeyListInstance
import typings.twilio.sipMod.SipListInstance
import typings.twilio.tokenMod.TokenListInstance
import typings.twilio.twilioStrings.active_
import typings.twilio.usageMod.UsageListInstance
import typings.twilio.validationRequestMod.ValidationRequestListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/api/v2010/account", "AccountContext")
  @js.native
  open class AccountContext protected () extends StObject {
    /**
      * Initialize the AccountContext
      *
      * @param version - Version of the resource
      * @param sid - Fetch by unique Account Sid
      */
    def this(version: typings.twilio.v2010Mod.^, sid: String) = this()
    
    /**
      * @param sid - sid of instance
      */
    def addresses(sid: String): AddressContext = js.native
    @JSName("addresses")
    var addresses_Original: AddressListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def applications(sid: String): ApplicationContext = js.native
    @JSName("applications")
    var applications_Original: ApplicationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def authorizedConnectApps(sid: String): AuthorizedConnectAppContext = js.native
    @JSName("authorizedConnectApps")
    var authorizedConnectApps_Original: AuthorizedConnectAppListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def availablePhoneNumbers(sid: String): AvailablePhoneNumberCountryContext = js.native
    @JSName("availablePhoneNumbers")
    var availablePhoneNumbers_Original: AvailablePhoneNumberCountryListInstance = js.native
    
    var balance: BalanceListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def calls(sid: String): CallContext = js.native
    @JSName("calls")
    var calls_Original: CallListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def conferences(sid: String): ConferenceContext = js.native
    @JSName("conferences")
    var conferences_Original: ConferenceListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def connectApps(sid: String): ConnectAppContext = js.native
    @JSName("connectApps")
    var connectApps_Original: ConnectAppListInstance = js.native
    
    /**
      * fetch a AccountInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AccountInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ AccountInstance, Any]): js.Promise[AccountInstance] = js.native
    
    /**
      * @param sid - sid of instance
      */
    def incomingPhoneNumbers(sid: String): IncomingPhoneNumberContext = js.native
    @JSName("incomingPhoneNumbers")
    var incomingPhoneNumbers_Original: IncomingPhoneNumberListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def keys(sid: String): KeyContext = js.native
    @JSName("keys")
    var keys_Original: KeyListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def messages(sid: String): MessageContext = js.native
    @JSName("messages")
    var messages_Original: MessageListInstance = js.native
    
    var newKeys: NewKeyListInstance = js.native
    
    var newSigningKeys: NewSigningKeyListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def notifications(sid: String): NotificationContext = js.native
    @JSName("notifications")
    var notifications_Original: NotificationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def outgoingCallerIds(sid: String): OutgoingCallerIdContext = js.native
    @JSName("outgoingCallerIds")
    var outgoingCallerIds_Original: OutgoingCallerIdListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def queues(sid: String): QueueContext = js.native
    @JSName("queues")
    var queues_Original: QueueListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def recordings(sid: String): RecordingContext = js.native
    @JSName("recordings")
    var recordings_Original: RecordingListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def shortCodes(sid: String): ShortCodeContext = js.native
    @JSName("shortCodes")
    var shortCodes_Original: ShortCodeListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def signingKeys(sid: String): SigningKeyContext = js.native
    @JSName("signingKeys")
    var signingKeys_Original: SigningKeyListInstance = js.native
    
    var sip: SipListInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    var tokens: TokenListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def transcriptions(sid: String): TranscriptionContext = js.native
    @JSName("transcriptions")
    var transcriptions_Original: TranscriptionListInstance = js.native
    
    /**
      * update a AccountInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AccountInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ AccountInstance, Any]): js.Promise[AccountInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AccountInstance, Any]): js.Promise[AccountInstance] = js.native
    def update(opts: AccountInstanceUpdateOptions): js.Promise[AccountInstance] = js.native
    def update(
      opts: AccountInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AccountInstance, Any]
    ): js.Promise[AccountInstance] = js.native
    
    var usage: UsageListInstance = js.native
    
    var validationRequests: ValidationRequestListInstance = js.native
  }
  
  @JSImport("twilio/lib/rest/api/v2010/account", "AccountInstance")
  @js.native
  open class AccountInstance protected () extends SerializableClass {
    /**
      * Initialize the AccountContext
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param sid - Fetch by unique Account Sid
      */
    def this(version: typings.twilio.v2010Mod.^, payload: AccountPayload, sid: String) = this()
    
    /* private */ var _proxy: AccountContext = js.native
    
    /**
      * Access the addresses
      */
    def addresses(): AddressListInstance = js.native
    
    /**
      * Access the applications
      */
    def applications(): ApplicationListInstance = js.native
    
    var authToken: String = js.native
    
    /**
      * Access the authorizedConnectApps
      */
    def authorizedConnectApps(): AuthorizedConnectAppListInstance = js.native
    
    /**
      * Access the availablePhoneNumbers
      */
    def availablePhoneNumbers(): AvailablePhoneNumberCountryListInstance = js.native
    
    /**
      * Access the balance
      */
    def balance(): BalanceListInstance = js.native
    
    /**
      * Access the calls
      */
    def calls(): CallListInstance = js.native
    
    /**
      * Access the conferences
      */
    def conferences(): ConferenceListInstance = js.native
    
    /**
      * Access the connectApps
      */
    def connectApps(): ConnectAppListInstance = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    /**
      * fetch a AccountInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[AccountInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AccountInstance] = js.native
    
    var friendlyName: String = js.native
    
    /**
      * Access the incomingPhoneNumbers
      */
    def incomingPhoneNumbers(): IncomingPhoneNumberListInstance = js.native
    
    /**
      * Access the keys
      */
    def keys(): KeyListInstance = js.native
    
    /**
      * Access the messages
      */
    def messages(): MessageListInstance = js.native
    
    /**
      * Access the newKeys
      */
    def newKeys(): NewKeyListInstance = js.native
    
    /**
      * Access the newSigningKeys
      */
    def newSigningKeys(): NewSigningKeyListInstance = js.native
    
    /**
      * Access the notifications
      */
    def notifications(): NotificationListInstance = js.native
    
    /**
      * Access the outgoingCallerIds
      */
    def outgoingCallerIds(): OutgoingCallerIdListInstance = js.native
    
    var ownerAccountSid: String = js.native
    
    /**
      * Access the queues
      */
    def queues(): QueueListInstance = js.native
    
    /**
      * Access the recordings
      */
    def recordings(): RecordingListInstance = js.native
    
    /**
      * Access the shortCodes
      */
    def shortCodes(): ShortCodeListInstance = js.native
    
    var sid: String = js.native
    
    /**
      * Access the signingKeys
      */
    def signingKeys(): SigningKeyListInstance = js.native
    
    /**
      * Access the sip
      */
    def sip(): SipListInstance = js.native
    
    var status: AccountStatus = js.native
    
    var subresourceUris: String = js.native
    
    /**
      * Access the tokens
      */
    def tokens(): TokenListInstance = js.native
    
    /**
      * Access the transcriptions
      */
    def transcriptions(): TranscriptionListInstance = js.native
    
    var `type`: AccountType = js.native
    
    /**
      * update a AccountInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[AccountInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AccountInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[AccountInstance] = js.native
    def update(opts: AccountInstanceUpdateOptions): js.Promise[AccountInstance] = js.native
    def update(
      opts: AccountInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[AccountInstance] = js.native
    
    var uri: String = js.native
    
    /**
      * Access the usage
      */
    def usage(): UsageListInstance = js.native
    
    /**
      * Access the validationRequests
      */
    def validationRequests(): ValidationRequestListInstance = js.native
  }
  
  /**
    * Initialize the AccountList
    *
    * @param version - Version of the resource
    */
  inline def AccountList(version: typings.twilio.v2010Mod.^): AccountListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("AccountList")(version.asInstanceOf[js.Any]).asInstanceOf[AccountListInstance]
  
  @JSImport("twilio/lib/rest/api/v2010/account", "AccountPage")
  @js.native
  open class AccountPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.v2010Mod.^, AccountPayload, AccountResource, AccountInstance] {
    /**
      * Initialize the AccountPage
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.v2010Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: AccountSolution
    ) = this()
    
    /**
      * Build an instance of AccountInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: AccountPayload): AccountInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property friendlyName - FriendlyName to update
    * @property status - Status to update the Account with
    */
  trait AccountInstanceUpdateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[AccountStatus] = js.undefined
  }
  object AccountInstanceUpdateOptions {
    
    inline def apply(): AccountInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountInstanceUpdateOptions]
    }
    
    extension [Self <: AccountInstanceUpdateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setStatus(value: AccountStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait AccountListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): AccountContext = js.native
    
    /**
      * create a AccountInstance
      *
      * @param callback - Callback to handle processed record
      */
    def create(): js.Promise[AccountInstance] = js.native
    def create(callback: js.Function2[/* error */ js.Error | Null, /* item */ AccountInstance, Any]): js.Promise[AccountInstance] = js.native
    def create(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* item */ AccountInstance, Any]): js.Promise[AccountInstance] = js.native
    def create(opts: AccountListInstanceCreateOptions): js.Promise[AccountInstance] = js.native
    def create(
      opts: AccountListInstanceCreateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ AccountInstance, Any]
    ): js.Promise[AccountInstance] = js.native
    
    /**
      * Streams AccountInstance records from the API.
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
          /* item */ AccountInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ AccountInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: AccountListInstanceEachOptions): Unit = js.native
    def each(
      opts: AccountListInstanceEachOptions,
      callback: js.Function2[
          /* item */ AccountInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Constructs a account
      *
      * @param sid - Fetch by unique Account Sid
      */
    def get(sid: String): AccountContext = js.native
    
    /**
      * Retrieve a single target page of AccountInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[AccountPage] = js.native
    def getPage(callback: js.Function2[/* error */ js.Error | Null, /* items */ AccountPage, Any]): js.Promise[AccountPage] = js.native
    def getPage(targetUrl: String): js.Promise[AccountPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AccountPage, Any]
    ): js.Promise[AccountPage] = js.native
    def getPage(targetUrl: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AccountPage, Any]): js.Promise[AccountPage] = js.native
    
    /**
      * Lists AccountInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[AccountInstance]] = js.native
    def list(callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AccountInstance], Any]): js.Promise[js.Array[AccountInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AccountInstance], Any]
    ): js.Promise[js.Array[AccountInstance]] = js.native
    def list(opts: AccountListInstanceOptions): js.Promise[js.Array[AccountInstance]] = js.native
    def list(
      opts: AccountListInstanceOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ js.Array[AccountInstance], Any]
    ): js.Promise[js.Array[AccountInstance]] = js.native
    
    /**
      * Retrieve a single page of AccountInstance records from the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[AccountPage] = js.native
    def page(callback: js.Function2[/* error */ js.Error | Null, /* items */ AccountPage, Any]): js.Promise[AccountPage] = js.native
    def page(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ AccountPage, Any]): js.Promise[AccountPage] = js.native
    def page(opts: AccountListInstancePageOptions): js.Promise[AccountPage] = js.native
    def page(
      opts: AccountListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ AccountPage, Any]
    ): js.Promise[AccountPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to create
    *
    * @property friendlyName - A human readable description of the account
    */
  trait AccountListInstanceCreateOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
  }
  object AccountListInstanceCreateOptions {
    
    inline def apply(): AccountListInstanceCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountListInstanceCreateOptions]
    }
    
    extension [Self <: AccountListInstanceCreateOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    }
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - FriendlyName to filter on
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
    * @property status - Status to filter on
    */
  trait AccountListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ AccountInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[AccountStatus] = js.undefined
  }
  object AccountListInstanceEachOptions {
    
    inline def apply(): AccountListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountListInstanceEachOptions]
    }
    
    extension [Self <: AccountListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ AccountInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
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
      
      inline def setStatus(value: AccountStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - FriendlyName to filter on
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
    * @property status - Status to filter on
    */
  trait AccountListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[AccountStatus] = js.undefined
  }
  object AccountListInstanceOptions {
    
    inline def apply(): AccountListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountListInstanceOptions]
    }
    
    extension [Self <: AccountListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStatus(value: AccountStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - FriendlyName to filter on
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property status - Status to filter on
    */
  trait AccountListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[AccountStatus] = js.undefined
  }
  object AccountListInstancePageOptions {
    
    inline def apply(): AccountListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountListInstancePageOptions]
    }
    
    extension [Self <: AccountListInstancePageOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setStatus(value: AccountStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.twilio.pageMod.TwilioResponsePayload because var conflicts: uri. Inlined first_page_uri, next_page_uri, page, page_size, previous_page_uri, meta */ trait AccountPayload
    extends StObject
       with AccountResource {
    
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
  object AccountPayload {
    
    inline def apply(
      auth_token: String,
      date_created: js.Date,
      date_updated: js.Date,
      first_page_uri: String,
      friendly_name: String,
      next_page_uri: String,
      owner_account_sid: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      sid: String,
      status: AccountStatus,
      subresource_uris: String,
      `type`: AccountType,
      uri: String
    ): AccountPayload = {
      val __obj = js.Dynamic.literal(auth_token = auth_token.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], owner_account_sid = owner_account_sid.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountPayload]
    }
    
    extension [Self <: AccountPayload](x: Self) {
      
      inline def setFirst_page_uri(value: String): Self = StObject.set(x, "first_page_uri", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Key): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNext_page_uri(value: String): Self = StObject.set(x, "next_page_uri", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page_uri(value: String): Self = StObject.set(x, "previous_page_uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccountResource extends StObject {
    
    var auth_token: String
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var friendly_name: String
    
    var owner_account_sid: String
    
    var sid: String
    
    var status: AccountStatus
    
    var subresource_uris: String
    
    var `type`: AccountType
    
    var uri: String
  }
  object AccountResource {
    
    inline def apply(
      auth_token: String,
      date_created: js.Date,
      date_updated: js.Date,
      friendly_name: String,
      owner_account_sid: String,
      sid: String,
      status: AccountStatus,
      subresource_uris: String,
      `type`: AccountType,
      uri: String
    ): AccountResource = {
      val __obj = js.Dynamic.literal(auth_token = auth_token.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], owner_account_sid = owner_account_sid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subresource_uris = subresource_uris.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountResource]
    }
    
    extension [Self <: AccountResource](x: Self) {
      
      inline def setAuth_token(value: String): Self = StObject.set(x, "auth_token", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setOwner_account_sid(value: String): Self = StObject.set(x, "owner_account_sid", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: AccountStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubresource_uris(value: String): Self = StObject.set(x, "subresource_uris", value.asInstanceOf[js.Any])
      
      inline def setType(value: AccountType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccountSolution extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.active_
    - typings.twilio.twilioStrings.suspended
    - typings.twilio.twilioStrings.closed
  */
  trait AccountStatus extends StObject
  object AccountStatus {
    
    inline def active: active_ = "active".asInstanceOf[active_]
    
    inline def closed: typings.twilio.twilioStrings.closed = "closed".asInstanceOf[typings.twilio.twilioStrings.closed]
    
    inline def suspended: typings.twilio.twilioStrings.suspended = "suspended".asInstanceOf[typings.twilio.twilioStrings.suspended]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.Trial
    - typings.twilio.twilioStrings.Full
  */
  trait AccountType extends StObject
  object AccountType {
    
    inline def Full: typings.twilio.twilioStrings.Full = "Full".asInstanceOf[typings.twilio.twilioStrings.Full]
    
    inline def Trial: typings.twilio.twilioStrings.Trial = "Trial".asInstanceOf[typings.twilio.twilioStrings.Trial]
  }
}
