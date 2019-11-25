package typings.svgo.svgoMod

import typings.svgo.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizedSvg extends js.Object {
  var data: String
  var info: Anon_Height
  var path: js.UndefOr[String] = js.undefined
}

object OptimizedSvg {
  @scala.inline
  def apply(data: String, info: Anon_Height, path: String = null): OptimizedSvg = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizedSvg]
  }
}

