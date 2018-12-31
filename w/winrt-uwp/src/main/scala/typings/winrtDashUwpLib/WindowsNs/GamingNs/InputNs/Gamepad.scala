package typings
package winrtDashUwpLib.WindowsNs.GamingNs.InputNs

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
  var isWireless: scala.Boolean = js.native
  /** Signals when a headset is attached to the gamepad. */
  @JSName("onheadsetconnected")
  var onheadsetconnected_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IGameController, Headset] = js.native
  /** Signals when a headset is disconnected from the gamepad. */
  @JSName("onheadsetdisconnected")
  var onheadsetdisconnected_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IGameController, Headset] = js.native
  /** Signals when the user associated with the gamepad has changed. */
  @JSName("onuserchanged")
  var onuserchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IGameController, winrtDashUwpLib.WindowsNs.SystemNs.UserChangedEventArgs] = js.native
  /** The user associated with the gamepad. */
  var user: winrtDashUwpLib.WindowsNs.SystemNs.User = js.native
  /** Describes the gamepad motor speed. */
  var vibration: GamepadVibration = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headsetconnected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.headsetconnected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IGameController, Headset]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headsetdisconnected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.headsetdisconnected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IGameController, Headset]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_userchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.userchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IGameController, winrtDashUwpLib.WindowsNs.SystemNs.UserChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Gets a snapshot of the gamepad state.
    * @return Returns a GamepadReading containing the current state of the gamepad.
    */
  def getCurrentReading(): GamepadReading = js.native
  /** Signals when a headset is attached to the gamepad. */
  def onheadsetconnected(ev: Headset with winrtDashUwpLib.WindowsNs.WinRTEvent[IGameController]): scala.Unit = js.native
  /** Signals when a headset is disconnected from the gamepad. */
  def onheadsetdisconnected(ev: Headset with winrtDashUwpLib.WindowsNs.WinRTEvent[IGameController]): scala.Unit = js.native
  /** Signals when the user associated with the gamepad has changed. */
  def onuserchanged(
    ev: winrtDashUwpLib.WindowsNs.SystemNs.UserChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[IGameController]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_headsetconnected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.headsetconnected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IGameController, Headset]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_headsetdisconnected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.headsetdisconnected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IGameController, Headset]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_userchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.userchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IGameController, winrtDashUwpLib.WindowsNs.SystemNs.UserChangedEventArgs]
  ): scala.Unit = js.native
}

/** Represents a game controller. */
@JSGlobal("Windows.Gaming.Input.Gamepad")
@js.native
object Gamepad extends js.Object {
  /** The list of all connected gamepads. */
  var gamepads: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.GamingNs.InputNs.Gamepad] = js.native
  /** Signals when a new gamepad is connected. */
  @JSName("ongamepadadded")
  var ongamepadadded_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  /** Signals when a gamepad is disconnected. */
  @JSName("ongamepadremoved")
  var ongamepadremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadadded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.gamepadadded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.gamepadremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /** Signals when a new gamepad is connected. */
  def ongamepadadded(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  /** Signals when a gamepad is disconnected. */
  def ongamepadremoved(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepadadded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.gamepadadded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepadremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.gamepadremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
}

