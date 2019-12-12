package typings.winrtDashUwp.Windows.Gaming.Input

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.a
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.b
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.dpadDown
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.dpadLeft
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.dpadRight
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.dpadUp
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.leftShoulder
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.leftThumbstick
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.menu
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.none
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.rightShoulder
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.rightThumbstick
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.view
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.x
import typings.winrtDashUwp.Windows.Gaming.Input.GamepadButtons.y
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GamepadButtons with Double] = js.native
  /* 3 */ @js.native
  object a extends TopLevel[a with Double]
  
  /* 4 */ @js.native
  object b extends TopLevel[b with Double]
  
  /* 8 */ @js.native
  object dpadDown extends TopLevel[dpadDown with Double]
  
  /* 9 */ @js.native
  object dpadLeft extends TopLevel[dpadLeft with Double]
  
  /* 10 */ @js.native
  object dpadRight extends TopLevel[dpadRight with Double]
  
  /* 7 */ @js.native
  object dpadUp extends TopLevel[dpadUp with Double]
  
  /* 11 */ @js.native
  object leftShoulder extends TopLevel[leftShoulder with Double]
  
  /* 13 */ @js.native
  object leftThumbstick extends TopLevel[leftThumbstick with Double]
  
  /* 1 */ @js.native
  object menu extends TopLevel[menu with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 12 */ @js.native
  object rightShoulder extends TopLevel[rightShoulder with Double]
  
  /* 14 */ @js.native
  object rightThumbstick extends TopLevel[rightThumbstick with Double]
  
  /* 2 */ @js.native
  object view extends TopLevel[view with Double]
  
  /* 5 */ @js.native
  object x extends TopLevel[x with Double]
  
  /* 6 */ @js.native
  object y extends TopLevel[y with Double]
  
}

