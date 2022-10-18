package typings.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the torch LED settings on a capture device. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.TorchControl")
@js.native
open class TorchControl ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.TorchControl {
  
  /** Gets or sets a value that enables and disables the torch LED on the device. */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /** Gets or sets the intensity of the torch LED. */
  /* CompleteClass */
  var powerPercent: Double = js.native
  
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  /* CompleteClass */
  var powerSupported: Boolean = js.native
  
  /** Gets a value that specifies if the capture device supports the torch control. */
  /* CompleteClass */
  var supported: Boolean = js.native
}
