package typings.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineDate extends ITimelineEra {
  var asset: js.UndefOr[ITimeLineAsset] = js.undefined
  var classname: js.UndefOr[String] = js.undefined
}

object ITimelineDate {
  @scala.inline
  def apply(
    endDate: String,
    headline: String,
    startDate: String,
    text: String,
    asset: ITimeLineAsset = null,
    classname: String = null,
    tag: String = null
  ): ITimelineDate = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (classname != null) __obj.updateDynamic("classname")(classname.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineDate]
  }
}

