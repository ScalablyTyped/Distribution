package typings.timelinejs3.TL

import typings.timelinejs3.timelinejs3Strings.cosmological
import typings.timelinejs3.timelinejs3Strings.human
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineConfig extends js.Object {
  var eras: js.UndefOr[js.Array[ITimelineEra]] = js.undefined
  var events: js.Array[ITimelineSlideData]
  /*
    * Either human or cosmological. If no scale is specified, the default is human. The cosmological scale is
    * required to handle dates in the very distant past or future. (Before Tuesday, April 20th, 271,821 BCE
    * after Saturday, September 13 275,760 CE) For the cosmological scale, only the year is considered, but it's
    * OK to have a cosmological timeline with years between 271,821 BCE and 275,760 CE.
    */
  var scale: js.UndefOr[human | cosmological] = js.undefined
  var title: js.UndefOr[ITimelineSlideData] = js.undefined
}

object ITimelineConfig {
  @scala.inline
  def apply(
    events: js.Array[ITimelineSlideData],
    eras: js.Array[ITimelineEra] = null,
    scale: human | cosmological = null,
    title: ITimelineSlideData = null
  ): ITimelineConfig = {
    val __obj = js.Dynamic.literal(events = events)
    if (eras != null) __obj.updateDynamic("eras")(eras)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ITimelineConfig]
  }
}

