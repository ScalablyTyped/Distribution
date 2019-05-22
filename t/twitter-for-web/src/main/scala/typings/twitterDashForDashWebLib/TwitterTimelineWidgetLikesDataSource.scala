package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterTimelineWidgetLikesDataSource extends _TwitterTimelineWidgetDataSource {
  var screenName: js.UndefOr[java.lang.String] = js.undefined
  var sourceType: js.UndefOr[twitterDashForDashWebLib.twitterDashForDashWebLibStrings.likes] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object TwitterTimelineWidgetLikesDataSource {
  @scala.inline
  def apply(
    screenName: java.lang.String = null,
    sourceType: twitterDashForDashWebLib.twitterDashForDashWebLibStrings.likes = null,
    userId: java.lang.String = null
  ): TwitterTimelineWidgetLikesDataSource = {
    val __obj = js.Dynamic.literal()
    if (screenName != null) __obj.updateDynamic("screenName")(screenName)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[TwitterTimelineWidgetLikesDataSource]
  }
}

