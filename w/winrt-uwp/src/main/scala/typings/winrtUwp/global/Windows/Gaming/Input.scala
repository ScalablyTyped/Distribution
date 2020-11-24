package typings.winrtUwp.global.Windows.Gaming

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.gamepadadded
import typings.winrtUwp.winrtUwpStrings.gamepadremoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to game controller input. */
@JSGlobal("Windows.Gaming.Input")
@js.native
object Input extends js.Object {
  
  /** Represents a game controller. */
  @js.native
  abstract class Gamepad ()
    extends typings.winrtUwp.Windows.Gaming.Input.Gamepad
  /* static members */
  @js.native
  object Gamepad extends js.Object {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[_]): Unit = js.native
    
    /** The list of all connected gamepads. */
    var gamepads: IVectorView[typings.winrtUwp.Windows.Gaming.Input.Gamepad] = js.native
    
    /** Signals when a new gamepad is connected. */
    def ongamepadadded(ev: js.Any with WinRTEvent[_]): Unit = js.native
    /** Signals when a new gamepad is connected. */
    @JSName("ongamepadadded")
    var ongamepadadded_Original: EventHandler[_] = js.native
    
    /** Signals when a gamepad is disconnected. */
    def ongamepadremoved(ev: js.Any with WinRTEvent[_]): Unit = js.native
    /** Signals when a gamepad is disconnected. */
    @JSName("ongamepadremoved")
    var ongamepadremoved_Original: EventHandler[_] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[_]): Unit = js.native
  }
  
  /** Specifies the button type. */
  @js.native
  object GamepadButtons extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Gaming.Input.GamepadButtons with Double] = js.native
    
    /* 3 */ val a: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.a with Double = js.native
    
    /* 4 */ val b: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.b with Double = js.native
    
    /* 8 */ val dpadDown: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadDown with Double = js.native
    
    /* 9 */ val dpadLeft: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadLeft with Double = js.native
    
    /* 10 */ val dpadRight: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadRight with Double = js.native
    
    /* 7 */ val dpadUp: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadUp with Double = js.native
    
    /* 11 */ val leftShoulder: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.leftShoulder with Double = js.native
    
    /* 13 */ val leftThumbstick: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.leftThumbstick with Double = js.native
    
    /* 1 */ val menu: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.menu with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.none with Double = js.native
    
    /* 12 */ val rightShoulder: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.rightShoulder with Double = js.native
    
    /* 14 */ val rightThumbstick: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.rightThumbstick with Double = js.native
    
    /* 2 */ val view: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.view with Double = js.native
    
    /* 5 */ val x: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.x with Double = js.native
    
    /* 6 */ val y: typings.winrtUwp.Windows.Gaming.Input.GamepadButtons.y with Double = js.native
  }
  
  /** Contains information about an audio headset attached to a gamepad. */
  @js.native
  abstract class Headset ()
    extends typings.winrtUwp.Windows.Gaming.Input.Headset
}
