package typings.timelinejs3.TL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineSlide extends js.Object {
  var data: ITimelineSlideData
}

object ITimelineSlide {
  @scala.inline
  def apply(data: ITimelineSlideData): ITimelineSlide = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITimelineSlide]
  }
}

