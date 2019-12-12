package typings.winrtDashUwp.Windows.Devices.SerialCommunication

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.SerialCommunication.SerialPinChange.breakSignal
import typings.winrtDashUwp.Windows.Devices.SerialCommunication.SerialPinChange.carrierDetect
import typings.winrtDashUwp.Windows.Devices.SerialCommunication.SerialPinChange.clearToSend
import typings.winrtDashUwp.Windows.Devices.SerialCommunication.SerialPinChange.dataSetReady
import typings.winrtDashUwp.Windows.Devices.SerialCommunication.SerialPinChange.ringIndicator
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SerialPinChange with Double] = js.native
  /* 0 */ @js.native
  object breakSignal extends TopLevel[breakSignal with Double]
  
  /* 1 */ @js.native
  object carrierDetect extends TopLevel[carrierDetect with Double]
  
  /* 2 */ @js.native
  object clearToSend extends TopLevel[clearToSend with Double]
  
  /* 3 */ @js.native
  object dataSetReady extends TopLevel[dataSetReady with Double]
  
  /* 4 */ @js.native
  object ringIndicator extends TopLevel[ringIndicator with Double]
  
}

