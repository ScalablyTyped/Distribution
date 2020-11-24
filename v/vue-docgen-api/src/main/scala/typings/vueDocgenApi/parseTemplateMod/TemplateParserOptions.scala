package typings.vueDocgenApi.parseTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateParserOptions extends js.Object {
  
  var functional: Boolean = js.native
}
object TemplateParserOptions {
  
  @scala.inline
  def apply(functional: Boolean): TemplateParserOptions = {
    val __obj = js.Dynamic.literal(functional = functional.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateParserOptions]
  }
  
  @scala.inline
  implicit class TemplateParserOptionsOps[Self <: TemplateParserOptions] (val x: Self) extends AnyVal {
    
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
    def setFunctional(value: Boolean): Self = this.set("functional", value.asInstanceOf[js.Any])
  }
}
