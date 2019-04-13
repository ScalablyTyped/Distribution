package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "Client")
@js.native
class Client () extends js.Object {
  def this(sid: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String, host: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String, host: java.lang.String, api_version: java.lang.String) = this()
  def this(sid: java.lang.String, tkn: java.lang.String, host: java.lang.String, api_version: java.lang.String, timeout: scala.Double) = this()
  var accountSid: java.lang.String = js.native
  var apiVersion: java.lang.String = js.native
  var authToken: java.lang.String = js.native
  var host: java.lang.String = js.native
  var timeout: scala.Double = js.native
  def getBaseUrl(): java.lang.String = js.native
  def request(options: ClientRequestOptions): qLib.qMod.Promise[_] = js.native
  def request(options: ClientRequestOptions, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
}

