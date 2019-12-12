package typings.winrtDashUwp.Windows.Devices.SerialCommunication

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.SerialCommunication.SerialStopBitCount.one
import typings.winrtDashUwp.Windows.Devices.SerialCommunication.SerialStopBitCount.onePointFive
import typings.winrtDashUwp.Windows.Devices.SerialCommunication.SerialStopBitCount.two
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SerialStopBitCount with Double] = js.native
  /* 0 */ @js.native
  object one extends TopLevel[one with Double]
  
  /* 1 */ @js.native
  object onePointFive extends TopLevel[onePointFive with Double]
  
  /* 2 */ @js.native
  object two extends TopLevel[two with Double]
  
}

