package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FocusMode extends js.Object

/** Defines the values for focus mode. */
@JSGlobal("Windows.Media.Devices.FocusMode")
@js.native
object FocusMode extends js.Object {
  /** Use autofocus. */
  @js.native
  sealed trait auto extends FocusMode
  
  /** Continuously adjust focus. */
  @js.native
  sealed trait continuous extends FocusMode
  
  /** Use manual focus. */
  @js.native
  sealed trait manual extends FocusMode
  
  /** Focus once. */
  @js.native
  sealed trait single extends FocusMode
  
  /* 0 */ val auto: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.FocusMode.auto with Double = js.native
  /* 2 */ val continuous: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.FocusMode.continuous with Double = js.native
  /* 3 */ val manual: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.FocusMode.manual with Double = js.native
  /* 1 */ val single: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.FocusMode.single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FocusMode with Double] = js.native
}

