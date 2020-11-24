package typings.vegaTypings.anon

import typings.vegaTypings.configMod.DefaultsConfig
import typings.vegaTypings.vegaTypingsStrings.any
import typings.vegaTypings.vegaTypingsStrings.container
import typings.vegaTypings.vegaTypingsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bind extends js.Object {
  
  var bind: js.UndefOr[any | container | none] = js.native
  
  var defaults: js.UndefOr[DefaultsConfig] = js.native
  
  var globalCursor: js.UndefOr[Boolean] = js.native
  
  var selector: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var timer: js.UndefOr[Boolean] = js.native
  
  var view: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var window: js.UndefOr[Boolean | js.Array[String]] = js.native
}
object Bind {
  
  @scala.inline
  def apply(): Bind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bind]
  }
  
  @scala.inline
  implicit class BindOps[Self <: Bind] (val x: Self) extends AnyVal {
    
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
    def setBind(value: any | container | none): Self = this.set("bind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    
    @scala.inline
    def setDefaults(value: DefaultsConfig): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setGlobalCursor(value: Boolean): Self = this.set("globalCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalCursor: Self = this.set("globalCursor", js.undefined)
    
    @scala.inline
    def setSelectorVarargs(value: String*): Self = this.set("selector", js.Array(value :_*))
    
    @scala.inline
    def setSelector(value: Boolean | js.Array[String]): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setTimer(value: Boolean): Self = this.set("timer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
    
    @scala.inline
    def setViewVarargs(value: String*): Self = this.set("view", js.Array(value :_*))
    
    @scala.inline
    def setView(value: Boolean | js.Array[String]): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setWindowVarargs(value: String*): Self = this.set("window", js.Array(value :_*))
    
    @scala.inline
    def setWindow(value: Boolean | js.Array[String]): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
}
