package typings
package styletronDashStandardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: js.UndefOr[styletronDashStandardLib.styletronDashStandardMod.Properties] = js.undefined
  var to: js.UndefOr[styletronDashStandardLib.styletronDashStandardMod.Properties] = js.undefined
}

object Anon_From {
  @scala.inline
  def apply(
    from: styletronDashStandardLib.styletronDashStandardMod.Properties = null,
    to: styletronDashStandardLib.styletronDashStandardMod.Properties = null
  ): Anon_From = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_From]
  }
}

