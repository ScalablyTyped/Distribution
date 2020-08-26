package typings.webAnimationsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationPlaybackEvent extends js.Object {
  var bubbles: Boolean = js.native
  var cancelable: Boolean = js.native
  var currentTarget: Animation = js.native
  val currentTime: Double | Null = js.native
  var defaultPrevented: Boolean = js.native
  var eventPhase: Double = js.native
  var target: Animation = js.native
  var timeStamp: Double = js.native
  val timelineTime: Double | Null = js.native
  var `type`: String = js.native
}

object AnimationPlaybackEvent {
  @scala.inline
  def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: Animation,
    defaultPrevented: Boolean,
    eventPhase: Double,
    target: Animation,
    timeStamp: Double,
    `type`: String
  ): AnimationPlaybackEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPlaybackEvent]
  }
  @scala.inline
  implicit class AnimationPlaybackEventOps[Self <: AnimationPlaybackEvent] (val x: Self) extends AnyVal {
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
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTarget(value: Animation): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Animation): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTimeNull: Self = this.set("currentTime", null)
    @scala.inline
    def setTimelineTime(value: Double): Self = this.set("timelineTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimelineTimeNull: Self = this.set("timelineTime", null)
  }
  
}

