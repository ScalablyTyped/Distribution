package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocus extends StObject {
  
  def date(newValue: js.Date): Unit
  
  def isFocus(newValue: Boolean): Unit
}
object IsFocus {
  
  inline def apply(date: js.Date => Unit, isFocus: Boolean => Unit): IsFocus = {
    val __obj = js.Dynamic.literal(date = js.Any.fromFunction1(date), isFocus = js.Any.fromFunction1(isFocus))
    __obj.asInstanceOf[IsFocus]
  }
  
  extension [Self <: IsFocus](x: Self) {
    
    inline def setDate(value: js.Date => Unit): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
    
    inline def setIsFocus(value: Boolean => Unit): Self = StObject.set(x, "isFocus", js.Any.fromFunction1(value))
  }
}
