package typings.winrtUwp.Windows.Gaming

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.System.User
import typings.winrtUwp.Windows.System.UserChangedEventArgs
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.headsetconnected
import typings.winrtUwp.winrtUwpStrings.headsetdisconnected
import typings.winrtUwp.winrtUwpStrings.userchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to game controller input. */
object Input {
  
  @js.native
  sealed trait GamepadButtons extends StObject
  /** Specifies the button type. */
  @JSGlobal("Windows.Gaming.Input.GamepadButtons")
  @js.native
  object GamepadButtons extends StObject {
    
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
  
  /** Represents a game controller. */
  @js.native
  trait Gamepad extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_headsetconnected(`type`: headsetconnected, listener: TypedEventHandler[IGameController, Headset]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_headsetdisconnected(`type`: headsetdisconnected, listener: TypedEventHandler[IGameController, Headset]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_userchanged(`type`: userchanged, listener: TypedEventHandler[IGameController, UserChangedEventArgs]): Unit = js.native
    
    /**
      * Gets a snapshot of the gamepad state.
      * @return Returns a GamepadReading containing the current state of the gamepad.
      */
    def getCurrentReading(): GamepadReading = js.native
    
    /** The audio headset attached to the gamepad. */
    var headset: Headset = js.native
    
    /** Gets a value that indicates the wireless state of the gamepad. */
    var isWireless: Boolean = js.native
    
    /** Signals when a headset is attached to the gamepad. */
    def onheadsetconnected(ev: Headset with WinRTEvent[IGameController]): Unit = js.native
    /** Signals when a headset is attached to the gamepad. */
    @JSName("onheadsetconnected")
    var onheadsetconnected_Original: TypedEventHandler[IGameController, Headset] = js.native
    
    /** Signals when a headset is disconnected from the gamepad. */
    def onheadsetdisconnected(ev: Headset with WinRTEvent[IGameController]): Unit = js.native
    /** Signals when a headset is disconnected from the gamepad. */
    @JSName("onheadsetdisconnected")
    var onheadsetdisconnected_Original: TypedEventHandler[IGameController, Headset] = js.native
    
    /** Signals when the user associated with the gamepad has changed. */
    def onuserchanged(ev: UserChangedEventArgs with WinRTEvent[IGameController]): Unit = js.native
    /** Signals when the user associated with the gamepad has changed. */
    @JSName("onuserchanged")
    var onuserchanged_Original: TypedEventHandler[IGameController, UserChangedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_headsetconnected(`type`: headsetconnected, listener: TypedEventHandler[IGameController, Headset]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_headsetdisconnected(`type`: headsetdisconnected, listener: TypedEventHandler[IGameController, Headset]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_userchanged(`type`: userchanged, listener: TypedEventHandler[IGameController, UserChangedEventArgs]): Unit = js.native
    
    /** The user associated with the gamepad. */
    var user: User = js.native
    
    /** Describes the gamepad motor speed. */
    var vibration: GamepadVibration = js.native
  }
  
  /** Represents the current state of the controller. */
  @js.native
  trait GamepadReading extends StObject {
    
    /** The state of the controller buttons. */
    var buttons: GamepadButtons = js.native
    
    /** The position of the left thumbstick on the X-asxis. The value is between -1.0 and 1.0. */
    var leftThumbstickX: Double = js.native
    
    /** The position of the left thumbstick on the Y-axis.The value is between -1.0 and 1.0. */
    var leftThumbstickY: Double = js.native
    
    /** The position of the left trigger. The value is between 0.0 (not depressed) and 1.0 (fully depressed). */
    var leftTrigger: Double = js.native
    
    /** The position of the right thumbstick on the X-axis.The value is between -1.0 and 1.0. */
    var rightThumbstickX: Double = js.native
    
    /** The position of the right thumbstick on the Y-axis. The value is between -1.0 and 1.0. */
    var rightThumbstickY: Double = js.native
    
    /** The position of the right trigger. The value is between 0.0 (not depressed) and 1.0 (fully depressed). */
    var rightTrigger: Double = js.native
    
    /** Time when the state was retrieved from the controller. */
    var timestamp: Double = js.native
  }
  object GamepadReading {
    
    @scala.inline
    def apply(
      buttons: GamepadButtons,
      leftThumbstickX: Double,
      leftThumbstickY: Double,
      leftTrigger: Double,
      rightThumbstickX: Double,
      rightThumbstickY: Double,
      rightTrigger: Double,
      timestamp: Double
    ): GamepadReading = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], leftThumbstickX = leftThumbstickX.asInstanceOf[js.Any], leftThumbstickY = leftThumbstickY.asInstanceOf[js.Any], leftTrigger = leftTrigger.asInstanceOf[js.Any], rightThumbstickX = rightThumbstickX.asInstanceOf[js.Any], rightThumbstickY = rightThumbstickY.asInstanceOf[js.Any], rightTrigger = rightTrigger.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[GamepadReading]
    }
    
    @scala.inline
    implicit class GamepadReadingMutableBuilder[Self <: GamepadReading] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: GamepadButtons): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftThumbstickX(value: Double): Self = StObject.set(x, "leftThumbstickX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftThumbstickY(value: Double): Self = StObject.set(x, "leftThumbstickY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftTrigger(value: Double): Self = StObject.set(x, "leftTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightThumbstickX(value: Double): Self = StObject.set(x, "rightThumbstickX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightThumbstickY(value: Double): Self = StObject.set(x, "rightThumbstickY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightTrigger(value: Double): Self = StObject.set(x, "rightTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /** Describes the speed of the gamepad's four available vibration motors. */
  @js.native
  trait GamepadVibration extends StObject {
    
    /** The level of the left vibration motor. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
    var leftMotor: Double = js.native
    
    /** The left trigger vibration level. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
    var leftTrigger: Double = js.native
    
    /** The level of the right vibration motor. Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
    var rightMotor: Double = js.native
    
    /** The right trigger vibration level, Valid values are between 0.0 and 1.0, where 0.0 signifies no motor use and 1.0 signifies max vibration. */
    var rightTrigger: Double = js.native
  }
  object GamepadVibration {
    
    @scala.inline
    def apply(leftMotor: Double, leftTrigger: Double, rightMotor: Double, rightTrigger: Double): GamepadVibration = {
      val __obj = js.Dynamic.literal(leftMotor = leftMotor.asInstanceOf[js.Any], leftTrigger = leftTrigger.asInstanceOf[js.Any], rightMotor = rightMotor.asInstanceOf[js.Any], rightTrigger = rightTrigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[GamepadVibration]
    }
    
    @scala.inline
    implicit class GamepadVibrationMutableBuilder[Self <: GamepadVibration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeftMotor(value: Double): Self = StObject.set(x, "leftMotor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftTrigger(value: Double): Self = StObject.set(x, "leftTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightMotor(value: Double): Self = StObject.set(x, "rightMotor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightTrigger(value: Double): Self = StObject.set(x, "rightTrigger", value.asInstanceOf[js.Any])
    }
  }
  
  /** Contains information about an audio headset attached to a gamepad. */
  @js.native
  trait Headset extends StObject {
    
    /** The XAudio endpoint ID for the headset's audio capture device. */
    var captureDeviceId: String = js.native
    
    /** The XAudio enpoint ID for the headset's audio render device. */
    var renderDeviceId: String = js.native
  }
  object Headset {
    
    @scala.inline
    def apply(captureDeviceId: String, renderDeviceId: String): Headset = {
      val __obj = js.Dynamic.literal(captureDeviceId = captureDeviceId.asInstanceOf[js.Any], renderDeviceId = renderDeviceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headset]
    }
    
    @scala.inline
    implicit class HeadsetMutableBuilder[Self <: Headset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptureDeviceId(value: String): Self = StObject.set(x, "captureDeviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderDeviceId(value: String): Self = StObject.set(x, "renderDeviceId", value.asInstanceOf[js.Any])
    }
  }
  
  /** The core interface required to be implemented by all controller devices, regardless of their actual type (i.e. gamepads, steering wheels, flight sticks, etc). This interface exists mainly to support extensibility for game controllers, which allows OEMs to publish WinRT classes that provide rich access to their device's features, while integrating into the underlying game controller device enumeration framework. */
  @js.native
  trait IGameController extends StObject {
    
    /** The audio headset attached to the controller. */
    var headset: Headset = js.native
    
    /** Gets a value that indicates the wireless state of the gamepad. */
    var isWireless: Boolean = js.native
    
    /** The user associated with the controller. */
    var user: User = js.native
  }
  object IGameController {
    
    @scala.inline
    def apply(headset: Headset, isWireless: Boolean, user: User): IGameController = {
      val __obj = js.Dynamic.literal(headset = headset.asInstanceOf[js.Any], isWireless = isWireless.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGameController]
    }
    
    @scala.inline
    implicit class IGameControllerMutableBuilder[Self <: IGameController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeadset(value: Headset): Self = StObject.set(x, "headset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWireless(value: Boolean): Self = StObject.set(x, "isWireless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
