package typings
package tetherLib.tetherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// global Tether constructor
trait Tether extends js.Object {
  def destroy(): scala.Unit
  def disable(): scala.Unit
  def enable(): scala.Unit
  def position(): scala.Unit
  def setOptions(options: tetherLib.tetherMod.TetherNs.ITetherOptions): scala.Unit
}

object Tether {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    disable: () => scala.Unit,
    enable: () => scala.Unit,
    position: () => scala.Unit,
    setOptions: tetherLib.tetherMod.TetherNs.ITetherOptions => scala.Unit
  ): Tether = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), position = js.Any.fromFunction0(position), setOptions = js.Any.fromFunction1(setOptions))
  
    __obj.asInstanceOf[Tether]
  }
}

