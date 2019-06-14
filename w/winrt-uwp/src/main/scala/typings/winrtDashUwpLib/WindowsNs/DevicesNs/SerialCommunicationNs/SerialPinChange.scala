package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SerialPinChange extends js.Object

/** Defines values for types of signal state changes on the serial port. */
@JSGlobal("Windows.Devices.SerialCommunication.SerialPinChange")
@js.native
object SerialPinChange extends js.Object {
  /** Change in the break signal state. */
  @js.native
  sealed trait breakSignal
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialPinChange
  
  /** Change in the Carrier Detect line for the port. */
  @js.native
  sealed trait carrierDetect
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialPinChange
  
  /** Change in the Clear-to-Send line for the port. */
  @js.native
  sealed trait clearToSend
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialPinChange
  
  /** Change in the state of the Data Set Ready (DSR) signal. */
  @js.native
  sealed trait dataSetReady
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialPinChange
  
  /** Change in the ring indicator state. */
  @js.native
  sealed trait ringIndicator
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialPinChange
  
  /* 0 */ val breakSignal: breakSignal with scala.Double = js.native
  /* 1 */ val carrierDetect: carrierDetect with scala.Double = js.native
  /* 2 */ val clearToSend: clearToSend with scala.Double = js.native
  /* 3 */ val dataSetReady: dataSetReady with scala.Double = js.native
  /* 4 */ val ringIndicator: ringIndicator with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialPinChange with scala.Double
  ] = js.native
}

