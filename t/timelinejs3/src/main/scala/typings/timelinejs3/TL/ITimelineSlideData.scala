package typings.timelinejs3.TL

import typings.timelinejs3.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineSlideData extends js.Object {
  /*
    * Defaults to true, which means that Timeline will scan text fields and automatically add <a> tags so that
    * links and email addresses are "clickable." If set to false, you may still manually apply the tags in the
    * appropriate fields when you want links. Autolinking applies to the text field in a text object and the
    * caption and credit fields in a media object.
    */
  var autolink: js.UndefOr[Boolean] = js.native
  /*
    * A Javascript object. The object can have these properties:
    * url: the fully-qualified URL pointing to an image which will be used as the background
    * color: a CSS color, in hexadecimal (e.g. #0f9bd1) or a valid CSS color keyword.
    */
  var background: js.UndefOr[Color] = js.native
  /*
    * A string which will be used when Timeline displays the date for this. If used, override's display_date
    * values set on the start or end date for this event, which is useful if you want to control how the two
    * dates relate to each other.
    */
  var display_date: js.UndefOr[String] = js.native
  var end_date: js.UndefOr[ITimelineDate] = js.native
  /*
    * If present, Timeline will organize events with the same value for group to be in the same row or adjacent
    * rows, separate from events in other groups. The common value for the group will be shown as a label at the
    * left edge of the navigation.
    */
  var group: js.UndefOr[String] = js.native
  var media: js.UndefOr[ITimelineMedia] = js.native
  /*
    * Required for events, but not for `title` slides.
    */
  var start_date: js.UndefOr[ITimelineDate] = js.native
  /*
    * Not required, but recommended.
    */
  var text: js.UndefOr[ITimelineText] = js.native
  /*
    * A string value which is unique among all slides in your timeline. If not specified, TimelineJS will
    * construct an ID based on the headline, but if you later edit your headline, the ID will change. Unique IDs
    * are used when the hash_bookmark option is used, and can also be used with the timeline.goToId() method to
    * programmatically move the timeline to a specific slide.
    */
  var unique_id: js.UndefOr[String] = js.native
}

object ITimelineSlideData {
  @scala.inline
  def apply(): ITimelineSlideData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimelineSlideData]
  }
  @scala.inline
  implicit class ITimelineSlideDataOps[Self <: ITimelineSlideData] (val x: Self) extends AnyVal {
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
    def setAutolink(value: Boolean): Self = this.set("autolink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutolink: Self = this.set("autolink", js.undefined)
    @scala.inline
    def setBackground(value: Color): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setDisplay_date(value: String): Self = this.set("display_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay_date: Self = this.set("display_date", js.undefined)
    @scala.inline
    def setEnd_date(value: ITimelineDate): Self = this.set("end_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_date: Self = this.set("end_date", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setMedia(value: ITimelineMedia): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setStart_date(value: ITimelineDate): Self = this.set("start_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_date: Self = this.set("start_date", js.undefined)
    @scala.inline
    def setText(value: ITimelineText): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUnique_id(value: String): Self = this.set("unique_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique_id: Self = this.set("unique_id", js.undefined)
  }
  
}

