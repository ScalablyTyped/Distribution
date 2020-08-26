package typings.timelinejs3.TL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineMedia extends js.Object {
  /*
    * HTML markup is OK.
    */
  var caption: js.UndefOr[String] = js.native
  /*
    * HTML markup is OK.
    */
  var credit: js.UndefOr[String] = js.native
  /*
    * A URL for an image to use in the timenav marker for this event. If omitted, Timeline will use an icon based
    * on the type of media. Not relevant for title slides, because they do not have a marker.
    */
  var thumbnail: js.UndefOr[String] = js.native
  /*
    * In most cases, a URL (see https://timeline.knightlab.com/docs/media-types.html for complete details).
    */
  var url: String = js.native
}

object ITimelineMedia {
  @scala.inline
  def apply(url: String): ITimelineMedia = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineMedia]
  }
  @scala.inline
  implicit class ITimelineMediaOps[Self <: ITimelineMedia] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setCredit(value: String): Self = this.set("credit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredit: Self = this.set("credit", js.undefined)
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
  
}

