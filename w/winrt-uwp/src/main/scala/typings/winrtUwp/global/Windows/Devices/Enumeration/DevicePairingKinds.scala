package typings.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the action the user will need to take in order to complete the pairing or unpairing action. */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingKinds")
@js.native
object DevicePairingKinds extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds & Double] = js.native
  
  /* 1 */ val confirmOnly: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds.confirmOnly & Double = js.native
  
  /* 4 */ val confirmPinMatch: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds.confirmPinMatch & Double = js.native
  
  /* 2 */ val displayPin: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds.displayPin & Double = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds.none & Double = js.native
  
  /* 3 */ val providePin: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds.providePin & Double = js.native
}
