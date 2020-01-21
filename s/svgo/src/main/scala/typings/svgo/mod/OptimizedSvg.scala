package typings.svgo.mod

import typings.svgo.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizedSvg extends js.Object {
  var data: String
  var info: AnonHeight
  var path: js.UndefOr[String] = js.undefined
}

object OptimizedSvg {
  @scala.inline
  def apply(data: String, info: AnonHeight, path: String = null): OptimizedSvg = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizedSvg]
  }
}

