package typings.websocket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStringified extends StObject {
  
  def toString(args: js.Any*): String
}
object IStringified {
  
  @scala.inline
  def apply(toString_ : /* repeated */ js.Any => String): IStringified = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[IStringified]
  }
  
  @scala.inline
  implicit class IStringifiedMutableBuilder[Self <: IStringified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToString_(value: /* repeated */ js.Any => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
  }
}
