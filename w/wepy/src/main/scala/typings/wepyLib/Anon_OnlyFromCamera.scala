package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnlyFromCamera extends js.Object {
  var onlyFromCamera: js.UndefOr[scala.Boolean] = js.undefined
  var scanType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_OnlyFromCamera {
  @scala.inline
  def apply(
    onlyFromCamera: js.UndefOr[scala.Boolean] = js.undefined,
    scanType: js.Array[java.lang.String] = null
  ): Anon_OnlyFromCamera = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlyFromCamera)) __obj.updateDynamic("onlyFromCamera")(onlyFromCamera)
    if (scanType != null) __obj.updateDynamic("scanType")(scanType)
    __obj.asInstanceOf[Anon_OnlyFromCamera]
  }
}

