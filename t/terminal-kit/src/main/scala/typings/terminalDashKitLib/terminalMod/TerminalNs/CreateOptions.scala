package typings
package terminalDashKitLib.terminalMod.TerminalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  var appId: java.lang.String
  var appName: java.lang.String
  var generic: js.UndefOr[java.lang.String] = js.undefined
  var isSSH: js.UndefOr[scala.Boolean] = js.undefined
  var isTTY: js.UndefOr[scala.Boolean] = js.undefined
  var pid: js.UndefOr[js.Any] = js.undefined
  var preferProcessSigwinch: js.UndefOr[scala.Boolean] = js.undefined
  var processSigwinch: js.UndefOr[scala.Boolean] = js.undefined
  var stderr: js.UndefOr[nodeLib.NodeJSNs.Process] = js.undefined
  var stdin: js.UndefOr[nodeLib.NodeJSNs.Process] = js.undefined
  var stdout: js.UndefOr[nodeLib.NodeJSNs.Process] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    appId: java.lang.String,
    appName: java.lang.String,
    generic: java.lang.String = null,
    isSSH: js.UndefOr[scala.Boolean] = js.undefined,
    isTTY: js.UndefOr[scala.Boolean] = js.undefined,
    pid: js.Any = null,
    preferProcessSigwinch: js.UndefOr[scala.Boolean] = js.undefined,
    processSigwinch: js.UndefOr[scala.Boolean] = js.undefined,
    stderr: nodeLib.NodeJSNs.Process = null,
    stdin: nodeLib.NodeJSNs.Process = null,
    stdout: nodeLib.NodeJSNs.Process = null
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appId")(appId)
    __obj.updateDynamic("appName")(appName)
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

