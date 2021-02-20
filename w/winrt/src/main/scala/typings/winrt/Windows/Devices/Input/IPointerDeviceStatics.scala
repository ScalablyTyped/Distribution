package typings.winrt.Windows.Devices.Input

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPointerDeviceStatics extends StObject {
  
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
  implicit class IPointerDeviceStaticsMutableBuilder[Self <: IPointerDeviceStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPointerDevice(value: Double => PointerDevice): Self = StObject.set(x, "getPointerDevice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPointerDevices(value: () => IVectorView[PointerDevice]): Self = StObject.set(x, "getPointerDevices", js.Any.fromFunction0(value))
  }
}
