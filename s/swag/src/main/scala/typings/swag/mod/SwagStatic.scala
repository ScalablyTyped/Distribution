package typings.swag.mod

import typings.swag.anon.TypeofHandlebars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwagStatic extends js.Object {
  
  def registerHelpers(handlebars: TypeofHandlebars): Unit = js.native
}
object SwagStatic {
  
  @scala.inline
  def apply(registerHelpers: TypeofHandlebars => Unit): SwagStatic = {
    val __obj = js.Dynamic.literal(registerHelpers = js.Any.fromFunction1(registerHelpers))
    __obj.asInstanceOf[SwagStatic]
  }
  
  @scala.inline
  implicit class SwagStaticOps[Self <: SwagStatic] (val x: Self) extends AnyVal {
    
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
    def setRegisterHelpers(value: TypeofHandlebars => Unit): Self = this.set("registerHelpers", js.Any.fromFunction1(value))
  }
}
