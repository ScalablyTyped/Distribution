package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** if true, method does not make an actual request to the API Server but rather returns an object with url which contains the actual URL to make the GET request to WebPageTest API Server */
  var dryRun: js.UndefOr[scala.Boolean] = js.undefined
  /** if specified, overrides the WebPageTest server informed in the constructor only for that method call */
  var server: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(dryRun: js.UndefOr[scala.Boolean] = js.undefined, server: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Options]
  }
}

