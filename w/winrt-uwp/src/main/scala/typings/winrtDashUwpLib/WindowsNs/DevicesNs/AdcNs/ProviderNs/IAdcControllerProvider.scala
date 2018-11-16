package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents properties and methods common to all ADC controllers. */

trait IAdcControllerProvider extends js.Object {
  /** Gets the number of channels available on for the controller. */
  var channelCount: scala.Double
  /** Gets or sets the controller channel mode. */
  var channelMode: ProviderAdcChannelMode
  /** Gets the maximum value that the controller can return. */
  var maxValue: scala.Double
  /** Gets the minimum value that the controller can return. */
  var minValue: scala.Double
  /** Gets the resolution of the controller as number of bits it has. */
  var resolutionInBits: scala.Double
  /**
                       * Acquires a connection to the specified channel.
                       * @param channel Which channel to connect to.
                       */
  def acquireChannel(channel: scala.Double): scala.Unit
  /**
                       * Determines if the specified channel mode is supported by the controller.
                       * @param channelMode The channel mode in question.
                       * @return True if the specified channel mode is supported, otherwise false.
                       */
  def isChannelModeSupported(channelMode: ProviderAdcChannelMode): scala.Boolean
  /**
                       * Gets the digital representation of the analog value on the specified channel.
                       * @param channelNumber Which channel to read from.
                       * @return The digital representation of the analog value.
                       */
  def readValue(channelNumber: scala.Double): scala.Double
  /**
                       * Releases the channel connection, opening that channel for others to use.
                       * @param channel Which channel to close the connection to.
                       */
  def releaseChannel(channel: scala.Double): scala.Unit
}

