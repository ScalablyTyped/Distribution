package typings
package typedocLib.distLibUtilsComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions extends js.Object {
  var childClass: js.UndefOr[js.Function] = js.undefined
  var internal: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply(
    childClass: js.Function = null,
    internal: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null
  ): ComponentOptions = {
    val __obj = js.Dynamic.literal()
    if (childClass != null) __obj.updateDynamic("childClass")(childClass)
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ComponentOptions]
  }
}

