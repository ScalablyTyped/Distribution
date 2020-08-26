package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapPanOptions extends IMapPositionOptions {
  var delay: js.UndefOr[Double] = js.native
  var flying: js.UndefOr[Boolean] = js.native
  var safe: js.UndefOr[Boolean] = js.native
}

object IMapPanOptions {
  @scala.inline
  def apply(): IMapPanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapPanOptions]
  }
  @scala.inline
  implicit class IMapPanOptionsOps[Self <: IMapPanOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setFlying(value: Boolean): Self = this.set("flying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlying: Self = this.set("flying", js.undefined)
    @scala.inline
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
  }
  
}

