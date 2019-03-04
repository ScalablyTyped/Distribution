package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AdcNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents methods common to all ADC providers. */
trait IAdcProvider extends js.Object {
  /**
    * Gets the ADC controllers available on the system.
    * @return When this method completes it returns a list of all the available controllers on the system.
    */
  def getControllers(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IAdcControllerProvider]
}

object IAdcProvider {
  @scala.inline
  def apply(
    getControllers: js.Function0[
      winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IAdcControllerProvider]
    ]
  ): IAdcProvider = {
    val __obj = js.Dynamic.literal(getControllers = getControllers)
  
    __obj.asInstanceOf[IAdcProvider]
  }
}

