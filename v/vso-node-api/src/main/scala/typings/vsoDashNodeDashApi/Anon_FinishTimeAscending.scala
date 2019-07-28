package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FinishTimeAscending extends js.Object {
  var finishTimeAscending: Double
  var finishTimeDescending: Double
  var queueTimeAscending: Double
  var queueTimeDescending: Double
  var startTimeAscending: Double
  var startTimeDescending: Double
}

object Anon_FinishTimeAscending {
  @scala.inline
  def apply(
    finishTimeAscending: Double,
    finishTimeDescending: Double,
    queueTimeAscending: Double,
    queueTimeDescending: Double,
    startTimeAscending: Double,
    startTimeDescending: Double
  ): Anon_FinishTimeAscending = {
    val __obj = js.Dynamic.literal(finishTimeAscending = finishTimeAscending, finishTimeDescending = finishTimeDescending, queueTimeAscending = queueTimeAscending, queueTimeDescending = queueTimeDescending, startTimeAscending = startTimeAscending, startTimeDescending = startTimeDescending)
  
    __obj.asInstanceOf[Anon_FinishTimeAscending]
  }
}

