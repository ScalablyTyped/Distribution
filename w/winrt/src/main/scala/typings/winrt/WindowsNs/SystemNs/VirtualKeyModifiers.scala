package typings.winrt.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VirtualKeyModifiers extends js.Object

@JSGlobal("Windows.System.VirtualKeyModifiers")
@js.native
object VirtualKeyModifiers extends js.Object {
  @js.native
  sealed trait control extends VirtualKeyModifiers
  
  @js.native
  sealed trait menu extends VirtualKeyModifiers
  
  @js.native
  sealed trait none extends VirtualKeyModifiers
  
  @js.native
  sealed trait shift extends VirtualKeyModifiers
  
  @js.native
  sealed trait windows extends VirtualKeyModifiers
  
  /* 1 */ val control: typings.winrt.WindowsNs.SystemNs.VirtualKeyModifiers.control with Double = js.native
  /* 2 */ val menu: typings.winrt.WindowsNs.SystemNs.VirtualKeyModifiers.menu with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.SystemNs.VirtualKeyModifiers.none with Double = js.native
  /* 3 */ val shift: typings.winrt.WindowsNs.SystemNs.VirtualKeyModifiers.shift with Double = js.native
  /* 4 */ val windows: typings.winrt.WindowsNs.SystemNs.VirtualKeyModifiers.windows with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VirtualKeyModifiers with Double] = js.native
}

