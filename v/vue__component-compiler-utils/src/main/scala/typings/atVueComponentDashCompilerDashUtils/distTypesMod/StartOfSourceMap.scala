package typings.atVueComponentDashCompilerDashUtils.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOfSourceMap extends js.Object {
  var file: js.UndefOr[String] = js.undefined
  var sourceRoot: js.UndefOr[String] = js.undefined
}

object StartOfSourceMap {
  @scala.inline
  def apply(file: String = null, sourceRoot: String = null): StartOfSourceMap = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOfSourceMap]
  }
}

