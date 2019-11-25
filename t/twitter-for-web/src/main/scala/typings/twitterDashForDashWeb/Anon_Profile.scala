package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Profile extends TwitterTimelineWidgetProfileDataSource {
  var screenName: String
  var sourceType: profile
}

object Anon_Profile {
  @scala.inline
  def apply(screenName: String, sourceType: profile): Anon_Profile = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Profile]
  }
}

