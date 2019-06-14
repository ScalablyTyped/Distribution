package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs

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
  sealed trait allowed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioAccessStatus
  
  /** Access was denied by the system. One common reason for this result is that the user does not have suitable permission to manipulate the radio in question. */
  @js.native
  sealed trait deniedBySystem
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioAccessStatus
  
  /** Access was denied because of user action, usually through denying an operation through the radio privacy settings page. */
  @js.native
  sealed trait deniedByUser
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioAccessStatus
  
  /** Access state is unspecified. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioAccessStatus
  
  /* 1 */ val allowed: allowed with scala.Double = js.native
  /* 3 */ val deniedBySystem: deniedBySystem with scala.Double = js.native
  /* 2 */ val deniedByUser: deniedByUser with scala.Double = js.native
  /* 0 */ val unspecified: unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioAccessStatus with scala.Double] = js.native
}

