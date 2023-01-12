package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInclinometerStatics extends StObject {
  
  def getDefault(): Inclinometer
}
object IInclinometerStatics {
  
  inline def apply(getDefault: () => Inclinometer): IInclinometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[IInclinometerStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInclinometerStatics] (val x: Self) extends AnyVal {
    
    inline def setGetDefault(value: () => Inclinometer): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
  }
}
