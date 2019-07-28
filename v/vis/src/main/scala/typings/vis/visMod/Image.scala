package typings.vis.visMod

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
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (unselected != null) __obj.updateDynamic("unselected")(unselected)
    __obj.asInstanceOf[Image]
  }
}

