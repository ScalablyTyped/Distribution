package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.anon.Dataset
import typings.wechatMiniprogram.anon.X
import typings.wechatMiniprogram.wechatMiniprogramStrings.tap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapEvent extends Event {
  var changedTouches: js.Array[js.Any] = js.native
  var detail: X = js.native
  @JSName("type")
  var type_TapEvent: tap = js.native
}

object TapEvent {
  @scala.inline
  def apply(
    changedTouches: js.Array[js.Any],
    currentTarget: Dataset,
    detail: X,
    mut: Boolean,
    target: Dataset,
    timeStamp: Double,
    touches: js.Array[Touch],
    `type`: tap
  ): TapEvent = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], mut = mut.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapEvent]
  }
  @scala.inline
  implicit class TapEventOps[Self <: TapEvent] (val x: Self) extends AnyVal {
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
    def setChangedTouchesVarargs(value: js.Any*): Self = this.set("changedTouches", js.Array(value :_*))
    @scala.inline
    def setChangedTouches(value: js.Array[js.Any]): Self = this.set("changedTouches", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetail(value: X): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: tap): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

