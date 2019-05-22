package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterTimelineWidgetProfileDataSource extends _TwitterTimelineWidgetDataSource {
  var screenName: js.UndefOr[java.lang.String] = js.undefined
  var sourceType: js.UndefOr[twitterDashForDashWebLib.twitterDashForDashWebLibStrings.profile] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object TwitterTimelineWidgetProfileDataSource {
  @scala.inline
  def apply(
    screenName: java.lang.String = null,
    sourceType: twitterDashForDashWebLib.twitterDashForDashWebLibStrings.profile = null,
    userId: java.lang.String = null
  ): TwitterTimelineWidgetProfileDataSource = {
    val __obj = js.Dynamic.literal()
    if (screenName != null) __obj.updateDynamic("screenName")(screenName)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[TwitterTimelineWidgetProfileDataSource]
  }
}

