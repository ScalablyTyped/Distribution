package typings.winrtUwp.Windows.Gaming.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
