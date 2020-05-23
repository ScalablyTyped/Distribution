package typings.twitterForWeb.anon

import typings.twitterForWeb.TwitterTimelineWidgetProfileDataSource
import typings.twitterForWeb.twitterForWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceType extends TwitterTimelineWidgetProfileDataSource {
  var sourceType: profile
  var userId: String
}

object SourceType {
  @scala.inline
  def apply(sourceType: profile, userId: String): SourceType = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceType]
  }
}

