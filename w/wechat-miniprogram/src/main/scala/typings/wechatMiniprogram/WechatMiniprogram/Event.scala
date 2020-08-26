package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.anon.Dataset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var currentTarget: Dataset = js.native
  var mut: Boolean = js.native
  var target: Dataset = js.native
  var timeStamp: Double = js.native
  var touches: js.Array[Touch] = js.native
  var `type`: String = js.native
}

object Event {
  @scala.inline
  def apply(
    currentTarget: Dataset,
    mut: Boolean,
    target: Dataset,
    timeStamp: Double,
    touches: js.Array[Touch],
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], mut = mut.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setCurrentTarget(value: Dataset): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setMut(value: Boolean): Self = this.set("mut", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Dataset): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchesVarargs(value: Touch*): Self = this.set("touches", js.Array(value :_*))
    @scala.inline
    def setTouches(value: js.Array[Touch]): Self = this.set("touches", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

