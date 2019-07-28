package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterTimelineWidgetProfileDataSource extends _TwitterTimelineWidgetDataSource {
  var screenName: js.UndefOr[String] = js.undefined
  var sourceType: js.UndefOr[profile] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object TwitterTimelineWidgetProfileDataSource {
  @scala.inline
  def apply(screenName: String = null, sourceType: profile = null, userId: String = null): TwitterTimelineWidgetProfileDataSource = {
    val __obj = js.Dynamic.literal()
    if (screenName != null) __obj.updateDynamic("screenName")(screenName)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[TwitterTimelineWidgetProfileDataSource]
  }
}

