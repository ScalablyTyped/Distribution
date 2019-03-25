package typings
package webdriverDashManagerLib.distLibCmdsOptionsUnderscoreBinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerBinary
  extends webdriverDashManagerLib.distLibCmdsOptionsMod.Server {
  var binary: js.UndefOr[webdriverDashManagerLib.distLibProviderProviderMod.ProviderInterface] = js.undefined
}

object ServerBinary {
  @scala.inline
  def apply(
    binary: webdriverDashManagerLib.distLibProviderProviderMod.ProviderInterface = null,
    chromeLogs: java.lang.String = null,
    edge: java.lang.String = null,
    name: webdriverDashManagerLib.webdriverDashManagerLibStrings.selenium = null,
    port: scala.Int | scala.Double = null,
    runAsDetach: js.UndefOr[scala.Boolean] = js.undefined,
    runAsNode: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null
  ): ServerBinary = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (chromeLogs != null) __obj.updateDynamic("chromeLogs")(chromeLogs)
    if (edge != null) __obj.updateDynamic("edge")(edge)
    if (name != null) __obj.updateDynamic("name")(name)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(runAsDetach)) __obj.updateDynamic("runAsDetach")(runAsDetach)
    if (!js.isUndefined(runAsNode)) __obj.updateDynamic("runAsNode")(runAsNode)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ServerBinary]
  }
}

