package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- twilioLib.twilioMod.twilioNs.AccountInstance because var conflicts: get_Original, post_Original. Inlined update, update, update, update_Original, put, put, put, put_Original, availablePhoneNumbers, availablePhoneNumbers_Original, outgoingCallerIds, incomingPhoneNumbers, messages, sms, applications, connectApps, authorizedConnectApps, calls, conferences, queues, recordings, tokens, transcriptions, notifications, usage, sip, addresses, keys */ @js.native
trait AccountResource extends ListMappedResource[AccountInstance] {
  var addresses: AddressResource = js.native
  var applications: ApplicationResource = js.native
  var authorizedConnectApps: AuthorizedConnectAppResource = js.native
  // Mixed-in resources
  @JSName("availablePhoneNumbers")
  var availablePhoneNumbers_Original: AvailablePhoneNumberResource = js.native
  var calls: CallResource = js.native
  var conferences: ConferenceResource = js.native
  var connectApps: ConnectAppResource = js.native
  var incomingPhoneNumbers: IncomingPhoneNumberResource = js.native
  var keys: KeyResource = js.native
  var messages: MessageResource = js.native
  var notifications: NotificationResource = js.native
  var outgoingCallerIds: OutgoingCallerIdResource = js.native
  @JSName("put")
  var put_Original: RestMethod = js.native
  var queues: QueueResource = js.native
  var recordings: RecordingResource = js.native
  var sip: SIPIntermediary = js.native
  var sms: SMSIntermediary = js.native
  var tokens: TokenResource = js.native
  var transcriptions: TranscriptionResource = js.native
  @JSName("update")
  var update_Original: RestMethod = js.native
  var usage: UsageIntermediary = js.native
  // Mixed-in resources
  def availablePhoneNumbers(resourceSid: java.lang.String): AvailablePhoneNumberInstance = js.native
  def put(args: js.Any): qLib.qMod.QNs.Promise[_] = js.native
  def put(args: js.Any, callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
  def put(callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
  def update(args: js.Any): qLib.qMod.QNs.Promise[_] = js.native
  def update(args: js.Any, callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
  def update(callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
}

