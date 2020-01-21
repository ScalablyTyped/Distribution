package typings.typedoc.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions extends js.Object {
  var childClass: js.UndefOr[js.Function] = js.undefined
  var internal: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply(childClass: js.Function = null, internal: js.UndefOr[Boolean] = js.undefined, name: String = null): ComponentOptions = {
    val __obj = js.Dynamic.literal()
    if (childClass != null) __obj.updateDynamic("childClass")(childClass.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions]
  }
}

