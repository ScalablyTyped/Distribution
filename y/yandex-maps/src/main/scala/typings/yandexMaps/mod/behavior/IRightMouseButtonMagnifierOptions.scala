package typings.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRightMouseButtonMagnifierOptions extends js.Object {
  var actionCursor: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
}

object IRightMouseButtonMagnifierOptions {
  @scala.inline
  def apply(): IRightMouseButtonMagnifierOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRightMouseButtonMagnifierOptions]
  }
  @scala.inline
  implicit class IRightMouseButtonMagnifierOptionsOps[Self <: IRightMouseButtonMagnifierOptions] (val x: Self) extends AnyVal {
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
    def setActionCursor(value: String): Self = this.set("actionCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionCursor: Self = this.set("actionCursor", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
  
}

