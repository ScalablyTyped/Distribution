package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait locale extends js.Object {
  
  var pager: js.Any = js.native
}
object locale {
  
  @scala.inline
  def apply(pager: js.Any): locale = {
    val __obj = js.Dynamic.literal(pager = pager.asInstanceOf[js.Any])
    __obj.asInstanceOf[locale]
  }
  
  @scala.inline
  implicit class localeOps[Self <: locale] (val x: Self) extends AnyVal {
    
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
    def setPager(value: js.Any): Self = this.set("pager", value.asInstanceOf[js.Any])
  }
}
