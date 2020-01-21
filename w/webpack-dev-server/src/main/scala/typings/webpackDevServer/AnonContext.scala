package typings.webpackDevServer

import typings.httpProxyMiddleware.mod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: js.UndefOr[String | js.Array[String] | Filter] = js.undefined
  var path: js.UndefOr[String | js.Array[String]] = js.undefined
}

object AnonContext {
  @scala.inline
  def apply(context: String | js.Array[String] | Filter = null, path: String | js.Array[String] = null): AnonContext = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

