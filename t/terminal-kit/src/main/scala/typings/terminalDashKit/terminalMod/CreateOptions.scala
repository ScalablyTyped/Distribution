package typings.terminalDashKit.terminalMod

import typings.node.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  var appId: String
  var appName: String
  var generic: js.UndefOr[String] = js.undefined
  var isSSH: js.UndefOr[Boolean] = js.undefined
  var isTTY: js.UndefOr[Boolean] = js.undefined
  var pid: js.UndefOr[js.Any] = js.undefined
  var preferProcessSigwinch: js.UndefOr[Boolean] = js.undefined
  var processSigwinch: js.UndefOr[Boolean] = js.undefined
  var stderr: js.UndefOr[Process] = js.undefined
  var stdin: js.UndefOr[Process] = js.undefined
  var stdout: js.UndefOr[Process] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    appId: String,
    appName: String,
    generic: String = null,
    isSSH: js.UndefOr[Boolean] = js.undefined,
    isTTY: js.UndefOr[Boolean] = js.undefined,
    pid: js.Any = null,
    preferProcessSigwinch: js.UndefOr[Boolean] = js.undefined,
    processSigwinch: js.UndefOr[Boolean] = js.undefined,
    stderr: Process = null,
    stdin: Process = null,
    stdout: Process = null
  ): CreateOptions = {
    val __obj = js.Dynamic.literal(appId = appId, appName = appName)
    if (generic != null) __obj.updateDynamic("generic")(generic)
    if (!js.isUndefined(isSSH)) __obj.updateDynamic("isSSH")(isSSH)
    if (!js.isUndefined(isTTY)) __obj.updateDynamic("isTTY")(isTTY)
    if (pid != null) __obj.updateDynamic("pid")(pid)
    if (!js.isUndefined(preferProcessSigwinch)) __obj.updateDynamic("preferProcessSigwinch")(preferProcessSigwinch)
    if (!js.isUndefined(processSigwinch)) __obj.updateDynamic("processSigwinch")(processSigwinch)
    if (stderr != null) __obj.updateDynamic("stderr")(stderr)
    if (stdin != null) __obj.updateDynamic("stdin")(stdin)
    if (stdout != null) __obj.updateDynamic("stdout")(stdout)
    __obj.asInstanceOf[CreateOptions]
  }
}

