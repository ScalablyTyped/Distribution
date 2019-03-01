package typings
package webDashAnimationsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEffectReadOnly extends js.Object {
  val timing: scala.Double
  def getComputedTiming(): ComputedTimingProperties
}

object AnimationEffectReadOnly {
  @scala.inline
  def apply(getComputedTiming: js.Function0[ComputedTimingProperties], timing: scala.Double): AnimationEffectReadOnly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getComputedTiming")(getComputedTiming)
    __obj.updateDynamic("timing")(timing)
    __obj.asInstanceOf[AnimationEffectReadOnly]
  }
}

