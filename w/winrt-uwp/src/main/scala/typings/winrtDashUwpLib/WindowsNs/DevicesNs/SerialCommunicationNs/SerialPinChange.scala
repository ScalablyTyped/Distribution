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
  
  val breakSignal: breakSignal with java.lang.String = js.native
  val carrierDetect: carrierDetect with java.lang.String = js.native
  val clearToSend: clearToSend with java.lang.String = js.native
  val dataSetReady: dataSetReady with java.lang.String = js.native
  val ringIndicator: ringIndicator with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialPinChange with java.lang.String
  ] = js.native
}

