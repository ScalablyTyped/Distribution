package typings
package terserDashWebpackDashPluginLib.terserDashWebpackDashPluginMod.TerserPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyResult extends js.Object {
  var code: js.Any
  var error: js.Any
  var extractedComments: js.Any
  var map: js.Any
  var warnings: js.Any
}

object MinifyResult {
  @scala.inline
  def apply(code: js.Any, error: js.Any, extractedComments: js.Any, map: js.Any, warnings: js.Any): MinifyResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("extractedComments")(extractedComments)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[MinifyResult]
  }
}

