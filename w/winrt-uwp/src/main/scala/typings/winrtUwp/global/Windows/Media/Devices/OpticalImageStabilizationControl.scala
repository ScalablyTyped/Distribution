package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** When supported, allows an app to enable optical image stabilization on the capture device. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.OpticalImageStabilizationControl")
@js.native
open class OpticalImageStabilizationControl ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.OpticalImageStabilizationControl {
  
  /** Gets or sets a value indicating the current optical image stabilization mode of the capture device. */
  /* CompleteClass */
  var mode: typings.winrtUwp.Windows.Media.Devices.OpticalImageStabilizationMode = js.native
  
  /** Gets a value that indicates if the capture device supports the OpticalImageStabilizationControl . */
  /* CompleteClass */
  var supported: Boolean = js.native
  
  /** Gets the list of OpticalImageStabilizationMode values indicating the modes supported by the capture device. */
  /* CompleteClass */
  var supportedModes: IVectorView[typings.winrtUwp.Windows.Media.Devices.OpticalImageStabilizationMode] = js.native
}
