package typings.winrtDashUwp.WindowsNs.GamingNs.InputNs

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
  sealed trait a extends GamepadButtons
  
  /** B button. */
  @js.native
  sealed trait b extends GamepadButtons
  
  /** D-pad down. */
  @js.native
  sealed trait dpadDown extends GamepadButtons
  
  /** D-pad left. */
  @js.native
  sealed trait dpadLeft extends GamepadButtons
  
  /** D-pad right. */
  @js.native
  sealed trait dpadRight extends GamepadButtons
  
  /** D-pad up. */
  @js.native
  sealed trait dpadUp extends GamepadButtons
  
  /** Left bumper. */
  @js.native
  sealed trait leftShoulder extends GamepadButtons
  
  /** Left stick. */
  @js.native
  sealed trait leftThumbstick extends GamepadButtons
  
  /** Menu button. */
  @js.native
  sealed trait menu extends GamepadButtons
  
  /** No button. */
  @js.native
  sealed trait none extends GamepadButtons
  
  /** Right bumper. */
  @js.native
  sealed trait rightShoulder extends GamepadButtons
  
  /** Right stick. */
  @js.native
  sealed trait rightThumbstick extends GamepadButtons
  
  /** View button. */
  @js.native
  sealed trait view extends GamepadButtons
  
  /** X button. */
  @js.native
  sealed trait x extends GamepadButtons
  
  /** Y button. */
  @js.native
  sealed trait y extends GamepadButtons
  
  /* 3 */ val a: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.a with Double = js.native
  /* 4 */ val b: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.b with Double = js.native
  /* 8 */ val dpadDown: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.dpadDown with Double = js.native
  /* 9 */ val dpadLeft: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.dpadLeft with Double = js.native
  /* 10 */ val dpadRight: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.dpadRight with Double = js.native
  /* 7 */ val dpadUp: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.dpadUp with Double = js.native
  /* 11 */ val leftShoulder: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.leftShoulder with Double = js.native
  /* 13 */ val leftThumbstick: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.leftThumbstick with Double = js.native
  /* 1 */ val menu: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.menu with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.none with Double = js.native
  /* 12 */ val rightShoulder: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.rightShoulder with Double = js.native
  /* 14 */ val rightThumbstick: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.rightThumbstick with Double = js.native
  /* 2 */ val view: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.view with Double = js.native
  /* 5 */ val x: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.x with Double = js.native
  /* 6 */ val y: typings.winrtDashUwp.WindowsNs.GamingNs.InputNs.GamepadButtons.y with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GamepadButtons with Double] = js.native
}

