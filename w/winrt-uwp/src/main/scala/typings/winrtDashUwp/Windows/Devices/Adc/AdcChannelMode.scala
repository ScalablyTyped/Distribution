package typings.winrtDashUwp.Windows.Devices.Adc

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdcChannelMode with Double] = js.native
  /* 1 */ @js.native
  object differential extends TopLevel[differential with Double]
  
  /* 0 */ @js.native
  object singleEnded extends TopLevel[singleEnded with Double]
  
}

