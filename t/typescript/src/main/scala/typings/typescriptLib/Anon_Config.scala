package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[typescriptLib.typescriptMod.Diagnostic] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply(config: js.Any = null, error: typescriptLib.typescriptMod.Diagnostic = null): Anon_Config = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_Config]
  }
}

