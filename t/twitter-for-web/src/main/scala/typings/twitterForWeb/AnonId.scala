package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends TwitterTimelineWidgetListDataSource {
  var id: String
  var sourceType: list
}

object AnonId {
  @scala.inline
  def apply(id: String, sourceType: list): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

