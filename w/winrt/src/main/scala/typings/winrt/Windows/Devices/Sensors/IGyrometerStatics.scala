package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGyrometerStatics extends StObject {
  
  def getDefault(): Gyrometer
}
object IGyrometerStatics {
  
  @scala.inline
  def apply(getDefault: () => Gyrometer): IGyrometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[IGyrometerStatics]
  }
  
  @scala.inline
  implicit class IGyrometerStaticsMutableBuilder[Self <: IGyrometerStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDefault(value: () => Gyrometer): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
  }
}
