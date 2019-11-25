package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twitterDashForDashWeb.Anon_Profile
  - typings.twitterDashForDashWeb.Anon_ProfileSourceType
*/
trait TwitterTimelineWidgetProfileDataSource extends _TwitterTimelineWidgetDataSource

object TwitterTimelineWidgetProfileDataSource {
  @scala.inline
  def Anon_Profile(screenName: String, sourceType: profile): TwitterTimelineWidgetProfileDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetProfileDataSource]
  }
  @scala.inline
  def Anon_ProfileSourceType(sourceType: profile, userId: String): TwitterTimelineWidgetProfileDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetProfileDataSource]
  }
}

