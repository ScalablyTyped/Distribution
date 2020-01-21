package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnprojectOptions extends ProjectOptions {
  var targetZ: js.UndefOr[Double] = js.undefined
}

object UnprojectOptions {
  @scala.inline
  def apply(targetZ: Int | Double = null, topLeft: js.UndefOr[Boolean] = js.undefined): UnprojectOptions = {
    val __obj = js.Dynamic.literal()
    if (targetZ != null) __obj.updateDynamic("targetZ")(targetZ.asInstanceOf[js.Any])
    if (!js.isUndefined(topLeft)) __obj.updateDynamic("topLeft")(topLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprojectOptions]
  }
}

