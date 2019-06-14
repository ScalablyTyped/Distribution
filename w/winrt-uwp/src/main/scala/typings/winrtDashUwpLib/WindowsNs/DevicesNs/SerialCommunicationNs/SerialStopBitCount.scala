package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs

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
  sealed trait one
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialStopBitCount
  
  /** 1.5 stop bits are used. */
  @js.native
  sealed trait onePointFive
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialStopBitCount
  
  /** Two stop bits are used. */
  @js.native
  sealed trait two
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialStopBitCount
  
  /* 0 */ val one: one with scala.Double = js.native
  /* 1 */ val onePointFive: onePointFive with scala.Double = js.native
  /* 2 */ val two: two with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialStopBitCount with scala.Double
  ] = js.native
}

