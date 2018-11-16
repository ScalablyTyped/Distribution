package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

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
  sealed trait allowed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.DeviceTriggerResult
  
  /** The device background task was denied due to system policy. */
  @js.native
  sealed trait deniedBySystem
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.DeviceTriggerResult
  
  /** The device background task was denied by the user. */
  @js.native
  sealed trait deniedByUser
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.DeviceTriggerResult
  
  /** The device background task cannot run because the battery is low. */
  @js.native
  sealed trait lowBattery
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.DeviceTriggerResult
  
  val allowed: allowed with java.lang.String = js.native
  val deniedBySystem: deniedBySystem with java.lang.String = js.native
  val deniedByUser: deniedByUser with java.lang.String = js.native
  val lowBattery: lowBattery with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.DeviceTriggerResult with java.lang.String
  ] = js.native
}

