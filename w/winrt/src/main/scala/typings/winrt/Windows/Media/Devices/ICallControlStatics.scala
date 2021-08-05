package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICallControlStatics extends StObject {
  
  def fromId(deviceInterfaceId: String): CallControl
  
  def getDefault(): CallControl
}
object ICallControlStatics {
  
  inline def apply(fromId: String => CallControl, getDefault: () => CallControl): ICallControlStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[ICallControlStatics]
  }
  
  extension [Self <: ICallControlStatics](x: Self) {
    
    inline def setFromId(value: String => CallControl): Self = StObject.set(x, "fromId", js.Any.fromFunction1(value))
    
    inline def setGetDefault(value: () => CallControl): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
  }
}
