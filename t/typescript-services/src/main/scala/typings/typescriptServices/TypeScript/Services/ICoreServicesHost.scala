package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreServicesHost extends js.Object {
  var logger: ILogger
}

object ICoreServicesHost {
  @scala.inline
  def apply(logger: ILogger): ICoreServicesHost = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICoreServicesHost]
  }
}

