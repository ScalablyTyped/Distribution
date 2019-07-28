package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterTimelineWidgetCollectionDataSource extends _TwitterTimelineWidgetDataSource {
  var id: String
  var sourceType: collection
}

object TwitterTimelineWidgetCollectionDataSource {
  @scala.inline
  def apply(id: String, sourceType: collection): TwitterTimelineWidgetCollectionDataSource = {
    val __obj = js.Dynamic.literal(id = id, sourceType = sourceType)
  
    __obj.asInstanceOf[TwitterTimelineWidgetCollectionDataSource]
  }
}

