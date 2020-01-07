package typings.victory

import typings.victory.victoryMod.D3Scale
import typings.victory.victoryMod.ScalePropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYD3ScaleScalePropType extends js.Object {
  var x: js.UndefOr[ScalePropType | D3Scale] = js.undefined
  var y: js.UndefOr[ScalePropType | D3Scale] = js.undefined
}

object Anon_XYD3ScaleScalePropType {
  @scala.inline
  def apply(x: ScalePropType | D3Scale = null, y: ScalePropType | D3Scale = null): Anon_XYD3ScaleScalePropType = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XYD3ScaleScalePropType]
  }
}

