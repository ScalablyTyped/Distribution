package typings
package timelinejsLib.knightlabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineModel extends js.Object {
  var timeline: ITimeLine
}

object ITimelineModel {
  @scala.inline
  def apply(timeline: ITimeLine): ITimelineModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("timeline")(timeline)
    __obj.asInstanceOf[ITimelineModel]
  }
}

