package typings.terminalDashKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YesOrNoOptions extends js.Object {
  var echoNo: js.UndefOr[String] = js.undefined
  var echoYes: js.UndefOr[String] = js.undefined
  var no: String | js.Array[String]
  var yes: String | js.Array[String]
}

object YesOrNoOptions {
  @scala.inline
  def apply(
    no: String | js.Array[String],
    yes: String | js.Array[String],
    echoNo: String = null,
    echoYes: String = null
  ): YesOrNoOptions = {
    val __obj = js.Dynamic.literal(no = no.asInstanceOf[js.Any], yes = yes.asInstanceOf[js.Any])
    if (echoNo != null) __obj.updateDynamic("echoNo")(echoNo.asInstanceOf[js.Any])
    if (echoYes != null) __obj.updateDynamic("echoYes")(echoYes.asInstanceOf[js.Any])
    __obj.asInstanceOf[YesOrNoOptions]
  }
}

