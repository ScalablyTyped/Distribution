package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** When supported, allows an app to enable High Dynamic Range (HDR) video recording on the capture device. */
@JSGlobal("Windows.Media.Devices.HdrVideoControl")
@js.native
abstract class HdrVideoControl ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.HdrVideoControl {
  
  /** Gets or sets a value indicating the current High Dynamic Range (HDR) video recording mode of the capture device. */
  /* CompleteClass */
  var mode: typings.winrtUwp.Windows.Media.Devices.HdrVideoMode = js.native
  
  /** Gets a value that indicates if the capture device supports the HdrVideoControl . */
  /* CompleteClass */
  var supported: Boolean = js.native
  
  /** Gets the list of HdrVideoMode values indicating the modes supported by the capture device. */
  /* CompleteClass */
  var supportedModes: IVectorView[typings.winrtUwp.Windows.Media.Devices.HdrVideoMode] = js.native
}
