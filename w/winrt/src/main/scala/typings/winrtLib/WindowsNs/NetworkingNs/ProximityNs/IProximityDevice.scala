package typings
package winrtLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProximityDevice extends js.Object {
  var bitsPerSecond: scala.Double = js.native
  var deviceId: java.lang.String = js.native
  var maxMessageBytes: scala.Double = js.native
  var ondevicearrived: js.Any = js.native
  var ondevicedeparted: js.Any = js.native
  def publishBinaryMessage(messageType: java.lang.String, message: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): scala.Double = js.native
  def publishBinaryMessage(
    messageType: java.lang.String,
    message: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    messageTransmittedHandler: MessageTransmittedHandler
  ): scala.Double = js.native
  def publishMessage(messageType: java.lang.String, message: java.lang.String): scala.Double = js.native
  def publishMessage(
    messageType: java.lang.String,
    message: java.lang.String,
    messageTransmittedHandler: MessageTransmittedHandler
  ): scala.Double = js.native
  def publishUriMessage(message: winrtLib.WindowsNs.FoundationNs.Uri): scala.Double = js.native
  def publishUriMessage(message: winrtLib.WindowsNs.FoundationNs.Uri, messageTransmittedHandler: MessageTransmittedHandler): scala.Double = js.native
  def stopPublishingMessage(messageId: scala.Double): scala.Unit = js.native
  def stopSubscribingForMessage(subscriptionId: scala.Double): scala.Unit = js.native
  def subscribeForMessage(messageType: java.lang.String, messageReceivedHandler: MessageReceivedHandler): scala.Double = js.native
}

