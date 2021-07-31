package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInstance
  extends StObject
     with PostableResource {
  
  var addresses: AddressResource
  
  var applications: ApplicationResource
  
  var authorizedConnectApps: AuthorizedConnectAppResource
  
  // Mixed-in resources
  def availablePhoneNumbers(resourceSid: String): AvailablePhoneNumberInstance
  // Mixed-in resources
  @JSName("availablePhoneNumbers")
  var availablePhoneNumbers_Original: AvailablePhoneNumberResource
  
  var calls: CallResource
  
  var conferences: ConferenceResource
  
  var connectApps: ConnectAppResource
  
  var incomingPhoneNumbers: IncomingPhoneNumberResource
  
  var keys: KeyResource
  
  var messages: MessageResource
  
  var notifications: NotificationResource
  
  var outgoingCallerIds: OutgoingCallerIdResource
  
  def put(args: js.Any): Promise[js.Any]
  def put(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def put(callback: RequestCallback): Promise[js.Any]
  @JSName("put")
  var put_Original: RestMethod
  
  var queues: QueueResource
  
  var recordings: RecordingResource
  
  var sip: SIPIntermediary
  
  var sms: SMSIntermediary
  
  var tokens: TokenResource
  
  var transcriptions: TranscriptionResource
  
  def update(args: js.Any): Promise[js.Any]
  def update(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def update(callback: RequestCallback): Promise[js.Any]
  @JSName("update")
  var update_Original: RestMethod
  
  var usage: UsageIntermediary
}
object AccountInstance {
  
  @scala.inline
  def apply(
    addresses: AddressResource,
    applications: ApplicationResource,
    authorizedConnectApps: AuthorizedConnectAppResource,
    availablePhoneNumbers: /* resourceSid */ String => AvailablePhoneNumberInstance,
    calls: CallResource,
    conferences: ConferenceResource,
    connectApps: ConnectAppResource,
    get: RestMethod,
    incomingPhoneNumbers: IncomingPhoneNumberResource,
    keys: KeyResource,
    messages: MessageResource,
    notifications: NotificationResource,
    outgoingCallerIds: OutgoingCallerIdResource,
    post: RestMethod,
    put: RestMethod,
    queues: QueueResource,
    recordings: RecordingResource,
    sip: SIPIntermediary,
    sms: SMSIntermediary,
    tokens: TokenResource,
    transcriptions: TranscriptionResource,
    update: RestMethod,
    usage: UsageIntermediary
  ): AccountInstance = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], applications = applications.asInstanceOf[js.Any], authorizedConnectApps = authorizedConnectApps.asInstanceOf[js.Any], availablePhoneNumbers = js.Any.fromFunction1(availablePhoneNumbers), calls = calls.asInstanceOf[js.Any], conferences = conferences.asInstanceOf[js.Any], connectApps = connectApps.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], incomingPhoneNumbers = incomingPhoneNumbers.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], outgoingCallerIds = outgoingCallerIds.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any], recordings = recordings.asInstanceOf[js.Any], sip = sip.asInstanceOf[js.Any], sms = sms.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], transcriptions = transcriptions.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInstance]
  }
  
  @scala.inline
  implicit class AccountInstanceMutableBuilder[Self <: AccountInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: AddressResource): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplications(value: ApplicationResource): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedConnectApps(value: AuthorizedConnectAppResource): Self = StObject.set(x, "authorizedConnectApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailablePhoneNumbers(value: /* resourceSid */ String => AvailablePhoneNumberInstance): Self = StObject.set(x, "availablePhoneNumbers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalls(value: CallResource): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferences(value: ConferenceResource): Self = StObject.set(x, "conferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectApps(value: ConnectAppResource): Self = StObject.set(x, "connectApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingPhoneNumbers(value: IncomingPhoneNumberResource): Self = StObject.set(x, "incomingPhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: KeyResource): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: MessageResource): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifications(value: NotificationResource): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingCallerIds(value: OutgoingCallerIdResource): Self = StObject.set(x, "outgoingCallerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPut(value: RestMethod): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueues(value: QueueResource): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordings(value: RecordingResource): Self = StObject.set(x, "recordings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSip(value: SIPIntermediary): Self = StObject.set(x, "sip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSms(value: SMSIntermediary): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: TokenResource): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptions(value: TranscriptionResource): Self = StObject.set(x, "transcriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: RestMethod): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: UsageIntermediary): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
