package typings.valerieBrowser.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationResultStatic extends js.Object {
  
  // static method to create validatio failed message
  def createFailedResult(message: String): ValidationResult = js.native
  
  var passedInstance: ValidationResult = js.native
}
object ValidationResultStatic {
  
  @scala.inline
  def apply(createFailedResult: String => ValidationResult, passedInstance: ValidationResult): ValidationResultStatic = {
    val __obj = js.Dynamic.literal(createFailedResult = js.Any.fromFunction1(createFailedResult), passedInstance = passedInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResultStatic]
  }
  
  @scala.inline
  implicit class ValidationResultStaticOps[Self <: ValidationResultStatic] (val x: Self) extends AnyVal {
    
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
    def setCreateFailedResult(value: String => ValidationResult): Self = this.set("createFailedResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPassedInstance(value: ValidationResult): Self = this.set("passedInstance", value.asInstanceOf[js.Any])
  }
}
