package typings.twitterForWeb.anon

import typings.twitterForWeb.TwitterTimelineWidgetLikesDataSource
import typings.twitterForWeb.twitterForWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserId extends TwitterTimelineWidgetLikesDataSource {
  var sourceType: likes
  var userId: String
}

object UserId {
  @scala.inline
  def apply(sourceType: likes, userId: String): UserId = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserId]
  }
}

