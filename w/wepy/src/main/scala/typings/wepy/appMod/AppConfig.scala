package typings.wepy.appMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppConfig extends js.Object {
  
  var appEvents: js.UndefOr[js.Array[String]] = js.native
  
  var noPromiseAPI: js.UndefOr[js.Array[String] | StringDictionary[Boolean]] = js.native
  
  var pageEvents: js.UndefOr[js.Array[String]] = js.native
}
object AppConfig {
  
  @scala.inline
  def apply(): AppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppConfig]
  }
  
  @scala.inline
  implicit class AppConfigOps[Self <: AppConfig] (val x: Self) extends AnyVal {
    
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
    def setAppEventsVarargs(value: String*): Self = this.set("appEvents", js.Array(value :_*))
    
    @scala.inline
    def setAppEvents(value: js.Array[String]): Self = this.set("appEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppEvents: Self = this.set("appEvents", js.undefined)
    
    @scala.inline
    def setNoPromiseAPIVarargs(value: String*): Self = this.set("noPromiseAPI", js.Array(value :_*))
    
    @scala.inline
    def setNoPromiseAPI(value: js.Array[String] | StringDictionary[Boolean]): Self = this.set("noPromiseAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoPromiseAPI: Self = this.set("noPromiseAPI", js.undefined)
    
    @scala.inline
    def setPageEventsVarargs(value: String*): Self = this.set("pageEvents", js.Array(value :_*))
    
    @scala.inline
    def setPageEvents(value: js.Array[String]): Self = this.set("pageEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageEvents: Self = this.set("pageEvents", js.undefined)
  }
}
