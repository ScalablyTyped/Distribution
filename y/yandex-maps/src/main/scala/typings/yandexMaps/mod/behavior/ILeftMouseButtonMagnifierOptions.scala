package typings.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILeftMouseButtonMagnifierOptions extends js.Object {
  var actionCursor: js.UndefOr[String] = js.native
  var cursor: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
}

object ILeftMouseButtonMagnifierOptions {
  @scala.inline
  def apply(): ILeftMouseButtonMagnifierOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILeftMouseButtonMagnifierOptions]
  }
  @scala.inline
  implicit class ILeftMouseButtonMagnifierOptionsOps[Self <: ILeftMouseButtonMagnifierOptions] (val x: Self) extends AnyVal {
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
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
  
}

