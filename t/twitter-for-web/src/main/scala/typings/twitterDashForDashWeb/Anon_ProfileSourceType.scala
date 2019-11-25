package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProfileSourceType extends TwitterTimelineWidgetProfileDataSource {
  var sourceType: profile
  var userId: String
}

object Anon_ProfileSourceType {
  @scala.inline
  def apply(sourceType: profile, userId: String): Anon_ProfileSourceType = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ProfileSourceType]
  }
}

