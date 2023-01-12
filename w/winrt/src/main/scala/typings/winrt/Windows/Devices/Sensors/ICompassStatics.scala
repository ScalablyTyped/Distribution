package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompassStatics extends StObject {
  
  def getDefault(): Compass
}
object ICompassStatics {
  
  inline def apply(getDefault: () => Compass): ICompassStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[ICompassStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICompassStatics] (val x: Self) extends AnyVal {
    
    inline def setGetDefault(value: () => Compass): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
  }
}
