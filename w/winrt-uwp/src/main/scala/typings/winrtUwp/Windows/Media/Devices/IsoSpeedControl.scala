package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the ISO film speed settings on a capture device. */
trait IsoSpeedControl extends js.Object {
  /** Gets a value indicating whether auto ISO speed is enabled. */
  var auto: Boolean
  /** Gets the maximum ISO speed supported by the capture device. */
  var max: Double
  /** Gets the minimum ISO speed supported by the capture device. */
  var min: Double
  /** Gets the ISO film speed preset. */
  var preset: IsoSpeedPreset
  /** Gets the smallest ISO speed increment supported by the capture device. */
  var step: Double
  /** Gets a value the specifies if the capture device supports the ISO speed control. */
  var supported: Boolean
  /** Gets the ISO presets that the capture device supports. */
  var supportedPresets: IVectorView[IsoSpeedPreset]
  /** Gets the current ISO speed value. */
  var value: Double
  /**
    * Sets the ISO speed to automatic.
    * @return An asynchronous action.
    */
  def setAutoAsync(): IPromiseWithIAsyncAction
  /**
    * Asynchronously sets the ISO film speed Preset .
    * @param preset The ISO preset value to set the Preset property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setPresetAsync(preset: IsoSpeedPreset): IPromiseWithIAsyncAction
  /**
    * Sets the ISO speed value.
    * @param isoSpeed The ISO speed value.
    * @return An asynchronous action.
    */
  def setValueAsync(isoSpeed: Double): IPromiseWithIAsyncAction
}

object IsoSpeedControl {
  @scala.inline
  def apply(
    auto: Boolean,
    max: Double,
    min: Double,
    preset: IsoSpeedPreset,
    setAutoAsync: () => IPromiseWithIAsyncAction,
    setPresetAsync: IsoSpeedPreset => IPromiseWithIAsyncAction,
    setValueAsync: Double => IPromiseWithIAsyncAction,
    step: Double,
    supported: Boolean,
    supportedPresets: IVectorView[IsoSpeedPreset],
    value: Double
  ): IsoSpeedControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any], setAutoAsync = js.Any.fromFunction0(setAutoAsync), setPresetAsync = js.Any.fromFunction1(setPresetAsync), setValueAsync = js.Any.fromFunction1(setValueAsync), step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedPresets = supportedPresets.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsoSpeedControl]
  }
}

