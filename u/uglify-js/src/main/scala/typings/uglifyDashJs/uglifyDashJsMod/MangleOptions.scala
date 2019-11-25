package typings.uglifyDashJs.uglifyDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MangleOptions extends js.Object {
  /** Pass true to mangle names visible in scopes where `eval` or with are used. */
  var eval: js.UndefOr[Boolean] = js.undefined
  /** Pass true to not mangle function names. Useful for code relying on `Function.prototype.name`. */
  var keep_fnames: js.UndefOr[Boolean] = js.undefined
  var properties: js.UndefOr[Boolean | ManglePropertiesOptions] = js.undefined
  /** Pass an array of identifiers that should be excluded from mangling. Example: `["foo", "bar"]`. */
  var reserved: js.UndefOr[js.Array[String]] = js.undefined
  /** Pass true to mangle names declared in the top level scope. */
  var toplevel: js.UndefOr[Boolean] = js.undefined
}

object MangleOptions {
  @scala.inline
  def apply(
    eval: js.UndefOr[Boolean] = js.undefined,
    keep_fnames: js.UndefOr[Boolean] = js.undefined,
    properties: Boolean | ManglePropertiesOptions = null,
    reserved: js.Array[String] = null,
    toplevel: js.UndefOr[Boolean] = js.undefined
  ): MangleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eval)) __obj.updateDynamic("eval")(eval.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_fnames)) __obj.updateDynamic("keep_fnames")(keep_fnames.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (reserved != null) __obj.updateDynamic("reserved")(reserved.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangleOptions]
  }
}

