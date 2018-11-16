package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single ADC channel. */
@JSGlobal("Windows.Devices.Adc.AdcChannel")
@js.native
abstract class AdcChannel () extends js.Object {
  /** Gets the ADC controller for this channel. */
  var controller: AdcController = js.native
  /** Closes the connection on this channel, making it available to be opened by others. */
  def close(): scala.Unit = js.native
  /**
                   * Reads the value as a percentage of the max value possible for this controller.
                   * @return The value as percentage of the max value.
                   */
  def readRatio(): scala.Double = js.native
  /**
                   * Reads the digital representation of the analog value from the ADC.
                   * @return The digital value.
                   */
  def readValue(): scala.Double = js.native
}

