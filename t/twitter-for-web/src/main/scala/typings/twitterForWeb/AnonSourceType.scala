package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSourceType extends TwitterTimelineWidgetProfileDataSource {
  var sourceType: profile
  var userId: String
}

object AnonSourceType {
  @scala.inline
  def apply(sourceType: profile, userId: String): AnonSourceType = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSourceType]
  }
}

