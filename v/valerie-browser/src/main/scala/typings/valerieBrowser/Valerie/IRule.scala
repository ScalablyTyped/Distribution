package typings.valerieBrowser.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRule extends js.Object {
  
  var defaultOptions: ValidationOptions = js.native
  
  def test(value: js.Any): ValidationResult = js.native
}
object IRule {
  
  @scala.inline
  def apply(defaultOptions: ValidationOptions, test: js.Any => ValidationResult): IRule = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[IRule]
  }
  
  @scala.inline
  implicit class IRuleOps[Self <: IRule] (val x: Self) extends AnyVal {
    
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
    def setDefaultOptions(value: ValidationOptions): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: js.Any => ValidationResult): Self = this.set("test", js.Any.fromFunction1(value))
  }
}
