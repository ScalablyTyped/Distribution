package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseDeviceStatics extends StObject {
  
  def getForCurrentView(): MouseDevice
}
object IMouseDeviceStatics {
  
  inline def apply(getForCurrentView: () => MouseDevice): IMouseDeviceStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[IMouseDeviceStatics]
  }
  
  extension [Self <: IMouseDeviceStatics](x: Self) {
    
    inline def setGetForCurrentView(value: () => MouseDevice): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
  }
}
