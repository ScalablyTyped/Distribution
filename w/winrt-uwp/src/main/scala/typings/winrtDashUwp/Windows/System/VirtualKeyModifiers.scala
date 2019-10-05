package typings.winrtDashUwp.Windows.System

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
  sealed trait control extends VirtualKeyModifiers
  
  /** The Menu virtual key. */
  @js.native
  sealed trait menu extends VirtualKeyModifiers
  
  /** No virtual key modifier. */
  @js.native
  sealed trait none extends VirtualKeyModifiers
  
  /** The Shift virtual key. */
  @js.native
  sealed trait shift extends VirtualKeyModifiers
  
  /** The Windows virtual key. */
  @js.native
  sealed trait windows extends VirtualKeyModifiers
  
  /* 1 */ val control: typings.winrtDashUwp.Windows.System.VirtualKeyModifiers.control with Double = js.native
  /* 2 */ val menu: typings.winrtDashUwp.Windows.System.VirtualKeyModifiers.menu with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.System.VirtualKeyModifiers.none with Double = js.native
  /* 3 */ val shift: typings.winrtDashUwp.Windows.System.VirtualKeyModifiers.shift with Double = js.native
  /* 4 */ val windows: typings.winrtDashUwp.Windows.System.VirtualKeyModifiers.windows with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VirtualKeyModifiers with Double] = js.native
}

