package typings.vueNiceDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsFocus extends js.Object {
  
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
  implicit class IsFocusOps[Self <: IsFocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: typings.std.Date => Unit): Self = this.set("date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFocus(value: Boolean => Unit): Self = this.set("isFocus", js.Any.fromFunction1(value))
  }
}
