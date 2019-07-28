package typings.timelinejs.knightlabNs

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
    val __obj = js.Dynamic.literal(endDate = endDate, headline = headline, startDate = startDate, text = text)
    if (asset != null) __obj.updateDynamic("asset")(asset)
    if (classname != null) __obj.updateDynamic("classname")(classname)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[ITimelineDate]
  }
}

