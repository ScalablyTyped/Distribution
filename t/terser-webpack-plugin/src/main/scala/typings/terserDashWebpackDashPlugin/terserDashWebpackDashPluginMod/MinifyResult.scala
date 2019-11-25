package typings.terserDashWebpackDashPlugin.terserDashWebpackDashPluginMod

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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], extractedComments = extractedComments.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MinifyResult]
  }
}

