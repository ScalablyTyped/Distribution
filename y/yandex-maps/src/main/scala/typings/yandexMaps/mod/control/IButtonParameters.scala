package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Content
import typings.yandexMaps.anon.Enabled
import typings.yandexMaps.anon.IBaseButtonParametersOpti
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IButtonParameters extends js.Object {
  
  var data: js.UndefOr[Content] = js.native
  
  var options: js.UndefOr[IBaseButtonParametersOpti] = js.native
  
  var state: js.UndefOr[Enabled] = js.native
}
object IButtonParameters {
  
  @scala.inline
  def apply(): IButtonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonParameters]
  }
  
  @scala.inline
  implicit class IButtonParametersOps[Self <: IButtonParameters] (val x: Self) extends AnyVal {
    
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
    def setData(value: Content): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setOptions(value: IBaseButtonParametersOpti): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setState(value: Enabled): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
