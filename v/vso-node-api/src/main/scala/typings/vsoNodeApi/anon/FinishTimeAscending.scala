package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishTimeAscending extends js.Object {
  var finishTimeAscending: scala.Double
  var finishTimeDescending: scala.Double
  var queueTimeAscending: scala.Double
  var queueTimeDescending: scala.Double
  var startTimeAscending: scala.Double
  var startTimeDescending: scala.Double
}

object FinishTimeAscending {
  @scala.inline
  def apply(
    finishTimeAscending: scala.Double,
    finishTimeDescending: scala.Double,
    queueTimeAscending: scala.Double,
    queueTimeDescending: scala.Double,
    startTimeAscending: scala.Double,
    startTimeDescending: scala.Double
  ): FinishTimeAscending = {
    val __obj = js.Dynamic.literal(finishTimeAscending = finishTimeAscending.asInstanceOf[js.Any], finishTimeDescending = finishTimeDescending.asInstanceOf[js.Any], queueTimeAscending = queueTimeAscending.asInstanceOf[js.Any], queueTimeDescending = queueTimeDescending.asInstanceOf[js.Any], startTimeAscending = startTimeAscending.asInstanceOf[js.Any], startTimeDescending = startTimeDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishTimeAscending]
  }
}

