package typings.winrt.Windows.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColorHelperStatics extends StObject {
  
  def fromArgb(a: Double, r: Double, g: Double, b: Double): Color
}
object IColorHelperStatics {
  
  inline def apply(fromArgb: (Double, Double, Double, Double) => Color): IColorHelperStatics = {
    val __obj = js.Dynamic.literal(fromArgb = js.Any.fromFunction4(fromArgb))
    __obj.asInstanceOf[IColorHelperStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IColorHelperStatics] (val x: Self) extends AnyVal {
    
    inline def setFromArgb(value: (Double, Double, Double, Double) => Color): Self = StObject.set(x, "fromArgb", js.Any.fromFunction4(value))
  }
}
