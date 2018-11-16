package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.ProviderNs

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
  sealed trait differential
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.ProviderNs.ProviderAdcChannelMode
  
  /** Simple value of a particular pin. */
  @js.native
  sealed trait singleEnded
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.ProviderNs.ProviderAdcChannelMode
  
  val differential: differential with java.lang.String = js.native
  val singleEnded: singleEnded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.ProviderNs.ProviderAdcChannelMode with java.lang.String
  ] = js.native
}

