package typings
package vscodeDashLanguageclientLib.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutableOptions extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var shell: js.UndefOr[scala.Boolean] = js.undefined
  var stdio: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object ExecutableOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    env: js.Any = null,
    shell: js.UndefOr[scala.Boolean] = js.undefined,
    stdio: java.lang.String | js.Array[java.lang.String] = null
  ): ExecutableOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (env != null) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(shell)) __obj.updateDynamic("shell")(shell)
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutableOptions]
  }
}

