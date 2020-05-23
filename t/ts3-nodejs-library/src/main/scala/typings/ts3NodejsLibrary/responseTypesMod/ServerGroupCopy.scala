package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerGroupCopy extends js.Object {
  /** only available when a new group gets created */
  var sgid: js.UndefOr[Double] = js.undefined
}

object ServerGroupCopy {
  @scala.inline
  def apply(sgid: js.UndefOr[Double] = js.undefined): ServerGroupCopy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sgid)) __obj.updateDynamic("sgid")(sgid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupCopy]
  }
}

