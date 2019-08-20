package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerGroupCopy extends js.Object {
  /** only available when a new group gets created */
  var sgid: js.UndefOr[Double] = js.undefined
}

object ServerGroupCopy {
  @scala.inline
  def apply(sgid: Int | Double = null): ServerGroupCopy = {
    val __obj = js.Dynamic.literal()
    if (sgid != null) __obj.updateDynamic("sgid")(sgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupCopy]
  }
}

