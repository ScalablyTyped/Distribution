package typings
package timelinejs3Lib.TLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITimelineDate extends js.Object {
  var day: js.UndefOr[scala.Double] = js.undefined
  /*
           * A string for presenting the date. Useful if Timeline's date formatting doesn't fit your needs.
           */
  var display_date: js.UndefOr[java.lang.String] = js.undefined
  /*
           * 0-23
           */
  var hour: js.UndefOr[scala.Double] = js.undefined
  var millisecond: js.UndefOr[scala.Double] = js.undefined
  /*
           * 0-59
           */
  var minute: js.UndefOr[scala.Double] = js.undefined
  /*
           * 1-12
           */
  var month: js.UndefOr[scala.Double] = js.undefined
  /*
           * 0-59
           */
  var second: js.UndefOr[scala.Double] = js.undefined
  /*
           * BCE years should be negative numbers.
           */
  var year: scala.Double
}

