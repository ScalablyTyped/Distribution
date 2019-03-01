package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataOptions extends js.Object {
  var expand: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IDataOptions {
  @scala.inline
  def apply(expand: js.Array[java.lang.String] = null, include: js.Array[java.lang.String] = null): IDataOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[IDataOptions]
  }
}

