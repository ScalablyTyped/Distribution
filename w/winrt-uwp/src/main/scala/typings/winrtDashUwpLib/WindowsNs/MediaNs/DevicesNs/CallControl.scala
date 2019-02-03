package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the properties, commands and events for handling calls on a telephony related device. */
@JSGlobal("Windows.Media.Devices.CallControl")
@js.native
abstract class CallControl () extends js.Object {
  /** Indicates whether the telephony device has a built-in ringer. */
  var hasRinger: scala.Boolean = js.native
  /** Occurs when the device receives a request to answer a call. */
  @JSName("onanswerrequested")
  var onanswerrequested_Original: CallControlEventHandler = js.native
  /** Occurs when the device receives a request for an audio transfer. */
  @JSName("onaudiotransferrequested")
  var onaudiotransferrequested_Original: CallControlEventHandler = js.native
  /** Occurs when a number is dialed from the device. */
  @JSName("ondialrequested")
  var ondialrequested_Original: DialRequestedEventHandler = js.native
  /** Occurs when the device receives a request to hang up a call. */
  @JSName("onhanguprequested")
  var onhanguprequested_Original: CallControlEventHandler = js.native
  /** Occurs when a keypad button on the device has been pressed. */
  @JSName("onkeypadpressed")
  var onkeypadpressed_Original: KeypadPressedEventHandler = js.native
  /** Occurs when the device receives a request to redial. */
  @JSName("onredialrequested")
  var onredialrequested_Original: RedialRequestedEventHandler = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_answerrequested(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.answerrequested, listener: CallControlEventHandler): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiotransferrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.audiotransferrequested,
    listener: CallControlEventHandler
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialrequested(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.dialrequested, listener: DialRequestedEventHandler): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hanguprequested(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.hanguprequested, listener: CallControlEventHandler): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypadpressed(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.keypadpressed, listener: KeypadPressedEventHandler): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_redialrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.redialrequested,
    listener: RedialRequestedEventHandler
  ): scala.Unit = js.native
  /**
    * Ends the specified call.
    * @param callToken The unique identifier of the specified call.
    */
  def endCall(callToken: scala.Double): scala.Unit = js.native
  /**
    * Indicates that the specified call is now active.
    * @param callToken The unique identifier of the specified call.
    */
  def indicateActiveCall(callToken: scala.Double): scala.Unit = js.native
  /**
    * Informs the device that there is an incoming call.
    * @param enableRinger Specifies whether the device should activate its built-in ringer.
    * @param callerId A numeric string that specifies the incoming caller ID. This parameter can be null, and often is for many VoIP calls.
    * @return A call token that uniquely identifies this call.
    */
  def indicateNewIncomingCall(enableRinger: scala.Boolean, callerId: java.lang.String): scala.Double = js.native
  /**
    * Updates device indicators to indicate an outgoing call.
    * @return A call token that uniquely identifies this call.
    */
  def indicateNewOutgoingCall(): scala.Double = js.native
  /** Occurs when the device receives a request to answer a call. */
  def onanswerrequested(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[CallControl]): scala.Unit = js.native
  /** Occurs when the device receives a request for an audio transfer. */
  def onaudiotransferrequested(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[CallControl]): scala.Unit = js.native
  /** Occurs when a number is dialed from the device. */
  def ondialrequested(ev: DialRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CallControl]): scala.Unit = js.native
  /** Occurs when the device receives a request to hang up a call. */
  def onhanguprequested(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[CallControl]): scala.Unit = js.native
  /** Occurs when a keypad button on the device has been pressed. */
  def onkeypadpressed(ev: KeypadPressedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CallControl]): scala.Unit = js.native
  /** Occurs when the device receives a request to redial. */
  def onredialrequested(ev: RedialRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CallControl]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_answerrequested(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.answerrequested, listener: CallControlEventHandler): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiotransferrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.audiotransferrequested,
    listener: CallControlEventHandler
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialrequested(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.dialrequested, listener: DialRequestedEventHandler): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hanguprequested(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.hanguprequested, listener: CallControlEventHandler): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypadpressed(`type`: winrtDashUwpLib.winrtDashUwpLibStrings.keypadpressed, listener: KeypadPressedEventHandler): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_redialrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.redialrequested,
    listener: RedialRequestedEventHandler
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Media.Devices.CallControl")
@js.native
object CallControl extends js.Object {
  /**
    * Returns a CallControl class that represents the audio communications device specified by the DeviceInformation ID being passed.
    * @param deviceId The DeviceInformation ID of the specified audio communications device.
    * @return A class that represents the specified audio communications device.
    */
  def fromId(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CallControl = js.native
  /**
    * Returns a CallControl class that represents the default audio communications device.
    * @return A class that represents the default audio communications device.
    */
  def getDefault(): winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CallControl = js.native
}

