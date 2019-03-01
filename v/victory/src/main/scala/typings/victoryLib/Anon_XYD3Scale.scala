package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYD3Scale extends js.Object {
  var x: js.UndefOr[victoryLib.victoryMod.ScalePropType | victoryLib.victoryMod.D3Scale] = js.undefined
  var y: js.UndefOr[victoryLib.victoryMod.ScalePropType | victoryLib.victoryMod.D3Scale] = js.undefined
}

object Anon_XYD3Scale {
  @scala.inline
  def apply(
    x: victoryLib.victoryMod.ScalePropType | victoryLib.victoryMod.D3Scale = null,
    y: victoryLib.victoryMod.ScalePropType | victoryLib.victoryMod.D3Scale = null
  ): Anon_XYD3Scale = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XYD3Scale]
  }
}

