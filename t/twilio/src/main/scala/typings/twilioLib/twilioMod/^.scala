package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RestClient = js.native
  def apply(sid: java.lang.String): RestClient = js.native
  def apply(sid: java.lang.String, tkn: java.lang.String): RestClient = js.native
  def apply(sid: java.lang.String, tkn: java.lang.String, options: ClientOptions): RestClient = js.native
  def validateExpressRequest(request: expressLib.expressMod.Request, authToken: java.lang.String): scala.Boolean = js.native
  def validateExpressRequest(
    request: expressLib.expressMod.Request,
    authToken: java.lang.String,
    options: WebhookExpressOptions
  ): scala.Boolean = js.native
  def validateRequest(authToken: java.lang.String, twilioHeader: java.lang.String, url: java.lang.String): scala.Boolean = js.native
  def validateRequest(authToken: java.lang.String, twilioHeader: java.lang.String, url: java.lang.String, params: js.Any): scala.Boolean = js.native
  def webhook(): MiddlewareFunction = js.native
  def webhook(authToken: java.lang.String): MiddlewareFunction = js.native
  def webhook(authToken: java.lang.String, options: WebhookOptions): MiddlewareFunction = js.native
  def webhook(options: WebhookOptions): MiddlewareFunction = js.native
}

