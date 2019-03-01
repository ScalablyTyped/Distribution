package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgInfo extends js.Object {
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object SvgInfo {
  @scala.inline
  def apply(path: java.lang.String = null): SvgInfo = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[SvgInfo]
  }
}

