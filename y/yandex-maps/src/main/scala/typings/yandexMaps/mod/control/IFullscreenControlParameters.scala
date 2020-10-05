package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Expanded
import typings.yandexMaps.anon.IBaseButtonParametersOptiAdjustMapMargin
import typings.yandexMaps.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFullscreenControlParameters extends js.Object {
  var data: js.UndefOr[Title] = js.native
  var options: js.UndefOr[IBaseButtonParametersOptiAdjustMapMargin] = js.native
  var state: js.UndefOr[Expanded] = js.native
}

object IFullscreenControlParameters {
  @scala.inline
  def apply(): IFullscreenControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFullscreenControlParameters]
  }
  @scala.inline
  implicit class IFullscreenControlParametersOps[Self <: IFullscreenControlParameters] (val x: Self) extends AnyVal {
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
    def setData(value: Title): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setOptions(value: IBaseButtonParametersOptiAdjustMapMargin): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setState(value: Expanded): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

