package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the white balance settings on a capture device. */
@JSGlobal("Windows.Media.Devices.WhiteBalanceControl")
@js.native
abstract class WhiteBalanceControl () extends js.Object {
  /** Gets the maximum white balance value. */
  var max: scala.Double = js.native
  /** Gets the minimum white balance value. */
  var min: scala.Double = js.native
  /** Gets the color temperature preset. */
  var preset: ColorTemperaturePreset = js.native
  /** Gets the step value. */
  var step: scala.Double = js.native
  /** Gets a value that specifies if the capture device supports the white balance control. */
  var supported: scala.Boolean = js.native
  /** Gets the color temperature value. */
  var value: scala.Double = js.native
  /**
                   * Asynchronously sets the color temperature Preset .
                   * @param preset The color temperate preset to set the Preset property to.
                   * @return The object that is used to control the asynchronous operation.
                   */
  def setPresetAsync(preset: ColorTemperaturePreset): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously sets the color temperature Value .
                   * @param temperature The temperature value to set the Value property to.
                   * @return The object that is used to control the asynchronous operation.
                   */
  def setValueAsync(temperature: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

