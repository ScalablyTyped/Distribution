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
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    if (generic != null) __obj.updateDynamic("generic")(generic.asInstanceOf[js.Any])
    if (!js.isUndefined(isSSH)) __obj.updateDynamic("isSSH")(isSSH.asInstanceOf[js.Any])
    if (!js.isUndefined(isTTY)) __obj.updateDynamic("isTTY")(isTTY.asInstanceOf[js.Any])
    if (pid != null) __obj.updateDynamic("pid")(pid.asInstanceOf[js.Any])
    if (!js.isUndefined(preferProcessSigwinch)) __obj.updateDynamic("preferProcessSigwinch")(preferProcessSigwinch.asInstanceOf[js.Any])
    if (!js.isUndefined(processSigwinch)) __obj.updateDynamic("processSigwinch")(processSigwinch.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (stdin != null) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
}

