package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeedbackDesktop extends StObject {
  
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
  
  @scala.inline
  implicit class FeedbackDesktopMutableBuilder[Self <: FeedbackDesktop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedbackDesktop(value: scala.Double): Self = StObject.set(x, "feedbackDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackWeb(value: scala.Double): Self = StObject.set(x, "feedbackWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionInsightsForAll(value: scala.Double): Self = StObject.set(x, "sessionInsightsForAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXTDesktop(value: scala.Double): Self = StObject.set(x, "xTDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXTDesktop2(value: scala.Double): Self = StObject.set(x, "xTDesktop2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXTWeb(value: scala.Double): Self = StObject.set(x, "xTWeb", value.asInstanceOf[js.Any])
  }
}
