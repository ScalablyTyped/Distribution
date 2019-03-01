package typings
package timelinejs3Lib.TLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineSlide extends js.Object {
  var data: ITimelineSlideData
}

object ITimelineSlide {
  @scala.inline
  def apply(data: ITimelineSlideData): ITimelineSlide = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ITimelineSlide]
  }
}

