package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var accountSid: java.lang.String = js.native
  var apiVersion: java.lang.String = js.native
  var authToken: java.lang.String = js.native
  var host: java.lang.String = js.native
  var timeout: scala.Double = js.native
  def getBaseUrl(): java.lang.String = js.native
  def request(options: ClientRequestOptions): qLib.qMod.QNs.Promise[_] = js.native
  def request(options: ClientRequestOptions, callback: RequestCallback): qLib.qMod.QNs.Promise[_] = js.native
}

