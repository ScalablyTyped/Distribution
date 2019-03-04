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
    val __obj = js.Dynamic.literal(created = created, multiple = multiple, mutableOptions = mutableOptions, mutableValue = mutableValue, options = options, value = value)
  
    __obj.asInstanceOf[VueSelectWatch]
  }
}

