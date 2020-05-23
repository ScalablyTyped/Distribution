package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitHelper extends js.Object {
  val dependencies: js.UndefOr[js.Array[EmitHelper]] = js.undefined
  val name: java.lang.String
  val priority: js.UndefOr[Double] = js.undefined
  val scoped: Boolean
  val text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
}

object EmitHelper {
  @scala.inline
  def apply(
    name: java.lang.String,
    scoped: Boolean,
    text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String]),
    dependencies: js.Array[EmitHelper] = null,
    priority: js.UndefOr[Double] = js.undefined
  ): EmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitHelper]
  }
}

