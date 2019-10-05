package typings.winrt.Windows.Networking.Proximity

import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProximityDevice extends js.Object {
  var bitsPerSecond: Double = js.native
  var deviceId: String = js.native
  var maxMessageBytes: Double = js.native
  var ondevicearrived: js.Any = js.native
  var ondevicedeparted: js.Any = js.native
  def publishBinaryMessage(messageType: String, message: IBuffer): Double = js.native
  def publishBinaryMessage(messageType: String, message: IBuffer, messageTransmittedHandler: MessageTransmittedHandler): Double = js.native
  def publishMessage(messageType: String, message: String): Double = js.native
  def publishMessage(messageType: String, message: String, messageTransmittedHandler: MessageTransmittedHandler): Double = js.native
  def publishUriMessage(message: Uri): Double = js.native
  def publishUriMessage(message: Uri, messageTransmittedHandler: MessageTransmittedHandler): Double = js.native
  def stopPublishingMessage(messageId: Double): Unit = js.native
  def stopSubscribingForMessage(subscriptionId: Double): Unit = js.native
  def subscribeForMessage(messageType: String, messageReceivedHandler: MessageReceivedHandler): Double = js.native
}

