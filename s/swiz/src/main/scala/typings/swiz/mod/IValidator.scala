package typings.swiz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidator extends js.Object {
  
  def func(value: js.Any, baton: js.Any, callback: js.Function): Unit = js.native
  
  var help: String = js.native
  
  var name: String = js.native
}
object IValidator {
  
  @scala.inline
  def apply(func: (js.Any, js.Any, js.Function) => Unit, help: String, name: String): IValidator = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidator]
  }
  
  @scala.inline
  implicit class IValidatorOps[Self <: IValidator] (val x: Self) extends AnyVal {
    
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
    def setFunc(value: (js.Any, js.Any, js.Function) => Unit): Self = this.set("func", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
