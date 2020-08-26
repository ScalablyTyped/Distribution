package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreServicesHost extends js.Object {
  var logger: ILogger = js.native
}

object ICoreServicesHost {
  @scala.inline
  def apply(logger: ILogger): ICoreServicesHost = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreServicesHost]
  }
  @scala.inline
  implicit class ICoreServicesHostOps[Self <: ICoreServicesHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLogger(value: ILogger): Self = this.set("logger", value.asInstanceOf[js.Any])
  }
  
}

