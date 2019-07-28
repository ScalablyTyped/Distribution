package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterTimelineWidgetLikesDataSource extends _TwitterTimelineWidgetDataSource {
  var screenName: js.UndefOr[String] = js.undefined
  var sourceType: js.UndefOr[likes] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object TwitterTimelineWidgetLikesDataSource {
  @scala.inline
  def apply(screenName: String = null, sourceType: likes = null, userId: String = null): TwitterTimelineWidgetLikesDataSource = {
    val __obj = js.Dynamic.literal()
    if (screenName != null) __obj.updateDynamic("screenName")(screenName)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
  }
}

