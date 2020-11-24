package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the white balance settings on a capture device. */
@js.native
trait WhiteBalanceControl extends js.Object {
  
  /** Gets the maximum white balance value. */
  var max: Double = js.native
  
  /** Gets the minimum white balance value. */
  var min: Double = js.native
  
  /** Gets the color temperature preset. */
  var preset: ColorTemperaturePreset = js.native
  
  /**
    * Asynchronously sets the color temperature Preset .
    * @param preset The color temperate preset to set the Preset property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setPresetAsync(preset: ColorTemperaturePreset): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously sets the color temperature Value .
    * @param temperature The temperature value to set the Value property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(temperature: Double): IPromiseWithIAsyncAction = js.native
  
  /** Gets the step value. */
  var step: Double = js.native
  
  /** Gets a value that specifies if the capture device supports the white balance control. */
  var supported: Boolean = js.native
  
  /** Gets the color temperature value. */
  var value: Double = js.native
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
  
  @scala.inline
  implicit class WhiteBalanceControlOps[Self <: WhiteBalanceControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreset(value: ColorTemperaturePreset): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPresetAsync(value: ColorTemperaturePreset => IPromiseWithIAsyncAction): Self = this.set("setPresetAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueAsync(value: Double => IPromiseWithIAsyncAction): Self = this.set("setValueAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
