package typings.winrtUwp.Windows.Devices.SerialCommunication

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
  sealed trait breakSignal extends SerialPinChange
  
  /** Change in the Carrier Detect line for the port. */
  @js.native
  sealed trait carrierDetect extends SerialPinChange
  
  /** Change in the Clear-to-Send line for the port. */
  @js.native
  sealed trait clearToSend extends SerialPinChange
  
  /** Change in the state of the Data Set Ready (DSR) signal. */
  @js.native
  sealed trait dataSetReady extends SerialPinChange
  
  /** Change in the ring indicator state. */
  @js.native
  sealed trait ringIndicator extends SerialPinChange
  
}

