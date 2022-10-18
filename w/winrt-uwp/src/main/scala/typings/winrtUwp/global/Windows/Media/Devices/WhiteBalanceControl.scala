package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the white balance settings on a capture device. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.WhiteBalanceControl")
@js.native
open class WhiteBalanceControl ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.WhiteBalanceControl {
  
  /** Gets the maximum white balance value. */
  /* CompleteClass */
  var max: Double = js.native
  
  /** Gets the minimum white balance value. */
  /* CompleteClass */
  var min: Double = js.native
  
  /** Gets the color temperature preset. */
  /* CompleteClass */
  var preset: typings.winrtUwp.Windows.Media.Devices.ColorTemperaturePreset = js.native
  
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
  
  /** Gets the step value. */
  /* CompleteClass */
  var step: Double = js.native
  
  /** Gets a value that specifies if the capture device supports the white balance control. */
  /* CompleteClass */
  var supported: Boolean = js.native
  
  /** Gets the color temperature value. */
  /* CompleteClass */
  var value: Double = js.native
}
