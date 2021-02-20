package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.answerrequested
import typings.winrtUwp.winrtUwpStrings.audiotransferrequested
import typings.winrtUwp.winrtUwpStrings.dialrequested
import typings.winrtUwp.winrtUwpStrings.hanguprequested
import typings.winrtUwp.winrtUwpStrings.keypadpressed
import typings.winrtUwp.winrtUwpStrings.redialrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the properties, commands and events for handling calls on a telephony related device. */
@js.native
trait CallControl extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_answerrequested(`type`: answerrequested, listener: CallControlEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiotransferrequested(`type`: audiotransferrequested, listener: CallControlEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialrequested(`type`: dialrequested, listener: DialRequestedEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hanguprequested(`type`: hanguprequested, listener: CallControlEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypadpressed(`type`: keypadpressed, listener: KeypadPressedEventHandler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_redialrequested(`type`: redialrequested, listener: RedialRequestedEventHandler): Unit = js.native
  
  /**
    * Ends the specified call.
    * @param callToken The unique identifier of the specified call.
    */
  def endCall(callToken: Double): Unit = js.native
  
  /** Indicates whether the telephony device has a built-in ringer. */
  var hasRinger: Boolean = js.native
  
  /**
    * Indicates that the specified call is now active.
    * @param callToken The unique identifier of the specified call.
    */
  def indicateActiveCall(callToken: Double): Unit = js.native
  
  /**
    * Informs the device that there is an incoming call.
    * @param enableRinger Specifies whether the device should activate its built-in ringer.
    * @param callerId A numeric string that specifies the incoming caller ID. This parameter can be null, and often is for many VoIP calls.
    * @return A call token that uniquely identifies this call.
    */
  def indicateNewIncomingCall(enableRinger: Boolean, callerId: String): Double = js.native
  
  /**
    * Updates device indicators to indicate an outgoing call.
    * @return A call token that uniquely identifies this call.
    */
  def indicateNewOutgoingCall(): Double = js.native
  
  /** Occurs when the device receives a request to answer a call. */
  def onanswerrequested(ev: WinRTEvent[CallControl]): Unit = js.native
  /** Occurs when the device receives a request to answer a call. */
  @JSName("onanswerrequested")
  var onanswerrequested_Original: CallControlEventHandler = js.native
  
  /** Occurs when the device receives a request for an audio transfer. */
  def onaudiotransferrequested(ev: WinRTEvent[CallControl]): Unit = js.native
  /** Occurs when the device receives a request for an audio transfer. */
  @JSName("onaudiotransferrequested")
  var onaudiotransferrequested_Original: CallControlEventHandler = js.native
  
  /** Occurs when a number is dialed from the device. */
  def ondialrequested(ev: DialRequestedEventArgs with WinRTEvent[CallControl]): Unit = js.native
  /** Occurs when a number is dialed from the device. */
  @JSName("ondialrequested")
  var ondialrequested_Original: DialRequestedEventHandler = js.native
  
  /** Occurs when the device receives a request to hang up a call. */
  def onhanguprequested(ev: WinRTEvent[CallControl]): Unit = js.native
  /** Occurs when the device receives a request to hang up a call. */
  @JSName("onhanguprequested")
  var onhanguprequested_Original: CallControlEventHandler = js.native
  
  /** Occurs when a keypad button on the device has been pressed. */
  def onkeypadpressed(ev: KeypadPressedEventArgs with WinRTEvent[CallControl]): Unit = js.native
  /** Occurs when a keypad button on the device has been pressed. */
  @JSName("onkeypadpressed")
  var onkeypadpressed_Original: KeypadPressedEventHandler = js.native
  
  /** Occurs when the device receives a request to redial. */
  def onredialrequested(ev: RedialRequestedEventArgs with WinRTEvent[CallControl]): Unit = js.native
  /** Occurs when the device receives a request to redial. */
  @JSName("onredialrequested")
  var onredialrequested_Original: RedialRequestedEventHandler = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_answerrequested(`type`: answerrequested, listener: CallControlEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiotransferrequested(`type`: audiotransferrequested, listener: CallControlEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialrequested(`type`: dialrequested, listener: DialRequestedEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hanguprequested(`type`: hanguprequested, listener: CallControlEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypadpressed(`type`: keypadpressed, listener: KeypadPressedEventHandler): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_redialrequested(`type`: redialrequested, listener: RedialRequestedEventHandler): Unit = js.native
}
