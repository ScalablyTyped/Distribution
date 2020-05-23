package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedbackDesktop extends js.Object {
  var feedbackDesktop: scala.Double
  var feedbackWeb: scala.Double
  var sessionInsightsForAll: scala.Double
  var unknown: scala.Double
  var xTDesktop: scala.Double
  var xTDesktop2: scala.Double
  var xTWeb: scala.Double
}

object FeedbackDesktop {
  @scala.inline
  def apply(
    feedbackDesktop: scala.Double,
    feedbackWeb: scala.Double,
    sessionInsightsForAll: scala.Double,
    unknown: scala.Double,
    xTDesktop: scala.Double,
    xTDesktop2: scala.Double,
    xTWeb: scala.Double
  ): FeedbackDesktop = {
    val __obj = js.Dynamic.literal(feedbackDesktop = feedbackDesktop.asInstanceOf[js.Any], feedbackWeb = feedbackWeb.asInstanceOf[js.Any], sessionInsightsForAll = sessionInsightsForAll.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], xTDesktop = xTDesktop.asInstanceOf[js.Any], xTDesktop2 = xTDesktop2.asInstanceOf[js.Any], xTWeb = xTWeb.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackDesktop]
  }
}

