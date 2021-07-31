package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the ISO film speed settings on a capture device. */
@JSGlobal("Windows.Media.Devices.IsoSpeedControl")
@js.native
abstract class IsoSpeedControl ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.IsoSpeedControl {
  
  /** Gets a value indicating whether auto ISO speed is enabled. */
  /* CompleteClass */
  var auto: Boolean = js.native
  
  /** Gets the maximum ISO speed supported by the capture device. */
  /* CompleteClass */
  var max: Double = js.native
  
  /** Gets the minimum ISO speed supported by the capture device. */
  /* CompleteClass */
  var min: Double = js.native
  
  /** Gets the ISO film speed preset. */
  /* CompleteClass */
  var preset: typings.winrtUwp.Windows.Media.Devices.IsoSpeedPreset = js.native
  
  /**
    * Sets the ISO speed to automatic.
    * @return An asynchronous action.
    */
  /* CompleteClass */
  override def setAutoAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously sets the ISO film speed Preset .
    * @param preset The ISO preset value to set the Preset property to.
    * @return The object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def setPresetAsync(preset: typings.winrtUwp.Windows.Media.Devices.IsoSpeedPreset): IPromiseWithIAsyncAction = js.native
  
  /**
    * Sets the ISO speed value.
    * @param isoSpeed The ISO speed value.
    * @return An asynchronous action.
    */
  /* CompleteClass */
  override def setValueAsync(isoSpeed: Double): IPromiseWithIAsyncAction = js.native
  
  /** Gets the smallest ISO speed increment supported by the capture device. */
  /* CompleteClass */
  var step: Double = js.native
  
  /** Gets a value the specifies if the capture device supports the ISO speed control. */
  /* CompleteClass */
  var supported: Boolean = js.native
  
  /** Gets the ISO presets that the capture device supports. */
  /* CompleteClass */
  var supportedPresets: IVectorView[typings.winrtUwp.Windows.Media.Devices.IsoSpeedPreset] = js.native
  
  /** Gets the current ISO speed value. */
  /* CompleteClass */
  var value: Double = js.native
}
