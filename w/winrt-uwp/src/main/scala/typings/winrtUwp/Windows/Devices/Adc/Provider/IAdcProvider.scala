package typings.winrtUwp.Windows.Devices.Adc.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents methods common to all ADC providers. */
trait IAdcProvider extends js.Object {
  /**
    * Gets the ADC controllers available on the system.
    * @return When this method completes it returns a list of all the available controllers on the system.
    */
  def getControllers(): IVectorView[IAdcControllerProvider]
}

object IAdcProvider {
  @scala.inline
  def apply(getControllers: () => IVectorView[IAdcControllerProvider]): IAdcProvider = {
    val __obj = js.Dynamic.literal(getControllers = js.Any.fromFunction0(getControllers))
  
    __obj.asInstanceOf[IAdcProvider]
  }
}

