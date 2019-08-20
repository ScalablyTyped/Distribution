package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogView extends js.Object {
  /** only available in the first element of the response array */
  var file_size: js.UndefOr[Double] = js.undefined
  var l: String
  /** only available in the first element of the response array */
  var last_pos: js.UndefOr[Double] = js.undefined
}

object LogView {
  @scala.inline
  def apply(l: String, file_size: Int | Double = null, last_pos: Int | Double = null): LogView = {
    val __obj = js.Dynamic.literal(l = l)
    if (file_size != null) __obj.updateDynamic("file_size")(file_size.asInstanceOf[js.Any])
    if (last_pos != null) __obj.updateDynamic("last_pos")(last_pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogView]
  }
}

