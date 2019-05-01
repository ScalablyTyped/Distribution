package typings
package twilioDashMcsDashClientLib.libServicesNetworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-mcs-client/lib/services/network", "Network")
@js.native
class Network protected () extends js.Object {
  def this(config: twilioDashMcsDashClientLib.libConfigurationMod.Configuration, transport: twilioDashTransportLib.twilioDashTransportMod.Transport) = this()
  var backoffConfig: js.Any = js.native
  val config: js.Any = js.native
  var executeWithRetry: js.Any = js.native
  var retryWhenThrottled: js.Any = js.native
  val transport: js.Any = js.native
  def get(url: java.lang.String): js.Promise[_] = js.native
  def post(url: java.lang.String, media: java.lang.String): js.Promise[_] = js.native
  def post(url: java.lang.String, media: java.lang.String, contentType: java.lang.String): js.Promise[_] = js.native
  def post(url: java.lang.String, media: nodeLib.Buffer): js.Promise[_] = js.native
  def post(url: java.lang.String, media: nodeLib.Buffer, contentType: java.lang.String): js.Promise[_] = js.native
  def post(url: java.lang.String, media: stdLib.FormData): js.Promise[_] = js.native
  def post(url: java.lang.String, media: stdLib.FormData, contentType: java.lang.String): js.Promise[_] = js.native
}

