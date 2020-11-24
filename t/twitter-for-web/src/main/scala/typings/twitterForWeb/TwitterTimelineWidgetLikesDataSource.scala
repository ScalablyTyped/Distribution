package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.twitterForWeb.anon.ScreenNameSourceType
  - typings.twitterForWeb.anon.UserId
*/
trait TwitterTimelineWidgetLikesDataSource extends _TwitterTimelineWidgetDataSource
object TwitterTimelineWidgetLikesDataSource {
  
  @scala.inline
  def ScreenNameSourceType(screenName: String, sourceType: likes): TwitterTimelineWidgetLikesDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
  }
  
  @scala.inline
  def UserId(sourceType: likes, userId: String): TwitterTimelineWidgetLikesDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
  }
}
