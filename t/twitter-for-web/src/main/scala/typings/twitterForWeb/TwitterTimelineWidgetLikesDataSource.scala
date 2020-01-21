package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twitterForWeb.AnonLikes
  - typings.twitterForWeb.AnonLikesSourceType
*/
trait TwitterTimelineWidgetLikesDataSource extends _TwitterTimelineWidgetDataSource

object TwitterTimelineWidgetLikesDataSource {
  @scala.inline
  def AnonLikes(screenName: String, sourceType: likes): TwitterTimelineWidgetLikesDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
  }
  @scala.inline
  def AnonLikesSourceType(sourceType: likes, userId: String): TwitterTimelineWidgetLikesDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
  }
}

