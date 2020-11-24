package typings.winrt.Windows.Devices.Input

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPointerDeviceStatics extends js.Object {
  
  def getPointerDevice(pointerId: Double): PointerDevice = js.native
  
  def getPointerDevices(): IVectorView[PointerDevice] = js.native
}
object IPointerDeviceStatics {
  
  @scala.inline
  def apply(getPointerDevice: Double => PointerDevice, getPointerDevices: () => IVectorView[PointerDevice]): IPointerDeviceStatics = {
    val __obj = js.Dynamic.literal(getPointerDevice = js.Any.fromFunction1(getPointerDevice), getPointerDevices = js.Any.fromFunction0(getPointerDevices))
    __obj.asInstanceOf[IPointerDeviceStatics]
  }
  
  @scala.inline
  implicit class IPointerDeviceStaticsOps[Self <: IPointerDeviceStatics] (val x: Self) extends AnyVal {
    
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
    def setGetPointerDevice(value: Double => PointerDevice): Self = this.set("getPointerDevice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPointerDevices(value: () => IVectorView[PointerDevice]): Self = this.set("getPointerDevices", js.Any.fromFunction0(value))
  }
}
