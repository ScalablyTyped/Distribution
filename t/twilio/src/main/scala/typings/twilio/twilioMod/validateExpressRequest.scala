package typings.twilio.twilioMod

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "validateExpressRequest")
@js.native
object validateExpressRequest extends js.Object {
  def apply(request: Request, authToken: String): Boolean = js.native
  def apply(request: Request, authToken: String, options: WebhookExpressOptions): Boolean = js.native
}

