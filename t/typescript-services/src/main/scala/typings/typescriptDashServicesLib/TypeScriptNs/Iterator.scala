package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  def current(): T
  def moveNext(): scala.Boolean
}

object Iterator {
  @scala.inline
  def apply[T](current: js.Function0[T], moveNext: js.Function0[scala.Boolean]): Iterator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("moveNext")(moveNext)
    __obj.asInstanceOf[Iterator[T]]
  }
}

