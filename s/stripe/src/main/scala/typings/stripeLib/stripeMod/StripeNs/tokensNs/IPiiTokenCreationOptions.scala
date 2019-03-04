package typings
package stripeLib.stripeMod.StripeNs.tokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPiiTokenCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptions {
  var pii: stripeLib.Anon_Personalidnumber
}

object IPiiTokenCreationOptions {
  @scala.inline
  def apply(
    pii: stripeLib.Anon_Personalidnumber,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null
  ): IPiiTokenCreationOptions = {
    val __obj = js.Dynamic.literal(pii = pii)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[IPiiTokenCreationOptions]
  }
}

