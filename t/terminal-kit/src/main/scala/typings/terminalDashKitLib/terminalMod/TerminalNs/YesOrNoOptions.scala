package typings
package terminalDashKitLib.terminalMod.TerminalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YesOrNoOptions extends js.Object {
  var echoNo: js.UndefOr[java.lang.String] = js.undefined
  var echoYes: js.UndefOr[java.lang.String] = js.undefined
  var no: java.lang.String | js.Array[java.lang.String]
  var yes: java.lang.String | js.Array[java.lang.String]
}

object YesOrNoOptions {
  @scala.inline
  def apply(
    no: java.lang.String | js.Array[java.lang.String],
    yes: java.lang.String | js.Array[java.lang.String],
    echoNo: java.lang.String = null,
    echoYes: java.lang.String = null
  ): YesOrNoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("no")(no.asInstanceOf[js.Any])
    __obj.updateDynamic("yes")(yes.asInstanceOf[js.Any])
    if (echoNo != null) __obj.updateDynamic("echoNo")(echoNo)
    if (echoYes != null) __obj.updateDynamic("echoYes")(echoYes)
    __obj.asInstanceOf[YesOrNoOptions]
  }
}

