package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

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
  var broadcastChannels: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[scala.Double] = js.native
  /** Gets a list of broadcast types for an SMS message that matches this rule. */
  var broadcastTypes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SmsBroadcastType] = js.native
  /** The cellular class identifier for SMS messages that match this rule. */
  var cellularClass: CellularClass = js.native
  /** Gets a list of device identifiers for an SMS message that matches this rule. */
  var deviceIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the IMSI prefixes for an SMS message that matches this rule. */
  var imsiPrefixes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the message type of an SMS message that matches this filter rule. */
  var messageType: SmsMessageType = js.native
  /** Gets a list of port numbers associated with the SMS message that matches this rule. */
  var portNumbers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[scala.Double] = js.native
  /** Gets a list of protocol identifiers associated with the SMS message that matches this rule.. */
  var protocolIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[scala.Double] = js.native
  /** Gets the sender numbers associated with an SMS message that matches this rule. */
  var senderNumbers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the list of teleservice identifiers for an SMS message that matches this rule. */
  var teleserviceIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[scala.Double] = js.native
  /** Gets a list of the text message prefixes for an SMS message that matches this filter. */
  var textMessagePrefixes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets a list of WAP application identifiers for the SMS message that matches this rule. */
  var wapApplicationIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets a list of WAP content types for the SMS message that matches this rule. */
  var wapContentTypes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
}

