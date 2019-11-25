package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitHelper extends js.Object {
  val name: String
  val priority: js.UndefOr[Double] = js.undefined
  val scoped: Boolean
  val text: String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, String])
}

object EmitHelper {
  @scala.inline
  def apply(
    name: String,
    scoped: Boolean,
    text: String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, String]),
    priority: Int | Double = null
  ): EmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitHelper]
  }
}

