package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitterTimelineWidgetCollectionDataSource extends _TwitterTimelineWidgetDataSource {
  var id: String = js.native
  var sourceType: collection = js.native
}

object TwitterTimelineWidgetCollectionDataSource {
  @scala.inline
  def apply(id: String, sourceType: collection): TwitterTimelineWidgetCollectionDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetCollectionDataSource]
  }
  @scala.inline
  implicit class TwitterTimelineWidgetCollectionDataSourceOps[Self <: TwitterTimelineWidgetCollectionDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceType(value: collection): Self = this.set("sourceType", value.asInstanceOf[js.Any])
  }
  
}

