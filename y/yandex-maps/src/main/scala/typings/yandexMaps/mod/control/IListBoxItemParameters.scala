package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Layout
import typings.yandexMaps.anon.Selected
import typings.yandexMaps.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IListBoxItemParameters extends js.Object {
  
  var data: js.UndefOr[`0`] = js.native
  
  var options: js.UndefOr[Layout] = js.native
  
  var state: js.UndefOr[Selected] = js.native
}
object IListBoxItemParameters {
  
  @scala.inline
  def apply(): IListBoxItemParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListBoxItemParameters]
  }
  
  @scala.inline
  implicit class IListBoxItemParametersOps[Self <: IListBoxItemParameters] (val x: Self) extends AnyVal {
    
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
    def setData(value: `0`): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setOptions(value: Layout): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setState(value: Selected): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
