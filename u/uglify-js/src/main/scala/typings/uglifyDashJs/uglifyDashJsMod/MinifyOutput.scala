package typings.uglifyDashJs.uglifyDashJsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOutput extends js.Object {
  var code: String
  var error: js.UndefOr[Error] = js.undefined
  var map: String
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object MinifyOutput {
  @scala.inline
  def apply(code: String, map: String, error: Error = null, warnings: js.Array[String] = null): MinifyOutput = {
    val __obj = js.Dynamic.literal(code = code, map = map)
    if (error != null) __obj.updateDynamic("error")(error)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[MinifyOutput]
  }
}

