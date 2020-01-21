package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonList extends TwitterTimelineWidgetListDataSource {
  var ownerScreenName: String
  var slug: String
  var sourceType: list
}

object AnonList {
  @scala.inline
  def apply(ownerScreenName: String, slug: String, sourceType: list): AnonList = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonList]
  }
}

