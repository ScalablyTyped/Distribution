package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait rules extends js.Object {
  
  def isChecked(): Boolean = js.native
  
  def isEmail(): Boolean = js.native
  
  def isNotEmpty(): Boolean = js.native
  
  def isNumber(): Boolean = js.native
}
object rules {
  
  @scala.inline
  def apply(
    isChecked: () => Boolean,
    isEmail: () => Boolean,
    isNotEmpty: () => Boolean,
    isNumber: () => Boolean
  ): rules = {
    val __obj = js.Dynamic.literal(isChecked = js.Any.fromFunction0(isChecked), isEmail = js.Any.fromFunction0(isEmail), isNotEmpty = js.Any.fromFunction0(isNotEmpty), isNumber = js.Any.fromFunction0(isNumber))
    __obj.asInstanceOf[rules]
  }
  
  @scala.inline
  implicit class rulesOps[Self <: rules] (val x: Self) extends AnyVal {
    
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
    def setIsChecked(value: () => Boolean): Self = this.set("isChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmail(value: () => Boolean): Self = this.set("isEmail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNotEmpty(value: () => Boolean): Self = this.set("isNotEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNumber(value: () => Boolean): Self = this.set("isNumber", js.Any.fromFunction0(value))
  }
}
