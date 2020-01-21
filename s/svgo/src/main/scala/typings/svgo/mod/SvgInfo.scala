package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgInfo extends js.Object {
  var path: js.UndefOr[String] = js.undefined
}

object SvgInfo {
  @scala.inline
  def apply(path: String = null): SvgInfo = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgInfo]
  }
}

