package typings.webAnimationsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEffectReadOnly extends js.Object {
  val timing: Double
  def getComputedTiming(): ComputedTimingProperties
}

object AnimationEffectReadOnly {
  @scala.inline
  def apply(getComputedTiming: () => ComputedTimingProperties, timing: Double): AnimationEffectReadOnly = {
    val __obj = js.Dynamic.literal(getComputedTiming = js.Any.fromFunction0(getComputedTiming), timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEffectReadOnly]
  }
}

