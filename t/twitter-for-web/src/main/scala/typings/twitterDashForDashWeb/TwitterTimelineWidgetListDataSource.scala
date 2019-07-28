package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterTimelineWidgetListDataSource extends _TwitterTimelineWidgetDataSource {
  var id: js.UndefOr[String] = js.undefined
  var ownerScreenName: js.UndefOr[String] = js.undefined
  var slug: js.UndefOr[String] = js.undefined
  var sourceType: js.UndefOr[list] = js.undefined
}

object TwitterTimelineWidgetListDataSource {
  @scala.inline
  def apply(id: String = null, ownerScreenName: String = null, slug: String = null, sourceType: list = null): TwitterTimelineWidgetListDataSource = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (ownerScreenName != null) __obj.updateDynamic("ownerScreenName")(ownerScreenName)
    if (slug != null) __obj.updateDynamic("slug")(slug)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType)
    __obj.asInstanceOf[TwitterTimelineWidgetListDataSource]
  }
}

