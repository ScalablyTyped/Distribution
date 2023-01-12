package typings.winrt.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHostNameStatics extends StObject {
  
  def compare(value1: String, value2: String): Double
}
object IHostNameStatics {
  
  inline def apply(compare: (String, String) => Double): IHostNameStatics = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
    __obj.asInstanceOf[IHostNameStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHostNameStatics] (val x: Self) extends AnyVal {
    
    inline def setCompare(value: (String, String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
  }
}
