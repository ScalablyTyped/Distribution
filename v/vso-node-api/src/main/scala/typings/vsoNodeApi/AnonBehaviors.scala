package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBehaviors extends js.Object {
  var behaviors: Double
  var layout: Double
  var none: Double
  var states: Double
}

object AnonBehaviors {
  @scala.inline
  def apply(behaviors: Double, layout: Double, none: Double, states: Double): AnonBehaviors = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBehaviors]
  }
}

