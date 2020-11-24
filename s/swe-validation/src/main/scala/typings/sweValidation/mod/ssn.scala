package typings.sweValidation.mod

import typings.sweValidation.anon.Sex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ssn extends js.Object {
  
  var isValid: Boolean = js.native
  
  var person: js.UndefOr[Sex] = js.native
}
object ssn {
  
  @scala.inline
  def apply(isValid: Boolean): ssn = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ssn]
  }
  
  @scala.inline
  implicit class ssnOps[Self <: ssn] (val x: Self) extends AnyVal {
    
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
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerson(value: Sex): Self = this.set("person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerson: Self = this.set("person", js.undefined)
  }
}
