package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFeedbackDesktop extends js.Object {
  var feedbackDesktop: Double
  var feedbackWeb: Double
  var sessionInsightsForAll: Double
  var unknown: Double
  var xTDesktop: Double
  var xTDesktop2: Double
  var xTWeb: Double
}

object AnonFeedbackDesktop {
  @scala.inline
  def apply(
    feedbackDesktop: Double,
    feedbackWeb: Double,
    sessionInsightsForAll: Double,
    unknown: Double,
    xTDesktop: Double,
    xTDesktop2: Double,
    xTWeb: Double
  ): AnonFeedbackDesktop = {
    val __obj = js.Dynamic.literal(feedbackDesktop = feedbackDesktop.asInstanceOf[js.Any], feedbackWeb = feedbackWeb.asInstanceOf[js.Any], sessionInsightsForAll = sessionInsightsForAll.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], xTDesktop = xTDesktop.asInstanceOf[js.Any], xTDesktop2 = xTDesktop2.asInstanceOf[js.Any], xTWeb = xTWeb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFeedbackDesktop]
  }
}

