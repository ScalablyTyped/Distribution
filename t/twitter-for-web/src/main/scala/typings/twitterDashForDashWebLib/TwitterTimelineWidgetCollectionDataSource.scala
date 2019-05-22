package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterTimelineWidgetCollectionDataSource extends _TwitterTimelineWidgetDataSource {
  var id: java.lang.String
  var sourceType: twitterDashForDashWebLib.twitterDashForDashWebLibStrings.collection
}

object TwitterTimelineWidgetCollectionDataSource {
  @scala.inline
  def apply(
    id: java.lang.String,
    sourceType: twitterDashForDashWebLib.twitterDashForDashWebLibStrings.collection
  ): TwitterTimelineWidgetCollectionDataSource = {
    val __obj = js.Dynamic.literal(id = id, sourceType = sourceType)
  
    __obj.asInstanceOf[TwitterTimelineWidgetCollectionDataSource]
  }
}

