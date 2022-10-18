package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details of a radio state change notification. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChange")
@js.native
open class MobileBroadbandRadioStateChange ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChange {
  
  /** Gets the device ID of the device whose radio state changed. */
  /* CompleteClass */
  var deviceId: String = js.native
  
  /** Gets the new state of the radio. */
  /* CompleteClass */
  var radioState: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandRadioState = js.native
}
