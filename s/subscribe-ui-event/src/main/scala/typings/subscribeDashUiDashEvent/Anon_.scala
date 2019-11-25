package typings.subscribeDashUiDashEvent

import typings.subscribeDashUiDashEvent.subscribeDashUiDashEventStrings.Empty
import typings.subscribeDashUiDashEvent.subscribeDashUiDashEventStrings.x
import typings.subscribeDashUiDashEvent.subscribeDashUiDashEventStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var axisIntention: x | y | Empty
  var deltaX: Double
  var deltaY: Double
  var startX: Double
  var startY: Double
}

object Anon_ {
  @scala.inline
  def apply(axisIntention: x | y | Empty, deltaX: Double, deltaY: Double, startX: Double, startY: Double): Anon_ = {
    val __obj = js.Dynamic.literal(axisIntention = axisIntention.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_]
  }
}

