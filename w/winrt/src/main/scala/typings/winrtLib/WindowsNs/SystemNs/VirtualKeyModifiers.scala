package typings
package winrtLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VirtualKeyModifiers extends js.Object

@JSGlobal("Windows.System.VirtualKeyModifiers")
@js.native
object VirtualKeyModifiers extends js.Object {
  @js.native
  sealed trait control
    extends winrtLib.WindowsNs.SystemNs.VirtualKeyModifiers
  
  @js.native
  sealed trait menu
    extends winrtLib.WindowsNs.SystemNs.VirtualKeyModifiers
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.SystemNs.VirtualKeyModifiers
  
  @js.native
  sealed trait shift
    extends winrtLib.WindowsNs.SystemNs.VirtualKeyModifiers
  
  @js.native
  sealed trait windows
    extends winrtLib.WindowsNs.SystemNs.VirtualKeyModifiers
  
  /* 1 */ val control: control with scala.Double = js.native
  /* 2 */ val menu: menu with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val shift: shift with scala.Double = js.native
  /* 4 */ val windows: windows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.SystemNs.VirtualKeyModifiers with scala.Double] = js.native
}

