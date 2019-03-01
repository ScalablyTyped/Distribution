package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreServicesHost extends js.Object {
  var logger: typescriptDashServicesLib.TypeScriptNs.ILogger
}

object ICoreServicesHost {
  @scala.inline
  def apply(logger: typescriptDashServicesLib.TypeScriptNs.ILogger): ICoreServicesHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[ICoreServicesHost]
  }
}

