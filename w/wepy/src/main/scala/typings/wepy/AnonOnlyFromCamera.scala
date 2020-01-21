package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnlyFromCamera extends js.Object {
  var onlyFromCamera: js.UndefOr[Boolean] = js.undefined
  var scanType: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonOnlyFromCamera {
  @scala.inline
  def apply(onlyFromCamera: js.UndefOr[Boolean] = js.undefined, scanType: js.Array[String] = null): AnonOnlyFromCamera = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlyFromCamera)) __obj.updateDynamic("onlyFromCamera")(onlyFromCamera.asInstanceOf[js.Any])
    if (scanType != null) __obj.updateDynamic("scanType")(scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnlyFromCamera]
  }
}

