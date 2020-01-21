package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var selected: js.UndefOr[String] = js.undefined
  var unselected: js.UndefOr[String] = js.undefined
}

object Image {
  @scala.inline
  def apply(selected: String = null, unselected: String = null): Image = {
    val __obj = js.Dynamic.literal()
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (unselected != null) __obj.updateDynamic("unselected")(unselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

