package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** if true, method does not make an actual request to the API Server but rather returns an object with url which contains the actual URL to make the GET request to WebPageTest API Server */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  /** if specified, overrides the WebPageTest server informed in the constructor only for that method call */
  var server: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(dryRun: js.UndefOr[Boolean] = js.undefined, server: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.get.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

