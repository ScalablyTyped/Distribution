package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterTimelineWidgetListDataSource extends _TwitterTimelineWidgetDataSource {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var ownerScreenName: js.UndefOr[java.lang.String] = js.undefined
  var slug: js.UndefOr[java.lang.String] = js.undefined
  var sourceType: js.UndefOr[twitterDashForDashWebLib.twitterDashForDashWebLibStrings.list] = js.undefined
}

object TwitterTimelineWidgetListDataSource {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    ownerScreenName: java.lang.String = null,
    slug: java.lang.String = null,
    sourceType: twitterDashForDashWebLib.twitterDashForDashWebLibStrings.list = null
  ): TwitterTimelineWidgetListDataSource = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (ownerScreenName != null) __obj.updateDynamic("ownerScreenName")(ownerScreenName)
    if (slug != null) __obj.updateDynamic("slug")(slug)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    __obj.asInstanceOf[TwitterTimelineWidgetListDataSource]
  }
}

