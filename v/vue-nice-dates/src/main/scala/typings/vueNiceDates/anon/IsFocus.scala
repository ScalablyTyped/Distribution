package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsFocus extends StObject {
  
  def date(newValue: typings.std.Date): Unit = js.native
  
  def isFocus(newValue: Boolean): Unit = js.native
}
object IsFocus {
  
  @scala.inline
  def apply(date: typings.std.Date => Unit, isFocus: Boolean => Unit): IsFocus = {
    val __obj = js.Dynamic.literal(date = js.Any.fromFunction1(date), isFocus = js.Any.fromFunction1(isFocus))
    __obj.asInstanceOf[IsFocus]
  }
  
  @scala.inline
  implicit class IsFocusMutableBuilder[Self <: IsFocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: typings.std.Date => Unit): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFocus(value: Boolean => Unit): Self = StObject.set(x, "isFocus", js.Any.fromFunction1(value))
  }
}
