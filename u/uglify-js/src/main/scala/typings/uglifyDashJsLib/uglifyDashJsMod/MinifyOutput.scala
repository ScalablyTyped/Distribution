package typings
package uglifyDashJsLib.uglifyDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOutput extends js.Object {
  var code: java.lang.String
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var map: java.lang.String
  var warnings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object MinifyOutput {
  @scala.inline
  def apply(
    code: java.lang.String,
    map: java.lang.String,
    error: stdLib.Error = null,
    warnings: js.Array[java.lang.String] = null
  ): MinifyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("map")(map)
    if (error != null) __obj.updateDynamic("error")(error)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[MinifyOutput]
  }
}

