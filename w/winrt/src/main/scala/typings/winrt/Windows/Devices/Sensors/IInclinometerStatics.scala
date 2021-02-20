package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInclinometerStatics extends StObject {
  
  def getDefault(): Inclinometer = js.native
}
object IInclinometerStatics {
  
  @scala.inline
  def apply(getDefault: () => Inclinometer): IInclinometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[IInclinometerStatics]
  }
  
  @scala.inline
  implicit class IInclinometerStaticsMutableBuilder[Self <: IInclinometerStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDefault(value: () => Inclinometer): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
  }
}
