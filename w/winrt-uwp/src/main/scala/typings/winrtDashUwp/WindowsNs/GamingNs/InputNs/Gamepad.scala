package typings.winrtDashUwp.WindowsNs.GamingNs.InputNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.SystemNs.User
import typings.winrtDashUwp.WindowsNs.SystemNs.UserChangedEventArgs
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.gamepadadded
import typings.winrtDashUwp.winrtDashUwpStrings.gamepadremoved
import typings.winrtDashUwp.winrtDashUwpStrings.headsetconnected
import typings.winrtDashUwp.winrtDashUwpStrings.headsetdisconnected
import typings.winrtDashUwp.winrtDashUwpStrings.userchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a game controller. */
@JSGlobal("Windows.Gaming.Input.Gamepad")
@js.native
abstract class Gamepad () extends js.Object {
  /** The audio headset attached to the gamepad. */
  var headset: Headset = js.native
  /** Gets a value that indicates the wireless state of the gamepad. */
  var isWireless: Boolean = js.native
  /** Signals when a headset is attached to the gamepad. */
  @JSName("onheadsetconnected")
  var onheadsetconnected_Original: TypedEventHandler[IGameController, Headset] = js.native
  /** Signals when a headset is disconnected from the gamepad. */
  @JSName("onheadsetdisconnected")
  var onheadsetdisconnected_Original: TypedEventHandler[IGameController, Headset] = js.native
  /** Signals when the user associated with the gamepad has changed. */
  @JSName("onuserchanged")
  var onuserchanged_Original: TypedEventHandler[IGameController, UserChangedEventArgs] = js.native
  /** The user associated with the gamepad. */
  var user: User = js.native
  /** Describes the gamepad motor speed. */
  var vibration: GamepadVibration = js.native
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
  /** Signals when a headset is attached to the gamepad. */
  def onheadsetconnected(ev: Headset with WinRTEvent[IGameController]): Unit = js.native
  /** Signals when a headset is disconnected from the gamepad. */
  def onheadsetdisconnected(ev: Headset with WinRTEvent[IGameController]): Unit = js.native
  /** Signals when the user associated with the gamepad has changed. */
  def onuserchanged(ev: UserChangedEventArgs with WinRTEvent[IGameController]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_headsetconnected(`type`: headsetconnected, listener: TypedEventHandler[IGameController, Headset]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_headsetdisconnected(`type`: headsetdisconnected, listener: TypedEventHandler[IGameController, Headset]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_userchanged(`type`: userchanged, listener: TypedEventHandler[IGameController, UserChangedEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Gaming.Input.Gamepad")
@js.native
object Gamepad extends js.Object {
  /** The list of all connected gamepads. */
  var gamepads: IVectorView[Gamepad] = js.native
  /** Signals when a new gamepad is connected. */
  @JSName("ongamepadadded")
  var ongamepadadded_Original: EventHandler[_] = js.native
  /** Signals when a gamepad is disconnected. */
  @JSName("ongamepadremoved")
  var ongamepadremoved_Original: EventHandler[_] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[_]): Unit = js.native
  /** Signals when a new gamepad is connected. */
  def ongamepadadded(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** Signals when a gamepad is disconnected. */
  def ongamepadremoved(ev: js.Any with WinRTEvent[_]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[_]): Unit = js.native
}

