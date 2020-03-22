package typings.victory

import typings.victory.mod.D3Scale
import typings.victory.mod.ScalePropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var x: js.UndefOr[ScalePropType | D3Scale] = js.undefined
  var y: js.UndefOr[ScalePropType | D3Scale] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(x: ScalePropType | D3Scale = null, y: ScalePropType | D3Scale = null): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

