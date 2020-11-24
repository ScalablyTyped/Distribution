package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.devicearrived
import typings.winrtUwp.winrtUwpStrings.devicedeparted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables you to publish messages to proximate devices or subscribe to messages from proximate devices. */
@js.native
trait ProximityDevice extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicearrived(`type`: devicearrived, listener: DeviceArrivedEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicedeparted(`type`: devicedeparted, listener: DeviceDepartedEventHandler): Unit = js.native
  
  /** Gets the transfer rate of a proximity device. */
  var bitsPerSecond: Double = js.native
  
  /** Gets the DeviceInformation Id for a proximity device. */
  var deviceId: String = js.native
  
  /** Gets the maximum size of a published message that this proximity device supports. */
  var maxMessageBytes: Double = js.native
  
  /** Occurs when a device enters the proximate range. */
  def ondevicearrived(ev: WinRTEvent[ProximityDevice]): Unit = js.native
  /** Occurs when a device enters the proximate range. */
  @JSName("ondevicearrived")
  var ondevicearrived_Original: DeviceArrivedEventHandler = js.native
  
  /** Occurs when a device leaves the proximate range. */
  def ondevicedeparted(ev: WinRTEvent[ProximityDevice]): Unit = js.native
  /** Occurs when a device leaves the proximate range. */
  @JSName("ondevicedeparted")
  var ondevicedeparted_Original: DeviceDepartedEventHandler = js.native
  
  /**
    * Publishes a message that contains binary data to subscribers of the specified message type.
    * @param messageType The type of message to deliver to subscribers.
    * @param message The binary message data to deliver to subscribers.
    * @return A unique publication ID for the published message.
    */
  def publishBinaryMessage(messageType: String, message: IBuffer): Double = js.native
  /**
    * Publishes a message that contains binary data to subscribers of the specified message type. The specified handler is called when the message has been transmitted.
    * @param messageType The type of message to deliver to subscribers.
    * @param message The binary message data to deliver to subscribers.
    * @param messageTransmittedHandler The handler to call when the message has been transmitted.
    * @return A unique publication ID for the published message.
    */
  def publishBinaryMessage(messageType: String, message: IBuffer, messageTransmittedHandler: MessageTransmittedHandler): Double = js.native
  
  /**
    * Publishes a message to subscribers of the specified message type.
    * @param messageType The type of message to deliver to subscribers.
    * @param message The message to deliver to subscribers.
    * @return A unique publication ID for the published message. Pass this value to the StopPublishingMessage method to stop publishing the message.
    */
  def publishMessage(messageType: String, message: String): Double = js.native
  /**
    * Publishes a message to subscribers of the specified message type. The specified handler is called when the message has been transmitted.
    * @param messageType The type of message to deliver to subscribers.
    * @param message The message to deliver to subscribers.
    * @param messageTransmittedHandler The handler to call when the message has been transmitted.
    * @return A unique publication ID for the published message.
    */
  def publishMessage(messageType: String, message: String, messageTransmittedHandler: MessageTransmittedHandler): Double = js.native
  
  /**
    * Publishes a Uniform Resource Identifier (URI) to a proximate device.
    * @param message The URI to publish.
    * @return The publication ID of the message.
    */
  def publishUriMessage(message: Uri): Double = js.native
  /**
    * Publishes a Uniform Resource Identifier (URI) to a proximate device. The specified handler is called when the message has been transmitted.
    * @param message The URI to publish.
    * @param messageTransmittedHandler The handler to call when the message has been transmitted.
    * @return The publication ID of the message.
    */
  def publishUriMessage(message: Uri, messageTransmittedHandler: MessageTransmittedHandler): Double = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicearrived(`type`: devicearrived, listener: DeviceArrivedEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicedeparted(`type`: devicedeparted, listener: DeviceDepartedEventHandler): Unit = js.native
  
  /**
    * Stops publishing a message.
    * @param messageId The publication ID for the message.
    */
  def stopPublishingMessage(messageId: Double): Unit = js.native
  
  /**
    * Cancels a message subscription.
    * @param subscriptionId The subscription ID for the message.
    */
  def stopSubscribingForMessage(subscriptionId: Double): Unit = js.native
  
  /**
    * Creates a subscription for a specified message type.
    * @param messageType The type of message to deliver to this subscription.
    * @param messageReceivedHandler The handler that the proximity provider will call when it delivers a message.
    * @return A unique ID for the subscription.
    */
  def subscribeForMessage(messageType: String, messageReceivedHandler: MessageReceivedHandler): Double = js.native
}
