package typings.typescript

import typings.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[Diagnostic] = js.undefined
}

object AnonConfig {
  @scala.inline
  def apply(config: js.Any = null, error: Diagnostic = null): AnonConfig = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
}

