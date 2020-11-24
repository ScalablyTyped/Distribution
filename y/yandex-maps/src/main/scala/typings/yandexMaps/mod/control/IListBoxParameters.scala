package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.IBaseButtonParametersOptiFloat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IListBoxParameters extends IButtonParameters {
  
  @JSName("options")
  var options_IListBoxParameters: js.UndefOr[IBaseButtonParametersOptiFloat] = js.native
}
object IListBoxParameters {
  
  @scala.inline
  def apply(): IListBoxParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListBoxParameters]
  }
  
  @scala.inline
  implicit class IListBoxParametersOps[Self <: IListBoxParameters] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: IBaseButtonParametersOptiFloat): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
