package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes an SMS filtering rule. */
trait SmsFilterRule extends js.Object {
  /** A list of broadcast channels that match this rule. */
  var broadcastChannels: IVector[Double]
  /** Gets a list of broadcast types for an SMS message that matches this rule. */
  var broadcastTypes: IVector[SmsBroadcastType]
  /** The cellular class identifier for SMS messages that match this rule. */
  var cellularClass: CellularClass
  /** Gets a list of device identifiers for an SMS message that matches this rule. */
  var deviceIds: IVector[String]
  /** Gets the IMSI prefixes for an SMS message that matches this rule. */
  var imsiPrefixes: IVector[String]
  /** Gets the message type of an SMS message that matches this filter rule. */
  var messageType: SmsMessageType
  /** Gets a list of port numbers associated with the SMS message that matches this rule. */
  var portNumbers: IVector[Double]
  /** Gets a list of protocol identifiers associated with the SMS message that matches this rule.. */
  var protocolIds: IVector[Double]
  /** Gets the sender numbers associated with an SMS message that matches this rule. */
  var senderNumbers: IVector[String]
  /** Gets the list of teleservice identifiers for an SMS message that matches this rule. */
  var teleserviceIds: IVector[Double]
  /** Gets a list of the text message prefixes for an SMS message that matches this filter. */
  var textMessagePrefixes: IVector[String]
  /** Gets a list of WAP application identifiers for the SMS message that matches this rule. */
  var wapApplicationIds: IVector[String]
  /** Gets a list of WAP content types for the SMS message that matches this rule. */
  var wapContentTypes: IVector[String]
}

object SmsFilterRule {
  @scala.inline
  def apply(
    broadcastChannels: IVector[Double],
    broadcastTypes: IVector[SmsBroadcastType],
    cellularClass: CellularClass,
    deviceIds: IVector[String],
    imsiPrefixes: IVector[String],
    messageType: SmsMessageType,
    portNumbers: IVector[Double],
    protocolIds: IVector[Double],
    senderNumbers: IVector[String],
    teleserviceIds: IVector[Double],
    textMessagePrefixes: IVector[String],
    wapApplicationIds: IVector[String],
    wapContentTypes: IVector[String]
  ): SmsFilterRule = {
    val __obj = js.Dynamic.literal(broadcastChannels = broadcastChannels.asInstanceOf[js.Any], broadcastTypes = broadcastTypes.asInstanceOf[js.Any], cellularClass = cellularClass.asInstanceOf[js.Any], deviceIds = deviceIds.asInstanceOf[js.Any], imsiPrefixes = imsiPrefixes.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], portNumbers = portNumbers.asInstanceOf[js.Any], protocolIds = protocolIds.asInstanceOf[js.Any], senderNumbers = senderNumbers.asInstanceOf[js.Any], teleserviceIds = teleserviceIds.asInstanceOf[js.Any], textMessagePrefixes = textMessagePrefixes.asInstanceOf[js.Any], wapApplicationIds = wapApplicationIds.asInstanceOf[js.Any], wapContentTypes = wapContentTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsFilterRule]
  }
}

