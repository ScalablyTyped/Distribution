package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ADC controller on the system */
@JSGlobal("Windows.Devices.Adc.AdcController")
@js.native
abstract class AdcController () extends js.Object {
  /** The number of channels available on the ADC controller. */
  var channelCount: scala.Double = js.native
  /** Gets or sets the channel mode for the ADC controller. */
  var channelMode: AdcChannelMode = js.native
  /** Gets the maximum value that the controller can report. */
  var maxValue: scala.Double = js.native
  /** The minimum value the controller can report. */
  var minValue: scala.Double = js.native
  /** Gets the resolution of the controller as number of bits it has. For example, if we have a 10-bit ADC, that means it can detect 1024 (2^10) discrete levels. */
  var resolutionInBits: scala.Double = js.native
  /**
                   * Verifies that the specified channel mode is supported by the controller.
                   * @param channelMode The channel mode.
                   * @return True if the specified channel mode is supported, otherwise false.
                   */
  def isChannelModeSupported(channelMode: AdcChannelMode): scala.Boolean = js.native
  /**
                   * Opens a connection to the specified ADC channel.
                   * @param channelNumber The channel to connect to.
                   * @return The ADC channel.
                   */
  def openChannel(channelNumber: scala.Double): AdcChannel = js.native
}

/** Represents an ADC controller on the system */
@JSGlobal("Windows.Devices.Adc.AdcController")
@js.native
object AdcController extends js.Object {
  /**
                   * Gets all the controllers that are connected to the system asynchronously .
                   * @param provider The ADC provider for the controllers on the system.
                   * @return When the method completes successfully, it returns a list of values that represent the controllers available on the system.
                   */
  def getControllersAsync(provider: winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.ProviderNs.IAdcProvider): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Gets the default ADC controller on the system.
                   * @return The default ADC controller on the system, or null if the system has no ADC controller.
                   */
  def getDefaultAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.AdcController] = js.native
}

