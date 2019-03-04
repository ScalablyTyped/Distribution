package typings
package timelinejsLib.knightlabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineDate extends ITimelineEra {
  var asset: js.UndefOr[ITimeLineAsset] = js.undefined
  var classname: js.UndefOr[java.lang.String] = js.undefined
}

object ITimelineDate {
  @scala.inline
  def apply(
    endDate: java.lang.String,
    headline: java.lang.String,
    startDate: java.lang.String,
    text: java.lang.String,
    asset: ITimeLineAsset = null,
    classname: java.lang.String = null,
    tag: java.lang.String = null
  ): ITimelineDate = {
    val __obj = js.Dynamic.literal(endDate = endDate, headline = headline, startDate = startDate, text = text)
    if (asset != null) __obj.updateDynamic("asset")(asset)
    if (classname != null) __obj.updateDynamic("classname")(classname)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[ITimelineDate]
  }
}

