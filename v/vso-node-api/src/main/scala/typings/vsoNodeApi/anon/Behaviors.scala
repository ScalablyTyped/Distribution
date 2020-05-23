package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Behaviors extends js.Object {
  var behaviors: scala.Double
  var layout: scala.Double
  var none: scala.Double
  var states: scala.Double
}

object Behaviors {
  @scala.inline
  def apply(behaviors: scala.Double, layout: scala.Double, none: scala.Double, states: scala.Double): Behaviors = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behaviors]
  }
}

