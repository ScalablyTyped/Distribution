package typings.timelinejs3.TL

import typings.timelinejs3.Anon_Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineSlideData extends js.Object {
  /*
    * Defaults to true, which means that Timeline will scan text fields and automatically add <a> tags so that
    * links and email addresses are "clickable." If set to false, you may still manually apply the tags in the
    * appropriate fields when you want links. Autolinking applies to the text field in a text object and the
    * caption and credit fields in a media object.
    */
  var autolink: js.UndefOr[Boolean] = js.undefined
  /*
    * A Javascript object. The object can have these properties:
    * url: the fully-qualified URL pointing to an image which will be used as the background
    * color: a CSS color, in hexadecimal (e.g. #0f9bd1) or a valid CSS color keyword.
    */
  var background: js.UndefOr[Anon_Color] = js.undefined
  /*
    * A string which will be used when Timeline displays the date for this. If used, override's display_date
    * values set on the start or end date for this event, which is useful if you want to control how the two
    * dates relate to each other.
    */
  var display_date: js.UndefOr[String] = js.undefined
  var end_date: js.UndefOr[ITimelineDate] = js.undefined
  /*
    * If present, Timeline will organize events with the same value for group to be in the same row or adjacent
    * rows, separate from events in other groups. The common value for the group will be shown as a label at the
    * left edge of the navigation.
    */
  var group: js.UndefOr[String] = js.undefined
  var media: js.UndefOr[ITimelineMedia] = js.undefined
  /*
    * Required for events, but not for `title` slides.
    */
  var start_date: js.UndefOr[ITimelineDate] = js.undefined
  /*
    * Not required, but recommended.
    */
  var text: js.UndefOr[ITimelineText] = js.undefined
  /*
    * A string value which is unique among all slides in your timeline. If not specified, TimelineJS will
    * construct an ID based on the headline, but if you later edit your headline, the ID will change. Unique IDs
    * are used when the hash_bookmark option is used, and can also be used with the timeline.goToId() method to
    * programmatically move the timeline to a specific slide.
    */
  var unique_id: js.UndefOr[String] = js.undefined
}

object ITimelineSlideData {
  @scala.inline
  def apply(
    autolink: js.UndefOr[Boolean] = js.undefined,
    background: Anon_Color = null,
    display_date: String = null,
    end_date: ITimelineDate = null,
    group: String = null,
    media: ITimelineMedia = null,
    start_date: ITimelineDate = null,
    text: ITimelineText = null,
    unique_id: String = null
  ): ITimelineSlideData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autolink)) __obj.updateDynamic("autolink")(autolink)
    if (background != null) __obj.updateDynamic("background")(background)
    if (display_date != null) __obj.updateDynamic("display_date")(display_date)
    if (end_date != null) __obj.updateDynamic("end_date")(end_date)
    if (group != null) __obj.updateDynamic("group")(group)
    if (media != null) __obj.updateDynamic("media")(media)
    if (start_date != null) __obj.updateDynamic("start_date")(start_date)
    if (text != null) __obj.updateDynamic("text")(text)
    if (unique_id != null) __obj.updateDynamic("unique_id")(unique_id)
    __obj.asInstanceOf[ITimelineSlideData]
  }
}

