package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the white balance settings on a capture device. */
trait WhiteBalanceControl extends js.Object {
  /** Gets the maximum white balance value. */
  var max: Double
  /** Gets the minimum white balance value. */
  var min: Double
  /** Gets the color temperature preset. */
  var preset: ColorTemperaturePreset
  /** Gets the step value. */
  var step: Double
  /** Gets a value that specifies if the capture device supports the white balance control. */
  var supported: Boolean
  /** Gets the color temperature value. */
  var value: Double
  /**
    * Asynchronously sets the color temperature Preset .
    * @param preset The color temperate preset to set the Preset property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setPresetAsync(preset: ColorTemperaturePreset): IPromiseWithIAsyncAction
  /**
    * Asynchronously sets the color temperature Value .
    * @param temperature The temperature value to set the Value property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(temperature: Double): IPromiseWithIAsyncAction
}

object WhiteBalanceControl {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    preset: ColorTemperaturePreset,
    setPresetAsync: ColorTemperaturePreset => IPromiseWithIAsyncAction,
    setValueAsync: Double => IPromiseWithIAsyncAction,
    step: Double,
    supported: Boolean,
    value: Double
  ): WhiteBalanceControl = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any], setPresetAsync = js.Any.fromFunction1(setPresetAsync), setValueAsync = js.Any.fromFunction1(setValueAsync), step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteBalanceControl]
  }
}

