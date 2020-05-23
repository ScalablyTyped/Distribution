package typings.winrtUwp.global.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes an SMS filtering rule. */
@JSGlobal("Windows.Devices.Sms.SmsFilterRule")
@js.native
class SmsFilterRule protected ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsFilterRule {
  /**
    * Creates a new, empty SmsFilterRule .
    * @param messageType An enumeration value specifying the message type that will match this rule.
    */
  def this(messageType: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType) = this()
  /** A list of broadcast channels that match this rule. */
  /* CompleteClass */
  override var broadcastChannels: IVector[Double] = js.native
  /** Gets a list of broadcast types for an SMS message that matches this rule. */
  /* CompleteClass */
  override var broadcastTypes: IVector[typings.winrtUwp.Windows.Devices.Sms.SmsBroadcastType] = js.native
  /** The cellular class identifier for SMS messages that match this rule. */
  /* CompleteClass */
  override var cellularClass: typings.winrtUwp.Windows.Devices.Sms.CellularClass = js.native
  /** Gets a list of device identifiers for an SMS message that matches this rule. */
  /* CompleteClass */
  override var deviceIds: IVector[String] = js.native
  /** Gets the IMSI prefixes for an SMS message that matches this rule. */
  /* CompleteClass */
  override var imsiPrefixes: IVector[String] = js.native
  /** Gets the message type of an SMS message that matches this filter rule. */
  /* CompleteClass */
  override var messageType: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType = js.native
  /** Gets a list of port numbers associated with the SMS message that matches this rule. */
  /* CompleteClass */
  override var portNumbers: IVector[Double] = js.native
  /** Gets a list of protocol identifiers associated with the SMS message that matches this rule.. */
  /* CompleteClass */
  override var protocolIds: IVector[Double] = js.native
  /** Gets the sender numbers associated with an SMS message that matches this rule. */
  /* CompleteClass */
  override var senderNumbers: IVector[String] = js.native
  /** Gets the list of teleservice identifiers for an SMS message that matches this rule. */
  /* CompleteClass */
  override var teleserviceIds: IVector[Double] = js.native
  /** Gets a list of the text message prefixes for an SMS message that matches this filter. */
  /* CompleteClass */
  override var textMessagePrefixes: IVector[String] = js.native
  /** Gets a list of WAP application identifiers for the SMS message that matches this rule. */
  /* CompleteClass */
  override var wapApplicationIds: IVector[String] = js.native
  /** Gets a list of WAP content types for the SMS message that matches this rule. */
  /* CompleteClass */
  override var wapContentTypes: IVector[String] = js.native
}

