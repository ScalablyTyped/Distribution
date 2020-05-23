package typings.twitterForWeb.anon

import typings.twitterForWeb.TwitterTimelineWidgetProfileDataSource
import typings.twitterForWeb.twitterForWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenName extends TwitterTimelineWidgetProfileDataSource {
  var screenName: String
  var sourceType: profile
}

object ScreenName {
  @scala.inline
  def apply(screenName: String, sourceType: profile): ScreenName = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenName]
  }
}

