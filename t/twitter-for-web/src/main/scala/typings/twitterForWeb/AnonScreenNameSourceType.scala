package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScreenNameSourceType extends TwitterTimelineWidgetLikesDataSource {
  var screenName: String
  var sourceType: likes
}

object AnonScreenNameSourceType {
  @scala.inline
  def apply(screenName: String, sourceType: likes): AnonScreenNameSourceType = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScreenNameSourceType]
  }
}

