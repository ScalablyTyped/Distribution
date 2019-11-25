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
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineEra]
  }
}

