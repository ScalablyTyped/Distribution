package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterTimelineWidgetUrlDataSource extends _TwitterTimelineWidgetDataSource {
  var sourceType: twitterDashForDashWebLib.twitterDashForDashWebLibStrings.url
  var url: java.lang.String
}

object TwitterTimelineWidgetUrlDataSource {
  @scala.inline
  def apply(sourceType: twitterDashForDashWebLib.twitterDashForDashWebLibStrings.url, url: java.lang.String): TwitterTimelineWidgetUrlDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType, url = url)
  
    __obj.asInstanceOf[TwitterTimelineWidgetUrlDataSource]
  }
}

