package typings
package timelinejs3Lib.TLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITimelineEra extends js.Object {
  var end_date: ITimelineDate
  var start_date: ITimelineDate
  /*
           * Not required, but recommended.
           */
  var text: js.UndefOr[ITimelineText] = js.undefined
}

