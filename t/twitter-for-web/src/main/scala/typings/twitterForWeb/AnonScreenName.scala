package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScreenName extends TwitterTimelineWidgetProfileDataSource {
  var screenName: String
  var sourceType: profile
}

object AnonScreenName {
  @scala.inline
  def apply(screenName: String, sourceType: profile): AnonScreenName = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScreenName]
  }
}

