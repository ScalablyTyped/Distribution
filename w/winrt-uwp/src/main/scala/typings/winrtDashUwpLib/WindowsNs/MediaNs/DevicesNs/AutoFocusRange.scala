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
  
  val fullRange: fullRange with java.lang.String = js.native
  val `macro`: `macro` with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AutoFocusRange with java.lang.String] = js.native
}

