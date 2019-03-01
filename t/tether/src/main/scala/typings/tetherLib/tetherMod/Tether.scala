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
    destroy: js.Function0[scala.Unit],
    disable: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    position: js.Function0[scala.Unit],
    setOptions: js.Function1[tetherLib.tetherMod.TetherNs.ITetherOptions, scala.Unit]
  ): Tether = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("setOptions")(setOptions)
    __obj.asInstanceOf[Tether]
  }
}

