package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[String] = js.undefined
}

object Background {
  @scala.inline
  def apply(background: String = null, border: String = null): Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
}

