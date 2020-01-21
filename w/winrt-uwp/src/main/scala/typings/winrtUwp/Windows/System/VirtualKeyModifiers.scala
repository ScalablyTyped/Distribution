package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VirtualKeyModifiers with Double] = js.native
  /* 1 */ @js.native
  object control extends TopLevel[control with Double]
  
  /* 2 */ @js.native
  object menu extends TopLevel[menu with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object shift extends TopLevel[shift with Double]
  
  /* 4 */ @js.native
  object windows extends TopLevel[windows with Double]
  
}

