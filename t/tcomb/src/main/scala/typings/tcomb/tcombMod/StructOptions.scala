package typings.tcomb.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructOptions extends js.Object {
  var defaultProps: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object StructOptions {
  @scala.inline
  def apply(defaultProps: js.Object = null, name: String = null, strict: js.UndefOr[Boolean] = js.undefined): StructOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[StructOptions]
  }
}

