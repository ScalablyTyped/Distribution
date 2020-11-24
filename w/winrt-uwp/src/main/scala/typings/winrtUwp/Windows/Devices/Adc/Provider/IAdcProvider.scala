package typings.winrtUwp.Windows.Devices.Adc.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents methods common to all ADC providers. */
@js.native
trait IAdcProvider extends js.Object {
  
  /**
    * Gets the ADC controllers available on the system.
    * @return When this method completes it returns a list of all the available controllers on the system.
    */
  def getControllers(): IVectorView[IAdcControllerProvider] = js.native
}
object IAdcProvider {
  
  @scala.inline
  def apply(getControllers: () => IVectorView[IAdcControllerProvider]): IAdcProvider = {
    val __obj = js.Dynamic.literal(getControllers = js.Any.fromFunction0(getControllers))
    __obj.asInstanceOf[IAdcProvider]
  }
  
  @scala.inline
  implicit class IAdcProviderOps[Self <: IAdcProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetControllers(value: () => IVectorView[IAdcControllerProvider]): Self = this.set("getControllers", js.Any.fromFunction0(value))
  }
}
