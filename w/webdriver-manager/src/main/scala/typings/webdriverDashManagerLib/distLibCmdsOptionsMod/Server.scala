package typings
package webdriverDashManagerLib.distLibCmdsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var chromeLogs: js.UndefOr[java.lang.String] = js.undefined
  var edge: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[webdriverDashManagerLib.webdriverDashManagerLibStrings.selenium] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var runAsDetach: js.UndefOr[scala.Boolean] = js.undefined
  var runAsNode: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Server {
  @scala.inline
  def apply(
    chromeLogs: java.lang.String = null,
    edge: java.lang.String = null,
    name: webdriverDashManagerLib.webdriverDashManagerLibStrings.selenium = null,
    port: scala.Int | scala.Double = null,
    runAsDetach: js.UndefOr[scala.Boolean] = js.undefined,
    runAsNode: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null
  ): Server = {
    val __obj = js.Dynamic.literal()
    if (chromeLogs != null) __obj.updateDynamic("chromeLogs")(chromeLogs)
    if (edge != null) __obj.updateDynamic("edge")(edge)
    if (name != null) __obj.updateDynamic("name")(name)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(runAsDetach)) __obj.updateDynamic("runAsDetach")(runAsDetach)
    if (!js.isUndefined(runAsNode)) __obj.updateDynamic("runAsNode")(runAsNode)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Server]
  }
}

