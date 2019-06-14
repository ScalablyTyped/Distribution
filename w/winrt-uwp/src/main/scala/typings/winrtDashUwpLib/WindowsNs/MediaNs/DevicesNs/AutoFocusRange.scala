package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoFocusRange extends js.Object

/** Defines the options for auto focus range. */
@JSGlobal("Windows.Media.Devices.AutoFocusRange")
@js.native
object AutoFocusRange extends js.Object {
  /** Full range. */
  @js.native
  sealed trait fullRange
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AutoFocusRange
  
  /** Macro. */
  @js.native
  sealed trait `macro`
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AutoFocusRange
  
  /** Normal range. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AutoFocusRange
  
  /* 0 */ val fullRange: fullRange with scala.Double = js.native
  /* 1 */ val `macro`: `macro` with scala.Double = js.native
  /* 2 */ val normal: normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AutoFocusRange with scala.Double] = js.native
}

