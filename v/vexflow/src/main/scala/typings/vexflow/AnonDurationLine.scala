package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurationLine extends js.Object {
  var duration: String
  var line: js.UndefOr[Double] = js.undefined
  var text: String
}

object AnonDurationLine {
  @scala.inline
  def apply(duration: String, text: String, line: Int | Double = null): AnonDurationLine = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDurationLine]
  }
}

