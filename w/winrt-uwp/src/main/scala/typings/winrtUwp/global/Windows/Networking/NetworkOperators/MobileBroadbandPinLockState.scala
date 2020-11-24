package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the possible PIN lock states of a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinLockState")
@js.native
object MobileBroadbandPinLockState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState with Double
  ] = js.native
  
  /* 2 */ val pinRequired: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState.pinRequired with Double = js.native
  
  /* 3 */ val pinUnblockKeyRequired: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState.pinUnblockKeyRequired with Double = js.native
  
  /* 0 */ val unknown: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState.unknown with Double = js.native
  
  /* 1 */ val unlocked: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState.unlocked with Double = js.native
}
