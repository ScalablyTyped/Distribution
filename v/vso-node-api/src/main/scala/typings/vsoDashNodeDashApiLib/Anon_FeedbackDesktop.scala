package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FeedbackDesktop extends js.Object {
  var feedbackDesktop: scala.Double
  var feedbackWeb: scala.Double
  var sessionInsightsForAll: scala.Double
  var unknown: scala.Double
  var xTDesktop: scala.Double
  var xTDesktop2: scala.Double
  var xTWeb: scala.Double
}

object Anon_FeedbackDesktop {
  @scala.inline
  def apply(
    feedbackDesktop: scala.Double,
    feedbackWeb: scala.Double,
    sessionInsightsForAll: scala.Double,
    unknown: scala.Double,
    xTDesktop: scala.Double,
    xTDesktop2: scala.Double,
    xTWeb: scala.Double
  ): Anon_FeedbackDesktop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("feedbackDesktop")(feedbackDesktop)
    __obj.updateDynamic("feedbackWeb")(feedbackWeb)
    __obj.updateDynamic("sessionInsightsForAll")(sessionInsightsForAll)
    __obj.updateDynamic("unknown")(unknown)
    __obj.updateDynamic("xTDesktop")(xTDesktop)
    __obj.updateDynamic("xTDesktop2")(xTDesktop2)
    __obj.updateDynamic("xTWeb")(xTWeb)
    __obj.asInstanceOf[Anon_FeedbackDesktop]
  }
}

