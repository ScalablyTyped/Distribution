package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Behaviors extends js.Object {
  var behaviors: scala.Double = js.native
  var layout: scala.Double = js.native
  var none: scala.Double = js.native
  var states: scala.Double = js.native
}

object Behaviors {
  @scala.inline
  def apply(behaviors: scala.Double, layout: scala.Double, none: scala.Double, states: scala.Double): Behaviors = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behaviors]
  }
  @scala.inline
  implicit class BehaviorsOps[Self <: Behaviors] (val x: Self) extends AnyVal {
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
    def setBehaviors(value: scala.Double): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: scala.Double): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setStates(value: scala.Double): Self = this.set("states", value.asInstanceOf[js.Any])
  }
  
}

