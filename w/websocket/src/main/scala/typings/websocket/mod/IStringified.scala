package typings.websocket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStringified extends StObject {
  
  def toString(args: Any*): String
}
object IStringified {
  
  inline def apply(toString_ : /* repeated */ Any => String): IStringified = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[IStringified]
  }
  
  extension [Self <: IStringified](x: Self) {
    
    inline def setToString_(value: /* repeated */ Any => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
  }
}
