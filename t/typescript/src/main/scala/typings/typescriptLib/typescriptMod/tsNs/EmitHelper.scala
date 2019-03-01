package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitHelper extends js.Object {
  val name: java.lang.String
  val priority: js.UndefOr[scala.Double] = js.undefined
  val scoped: scala.Boolean
  val text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
}

object EmitHelper {
  @scala.inline
  def apply(
    name: java.lang.String,
    scoped: scala.Boolean,
    text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String]),
    priority: scala.Int | scala.Double = null
  ): EmitHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scoped")(scoped)
    __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitHelper]
  }
}

