package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceTriggerResult extends js.Object

/** Indicates whether the device background task operation was allowed or denied, and if it was denied specifies the reason. */
@JSGlobal("Windows.ApplicationModel.Background.DeviceTriggerResult")
@js.native
object DeviceTriggerResult extends js.Object {
  /** The device background task was triggered. */
  @js.native
  sealed trait allowed extends DeviceTriggerResult
  
  /** The device background task was denied due to system policy. */
  @js.native
  sealed trait deniedBySystem extends DeviceTriggerResult
  
  /** The device background task was denied by the user. */
  @js.native
  sealed trait deniedByUser extends DeviceTriggerResult
  
  /** The device background task cannot run because the battery is low. */
  @js.native
  sealed trait lowBattery extends DeviceTriggerResult
  
  /* 0 */ val allowed: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.DeviceTriggerResult.allowed with Double = js.native
  /* 2 */ val deniedBySystem: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.DeviceTriggerResult.deniedBySystem with Double = js.native
  /* 1 */ val deniedByUser: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.DeviceTriggerResult.deniedByUser with Double = js.native
  /* 3 */ val lowBattery: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs.DeviceTriggerResult.lowBattery with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceTriggerResult with Double] = js.native
}

