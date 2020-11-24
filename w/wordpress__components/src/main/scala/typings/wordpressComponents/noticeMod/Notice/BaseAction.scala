package typings.wordpressComponents.noticeMod.Notice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAction extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var label: String = js.native
  
  /**
    * Should default classes be removed from the action?
    */
  var noDefaultClasses: js.UndefOr[Boolean] = js.native
}
object BaseAction {
  
  @scala.inline
  def apply(label: String): BaseAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAction]
  }
  
  @scala.inline
  implicit class BaseActionOps[Self <: BaseAction] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setNoDefaultClasses(value: Boolean): Self = this.set("noDefaultClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDefaultClasses: Self = this.set("noDefaultClasses", js.undefined)
  }
}
