package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var selected: js.UndefOr[java.lang.String] = js.undefined
  var unselected: js.UndefOr[java.lang.String] = js.undefined
}

object Image {
  @scala.inline
  def apply(selected: java.lang.String = null, unselected: java.lang.String = null): Image = {
    val __obj = js.Dynamic.literal()
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (unselected != null) __obj.updateDynamic("unselected")(unselected)
    __obj.asInstanceOf[Image]
  }
}

