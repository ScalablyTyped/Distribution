package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FeedbackDesktop extends js.Object {
  var feedbackDesktop: Double
  var feedbackWeb: Double
  var sessionInsightsForAll: Double
  var unknown: Double
  var xTDesktop: Double
  var xTDesktop2: Double
  var xTWeb: Double
}

object Anon_FeedbackDesktop {
  @scala.inline
  def apply(
    feedbackDesktop: Double,
    feedbackWeb: Double,
    sessionInsightsForAll: Double,
    unknown: Double,
    xTDesktop: Double,
    xTDesktop2: Double,
    xTWeb: Double
  ): Anon_FeedbackDesktop = {
    val __obj = js.Dynamic.literal(feedbackDesktop = feedbackDesktop, feedbackWeb = feedbackWeb, sessionInsightsForAll = sessionInsightsForAll, unknown = unknown, xTDesktop = xTDesktop, xTDesktop2 = xTDesktop2, xTWeb = xTWeb)
  
    __obj.asInstanceOf[Anon_FeedbackDesktop]
  }
}

