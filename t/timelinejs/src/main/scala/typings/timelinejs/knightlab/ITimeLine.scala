package typings.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeLine extends js.Object {
  var asset: js.UndefOr[ITimeLineAsset] = js.undefined
  var date: js.UndefOr[js.Array[ITimelineDate]] = js.undefined
  var era: js.UndefOr[js.Array[ITimelineEra]] = js.undefined
  var headline: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ITimeLine {
  @scala.inline
  def apply(
    asset: ITimeLineAsset = null,
    date: js.Array[ITimelineDate] = null,
    era: js.Array[ITimelineEra] = null,
    headline: String = null,
    text: String = null,
    `type`: String = null
  ): ITimeLine = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (era != null) __obj.updateDynamic("era")(era.asInstanceOf[js.Any])
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeLine]
  }
}

