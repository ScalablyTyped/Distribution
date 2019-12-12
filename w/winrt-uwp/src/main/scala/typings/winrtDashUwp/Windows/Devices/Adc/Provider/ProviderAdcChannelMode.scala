package typings.winrtDashUwp.Windows.Devices.Adc.Provider

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode.differential
import typings.winrtDashUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode.singleEnded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProviderAdcChannelMode extends js.Object

/** Determines how the pin value is represented. Implementation of specifics are decided by the provider, so differential may be fully or pseudo differential. */
@JSGlobal("Windows.Devices.Adc.Provider.ProviderAdcChannelMode")
@js.native
object ProviderAdcChannelMode extends js.Object {
  /** Difference between two pins. */
  @js.native
  sealed trait differential extends ProviderAdcChannelMode
  
  /** Simple value of a particular pin. */
  @js.native
  sealed trait singleEnded extends ProviderAdcChannelMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProviderAdcChannelMode with Double] = js.native
  /* 1 */ @js.native
  object differential extends TopLevel[differential with Double]
  
  /* 0 */ @js.native
  object singleEnded extends TopLevel[singleEnded with Double]
  
}

