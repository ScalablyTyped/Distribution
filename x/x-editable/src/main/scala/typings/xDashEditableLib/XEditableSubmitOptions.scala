package typings
package xDashEditableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEditableSubmitOptions extends js.Object {
  var ajaxOptions: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  def error(obj: js.Any): scala.Unit
  def success(obj: js.Any, config: js.Any): scala.Unit
}

object XEditableSubmitOptions {
  @scala.inline
  def apply(
    error: js.Function1[js.Any, scala.Unit],
    success: js.Function2[js.Any, js.Any, scala.Unit],
    ajaxOptions: js.Any = null,
    data: js.Any = null,
    url: js.Any = null
  ): XEditableSubmitOptions = {
    val __obj = js.Dynamic.literal(error = error, success = success)
    if (ajaxOptions != null) __obj.updateDynamic("ajaxOptions")(ajaxOptions)
    if (data != null) __obj.updateDynamic("data")(data)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[XEditableSubmitOptions]
  }
}

