package typings.stylus.mod.Stylus

import typings.stylus.stylusBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlOptions extends js.Object {
  var limit: js.UndefOr[Double | `false` | Null] = js.undefined
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}

object UrlOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Null | Double | `false`] = js.undefined, paths: js.Array[String] = null): UrlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlOptions]
  }
}

