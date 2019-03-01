package typings
package atVueComponentDashCompilerDashUtilsLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOfSourceMap extends js.Object {
  var file: js.UndefOr[java.lang.String] = js.undefined
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
}

object StartOfSourceMap {
  @scala.inline
  def apply(file: java.lang.String = null, sourceRoot: java.lang.String = null): StartOfSourceMap = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    __obj.asInstanceOf[StartOfSourceMap]
  }
}

