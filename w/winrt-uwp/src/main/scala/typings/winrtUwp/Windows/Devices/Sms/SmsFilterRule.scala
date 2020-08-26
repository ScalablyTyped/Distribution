package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes an SMS filtering rule. */
@js.native
trait SmsFilterRule extends js.Object {
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
  @scala.inline
  implicit class SmsFilterRuleOps[Self <: SmsFilterRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBroadcastChannels(value: IVector[Double]): Self = this.set("broadcastChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def setBroadcastTypes(value: IVector[SmsBroadcastType]): Self = this.set("broadcastTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellularClass(value: CellularClass): Self = this.set("cellularClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceIds(value: IVector[String]): Self = this.set("deviceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setImsiPrefixes(value: IVector[String]): Self = this.set("imsiPrefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageType(value: SmsMessageType): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortNumbers(value: IVector[Double]): Self = this.set("portNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocolIds(value: IVector[Double]): Self = this.set("protocolIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSenderNumbers(value: IVector[String]): Self = this.set("senderNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeleserviceIds(value: IVector[Double]): Self = this.set("teleserviceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextMessagePrefixes(value: IVector[String]): Self = this.set("textMessagePrefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def setWapApplicationIds(value: IVector[String]): Self = this.set("wapApplicationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setWapContentTypes(value: IVector[String]): Self = this.set("wapContentTypes", value.asInstanceOf[js.Any])
  }
  
}

