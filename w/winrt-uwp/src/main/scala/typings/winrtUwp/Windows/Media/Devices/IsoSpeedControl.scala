package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the ISO film speed settings on a capture device. */
@JSGlobal("Windows.Media.Devices.IsoSpeedControl")
@js.native
abstract class IsoSpeedControl () extends js.Object {
  /** Gets a value indicating whether auto ISO speed is enabled. */
  var auto: Boolean = js.native
  /** Gets the maximum ISO speed supported by the capture device. */
  var max: Double = js.native
  /** Gets the minimum ISO speed supported by the capture device. */
  var min: Double = js.native
  /** Gets the ISO film speed preset. */
  var preset: IsoSpeedPreset = js.native
  /** Gets the smallest ISO speed increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value the specifies if the capture device supports the ISO speed control. */
  var supported: Boolean = js.native
  /** Gets the ISO presets that the capture device supports. */
  var supportedPresets: IVectorView[IsoSpeedPreset] = js.native
  /** Gets the current ISO speed value. */
  var value: Double = js.native
  /**
    * Sets the ISO speed to automatic.
    * @return An asynchronous action.
    */
  def setAutoAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sets the ISO film speed Preset .
    * @param preset The ISO preset value to set the Preset property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setPresetAsync(preset: IsoSpeedPreset): IPromiseWithIAsyncAction = js.native
  /**
    * Sets the ISO speed value.
    * @param isoSpeed The ISO speed value.
    * @return An asynchronous action.
    */
  def setValueAsync(isoSpeed: Double): IPromiseWithIAsyncAction = js.native
}

