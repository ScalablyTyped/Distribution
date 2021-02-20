package typings.w3cGamepad

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gamepad {
  
  @js.native
  trait Gamepad extends StObject {
    
    /**
      * Array of values for all axes of the gamepad. All axis values must be linearly normalized to the range [-1.0 .. 1.0]. As appropriate, -1.0 should correspond to "up" or "left", and 1.0 should correspond to "down" or "right". Axes that are drawn from a 2D input device should appear next to each other in the axes array, X then Y. It is recommended that axes appear in decreasing order of importance, such that element 0 and 1 typically represent the X and Y axis of a directional stick.
      * @readonly
      */
    var axes: js.Array[Double] = js.native
    
    /**
      * Array of values for all buttons of the gamepad. All button values must be linearly normalized to the range [0.0 .. 1.0]. 0.0 must mean fully unpressed, and 1.0 must mean fully pressed. It is recommended that buttons appear in decreasing importance such that the primary button, secondary button, tertiary button, and so on appear as elements 0, 1, 2, ... in the buttons array.
      * @readonly
      */
    var buttons: js.Array[GamepadButton] = js.native
    
    /**
      * Indicates whether the physical device represented by this object is still connected to the system. When a gamepad becomes unavailable, whether by being physically disconnected, powered off or otherwise unusable, the connected attribute must be set to false.
      * @readonly
      */
    var connected: Boolean = js.native
    
    /**
      * An identification string for the gamepad. This string identifies the brand or style of connected gamepad device. Typically, this will include the USB vendor and a product ID.
      * @readonly
      */
    var id: String = js.native
    
    /**
      * The index of the gamepad in the Navigator. When multiple gamepads are connected to a user agent, indices must be assigned on a first-come, first-serve basis, starting at zero. If a gamepad is disconnected, previously assigned indices must not be reassigned to gamepads that continue to be connected. However, if a gamepad is disconnected, and subsequently the same or a different gamepad is then connected, index entries must be reused.
      * @readonly
      */
    var index: Double = js.native
    
    /**
      * The mapping in use for this device. If the user agent has knowledge of the layout of the device, then it should indicate that a mapping is in use by setting this property to a known mapping name. Currently the only known mapping is "standard", which corresponds to the Standard Gamepad layout. If the user agent does not have knowledge of the device layout and is simply providing the controls as represented by the driver in use, then it must set the mapping property to an empty string.
      * @readonly
      */
    var mapping: String = js.native
    
    /**
      * Last time the data for this gamepad was updated. Timestamp is a monotonically increasing value that allows the author to determine if the axes and button data have been updated from the hardware, relative to a previously saved timestamp.
      * @readonly
      */
    var timestamp: Double = js.native
  }
  object Gamepad {
    
    @scala.inline
    def apply(
      axes: js.Array[Double],
      buttons: js.Array[GamepadButton],
      connected: Boolean,
      id: String,
      index: Double,
      mapping: String,
      timestamp: Double
    ): typings.w3cGamepad.Gamepad.Gamepad = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.w3cGamepad.Gamepad.Gamepad]
    }
    
    @scala.inline
    implicit class GamepadMutableBuilder[Self <: typings.w3cGamepad.Gamepad.Gamepad] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: js.Array[Double]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesVarargs(value: Double*): Self = StObject.set(x, "axes", js.Array(value :_*))
      
      @scala.inline
      def setButtons(value: js.Array[GamepadButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsVarargs(value: GamepadButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapping(value: String): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GamepadButton extends StObject {
    
    var pressed: Boolean = js.native
    
    var value: Double = js.native
  }
  object GamepadButton {
    
    @scala.inline
    def apply(pressed: Boolean, value: Double): GamepadButton = {
      val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GamepadButton]
    }
    
    @scala.inline
    implicit class GamepadButtonMutableBuilder[Self <: GamepadButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GamepadEvent extends Event {
    
    /**
      * The single gamepad attribute provides access to the associated gamepad data for this event.
      * @readonly
      */
    var gamepad: typings.w3cGamepad.Gamepad.Gamepad = js.native
  }
  
  @js.native
  trait GamepadList
    extends /* index */ NumberDictionary[typings.w3cGamepad.Gamepad.Gamepad] {
    
    var length: Double = js.native
  }
  object GamepadList {
    
    @scala.inline
    def apply(length: Double): GamepadList = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[GamepadList]
    }
    
    @scala.inline
    implicit class GamepadListMutableBuilder[Self <: GamepadList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
