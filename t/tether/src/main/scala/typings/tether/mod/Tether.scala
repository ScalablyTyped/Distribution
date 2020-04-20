package typings.tether.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// global Tether constructor
trait Tether extends js.Object {
  def destroy(): Unit
  def disable(): Unit
  def enable(): Unit
  def position(): Unit
  def setOptions(options: ITetherOptions): Unit
}

object Tether {
  @scala.inline
  def apply(
    destroy: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    position: () => Unit,
    setOptions: ITetherOptions => Unit
  ): Tether = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), position = js.Any.fromFunction0(position), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Tether]
  }
}

