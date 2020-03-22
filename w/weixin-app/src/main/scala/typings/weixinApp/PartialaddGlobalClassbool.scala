package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  addGlobalClass  :boolean,   multipleSlots  :boolean}> */
trait PartialaddGlobalClassbool extends js.Object {
  var addGlobalClass: js.UndefOr[Boolean] = js.undefined
  var multipleSlots: js.UndefOr[Boolean] = js.undefined
}

object PartialaddGlobalClassbool {
  @scala.inline
  def apply(
    addGlobalClass: js.UndefOr[Boolean] = js.undefined,
    multipleSlots: js.UndefOr[Boolean] = js.undefined
  ): PartialaddGlobalClassbool = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addGlobalClass)) __obj.updateDynamic("addGlobalClass")(addGlobalClass.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleSlots)) __obj.updateDynamic("multipleSlots")(multipleSlots.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialaddGlobalClassbool]
  }
}

