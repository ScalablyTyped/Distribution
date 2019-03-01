package typings
package umzugLib.umzugMod.umzugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteOptions extends js.Object {
  var method: js.UndefOr[java.lang.String] = js.undefined
  var migrations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ExecuteOptions {
  @scala.inline
  def apply(method: java.lang.String = null, migrations: js.Array[java.lang.String] = null): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method)
    if (migrations != null) __obj.updateDynamic("migrations")(migrations)
    __obj.asInstanceOf[ExecuteOptions]
  }
}

