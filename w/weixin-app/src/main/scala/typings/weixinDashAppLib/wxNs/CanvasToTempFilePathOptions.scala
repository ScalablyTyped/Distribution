package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasToTempFilePathOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 画布标识，传入 <canvas/> 的 cavas-id
  		 */
  var canvasId: java.lang.String
}

object CanvasToTempFilePathOptions {
  @scala.inline
  def apply(
    canvasId: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canvasId")(canvasId)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
}

