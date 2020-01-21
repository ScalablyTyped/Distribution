package typings.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteOptions extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var migrations: js.UndefOr[js.Array[String]] = js.undefined
}

object ExecuteOptions {
  @scala.inline
  def apply(method: String = null, migrations: js.Array[String] = null): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (migrations != null) __obj.updateDynamic("migrations")(migrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteOptions]
  }
}

