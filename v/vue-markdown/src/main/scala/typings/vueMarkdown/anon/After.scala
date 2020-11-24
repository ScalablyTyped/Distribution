package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait After extends js.Object {
  
  var after: js.Any = js.native
  
  var at: js.Any = js.native
  
  var before: js.Any = js.native
  
  var disable: js.Any = js.native
  
  var enable: js.Any = js.native
  
  var enableOnly: js.Any = js.native
  
  var getRules: js.Any = js.native
  
  var push: js.Any = js.native
}
object After {
  
  @scala.inline
  def apply(
    after: js.Any,
    at: js.Any,
    before: js.Any,
    disable: js.Any,
    enable: js.Any,
    enableOnly: js.Any,
    getRules: js.Any,
    push: js.Any
  ): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], enableOnly = enableOnly.asInstanceOf[js.Any], getRules = getRules.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  @scala.inline
  implicit class AfterOps[Self <: After] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: js.Any): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAt(value: js.Any): Self = this.set("at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: js.Any): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable(value: js.Any): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: js.Any): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOnly(value: js.Any): Self = this.set("enableOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRules(value: js.Any): Self = this.set("getRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: js.Any): Self = this.set("push", value.asInstanceOf[js.Any])
  }
}
