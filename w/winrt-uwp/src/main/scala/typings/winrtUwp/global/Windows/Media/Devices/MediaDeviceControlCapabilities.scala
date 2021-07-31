package typings.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets the capabilities of a camera setting. */
@JSGlobal("Windows.Media.Devices.MediaDeviceControlCapabilities")
@js.native
abstract class MediaDeviceControlCapabilities ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.MediaDeviceControlCapabilities {
  
  /** Gets the default value of the camera setting. */
  /* CompleteClass */
  var default: Double = js.native
  
  /** Queries whether the camera supports automatic adjustment of the setting. */
  /* CompleteClass */
  var autoModeSupported: Boolean = js.native
  
  /** Sets the maximum value of the camera setting. */
  /* CompleteClass */
  var max: Double = js.native
  
  /** Gets the minimum value of the camera setting. */
  /* CompleteClass */
  var min: Double = js.native
  
  /** Ges the step size for the setting. The step size is the smallest increment by which the property can change. */
  /* CompleteClass */
  var step: Double = js.native
  
  /** Indicates whether the camera supports this camera setting. */
  /* CompleteClass */
  var supported: Boolean = js.native
}
