package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

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
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusMode
  
  /** Continuously adjust focus. */
  @js.native
  sealed trait continuous
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusMode
  
  /** Use manual focus. */
  @js.native
  sealed trait manual
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusMode
  
  /** Focus once. */
  @js.native
  sealed trait single
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusMode
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 2 */ val continuous: continuous with scala.Double = js.native
  /* 3 */ val manual: manual with scala.Double = js.native
  /* 1 */ val single: single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.FocusMode with scala.Double] = js.native
}

