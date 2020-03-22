package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUserId extends TwitterTimelineWidgetLikesDataSource {
  var sourceType: likes
  var userId: String
}

object AnonUserId {
  @scala.inline
  def apply(sourceType: likes, userId: String): AnonUserId = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUserId]
  }
}

