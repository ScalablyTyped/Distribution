package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.collection
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetCollectionDataSource]
  }
}

