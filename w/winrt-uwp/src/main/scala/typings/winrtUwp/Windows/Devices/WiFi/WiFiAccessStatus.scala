package typings.winrtUwp.Windows.Devices.WiFi

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiAccessStatus with Double] = js.native
  /* 1 */ @js.native
  object allowed extends TopLevel[allowed with Double]
  
  /* 3 */ @js.native
  object deniedBySystem extends TopLevel[deniedBySystem with Double]
  
  /* 2 */ @js.native
  object deniedByUser extends TopLevel[deniedByUser with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

