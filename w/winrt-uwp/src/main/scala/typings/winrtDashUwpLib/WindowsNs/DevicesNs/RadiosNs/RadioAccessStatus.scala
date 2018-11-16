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
  
  val allowed: allowed with java.lang.String = js.native
  val deniedBySystem: deniedBySystem with java.lang.String = js.native
  val deniedByUser: deniedByUser with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioAccessStatus with java.lang.String
  ] = js.native
}

