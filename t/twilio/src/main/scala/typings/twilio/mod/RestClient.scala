package typings.twilio.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "RestClient")
@js.native
class RestClient () extends Client {
  def this(sid: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String, options: ClientOptions) = this()
  def this(sid: String, tkn: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
  def this(sid: String, tkn: String, options: ClientOptions) = this()
  
  var accounts: AccountResource = js.native
  
  var addresses: AddressResource = js.native
  
  var applications: ApplicationResource = js.native
  
  var authorizedConnectApps: AuthorizedConnectAppResource = js.native
  
  // Imported from AccountResource
  def availablePhoneNumbers(resourceSid: String): AvailablePhoneNumberInstance = js.native
  // Imported from AccountResource
  @JSName("availablePhoneNumbers")
  var availablePhoneNumbers_Original: AvailablePhoneNumberResource = js.native
  
  var calls: CallResource = js.native
  
  var conferences: ConferenceResource = js.native
  
  var connectApps: ConnectAppResource = js.native
  
  def get(args: js.Any): Promise[_] = js.native
  def get(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def get(callback: RequestCallback): Promise[_] = js.native
  
  def getCall(callSid: String): Promise[_] = js.native
  def getCall(callSid: String, callback: RequestCallback): Promise[_] = js.native
  
  def getMessage(messageSid: String): Promise[_] = js.native
  def getMessage(messageSid: String, callback: RequestCallback): Promise[_] = js.native
  
  def getSms(messageSid: String): Promise[_] = js.native
  def getSms(messageSid: String, callback: RequestCallback): Promise[_] = js.native
  
  @JSName("get")
  var get_Original: RestMethod = js.native
  
  var incomingPhoneNumbers: IncomingPhoneNumberResource = js.native
  
  var keys: KeyResource = js.native
  
  def list(args: js.Any): Promise[_] = js.native
  def list(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def list(callback: RequestCallback): Promise[_] = js.native
  
  def listCalls(args: js.Any): Promise[_] = js.native
  def listCalls(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def listCalls(callback: RequestCallback): Promise[_] = js.native
  @JSName("listCalls")
  var listCalls_Original: RestMethod = js.native
  
  def listMessages(args: js.Any): Promise[_] = js.native
  def listMessages(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def listMessages(callback: RequestCallback): Promise[_] = js.native
  @JSName("listMessages")
  var listMessages_Original: RestMethod = js.native
  
  def listSms(args: js.Any): Promise[_] = js.native
  def listSms(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def listSms(callback: RequestCallback): Promise[_] = js.native
  @JSName("listSms")
  var listSms_Original: RestMethod = js.native
  
  @JSName("list")
  var list_Original: RestMethod = js.native
  
  // Calls shorthand
  def makeCall(args: js.Any): Promise[_] = js.native
  def makeCall(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  // Calls shorthand
  def makeCall(callback: RequestCallback): Promise[_] = js.native
  // Calls shorthand
  @JSName("makeCall")
  var makeCall_Original: RestMethod = js.native
  
  var messages: MessageResource = js.native
  
  var notifications: NotificationResource = js.native
  
  var outgoingCallerIds: OutgoingCallerIdResource = js.native
  
  def post(args: js.Any): Promise[_] = js.native
  def post(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def post(callback: RequestCallback): Promise[_] = js.native
  @JSName("post")
  var post_Original: RestMethod = js.native
  
  // Mixed-in Methods
  def put(args: js.Any): Promise[_] = js.native
  def put(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  // Mixed-in Methods
  def put(callback: RequestCallback): Promise[_] = js.native
  // Mixed-in Methods
  @JSName("put")
  var put_Original: RestMethod = js.native
  
  var queues: QueueResource = js.native
  
  var recordings: RecordingResource = js.native
  
  def sendMessage(args: js.Any): Promise[_] = js.native
  def sendMessage(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def sendMessage(callback: RequestCallback): Promise[_] = js.native
  @JSName("sendMessage")
  var sendMessage_Original: RestMethod = js.native
  
  def sendMms(args: js.Any): Promise[_] = js.native
  def sendMms(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def sendMms(callback: RequestCallback): Promise[_] = js.native
  @JSName("sendMms")
  var sendMms_Original: RestMethod = js.native
  
  // Messaging shorthand
  def sendSms(args: js.Any): Promise[_] = js.native
  def sendSms(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  // Messaging shorthand
  def sendSms(callback: RequestCallback): Promise[_] = js.native
  // Messaging shorthand
  @JSName("sendSms")
  var sendSms_Original: RestMethod = js.native
  
  var sip: SIPIntermediary = js.native
  
  var sms: SMSIntermediary = js.native
  
  var tokens: TokenResource = js.native
  
  var transcriptions: TranscriptionResource = js.native
  
  def update(args: js.Any): Promise[_] = js.native
  def update(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def update(callback: RequestCallback): Promise[_] = js.native
  @JSName("update")
  var update_Original: RestMethod = js.native
  
  var usage: UsageIntermediary = js.native
}
