package typings.yandexMaps.mod.control

import typings.yandexMaps.mod.IPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManagerOptions extends js.Object {
  var margin: js.UndefOr[Double] = js.native
  var pane: js.UndefOr[IPane] = js.native
  var states: js.UndefOr[js.Array[String]] = js.native
}

object IManagerOptions {
  @scala.inline
  def apply(): IManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IManagerOptions]
  }
  @scala.inline
  implicit class IManagerOptionsOps[Self <: IManagerOptions] (val x: Self) extends AnyVal {
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
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPane(value: IPane): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setStatesVarargs(value: String*): Self = this.set("states", js.Array(value :_*))
    @scala.inline
    def setStates(value: js.Array[String]): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
  }
  
}

