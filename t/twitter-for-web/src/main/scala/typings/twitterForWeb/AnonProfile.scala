package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProfile extends TwitterTimelineWidgetProfileDataSource {
  var screenName: String
  var sourceType: profile
}

object AnonProfile {
  @scala.inline
  def apply(screenName: String, sourceType: profile): AnonProfile = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProfile]
  }
}

