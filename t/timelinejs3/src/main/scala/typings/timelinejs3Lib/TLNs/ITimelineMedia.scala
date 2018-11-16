package typings
package timelinejs3Lib.TLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITimelineMedia extends js.Object {
  /*
           * HTML markup is OK.
           */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /*
           * HTML markup is OK.
           */
  var credit: js.UndefOr[java.lang.String] = js.undefined
  /*
           * A URL for an image to use in the timenav marker for this event. If omitted, Timeline will use an icon based
           * on the type of media. Not relevant for title slides, because they do not have a marker.
           */
  var thumbnail: js.UndefOr[java.lang.String] = js.undefined
  /*
           * In most cases, a URL (see https://timeline.knightlab.com/docs/media-types.html for complete details).
           */
  var url: java.lang.String
}

