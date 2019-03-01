package typings
package vueDashSelectLib.vueDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueSelectWatch extends js.Object {
  def created(): scala.Unit
  def multiple(reset: scala.Boolean): scala.Unit
  def mutableOptions(): scala.Unit
  def mutableValue(`val`: js.Any, old: js.Any): scala.Unit
  def options(`val`: js.Any): scala.Unit
  def value(`val`: js.Any): scala.Unit
}

object VueSelectWatch {
  @scala.inline
  def apply(
    created: js.Function0[scala.Unit],
    multiple: js.Function1[scala.Boolean, scala.Unit],
    mutableOptions: js.Function0[scala.Unit],
    mutableValue: js.Function2[js.Any, js.Any, scala.Unit],
    options: js.Function1[js.Any, scala.Unit],
    value: js.Function1[js.Any, scala.Unit]
  ): VueSelectWatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("multiple")(multiple)
    __obj.updateDynamic("mutableOptions")(mutableOptions)
    __obj.updateDynamic("mutableValue")(mutableValue)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[VueSelectWatch]
  }
}

