package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", JSImport.Namespace)
@js.native
object twilioModMembers extends js.Object {
  def apply(): twilioLib.twilioMod.twilioNs.RestClient = js.native
  def apply(sid: java.lang.String): twilioLib.twilioMod.twilioNs.RestClient = js.native
  def apply(sid: java.lang.String, tkn: java.lang.String): twilioLib.twilioMod.twilioNs.RestClient = js.native
  def apply(sid: java.lang.String, tkn: java.lang.String, options: twilioLib.twilioMod.twilioNs.ClientOptions): twilioLib.twilioMod.twilioNs.RestClient = js.native
  def validateExpressRequest(request: expressLib.expressMod.eNs.Request, authToken: java.lang.String): scala.Boolean = js.native
  def validateExpressRequest(
    request: expressLib.expressMod.eNs.Request,
    authToken: java.lang.String,
    options: twilioLib.twilioMod.twilioNs.WebhookExpressOptions
  ): scala.Boolean = js.native
  def validateRequest(authToken: java.lang.String, twilioHeader: java.lang.String, url: java.lang.String): scala.Boolean = js.native
  def validateRequest(authToken: java.lang.String, twilioHeader: java.lang.String, url: java.lang.String, params: js.Any): scala.Boolean = js.native
  def webhook(): twilioLib.twilioMod.twilioNs.MiddlewareFunction = js.native
  def webhook(authToken: java.lang.String): twilioLib.twilioMod.twilioNs.MiddlewareFunction = js.native
  def webhook(authToken: java.lang.String, options: twilioLib.twilioMod.twilioNs.WebhookOptions): twilioLib.twilioMod.twilioNs.MiddlewareFunction = js.native
  def webhook(options: twilioLib.twilioMod.twilioNs.WebhookOptions): twilioLib.twilioMod.twilioNs.MiddlewareFunction = js.native
}

