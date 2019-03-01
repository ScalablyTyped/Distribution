package typings
package timelinejsLib.knightlabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineEra extends js.Object {
  /*
    * format example: 2011,12,10
    */
  var endDate: java.lang.String
  var headline: java.lang.String
  /*
    * format example: 2011,12,10
    */
  var startDate: java.lang.String
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
}

object ITimelineEra {
  @scala.inline
  def apply(
    endDate: java.lang.String,
    headline: java.lang.String,
    startDate: java.lang.String,
    text: java.lang.String,
    tag: java.lang.String = null
  ): ITimelineEra = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endDate")(endDate)
    __obj.updateDynamic("headline")(headline)
    __obj.updateDynamic("startDate")(startDate)
    __obj.updateDynamic("text")(text)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[ITimelineEra]
  }
}

