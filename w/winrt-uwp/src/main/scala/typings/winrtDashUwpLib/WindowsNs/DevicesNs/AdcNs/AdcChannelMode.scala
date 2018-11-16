package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdcChannelMode extends js.Object

/** Describes the channel modes that the ADC controller can use for input. */
@JSGlobal("Windows.Devices.Adc.AdcChannelMode")
@js.native
object AdcChannelMode extends js.Object {
  /** Difference between two pins. */
  @js.native
  sealed trait differential
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.AdcChannelMode
  
  /** Simple value of a particular pin. */
  @js.native
  sealed trait singleEnded
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.AdcChannelMode
  
  val differential: differential with java.lang.String = js.native
  val singleEnded: singleEnded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.AdcChannelMode with java.lang.String] = js.native
}

