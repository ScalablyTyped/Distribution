package typings.victory.anon

import typings.victory.mod.D3Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XY extends js.Object {
  var x: js.UndefOr[D3Scale] = js.undefined
  var y: js.UndefOr[D3Scale] = js.undefined
}

object XY {
  @scala.inline
  def apply(x: D3Scale = null, y: D3Scale = null): XY = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XY]
  }
}

