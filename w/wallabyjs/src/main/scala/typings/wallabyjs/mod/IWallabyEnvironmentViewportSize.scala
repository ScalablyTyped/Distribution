package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyEnvironmentViewportSize extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object IWallabyEnvironmentViewportSize {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): IWallabyEnvironmentViewportSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyEnvironmentViewportSize]
  }
}

