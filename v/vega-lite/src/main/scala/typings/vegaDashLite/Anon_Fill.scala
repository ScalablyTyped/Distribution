package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fill extends js.Object {
  var fill: js.UndefOr[Boolean] = js.undefined
  var stroke: js.UndefOr[Boolean] = js.undefined
}

object Anon_Fill {
  @scala.inline
  def apply(fill: js.UndefOr[Boolean] = js.undefined, stroke: js.UndefOr[Boolean] = js.undefined): Anon_Fill = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[Anon_Fill]
  }
}

