package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import typings.typescriptDashServices.TypeScriptNs.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreServicesHost extends js.Object {
  var logger: ILogger
}

object ICoreServicesHost {
  @scala.inline
  def apply(logger: ILogger): ICoreServicesHost = {
    val __obj = js.Dynamic.literal(logger = logger)
  
    __obj.asInstanceOf[ICoreServicesHost]
  }
}

