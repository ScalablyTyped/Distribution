package typings
package xadesjsLib.xadesjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsSignerRole extends js.Object {
  var certified: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var claimed: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OptionsSignerRole {
  @scala.inline
  def apply(certified: js.Array[java.lang.String] = null, claimed: js.Array[java.lang.String] = null): OptionsSignerRole = {
    val __obj = js.Dynamic.literal()
    if (certified != null) __obj.updateDynamic("certified")(certified)
    if (claimed != null) __obj.updateDynamic("claimed")(claimed)
    __obj.asInstanceOf[OptionsSignerRole]
  }
}

