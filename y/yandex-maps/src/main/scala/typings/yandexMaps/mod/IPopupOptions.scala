package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPopupOptions extends js.Object {
  var closeTimeout: js.UndefOr[Double] = js.native
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.native
  var openTimeout: js.UndefOr[Double] = js.native
  var pane: js.UndefOr[IPane | String] = js.native
  var projection: js.UndefOr[IProjection] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object IPopupOptions {
  @scala.inline
  def apply(): IPopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupOptions]
  }
  @scala.inline
  implicit class IPopupOptionsOps[Self <: IPopupOptions] (val x: Self) extends AnyVal {
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
    def setCloseTimeout(value: Double): Self = this.set("closeTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseTimeout: Self = this.set("closeTimeout", js.undefined)
    @scala.inline
    def setInteractivityModel(value: InteractivityModelKey): Self = this.set("interactivityModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractivityModel: Self = this.set("interactivityModel", js.undefined)
    @scala.inline
    def setOpenTimeout(value: Double): Self = this.set("openTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenTimeout: Self = this.set("openTimeout", js.undefined)
    @scala.inline
    def setPane(value: IPane | String): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setProjection(value: IProjection): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

