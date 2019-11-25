package typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod

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
    height: Int | Double = null,
    projectionMatrix: ViewMatrix = null,
    viewMatrix: ViewMatrix = null,
    width: Int | Double = null
  ): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (projectionMatrix != null) __obj.updateDynamic("projectionMatrix")(projectionMatrix.asInstanceOf[js.Any])
    if (viewMatrix != null) __obj.updateDynamic("viewMatrix")(viewMatrix.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportOptions]
  }
}

