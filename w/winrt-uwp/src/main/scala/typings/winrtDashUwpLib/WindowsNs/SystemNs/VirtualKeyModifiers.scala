package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VirtualKeyModifiers extends js.Object

/** Specifies the virtual key used to modify another keypress. For example, the Ctrl key when pressed in conjunction with another key, as in Ctrl+C. */
@JSGlobal("Windows.System.VirtualKeyModifiers")
@js.native
object VirtualKeyModifiers extends js.Object {
  /** The Ctrl (control) virtual key. */
  @js.native
  sealed trait control
    extends winrtDashUwpLib.WindowsNs.SystemNs.VirtualKeyModifiers
  
  /** The Menu virtual key. */
  @js.native
  sealed trait menu
    extends winrtDashUwpLib.WindowsNs.SystemNs.VirtualKeyModifiers
  
  /** No virtual key modifier. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.SystemNs.VirtualKeyModifiers
  
  /** The Shift virtual key. */
  @js.native
  sealed trait shift
    extends winrtDashUwpLib.WindowsNs.SystemNs.VirtualKeyModifiers
  
  /** The Windows virtual key. */
  @js.native
  sealed trait windows
    extends winrtDashUwpLib.WindowsNs.SystemNs.VirtualKeyModifiers
  
  /* 1 */ val control: control with scala.Double = js.native
  /* 2 */ val menu: menu with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val shift: shift with scala.Double = js.native
  /* 4 */ val windows: windows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.VirtualKeyModifiers with scala.Double] = js.native
}

