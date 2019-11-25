package typings.winrtDashUwp.Windows.Devices.Adc.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents properties and methods common to all ADC controllers. */
trait IAdcControllerProvider extends js.Object {
  /** Gets the number of channels available on for the controller. */
  var channelCount: Double
  /** Gets or sets the controller channel mode. */
  var channelMode: ProviderAdcChannelMode
  /** Gets the maximum value that the controller can return. */
  var maxValue: Double
  /** Gets the minimum value that the controller can return. */
  var minValue: Double
  /** Gets the resolution of the controller as number of bits it has. */
  var resolutionInBits: Double
  /**
    * Acquires a connection to the specified channel.
    * @param channel Which channel to connect to.
    */
  def acquireChannel(channel: Double): Unit
  /**
    * Determines if the specified channel mode is supported by the controller.
    * @param channelMode The channel mode in question.
    * @return True if the specified channel mode is supported, otherwise false.
    */
  def isChannelModeSupported(channelMode: ProviderAdcChannelMode): Boolean
  /**
    * Gets the digital representation of the analog value on the specified channel.
    * @param channelNumber Which channel to read from.
    * @return The digital representation of the analog value.
    */
  def readValue(channelNumber: Double): Double
  /**
    * Releases the channel connection, opening that channel for others to use.
    * @param channel Which channel to close the connection to.
    */
  def releaseChannel(channel: Double): Unit
}

object IAdcControllerProvider {
  @scala.inline
  def apply(
    acquireChannel: Double => Unit,
    channelCount: Double,
    channelMode: ProviderAdcChannelMode,
    isChannelModeSupported: ProviderAdcChannelMode => Boolean,
    maxValue: Double,
    minValue: Double,
    readValue: Double => Double,
    releaseChannel: Double => Unit,
    resolutionInBits: Double
  ): IAdcControllerProvider = {
    val __obj = js.Dynamic.literal(acquireChannel = js.Any.fromFunction1(acquireChannel), channelCount = channelCount.asInstanceOf[js.Any], channelMode = channelMode.asInstanceOf[js.Any], isChannelModeSupported = js.Any.fromFunction1(isChannelModeSupported), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], readValue = js.Any.fromFunction1(readValue), releaseChannel = js.Any.fromFunction1(releaseChannel), resolutionInBits = resolutionInBits.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAdcControllerProvider]
  }
}

