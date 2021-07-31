package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseDeviceStatics extends StObject {
  
  def getForCurrentView(): MouseDevice
}
object IMouseDeviceStatics {
  
  @scala.inline
  def apply(getForCurrentView: () => MouseDevice): IMouseDeviceStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[IMouseDeviceStatics]
  }
  
  @scala.inline
  implicit class IMouseDeviceStaticsMutableBuilder[Self <: IMouseDeviceStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetForCurrentView(value: () => MouseDevice): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
  }
}
