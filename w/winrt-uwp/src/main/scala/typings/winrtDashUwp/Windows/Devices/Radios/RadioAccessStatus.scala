package typings.winrtDashUwp.Windows.Devices.Radios

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Radios.RadioAccessStatus.allowed
import typings.winrtDashUwp.Windows.Devices.Radios.RadioAccessStatus.deniedBySystem
import typings.winrtDashUwp.Windows.Devices.Radios.RadioAccessStatus.deniedByUser
import typings.winrtDashUwp.Windows.Devices.Radios.RadioAccessStatus.unspecified
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RadioAccessStatus with Double] = js.native
  /* 1 */ @js.native
  object allowed extends TopLevel[allowed with Double]
  
  /* 3 */ @js.native
  object deniedBySystem extends TopLevel[deniedBySystem with Double]
  
  /* 2 */ @js.native
  object deniedByUser extends TopLevel[deniedByUser with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

