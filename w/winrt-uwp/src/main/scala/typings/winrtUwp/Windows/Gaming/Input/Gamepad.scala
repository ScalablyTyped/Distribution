package typings.winrtUwp.Windows.Gaming.Input

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.System.User
import typings.winrtUwp.Windows.System.UserChangedEventArgs
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.headsetconnected
import typings.winrtUwp.winrtUwpStrings.headsetdisconnected
import typings.winrtUwp.winrtUwpStrings.userchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a game controller. */
@js.native
trait Gamepad extends js.Object {
  
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
