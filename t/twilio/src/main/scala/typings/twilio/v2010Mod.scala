package typings.twilio

import typings.twilio.accountMod.AccountContext
import typings.twilio.accountMod.AccountListInstance
import typings.twilio.accountNotificationMod.NotificationContext
import typings.twilio.accountNotificationMod.NotificationListInstance
import typings.twilio.accountRecordingMod.RecordingContext
import typings.twilio.accountRecordingMod.RecordingListInstance
import typings.twilio.accountTranscriptionMod.TranscriptionContext
import typings.twilio.accountTranscriptionMod.TranscriptionListInstance
import typings.twilio.addressMod.AddressContext
import typings.twilio.addressMod.AddressListInstance
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
import typings.twilio.usageMod.UsageListInstance
import typings.twilio.validationRequestMod.ValidationRequestListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v2010Mod {
  
  @JSImport("twilio/lib/rest/api/V2010", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2010 {
    /**
      * Initialize the V2010 version of Api
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.apiMod.^) = this()
  }
  
  @js.native
  trait V2010
    extends typings.twilio.versionMod.^ {
    
    var account: AccountContext = js.native
    
    /**
      * @param sid - sid of instance
      */
    def accounts(sid: String): AccountContext = js.native
    @JSName("accounts")
    val accounts_Original: AccountListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def addresses(sid: String): AddressContext = js.native
    @JSName("addresses")
    val addresses_Original: AddressListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def applications(sid: String): ApplicationContext = js.native
    @JSName("applications")
    val applications_Original: ApplicationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def authorizedConnectApps(sid: String): AuthorizedConnectAppContext = js.native
    @JSName("authorizedConnectApps")
    val authorizedConnectApps_Original: AuthorizedConnectAppListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def availablePhoneNumbers(sid: String): AvailablePhoneNumberCountryContext = js.native
    @JSName("availablePhoneNumbers")
    val availablePhoneNumbers_Original: AvailablePhoneNumberCountryListInstance = js.native
    
    val balance: BalanceListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def calls(sid: String): CallContext = js.native
    @JSName("calls")
    val calls_Original: CallListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def conferences(sid: String): ConferenceContext = js.native
    @JSName("conferences")
    val conferences_Original: ConferenceListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def connectApps(sid: String): ConnectAppContext = js.native
    @JSName("connectApps")
    val connectApps_Original: ConnectAppListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def incomingPhoneNumbers(sid: String): IncomingPhoneNumberContext = js.native
    @JSName("incomingPhoneNumbers")
    val incomingPhoneNumbers_Original: IncomingPhoneNumberListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def keys(sid: String): KeyContext = js.native
    @JSName("keys")
    val keys_Original: KeyListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def messages(sid: String): MessageContext = js.native
    @JSName("messages")
    val messages_Original: MessageListInstance = js.native
    
    val newKeys: NewKeyListInstance = js.native
    
    val newSigningKeys: NewSigningKeyListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def notifications(sid: String): NotificationContext = js.native
    @JSName("notifications")
    val notifications_Original: NotificationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def outgoingCallerIds(sid: String): OutgoingCallerIdContext = js.native
    @JSName("outgoingCallerIds")
    val outgoingCallerIds_Original: OutgoingCallerIdListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def queues(sid: String): QueueContext = js.native
    @JSName("queues")
    val queues_Original: QueueListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def recordings(sid: String): RecordingContext = js.native
    @JSName("recordings")
    val recordings_Original: RecordingListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def shortCodes(sid: String): ShortCodeContext = js.native
    @JSName("shortCodes")
    val shortCodes_Original: ShortCodeListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def signingKeys(sid: String): SigningKeyContext = js.native
    @JSName("signingKeys")
    val signingKeys_Original: SigningKeyListInstance = js.native
    
    val sip: SipListInstance = js.native
    
    val tokens: TokenListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def transcriptions(sid: String): TranscriptionContext = js.native
    @JSName("transcriptions")
    val transcriptions_Original: TranscriptionListInstance = js.native
    
    val usage: UsageListInstance = js.native
    
    val validationRequests: ValidationRequestListInstance = js.native
  }
}
