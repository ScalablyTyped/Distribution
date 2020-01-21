package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLikesSourceType extends TwitterTimelineWidgetLikesDataSource {
  var sourceType: likes
  var userId: String
}

object AnonLikesSourceType {
  @scala.inline
  def apply(sourceType: likes, userId: String): AnonLikesSourceType = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLikesSourceType]
  }
}

