package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the ISO film speed settings on a capture device. */
@js.native
trait IsoSpeedControl extends StObject {
  
  /** Gets a value indicating whether auto ISO speed is enabled. */
  var auto: Boolean = js.native
  
  /** Gets the maximum ISO speed supported by the capture device. */
  var max: Double = js.native
  
  /** Gets the minimum ISO speed supported by the capture device. */
  var min: Double = js.native
  
  /** Gets the ISO film speed preset. */
  var preset: IsoSpeedPreset = js.native
  
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
  
  /** Gets the smallest ISO speed increment supported by the capture device. */
  var step: Double = js.native
  
  /** Gets a value the specifies if the capture device supports the ISO speed control. */
  var supported: Boolean = js.native
  
  /** Gets the ISO presets that the capture device supports. */
  var supportedPresets: IVectorView[IsoSpeedPreset] = js.native
  
  /** Gets the current ISO speed value. */
  var value: Double = js.native
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
  
  @scala.inline
  implicit class IsoSpeedControlMutableBuilder[Self <: IsoSpeedControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreset(value: IsoSpeedPreset): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAutoAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "setAutoAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPresetAsync(value: IsoSpeedPreset => IPromiseWithIAsyncAction): Self = StObject.set(x, "setPresetAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueAsync(value: Double => IPromiseWithIAsyncAction): Self = StObject.set(x, "setValueAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPresets(value: IVectorView[IsoSpeedPreset]): Self = StObject.set(x, "supportedPresets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
