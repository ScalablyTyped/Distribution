package typings
package undertakerLib.undertakerMod.UndertakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskFunctionParams extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var flags: js.UndefOr[TaskFlags] = js.undefined
  val name: js.UndefOr[java.lang.String] = js.undefined
}

object TaskFunctionParams {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    flags: TaskFlags = null,
    name: java.lang.String = null
  ): TaskFunctionParams = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TaskFunctionParams]
  }
}

