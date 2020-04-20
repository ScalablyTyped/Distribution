package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterTimelineWidgetUrlDataSource extends _TwitterTimelineWidgetDataSource {
  var sourceType: url
  var url: String
}

object TwitterTimelineWidgetUrlDataSource {
  @scala.inline
  def apply(sourceType: url, url: String): TwitterTimelineWidgetUrlDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetUrlDataSource]
  }
}

