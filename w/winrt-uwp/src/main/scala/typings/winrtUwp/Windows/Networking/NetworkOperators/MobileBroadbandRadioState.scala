package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MobileBroadbandRadioState extends StObject
/** Describes radio states for a Mobile Broadband device. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioState")
@js.native
object MobileBroadbandRadioState extends StObject {
  
  /** The radio is off. This can be because it has been turned off using a physical switch on the device, or using a software mechanism such as Airplane Mode on the control panel. */
  @js.native
  sealed trait off
    extends StObject
       with MobileBroadbandRadioState
  
  /** The radio is on. */
  @js.native
  sealed trait on
    extends StObject
       with MobileBroadbandRadioState
}
