package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capability extends js.Object {
  var accountSid: java.lang.String = js.native
  var authToken: java.lang.String = js.native
  var capabilities: js.Array[java.lang.String] = js.native
  var clientName: java.lang.String = js.native
  var outgoingScopeParams: js.Any = js.native
  var scopeParams: js.Any = js.native
  def allowClientIncoming(clientName: java.lang.String): Capability = js.native
  def allowClientOutgoing(appSid: java.lang.String): Capability = js.native
  def allowClientOutgoing(appSid: java.lang.String, params: js.Any): Capability = js.native
  def allowEventStream(): Capability = js.native
  def allowEventStream(filters: js.Any): Capability = js.native
  def generate(): java.lang.String = js.native
  def generate(timeout: scala.Double): java.lang.String = js.native
}

