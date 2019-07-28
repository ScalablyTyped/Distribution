package typings.twilio.twilioMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "Client")
@js.native
class Client () extends js.Object {
  def this(sid: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: String, tkn: String, host: String) = this()
  def this(sid: String, tkn: String, host: String, api_version: String) = this()
  def this(sid: String, tkn: String, host: String, api_version: String, timeout: Double) = this()
  var accountSid: String = js.native
  var apiVersion: String = js.native
  var authToken: String = js.native
  var host: String = js.native
  var timeout: Double = js.native
  def getBaseUrl(): String = js.native
  def request(options: ClientRequestOptions): Promise[_] = js.native
  def request(options: ClientRequestOptions, callback: RequestCallback): Promise[_] = js.native
}

