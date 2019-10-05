package typings.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineEra extends js.Object {
  /*
    * format example: 2011,12,10
    */
  var endDate: String
  var headline: String
  /*
    * format example: 2011,12,10
    */
  var startDate: String
  var tag: js.UndefOr[String] = js.undefined
  var text: String
}

object ITimelineEra {
  @scala.inline
  def apply(endDate: String, headline: String, startDate: String, text: String, tag: String = null): ITimelineEra = {
    val __obj = js.Dynamic.literal(endDate = endDate, headline = headline, startDate = startDate, text = text)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[ITimelineEra]
  }
}

