package typings.vanillaSwipe.calculateMovingPositionMod

import typings.vanillaSwipe.anon.ClientX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait E extends js.Object {
  var changedTouches: js.UndefOr[js.Array[ClientX]] = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var preventDefault: js.UndefOr[js.Function] = js.native
}

object E {
  @scala.inline
  def apply(clientX: Double, clientY: Double): E = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
  @scala.inline
  implicit class EOps[Self <: E] (val x: Self) extends AnyVal {
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
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedTouchesVarargs(value: ClientX*): Self = this.set("changedTouches", js.Array(value :_*))
    @scala.inline
    def setChangedTouches(value: js.Array[ClientX]): Self = this.set("changedTouches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedTouches: Self = this.set("changedTouches", js.undefined)
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
  }
  
}

