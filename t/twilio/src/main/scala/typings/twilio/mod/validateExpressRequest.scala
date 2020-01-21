package typings.twilio.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "validateExpressRequest")
@js.native
object validateExpressRequest extends js.Object {
  def apply(request: Request_[ParamsDictionary], authToken: String): Boolean = js.native
  def apply(request: Request_[ParamsDictionary], authToken: String, options: WebhookExpressOptions): Boolean = js.native
}

