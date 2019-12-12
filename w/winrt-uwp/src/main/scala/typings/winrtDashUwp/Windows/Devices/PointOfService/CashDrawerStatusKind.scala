package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.PointOfService.CashDrawerStatusKind.extended
import typings.winrtDashUwp.Windows.Devices.PointOfService.CashDrawerStatusKind.off
import typings.winrtDashUwp.Windows.Devices.PointOfService.CashDrawerStatusKind.offOrOffline
import typings.winrtDashUwp.Windows.Devices.PointOfService.CashDrawerStatusKind.offline
import typings.winrtDashUwp.Windows.Devices.PointOfService.CashDrawerStatusKind.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CashDrawerStatusKind extends js.Object

/** Defines the constants that indicate the cash drawer power status. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerStatusKind")
@js.native
object CashDrawerStatusKind extends js.Object {
  /** The device status is not any of the above states. This is available so a POS driver can provide custom notifications to the app. */
  @js.native
  sealed trait extended extends CashDrawerStatusKind
  
  /** The device is powered off or detached from the terminal. */
  @js.native
  sealed trait off extends CashDrawerStatusKind
  
  /** The device is either off or offline, but the current state can not be distinguished. */
  @js.native
  sealed trait offOrOffline extends CashDrawerStatusKind
  
  /** The device is powered on but is not available to respond to requests. */
  @js.native
  sealed trait offline extends CashDrawerStatusKind
  
  /** The device is powered on and ready to use. */
  @js.native
  sealed trait online extends CashDrawerStatusKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CashDrawerStatusKind with Double] = js.native
  /* 4 */ @js.native
  object extended extends TopLevel[extended with Double]
  
  /* 1 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 3 */ @js.native
  object offOrOffline extends TopLevel[offOrOffline with Double]
  
  /* 2 */ @js.native
  object offline extends TopLevel[offline with Double]
  
  /* 0 */ @js.native
  object online extends TopLevel[online with Double]
  
}

