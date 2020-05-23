package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationLine extends js.Object {
  var duration: Double
  var line: js.UndefOr[Double] = js.undefined
}

object DurationLine {
  @scala.inline
  def apply(duration: Double, line: js.UndefOr[Double] = js.undefined): DurationLine = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationLine]
  }
}

