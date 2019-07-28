package typings.svgo.svgoMod

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
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[SvgInfo]
  }
}

