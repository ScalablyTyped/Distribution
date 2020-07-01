package typings.styledSystemCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionLabel extends _SystemStyleObject {
  var label: js.UndefOr[String] = js.undefined
}

object EmotionLabel {
  @scala.inline
  def apply(label: String = null): EmotionLabel = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmotionLabel]
  }
}

