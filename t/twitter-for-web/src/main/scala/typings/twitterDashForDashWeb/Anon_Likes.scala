package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Likes extends TwitterTimelineWidgetLikesDataSource {
  var screenName: String
  var sourceType: likes
}

object Anon_Likes {
  @scala.inline
  def apply(screenName: String, sourceType: likes): Anon_Likes = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Likes]
  }
}

