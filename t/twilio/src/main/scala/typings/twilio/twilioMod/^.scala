package typings.twilio.twilioMod

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RestClient = js.native
  def apply(sid: String): RestClient = js.native
  def apply(sid: String, tkn: String): RestClient = js.native
  def apply(sid: String, tkn: String, options: ClientOptions): RestClient = js.native
  def validateExpressRequest(request: Request, authToken: String): Boolean = js.native
  def validateExpressRequest(request: Request, authToken: String, options: WebhookExpressOptions): Boolean = js.native
  def validateRequest(authToken: String, twilioHeader: String, url: String): Boolean = js.native
  def validateRequest(authToken: String, twilioHeader: String, url: String, params: js.Any): Boolean = js.native
  def webhook(): MiddlewareFunction = js.native
  def webhook(authToken: String): MiddlewareFunction = js.native
  def webhook(authToken: String, options: WebhookOptions): MiddlewareFunction = js.native
  def webhook(options: WebhookOptions): MiddlewareFunction = js.native
}

