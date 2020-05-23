package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the white balance settings on a capture device. */
@JSGlobal("Windows.Media.Devices.WhiteBalanceControl")
@js.native
abstract class WhiteBalanceControl ()
  extends typings.winrtUwp.Windows.Media.Devices.WhiteBalanceControl {
  /** Gets the maximum white balance value. */
  /* CompleteClass */
  override var max: Double = js.native
  /** Gets the minimum white balance value. */
  /* CompleteClass */
  override var min: Double = js.native
  /** Gets the color temperature preset. */
  /* CompleteClass */
  override var preset: typings.winrtUwp.Windows.Media.Devices.ColorTemperaturePreset = js.native
  /** Gets the step value. */
  /* CompleteClass */
  override var step: Double = js.native
  /** Gets a value that specifies if the capture device supports the white balance control. */
  /* CompleteClass */
  override var supported: Boolean = js.native
  /** Gets the color temperature value. */
  /* CompleteClass */
  override var value: Double = js.native
  /**
    * Asynchronously sets the color temperature Preset .
    * @param preset The color temperate preset to set the Preset property to.
    * @return The object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def setPresetAsync(preset: typings.winrtUwp.Windows.Media.Devices.ColorTemperaturePreset): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sets the color temperature Value .
    * @param temperature The temperature value to set the Value property to.
    * @return The object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def setValueAsync(temperature: Double): IPromiseWithIAsyncAction = js.native
}

