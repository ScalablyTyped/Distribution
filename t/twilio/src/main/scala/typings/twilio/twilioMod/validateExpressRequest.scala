package typings.twilio.twilioMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "validateExpressRequest")
@js.native
object validateExpressRequest extends js.Object {
  def apply(request: Request[ParamsDictionary], authToken: String): Boolean = js.native
  def apply(request: Request[ParamsDictionary], authToken: String, options: WebhookExpressOptions): Boolean = js.native
}

