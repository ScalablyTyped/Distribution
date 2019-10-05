package typings.winrtDashUwp.Windows.Devices.WiFi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiAccessStatus extends js.Object

/** Used to report the results of an attempt to request access to a Wi-Fi adapter. */
@JSGlobal("Windows.Devices.WiFi.WiFiAccessStatus")
@js.native
object WiFiAccessStatus extends js.Object {
  /** Access has been allowed. */
  @js.native
  sealed trait allowed extends WiFiAccessStatus
  
  /** Access has been denied by the system. */
  @js.native
  sealed trait deniedBySystem extends WiFiAccessStatus
  
  /** Access has been denied by the user, through the user interface. */
  @js.native
  sealed trait deniedByUser extends WiFiAccessStatus
  
  /** The asynchronous request has not completed yet. */
  @js.native
  sealed trait unspecified extends WiFiAccessStatus
  
  /* 1 */ val allowed: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiAccessStatus.allowed with Double = js.native
  /* 3 */ val deniedBySystem: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiAccessStatus.deniedBySystem with Double = js.native
  /* 2 */ val deniedByUser: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiAccessStatus.deniedByUser with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiAccessStatus with Double] = js.native
}

