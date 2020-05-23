package typings.twitterForWeb.anon

import typings.twitterForWeb.TwitterTimelineWidgetListDataSource
import typings.twitterForWeb.twitterForWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends TwitterTimelineWidgetListDataSource {
  var id: String
  var sourceType: list
}

object Id {
  @scala.inline
  def apply(id: String, sourceType: list): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

