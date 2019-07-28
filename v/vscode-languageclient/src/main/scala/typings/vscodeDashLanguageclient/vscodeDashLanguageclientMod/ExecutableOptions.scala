package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutableOptions extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var detached: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var shell: js.UndefOr[Boolean] = js.undefined
  var stdio: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ExecutableOptions {
  @scala.inline
  def apply(
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: js.Any = null,
    shell: js.UndefOr[Boolean] = js.undefined,
    stdio: String | js.Array[String] = null
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

