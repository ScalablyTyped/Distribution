package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables you to publish messages to proximate devices or subscribe to messages from proximate devices. */
@JSGlobal("Windows.Networking.Proximity.ProximityDevice")
@js.native
abstract class ProximityDevice () extends js.Object {
  /** Gets the transfer rate of a proximity device. */
  var bitsPerSecond: scala.Double = js.native
  /** Gets the DeviceInformation Id for a proximity device. */
  var deviceId: java.lang.String = js.native
  /** Gets the maximum size of a published message that this proximity device supports. */
  var maxMessageBytes: scala.Double = js.native
  /** Occurs when a device enters the proximate range. */
  @JSName("ondevicearrived")
  var ondevicearrived_Original: DeviceArrivedEventHandler = js.native
  /** Occurs when a device leaves the proximate range. */
  @JSName("ondevicedeparted")
  var ondevicedeparted_Original: DeviceDepartedEventHandler = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicearrived(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.devicearrived, listener: DeviceArrivedEventHandler): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicedeparted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.devicedeparted,
    listener: DeviceDepartedEventHandler
  ): scala.Unit = js.native
  /** Occurs when a device enters the proximate range. */
  def ondevicearrived(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[ProximityDevice]): scala.Unit = js.native
  /** Occurs when a device leaves the proximate range. */
  def ondevicedeparted(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[ProximityDevice]): scala.Unit = js.native
  /**
                   * Publishes a message that contains binary data to subscribers of the specified message type.
                   * @param messageType The type of message to deliver to subscribers.
                   * @param message The binary message data to deliver to subscribers.
                   * @return A unique publication ID for the published message.
                   */
  def publishBinaryMessage(messageType: java.lang.String, message: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): scala.Double = js.native
  /**
                   * Publishes a message that contains binary data to subscribers of the specified message type. The specified handler is called when the message has been transmitted.
                   * @param messageType The type of message to deliver to subscribers.
                   * @param message The binary message data to deliver to subscribers.
                   * @param messageTransmittedHandler The handler to call when the message has been transmitted.
                   * @return A unique publication ID for the published message.
                   */
  def publishBinaryMessage(
    messageType: java.lang.String,
    message: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    messageTransmittedHandler: MessageTransmittedHandler
  ): scala.Double = js.native
  /**
                   * Publishes a message to subscribers of the specified message type.
                   * @param messageType The type of message to deliver to subscribers.
                   * @param message The message to deliver to subscribers.
                   * @return A unique publication ID for the published message. Pass this value to the StopPublishingMessage method to stop publishing the message.
                   */
  def publishMessage(messageType: java.lang.String, message: java.lang.String): scala.Double = js.native
  /**
                   * Publishes a message to subscribers of the specified message type. The specified handler is called when the message has been transmitted.
                   * @param messageType The type of message to deliver to subscribers.
                   * @param message The message to deliver to subscribers.
                   * @param messageTransmittedHandler The handler to call when the message has been transmitted.
                   * @return A unique publication ID for the published message.
                   */
  def publishMessage(
    messageType: java.lang.String,
    message: java.lang.String,
    messageTransmittedHandler: MessageTransmittedHandler
  ): scala.Double = js.native
  /**
                   * Publishes a Uniform Resource Identifier (URI) to a proximate device.
                   * @param message The URI to publish.
                   * @return The publication ID of the message.
                   */
  def publishUriMessage(message: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): scala.Double = js.native
  /**
                   * Publishes a Uniform Resource Identifier (URI) to a proximate device. The specified handler is called when the message has been transmitted.
                   * @param message The URI to publish.
                   * @param messageTransmittedHandler The handler to call when the message has been transmitted.
                   * @return The publication ID of the message.
                   */
  def publishUriMessage(
    message: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    messageTransmittedHandler: MessageTransmittedHandler
  ): scala.Double = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicearrived(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.devicearrived, listener: DeviceArrivedEventHandler): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicedeparted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.devicedeparted,
    listener: DeviceDepartedEventHandler
  ): scala.Unit = js.native
  /**
                   * Stops publishing a message.
                   * @param messageId The publication ID for the message.
                   */
  def stopPublishingMessage(messageId: scala.Double): scala.Unit = js.native
  /**
                   * Cancels a message subscription.
                   * @param subscriptionId The subscription ID for the message.
                   */
  def stopSubscribingForMessage(subscriptionId: scala.Double): scala.Unit = js.native
  /**
                   * Creates a subscription for a specified message type.
                   * @param messageType The type of message to deliver to this subscription.
                   * @param messageReceivedHandler The handler that the proximity provider will call when it delivers a message.
                   * @return A unique ID for the subscription.
                   */
  def subscribeForMessage(messageType: java.lang.String, messageReceivedHandler: MessageReceivedHandler): scala.Double = js.native
}

/** Enables you to publish messages to proximate devices or subscribe to messages from proximate devices. */
@JSGlobal("Windows.Networking.Proximity.ProximityDevice")
@js.native
object ProximityDevice extends js.Object {
  /**
                   * Creates an instance of a ProximityDevice class and activates the specified proximity device interface.
                   * @param deviceId The DeviceInformation Id of a proximity device.
                   * @return A new ProximityDevice that uses the specified proximity device interface. Throws a System.IO.FileNotFoundException exception if the specified proximity device interface isunavailable.
                   */
  def fromId(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.ProximityDevice = js.native
  /**
                   * Creates an instance of a ProximityDevice class and activates the default proximity provider.
                   * @return A new proximity device that uses the default proximity provider. Returns NULL if no proximity devices are installed.
                   */
  def getDefault(): winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.ProximityDevice = js.native
  /**
                   * Returns the class selection string that you can use to enumerate proximity devices.
                   * @return The class selection string for proximity devices.
                   */
  def getDeviceSelector(): java.lang.String = js.native
}

