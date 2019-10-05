package typings.timelinejs3.TL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineText extends js.Object {
  /*
    * HTML markup is OK. Blank is also OK.
    */
  var headline: js.UndefOr[String] = js.undefined
  /*
    * HTML markup is OK. Blank is also OK. Not used for era objects.
    */
  var text: js.UndefOr[String] = js.undefined
}

object ITimelineText {
  @scala.inline
  def apply(headline: String = null, text: String = null): ITimelineText = {
    val __obj = js.Dynamic.literal()
    if (headline != null) __obj.updateDynamic("headline")(headline)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ITimelineText]
  }
}

