package typings
package webdriverDashManagerLib.distLibCmdsOptionsUnderscoreBinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsBinary
  extends webdriverDashManagerLib.distLibCmdsOptionsMod.Options {
  @JSName("browserDrivers")
  var browserDrivers_OptionsBinary: js.UndefOr[js.Array[BrowserDriverBinary]] = js.undefined
  @JSName("server")
  var server_OptionsBinary: js.UndefOr[ServerBinary] = js.undefined
}

object OptionsBinary {
  @scala.inline
  def apply(
    browserDrivers: js.Array[BrowserDriverBinary] = null,
    githubToken: java.lang.String = null,
    ignoreSSL: js.UndefOr[scala.Boolean] = js.undefined,
    outDir: java.lang.String = null,
    proxy: java.lang.String = null,
    server: ServerBinary = null
  ): OptionsBinary = {
    val __obj = js.Dynamic.literal()
    if (browserDrivers != null) __obj.updateDynamic("browserDrivers")(browserDrivers)
    if (githubToken != null) __obj.updateDynamic("githubToken")(githubToken)
    if (!js.isUndefined(ignoreSSL)) __obj.updateDynamic("ignoreSSL")(ignoreSSL)
    if (outDir != null) __obj.updateDynamic("outDir")(outDir)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[OptionsBinary]
  }
}

