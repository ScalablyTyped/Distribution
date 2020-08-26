package typings.timelinejs3.TL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineSlide extends js.Object {
  var data: ITimelineSlideData = js.native
}

object ITimelineSlide {
  @scala.inline
  def apply(data: ITimelineSlideData): ITimelineSlide = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineSlide]
  }
  @scala.inline
  implicit class ITimelineSlideOps[Self <: ITimelineSlide] (val x: Self) extends AnyVal {
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
    def setData(value: ITimelineSlideData): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

