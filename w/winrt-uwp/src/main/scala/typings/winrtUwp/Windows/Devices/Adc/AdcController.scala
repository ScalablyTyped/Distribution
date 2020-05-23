package typings.winrtUwp.Windows.Devices.Adc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ADC controller on the system */
trait AdcController extends js.Object {
  /** The number of channels available on the ADC controller. */
  var channelCount: Double
  /** Gets or sets the channel mode for the ADC controller. */
  var channelMode: AdcChannelMode
  /** Gets the maximum value that the controller can report. */
  var maxValue: Double
  /** The minimum value the controller can report. */
  var minValue: Double
  /** Gets the resolution of the controller as number of bits it has. For example, if we have a 10-bit ADC, that means it can detect 1024 (2^10) discrete levels. */
  var resolutionInBits: Double
  /**
    * Verifies that the specified channel mode is supported by the controller.
    * @param channelMode The channel mode.
    * @return True if the specified channel mode is supported, otherwise false.
    */
  def isChannelModeSupported(channelMode: AdcChannelMode): Boolean
  /**
    * Opens a connection to the specified ADC channel.
    * @param channelNumber The channel to connect to.
    * @return The ADC channel.
    */
  def openChannel(channelNumber: Double): AdcChannel
}

object AdcController {
  @scala.inline
  def apply(
    channelCount: Double,
    channelMode: AdcChannelMode,
    isChannelModeSupported: AdcChannelMode => Boolean,
    maxValue: Double,
    minValue: Double,
    openChannel: Double => AdcChannel,
    resolutionInBits: Double
  ): AdcController = {
    val __obj = js.Dynamic.literal(channelCount = channelCount.asInstanceOf[js.Any], channelMode = channelMode.asInstanceOf[js.Any], isChannelModeSupported = js.Any.fromFunction1(isChannelModeSupported), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], openChannel = js.Any.fromFunction1(openChannel), resolutionInBits = resolutionInBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdcController]
  }
}

