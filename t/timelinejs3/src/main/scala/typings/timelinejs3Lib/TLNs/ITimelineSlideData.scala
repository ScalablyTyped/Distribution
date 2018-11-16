package typings
package timelinejs3Lib.TLNs

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
  var autolink: js.UndefOr[scala.Boolean] = js.undefined
  /*
           * A Javascript object. The object can have these properties:
           * url: the fully-qualified URL pointing to an image which will be used as the background
           * color: a CSS color, in hexadecimal (e.g. #0f9bd1) or a valid CSS color keyword.
           */
  var background: js.UndefOr[timelinejs3Lib.Anon_Color] = js.undefined
  /*
           * A string which will be used when Timeline displays the date for this. If used, override's display_date
           * values set on the start or end date for this event, which is useful if you want to control how the two
           * dates relate to each other.
           */
  var display_date: js.UndefOr[java.lang.String] = js.undefined
  var end_date: js.UndefOr[ITimelineDate] = js.undefined
  /*
           * If present, Timeline will organize events with the same value for group to be in the same row or adjacent
           * rows, separate from events in other groups. The common value for the group will be shown as a label at the
           * left edge of the navigation.
           */
  var group: js.UndefOr[java.lang.String] = js.undefined
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
  var unique_id: js.UndefOr[java.lang.String] = js.undefined
}

