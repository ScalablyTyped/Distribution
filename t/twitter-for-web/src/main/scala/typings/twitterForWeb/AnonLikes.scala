package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLikes extends TwitterTimelineWidgetLikesDataSource {
  var screenName: String
  var sourceType: likes
}

object AnonLikes {
  @scala.inline
  def apply(screenName: String, sourceType: likes): AnonLikes = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLikes]
  }
}

