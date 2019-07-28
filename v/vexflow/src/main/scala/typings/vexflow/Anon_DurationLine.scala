package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DurationLine extends js.Object {
  var duration: String
  var line: js.UndefOr[Double] = js.undefined
  var text: String
}

object Anon_DurationLine {
  @scala.inline
  def apply(duration: String, text: String, line: Int | Double = null): Anon_DurationLine = {
    val __obj = js.Dynamic.literal(duration = duration, text = text)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DurationLine]
  }
}

