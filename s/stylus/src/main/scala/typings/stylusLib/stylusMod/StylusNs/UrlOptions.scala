package typings
package stylusLib.stylusMod.StylusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlOptions extends js.Object {
  var limit: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
}

object UrlOptions {
  @scala.inline
  def apply(path: java.lang.String, limit: java.lang.String = null): UrlOptions = {
    val __obj = js.Dynamic.literal(path = path)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    __obj.asInstanceOf[UrlOptions]
  }
}

