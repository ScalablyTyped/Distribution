package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineText extends js.Object {
  var duration: String
  var line: js.UndefOr[Double] = js.undefined
  var text: String
}

object LineText {
  @scala.inline
  def apply(duration: String, text: String, line: js.UndefOr[Double] = js.undefined): LineText = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineText]
  }
}

