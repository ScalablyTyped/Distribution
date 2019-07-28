package typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SerialStopBitCount extends js.Object

/** Defines values that indicate the number of stop bits used in a transmission. The values are used by the StopBits property on the SerialDevice object. */
@JSGlobal("Windows.Devices.SerialCommunication.SerialStopBitCount")
@js.native
object SerialStopBitCount extends js.Object {
  /** One stop bit is used. */
  @js.native
  sealed trait one extends SerialStopBitCount
  
  /** 1.5 stop bits are used. */
  @js.native
  sealed trait onePointFive extends SerialStopBitCount
  
  /** Two stop bits are used. */
  @js.native
  sealed trait two extends SerialStopBitCount
  
  /* 0 */ val one: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialStopBitCount.one with Double = js.native
  /* 1 */ val onePointFive: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialStopBitCount.onePointFive with Double = js.native
  /* 2 */ val two: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialStopBitCount.two with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SerialStopBitCount with Double] = js.native
}

