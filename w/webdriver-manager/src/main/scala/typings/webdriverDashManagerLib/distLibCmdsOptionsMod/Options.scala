package typings
package webdriverDashManagerLib.distLibCmdsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var browserDrivers: js.UndefOr[js.Array[BrowserDriver]] = js.undefined
  var githubToken: js.UndefOr[java.lang.String] = js.undefined
  var ignoreSSL: js.UndefOr[scala.Boolean] = js.undefined
  var outDir: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var server: js.UndefOr[Server] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    browserDrivers: js.Array[BrowserDriver] = null,
    githubToken: java.lang.String = null,
    ignoreSSL: js.UndefOr[scala.Boolean] = js.undefined,
    outDir: java.lang.String = null,
    proxy: java.lang.String = null,
    server: Server = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (browserDrivers != null) __obj.updateDynamic("browserDrivers")(browserDrivers)
    if (githubToken != null) __obj.updateDynamic("githubToken")(githubToken)
    if (!js.isUndefined(ignoreSSL)) __obj.updateDynamic("ignoreSSL")(ignoreSSL)
    if (outDir != null) __obj.updateDynamic("outDir")(outDir)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Options]
  }
}

