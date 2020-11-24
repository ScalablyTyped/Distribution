package typings.uikit.mod.UIkit

import typings.uikit.uikitStrings.`bottom-center`
import typings.uikit.uikitStrings.`bottom-left`
import typings.uikit.uikitStrings.`bottom-right`
import typings.uikit.uikitStrings.`top-center`
import typings.uikit.uikitStrings.`top-left`
import typings.uikit.uikitStrings.`top-right`
import typings.uikit.uikitStrings.danger
import typings.uikit.uikitStrings.primary
import typings.uikit.uikitStrings.success
import typings.uikit.uikitStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitNotificationOptions extends js.Object {
  
  var group: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var pos: js.UndefOr[
    `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`
  ] = js.native
  
  var status: js.UndefOr[primary | success | warning | danger] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object UIkitNotificationOptions {
  
  @scala.inline
  def apply(): UIkitNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitNotificationOptions]
  }
  
  @scala.inline
  implicit class UIkitNotificationOptionsOps[Self <: UIkitNotificationOptions] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setPos(value: `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePos: Self = this.set("pos", js.undefined)
    
    @scala.inline
    def setStatus(value: primary | success | warning | danger): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
