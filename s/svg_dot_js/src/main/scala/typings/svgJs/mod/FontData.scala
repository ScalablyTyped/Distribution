package typings.svgJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontData extends js.Object {
  var anchor: js.UndefOr[String] = js.undefined
  var family: js.UndefOr[String] = js.undefined
  var leading: js.UndefOr[NumberAlias] = js.undefined
  var size: js.UndefOr[NumberAlias] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[String] = js.undefined
}

object FontData {
  @scala.inline
  def apply(
    anchor: String = null,
    family: String = null,
    leading: NumberAlias = null,
    size: NumberAlias = null,
    style: String = null,
    weight: String = null
  ): FontData = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (leading != null) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontData]
  }
}

