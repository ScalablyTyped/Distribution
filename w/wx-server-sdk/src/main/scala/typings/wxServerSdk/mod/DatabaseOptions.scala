package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseOptions extends js.Object {
  var env: js.UndefOr[String] = js.undefined
}

object DatabaseOptions {
  @scala.inline
  def apply(env: String = null): DatabaseOptions = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseOptions]
  }
}

