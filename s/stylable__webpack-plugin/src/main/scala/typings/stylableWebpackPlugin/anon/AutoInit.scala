package typings.stylableWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoInit extends js.Object {
  
  var autoInit: Boolean = js.native
  
  var getAutoInitModule: js.UndefOr[js.Any] = js.native
  
  var globalInjection: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
}
object AutoInit {
  
  @scala.inline
  def apply(autoInit: Boolean): AutoInit = {
    val __obj = js.Dynamic.literal(autoInit = autoInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoInit]
  }
  
  @scala.inline
  implicit class AutoInitOps[Self <: AutoInit] (val x: Self) extends AnyVal {
    
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
    def setAutoInit(value: Boolean): Self = this.set("autoInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAutoInitModule(value: js.Any): Self = this.set("getAutoInitModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetAutoInitModule: Self = this.set("getAutoInitModule", js.undefined)
    
    @scala.inline
    def setGlobalInjection(value: /* p */ String => String): Self = this.set("globalInjection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGlobalInjection: Self = this.set("globalInjection", js.undefined)
  }
}
