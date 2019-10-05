package typings.winrtDashUwp.Windows.Devices.Sms

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes an SMS filtering rule. */
@JSGlobal("Windows.Devices.Sms.SmsFilterRule")
@js.native
class SmsFilterRule protected () extends js.Object {
  /**
    * Creates a new, empty SmsFilterRule .
    * @param messageType An enumeration value specifying the message type that will match this rule.
    */
  def this(messageType: SmsMessageType) = this()
  /** A list of broadcast channels that match this rule. */
  var broadcastChannels: IVector[Double] = js.native
  /** Gets a list of broadcast types for an SMS message that matches this rule. */
  var broadcastTypes: IVector[SmsBroadcastType] = js.native
  /** The cellular class identifier for SMS messages that match this rule. */
  var cellularClass: CellularClass = js.native
  /** Gets a list of device identifiers for an SMS message that matches this rule. */
  var deviceIds: IVector[String] = js.native
  /** Gets the IMSI prefixes for an SMS message that matches this rule. */
  var imsiPrefixes: IVector[String] = js.native
  /** Gets the message type of an SMS message that matches this filter rule. */
  var messageType: SmsMessageType = js.native
  /** Gets a list of port numbers associated with the SMS message that matches this rule. */
  var portNumbers: IVector[Double] = js.native
  /** Gets a list of protocol identifiers associated with the SMS message that matches this rule.. */
  var protocolIds: IVector[Double] = js.native
  /** Gets the sender numbers associated with an SMS message that matches this rule. */
  var senderNumbers: IVector[String] = js.native
  /** Gets the list of teleservice identifiers for an SMS message that matches this rule. */
  var teleserviceIds: IVector[Double] = js.native
  /** Gets a list of the text message prefixes for an SMS message that matches this filter. */
  var textMessagePrefixes: IVector[String] = js.native
  /** Gets a list of WAP application identifiers for the SMS message that matches this rule. */
  var wapApplicationIds: IVector[String] = js.native
  /** Gets a list of WAP content types for the SMS message that matches this rule. */
  var wapContentTypes: IVector[String] = js.native
}

