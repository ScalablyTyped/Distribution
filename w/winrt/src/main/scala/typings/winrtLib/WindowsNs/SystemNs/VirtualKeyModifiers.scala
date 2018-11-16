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
  
  val control: control with java.lang.String = js.native
  val menu: menu with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val shift: shift with java.lang.String = js.native
  val windows: windows with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.SystemNs.VirtualKeyModifiers with java.lang.String] = js.native
}

