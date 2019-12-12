package typings.winrtDashUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Sms.SmsGeographicalScope.cell
import typings.winrtDashUwp.Windows.Devices.Sms.SmsGeographicalScope.cellWithImmediateDisplay
import typings.winrtDashUwp.Windows.Devices.Sms.SmsGeographicalScope.locationArea
import typings.winrtDashUwp.Windows.Devices.Sms.SmsGeographicalScope.none
import typings.winrtDashUwp.Windows.Devices.Sms.SmsGeographicalScope.plmn
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsGeographicalScope with Double] = js.native
  /* 4 */ @js.native
  object cell extends TopLevel[cell with Double]
  
  /* 1 */ @js.native
  object cellWithImmediateDisplay extends TopLevel[cellWithImmediateDisplay with Double]
  
  /* 2 */ @js.native
  object locationArea extends TopLevel[locationArea with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object plmn extends TopLevel[plmn with Double]
  
}

