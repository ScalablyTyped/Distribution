package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twitterDashForDashWeb.Anon_Likes
  - typings.twitterDashForDashWeb.Anon_LikesSourceType
*/
trait TwitterTimelineWidgetLikesDataSource extends _TwitterTimelineWidgetDataSource

object TwitterTimelineWidgetLikesDataSource {
  @scala.inline
  def Anon_Likes(screenName: String, sourceType: likes): TwitterTimelineWidgetLikesDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
  }
  @scala.inline
  def Anon_LikesSourceType(sourceType: likes, userId: String): TwitterTimelineWidgetLikesDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
  }
}

