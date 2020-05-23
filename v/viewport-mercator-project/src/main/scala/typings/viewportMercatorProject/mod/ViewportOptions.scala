package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var projectionMatrix: js.UndefOr[ViewMatrix] = js.undefined
  var viewMatrix: js.UndefOr[ViewMatrix] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ViewportOptions {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    projectionMatrix: ViewMatrix = null,
    viewMatrix: ViewMatrix = null,
    width: js.UndefOr[Double] = js.undefined
  ): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (projectionMatrix != null) __obj.updateDynamic("projectionMatrix")(projectionMatrix.asInstanceOf[js.Any])
    if (viewMatrix != null) __obj.updateDynamic("viewMatrix")(viewMatrix.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportOptions]
  }
}

