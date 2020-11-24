package typings.winrtUwp.Windows.Devices.Adc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
