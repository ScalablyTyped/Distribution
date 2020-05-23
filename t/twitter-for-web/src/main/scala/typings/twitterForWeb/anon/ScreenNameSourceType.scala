package typings.twitterForWeb.anon

import typings.twitterForWeb.TwitterTimelineWidgetLikesDataSource
import typings.twitterForWeb.twitterForWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenNameSourceType extends TwitterTimelineWidgetLikesDataSource {
  var screenName: String
  var sourceType: likes
}

object ScreenNameSourceType {
  @scala.inline
  def apply(screenName: String, sourceType: likes): ScreenNameSourceType = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenNameSourceType]
  }
}

