package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationEventMap extends ProxyEventMap {
  var complete: AnimationCompleteEvent = js.native
  var start: AnimationStartEvent = js.native
}

object AnimationEventMap {
  @scala.inline
  def apply(complete: AnimationCompleteEvent, start: AnimationStartEvent): AnimationEventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEventMap]
  }
  @scala.inline
  implicit class AnimationEventMapOps[Self <: AnimationEventMap] (val x: Self) extends AnyVal {
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
    def setComplete(value: AnimationCompleteEvent): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: AnimationStartEvent): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

