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
    created: () => scala.Unit,
    multiple: scala.Boolean => scala.Unit,
    mutableOptions: () => scala.Unit,
    mutableValue: (js.Any, js.Any) => scala.Unit,
    options: js.Any => scala.Unit,
    value: js.Any => scala.Unit
  ): VueSelectWatch = {
    val __obj = js.Dynamic.literal(created = js.Any.fromFunction0(created), multiple = js.Any.fromFunction1(multiple), mutableOptions = js.Any.fromFunction0(mutableOptions), mutableValue = js.Any.fromFunction2(mutableValue), options = js.Any.fromFunction1(options), value = js.Any.fromFunction1(value))
  
    __obj.asInstanceOf[VueSelectWatch]
  }
}

