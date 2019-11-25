package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnlyFromCamera extends js.Object {
  var onlyFromCamera: js.UndefOr[Boolean] = js.undefined
  var scanType: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_OnlyFromCamera {
  @scala.inline
  def apply(onlyFromCamera: js.UndefOr[Boolean] = js.undefined, scanType: js.Array[String] = null): Anon_OnlyFromCamera = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlyFromCamera)) __obj.updateDynamic("onlyFromCamera")(onlyFromCamera.asInstanceOf[js.Any])
    if (scanType != null) __obj.updateDynamic("scanType")(scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnlyFromCamera]
  }
}

