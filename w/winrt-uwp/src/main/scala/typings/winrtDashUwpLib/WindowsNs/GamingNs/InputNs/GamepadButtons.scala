package typings
package winrtDashUwpLib.WindowsNs.GamingNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GamepadButtons extends js.Object

/** Specifies the button type. */
@JSGlobal("Windows.Gaming.Input.GamepadButtons")
@js.native
object GamepadButtons extends js.Object {
  /** A button. */
  @js.native
  sealed trait a
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** B button. */
  @js.native
  sealed trait b
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** D-pad down. */
  @js.native
  sealed trait dpadDown
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** D-pad left. */
  @js.native
  sealed trait dpadLeft
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** D-pad right. */
  @js.native
  sealed trait dpadRight
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** D-pad up. */
  @js.native
  sealed trait dpadUp
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** Left bumper. */
  @js.native
  sealed trait leftShoulder
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** Left stick. */
  @js.native
  sealed trait leftThumbstick
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** Menu button. */
  @js.native
  sealed trait menu
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** No button. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** Right bumper. */
  @js.native
  sealed trait rightShoulder
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** Right stick. */
  @js.native
  sealed trait rightThumbstick
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** View button. */
  @js.native
  sealed trait view
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** X button. */
  @js.native
  sealed trait x
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /** Y button. */
  @js.native
  sealed trait y
    extends winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons
  
  /* 3 */ val a: a with scala.Double = js.native
  /* 4 */ val b: b with scala.Double = js.native
  /* 8 */ val dpadDown: dpadDown with scala.Double = js.native
  /* 9 */ val dpadLeft: dpadLeft with scala.Double = js.native
  /* 10 */ val dpadRight: dpadRight with scala.Double = js.native
  /* 7 */ val dpadUp: dpadUp with scala.Double = js.native
  /* 11 */ val leftShoulder: leftShoulder with scala.Double = js.native
  /* 13 */ val leftThumbstick: leftThumbstick with scala.Double = js.native
  /* 1 */ val menu: menu with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 12 */ val rightShoulder: rightShoulder with scala.Double = js.native
  /* 14 */ val rightThumbstick: rightThumbstick with scala.Double = js.native
  /* 2 */ val view: view with scala.Double = js.native
  /* 5 */ val x: x with scala.Double = js.native
  /* 6 */ val y: y with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GamingNs.InputNs.GamepadButtons with scala.Double] = js.native
}

