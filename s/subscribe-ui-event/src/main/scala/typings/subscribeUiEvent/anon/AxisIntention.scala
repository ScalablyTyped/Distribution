package typings.subscribeUiEvent.anon

import typings.subscribeUiEvent.subscribeUiEventStrings._empty
import typings.subscribeUiEvent.subscribeUiEventStrings.x
import typings.subscribeUiEvent.subscribeUiEventStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisIntention extends js.Object {
  var axisIntention: x | y | _empty
  var deltaX: Double
  var deltaY: Double
  var startX: Double
  var startY: Double
}

object AxisIntention {
  @scala.inline
  def apply(axisIntention: x | y | _empty, deltaX: Double, deltaY: Double, startX: Double, startY: Double): AxisIntention = {
    val __obj = js.Dynamic.literal(axisIntention = axisIntention.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisIntention]
  }
}

