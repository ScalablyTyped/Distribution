package typings.winrtDashUwp.WindowsNs.DevicesNs.RadiosNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RadioAccessStatus extends js.Object

/** Enumeration that describes possible access states that a user can have to a given radio. */
@JSGlobal("Windows.Devices.Radios.RadioAccessStatus")
@js.native
object RadioAccessStatus extends js.Object {
  /** Access is allowed. */
  @js.native
  sealed trait allowed extends RadioAccessStatus
  
  /** Access was denied by the system. One common reason for this result is that the user does not have suitable permission to manipulate the radio in question. */
  @js.native
  sealed trait deniedBySystem extends RadioAccessStatus
  
  /** Access was denied because of user action, usually through denying an operation through the radio privacy settings page. */
  @js.native
  sealed trait deniedByUser extends RadioAccessStatus
  
  /** Access state is unspecified. */
  @js.native
  sealed trait unspecified extends RadioAccessStatus
  
  /* 1 */ val allowed: typings.winrtDashUwp.WindowsNs.DevicesNs.RadiosNs.RadioAccessStatus.allowed with Double = js.native
  /* 3 */ val deniedBySystem: typings.winrtDashUwp.WindowsNs.DevicesNs.RadiosNs.RadioAccessStatus.deniedBySystem with Double = js.native
  /* 2 */ val deniedByUser: typings.winrtDashUwp.WindowsNs.DevicesNs.RadiosNs.RadioAccessStatus.deniedByUser with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.WindowsNs.DevicesNs.RadiosNs.RadioAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RadioAccessStatus with Double] = js.native
}

