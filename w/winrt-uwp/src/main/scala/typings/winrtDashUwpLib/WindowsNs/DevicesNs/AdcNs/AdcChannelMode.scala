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
  
  /* 1 */ val differential: differential with scala.Double = js.native
  /* 0 */ val singleEnded: singleEnded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.AdcChannelMode with scala.Double] = js.native
}

