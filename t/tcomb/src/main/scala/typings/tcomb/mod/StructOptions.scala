package typings.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructOptions extends js.Object {
  var defaultProps: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object StructOptions {
  @scala.inline
  def apply(
    defaultProps: js.Object = null,
    name: java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): StructOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructOptions]
  }
}

