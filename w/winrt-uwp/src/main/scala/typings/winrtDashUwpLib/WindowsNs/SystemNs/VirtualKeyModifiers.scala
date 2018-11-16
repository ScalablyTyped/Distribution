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
  
  val control: control with java.lang.String = js.native
  val menu: menu with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val shift: shift with java.lang.String = js.native
  val windows: windows with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.VirtualKeyModifiers with java.lang.String] = js.native
}

