package typings.xadesjs.xadesjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsSignerRole extends js.Object {
  var certified: js.UndefOr[js.Array[String]] = js.undefined
  var claimed: js.UndefOr[js.Array[String]] = js.undefined
}

object OptionsSignerRole {
  @scala.inline
  def apply(certified: js.Array[String] = null, claimed: js.Array[String] = null): OptionsSignerRole = {
    val __obj = js.Dynamic.literal()
    if (certified != null) __obj.updateDynamic("certified")(certified)
    if (claimed != null) __obj.updateDynamic("claimed")(claimed)
    __obj.asInstanceOf[OptionsSignerRole]
  }
}

