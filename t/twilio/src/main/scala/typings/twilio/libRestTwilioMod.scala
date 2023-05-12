package typings.twilio

import typings.twilio.libBaseBaseTwilioMod.Client
import typings.twilio.libBaseBaseTwilioMod.ClientOpts
import typings.twilio.libBaseBaseTwilioMod.RequestOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTwilioMod {
  
  /**
    * Twilio Client to interact with the Rest API
    */
  @JSImport("twilio/lib/rest/Twilio", JSImport.Namespace)
  @js.native
  /**
    * Creates a new instance of Twilio Client
    *
    * @param username -
    *          The username used for authentication. This is normally account sid, but if using key/secret auth will be the api key sid.
    * @param password -
    *          The password used for authentication. This is normally auth token, but if using key/secret auth will be the secret.
    * @param opts - The options argument
    *
    * @returns A new instance of Twilio client
    */
  open class ^ () extends Twilio {
    def this(username: String) = this()
    def this(username: String, password: String) = this()
    def this(username: Unit, password: String) = this()
    def this(username: String, password: String, opts: ClientOpts) = this()
    def this(username: String, password: Unit, opts: ClientOpts) = this()
    def this(username: Unit, password: String, opts: ClientOpts) = this()
    def this(username: Unit, password: Unit, opts: ClientOpts) = this()
  }
  
  type RequestClientOptions = ClientOpts
  
  type RequestOptions = RequestOpts
  
  /**
    * Twilio Client to interact with the Rest API
    */
  @js.native
  trait Twilio extends Client {
    
    /** (Twilio.Accounts) - accounts domain */
    var _accounts: js.UndefOr[typings.twilio.libRestAccountsMod.^] = js.native
    
    /** (Twilio.Api) - api domain */
    var _api: js.UndefOr[typings.twilio.libRestApiMod.^] = js.native
    
    /** (Twilio.Autopilot) - autopilot domain */
    var _autopilot: js.UndefOr[typings.twilio.libRestAutopilotMod.^] = js.native
    
    /** (Twilio.Bulkexports) - bulkexports domain */
    var _bulkexports: js.UndefOr[typings.twilio.libRestBulkexportsMod.^] = js.native
    
    /** (Twilio.Chat) - chat domain */
    var _chat: js.UndefOr[typings.twilio.libRestChatMod.^] = js.native
    
    /** (Twilio.Content) - content domain */
    var _content: js.UndefOr[typings.twilio.libRestContentMod.^] = js.native
    
    /** (Twilio.Conversations) - conversations domain */
    var _conversations: js.UndefOr[typings.twilio.libRestConversationsMod.^] = js.native
    
    /** (Twilio.Events) - events domain */
    var _events: js.UndefOr[typings.twilio.libRestEventsMod.^] = js.native
    
    /** (Twilio.FlexApi) - flexApi domain */
    var _flexApi: js.UndefOr[typings.twilio.libRestFlexApiMod.^] = js.native
    
    /** (Twilio.FrontlineApi) - frontlineApi domain */
    var _frontlineApi: js.UndefOr[typings.twilio.libRestFrontlineApiMod.^] = js.native
    
    /** (Twilio.Insights) - insights domain */
    var _insights: js.UndefOr[typings.twilio.libRestInsightsMod.^] = js.native
    
    /** (Twilio.IpMessaging) - ipMessaging domain */
    var _ipMessaging: js.UndefOr[typings.twilio.libRestIpMessagingMod.^] = js.native
    
    /** (Twilio.Lookups) - lookups domain */
    var _lookups: js.UndefOr[typings.twilio.libRestLookupsMod.^] = js.native
    
    /** (Twilio.Media) - media domain */
    var _media: js.UndefOr[typings.twilio.libRestMediaMod.^] = js.native
    
    /** (Twilio.Messaging) - messaging domain */
    var _messaging: js.UndefOr[typings.twilio.libRestMessagingMod.^] = js.native
    
    /** (Twilio.Microvisor) - microvisor domain */
    var _microvisor: js.UndefOr[typings.twilio.libRestMicrovisorMod.^] = js.native
    
    /** (Twilio.Monitor) - monitor domain */
    var _monitor: js.UndefOr[typings.twilio.libRestMonitorMod.^] = js.native
    
    /** (Twilio.Notify) - notify domain */
    var _notify: js.UndefOr[typings.twilio.libRestNotifyMod.^] = js.native
    
    /** (Twilio.Numbers) - numbers domain */
    var _numbers: js.UndefOr[typings.twilio.libRestNumbersMod.^] = js.native
    
    /** (Twilio.Oauth) - oauth domain */
    var _oauth: js.UndefOr[typings.twilio.libRestOauthMod.^] = js.native
    
    /** (Twilio.Preview) - preview domain */
    var _preview: js.UndefOr[typings.twilio.libRestPreviewMod.^] = js.native
    
    /** (Twilio.Pricing) - pricing domain */
    var _pricing: js.UndefOr[typings.twilio.libRestPricingMod.^] = js.native
    
    /** (Twilio.Proxy) - proxy domain */
    var _proxy: js.UndefOr[typings.twilio.libRestProxyMod.^] = js.native
    
    /** (Twilio.Routes) - routes domain */
    var _routes: js.UndefOr[typings.twilio.libRestRoutesMod.^] = js.native
    
    /** (Twilio.Serverless) - serverless domain */
    var _serverless: js.UndefOr[typings.twilio.libRestServerlessMod.^] = js.native
    
    /** (Twilio.Studio) - studio domain */
    var _studio: js.UndefOr[typings.twilio.libRestStudioMod.^] = js.native
    
    /** (Twilio.Supersim) - supersim domain */
    var _supersim: js.UndefOr[typings.twilio.libRestSupersimMod.^] = js.native
    
    /** (Twilio.Sync) - sync domain */
    var _sync: js.UndefOr[typings.twilio.libRestSyncMod.^] = js.native
    
    /** (Twilio.Taskrouter) - taskrouter domain */
    var _taskrouter: js.UndefOr[typings.twilio.libRestTaskrouterMod.^] = js.native
    
    /** (Twilio.Trunking) - trunking domain */
    var _trunking: js.UndefOr[typings.twilio.libRestTrunkingMod.^] = js.native
    
    /** (Twilio.Trusthub) - trusthub domain */
    var _trusthub: js.UndefOr[typings.twilio.libRestTrusthubMod.^] = js.native
    
    /** (Twilio.Verify) - verify domain */
    var _verify: js.UndefOr[typings.twilio.libRestVerifyMod.^] = js.native
    
    /** (Twilio.Video) - video domain */
    var _video: js.UndefOr[typings.twilio.libRestVideoMod.^] = js.native
    
    /** (Twilio.Voice) - voice domain */
    var _voice: js.UndefOr[typings.twilio.libRestVoiceMod.^] = js.native
    
    /** (Twilio.Wireless) - wireless domain */
    var _wireless: js.UndefOr[typings.twilio.libRestWirelessMod.^] = js.native
    
    /** Getter for (Twilio.Accounts) domain */
    def accounts: typings.twilio.libRestAccountsMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.AddressListInstance) addresses resource */
    def addresses: Any = js.native
    
    /** Getter for (Twilio.Api) domain */
    def api: typings.twilio.libRestApiMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.ApplicationListInstance) applications resource */
    def applications: Any = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.AuthorizedConnectAppListInstance) authorizedConnectApps resource */
    def authorizedConnectApps: Any = js.native
    
    /** Getter for (Twilio.Autopilot) domain */
    def autopilot: typings.twilio.libRestAutopilotMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.AvailablePhoneNumberCountryListInstance) availablePhoneNumbers resource */
    def availablePhoneNumbers: Any = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.BalanceListInstance) balance resource */
    def balance: Any = js.native
    
    /** Getter for (Twilio.Bulkexports) domain */
    def bulkexports: typings.twilio.libRestBulkexportsMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.CallListInstance) calls resource */
    def calls: Any = js.native
    
    /** Getter for (Twilio.Chat) domain */
    def chat: typings.twilio.libRestChatMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.ConferenceListInstance) conferences resource */
    def conferences: Any = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.ConnectAppListInstance) connectApps resource */
    def connectApps: Any = js.native
    
    /** Getter for (Twilio.Content) domain */
    def content: typings.twilio.libRestContentMod.^ = js.native
    
    /** Getter for (Twilio.Conversations) domain */
    def conversations: typings.twilio.libRestConversationsMod.^ = js.native
    
    /** Getter for (Twilio.Events) domain */
    def events: typings.twilio.libRestEventsMod.^ = js.native
    
    /** Getter for (Twilio.FlexApi) domain */
    def flexApi: typings.twilio.libRestFlexApiMod.^ = js.native
    
    /** Getter for (Twilio.FrontlineApi) domain */
    def frontlineApi: typings.twilio.libRestFrontlineApiMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.IncomingPhoneNumberListInstance) incomingPhoneNumbers resource */
    def incomingPhoneNumbers: Any = js.native
    
    /** Getter for (Twilio.Insights) domain */
    def insights: typings.twilio.libRestInsightsMod.^ = js.native
    
    /** Getter for (Twilio.IpMessaging) domain */
    def ipMessaging: typings.twilio.libRestIpMessagingMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.KeyListInstance) keys resource */
    def keys: Any = js.native
    
    /** Getter for (Twilio.Lookups) domain */
    def lookups: typings.twilio.libRestLookupsMod.^ = js.native
    
    /** Getter for (Twilio.Media) domain */
    def media: typings.twilio.libRestMediaMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.MessageListInstance) messages resource */
    def messages: Any = js.native
    
    /** Getter for (Twilio.Messaging) domain */
    def messaging: typings.twilio.libRestMessagingMod.^ = js.native
    
    /** Getter for (Twilio.Microvisor) domain */
    def microvisor: typings.twilio.libRestMicrovisorMod.^ = js.native
    
    /** Getter for (Twilio.Monitor) domain */
    def monitor: typings.twilio.libRestMonitorMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.NewKeyListInstance) newKeys resource */
    def newKeys: Any = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.NewSigningKeyListInstance) newSigningKeys resource */
    def newSigningKeys: Any = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.NotificationListInstance) notifications resource */
    def notifications: Any = js.native
    
    /** Getter for (Twilio.Numbers) domain */
    def numbers: typings.twilio.libRestNumbersMod.^ = js.native
    
    /** Getter for (Twilio.Oauth) domain */
    def oauth: typings.twilio.libRestOauthMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.OutgoingCallerIdListInstance) outgoingCallerIds resource */
    def outgoingCallerIds: Any = js.native
    
    /** Getter for (Twilio.Preview) domain */
    def preview: typings.twilio.libRestPreviewMod.^ = js.native
    
    /** Getter for (Twilio.Pricing) domain */
    def pricing: typings.twilio.libRestPricingMod.^ = js.native
    
    /** Getter for (Twilio.Proxy) domain */
    def proxy: typings.twilio.libRestProxyMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.QueueListInstance) queues resource */
    def queues: Any = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.RecordingListInstance) recordings resource */
    def recordings: Any = js.native
    
    /** Getter for (Twilio.Routes) domain */
    def routes: typings.twilio.libRestRoutesMod.^ = js.native
    
    /** Getter for (Twilio.Serverless) domain */
    def serverless: typings.twilio.libRestServerlessMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.ShortCodeListInstance) shortCodes resource */
    def shortCodes: Any = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.SigningKeyListInstance) signingKeys resource */
    def signingKeys: Any = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.SipListInstance) sip resource */
    def sip: Any = js.native
    
    /** Getter for (Twilio.Studio) domain */
    def studio: typings.twilio.libRestStudioMod.^ = js.native
    
    /** Getter for (Twilio.Supersim) domain */
    def supersim: typings.twilio.libRestSupersimMod.^ = js.native
    
    /** Getter for (Twilio.Sync) domain */
    def sync: typings.twilio.libRestSyncMod.^ = js.native
    
    /** Getter for (Twilio.Taskrouter) domain */
    def taskrouter: typings.twilio.libRestTaskrouterMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.TokenListInstance) tokens resource */
    def tokens: Any = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.TranscriptionListInstance) transcriptions resource */
    def transcriptions: Any = js.native
    
    /** Getter for (Twilio.Trunking) domain */
    def trunking: typings.twilio.libRestTrunkingMod.^ = js.native
    
    /** Getter for (Twilio.Trusthub) domain */
    def trusthub: typings.twilio.libRestTrusthubMod.^ = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.UsageListInstance) usage resource */
    def usage: Any = js.native
    
    /** Getter for (Twilio.Api.V2010.AccountContext.ValidationRequestListInstance) validationRequests resource */
    def validationRequests: Any = js.native
    
    /** Getter for (Twilio.Verify) domain */
    def verify: typings.twilio.libRestVerifyMod.^ = js.native
    
    /** Getter for (Twilio.Video) domain */
    def video: typings.twilio.libRestVideoMod.^ = js.native
    
    /** Getter for (Twilio.Voice) domain */
    def voice: typings.twilio.libRestVoiceMod.^ = js.native
    
    /** Getter for (Twilio.Wireless) domain */
    def wireless: typings.twilio.libRestWirelessMod.^ = js.native
  }
}
