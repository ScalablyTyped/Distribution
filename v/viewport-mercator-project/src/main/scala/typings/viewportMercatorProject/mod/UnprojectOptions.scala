package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnprojectOptions extends ProjectOptions {
  var targetZ: js.UndefOr[Double] = js.undefined
}

object UnprojectOptions {
  @scala.inline
  def apply(targetZ: js.UndefOr[Double] = js.undefined, topLeft: js.UndefOr[Boolean] = js.undefined): UnprojectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(targetZ)) __obj.updateDynamic("targetZ")(targetZ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topLeft)) __obj.updateDynamic("topLeft")(topLeft.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprojectOptions]
  }
}

