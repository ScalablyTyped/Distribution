package typings.webAnimationsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPlaybackEvent extends js.Object {
  var bubbles: Boolean
  var cancelable: Boolean
  var currentTarget: Animation
  val currentTime: Double | Null
  var defaultPrevented: Boolean
  var eventPhase: Double
  var target: Animation
  var timeStamp: Double
  val timelineTime: Double | Null
  var `type`: String
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
    `type`: String,
    currentTime: Double = null.asInstanceOf[Double],
    timelineTime: Double = null.asInstanceOf[Double]
  ): AnimationPlaybackEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], timelineTime = timelineTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPlaybackEvent]
  }
}

