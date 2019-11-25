package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LikesSourceType extends TwitterTimelineWidgetLikesDataSource {
  var sourceType: likes
  var userId: String
}

object Anon_LikesSourceType {
  @scala.inline
  def apply(sourceType: likes, userId: String): Anon_LikesSourceType = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LikesSourceType]
  }
}

