package typings.winrtDashUwp.WindowsNs.DevicesNs.AdcNs

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
  sealed trait differential extends AdcChannelMode
  
  /** Simple value of a particular pin. */
  @js.native
  sealed trait singleEnded extends AdcChannelMode
  
  /* 1 */ val differential: typings.winrtDashUwp.WindowsNs.DevicesNs.AdcNs.AdcChannelMode.differential with Double = js.native
  /* 0 */ val singleEnded: typings.winrtDashUwp.WindowsNs.DevicesNs.AdcNs.AdcChannelMode.singleEnded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdcChannelMode with Double] = js.native
}

