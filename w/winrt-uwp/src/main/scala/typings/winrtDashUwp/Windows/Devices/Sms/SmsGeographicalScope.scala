package typings.winrtDashUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsGeographicalScope extends js.Object

/** Values that describe the geographical scope of a cell broadcast message. */
@JSGlobal("Windows.Devices.Sms.SmsGeographicalScope")
@js.native
object SmsGeographicalScope extends js.Object {
  /** Scope is a single cell tower. */
  @js.native
  sealed trait cell extends SmsGeographicalScope
  
  /** Scope is a single cell tower, with immediate display. */
  @js.native
  sealed trait cellWithImmediateDisplay extends SmsGeographicalScope
  
  /** Scope is a Location Area. */
  @js.native
  sealed trait locationArea extends SmsGeographicalScope
  
  /** An undefined or unknown geographical scope. */
  @js.native
  sealed trait none extends SmsGeographicalScope
  
  /** Scope is the entire Public Land Mobile Network (PLMN). */
  @js.native
  sealed trait plmn extends SmsGeographicalScope
  
  /* 4 */ val cell: typings.winrtDashUwp.Windows.Devices.Sms.SmsGeographicalScope.cell with Double = js.native
  /* 1 */ val cellWithImmediateDisplay: typings.winrtDashUwp.Windows.Devices.Sms.SmsGeographicalScope.cellWithImmediateDisplay with Double = js.native
  /* 2 */ val locationArea: typings.winrtDashUwp.Windows.Devices.Sms.SmsGeographicalScope.locationArea with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Devices.Sms.SmsGeographicalScope.none with Double = js.native
  /* 3 */ val plmn: typings.winrtDashUwp.Windows.Devices.Sms.SmsGeographicalScope.plmn with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsGeographicalScope with Double] = js.native
}

