package typings.stylus.stylusMod.Stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlOptions extends js.Object {
  var limit: js.UndefOr[String] = js.undefined
  var path: String
}

object UrlOptions {
  @scala.inline
  def apply(path: String, limit: String = null): UrlOptions = {
    val __obj = js.Dynamic.literal(path = path)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    __obj.asInstanceOf[UrlOptions]
  }
}

