package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRouterCapability extends js.Object {
  var _baseUrl: java.lang.String = js.native
  var _resourceUrl: java.lang.String = js.native
  var accountSid: java.lang.String = js.native
  var authToken: java.lang.String = js.native
  var channelId: java.lang.String = js.native
  var policies: js.Array[Policy] = js.native
  var workspaceSid: java.lang.String = js.native
  /* private */ def _generate(ttl: scala.Double, extraAttributes: js.Any): java.lang.String = js.native
  /* protected */ def _setupResource(): scala.Unit = js.native
  /* private */ def _validateJWT(): scala.Unit = js.native
  def addPolicy(url: java.lang.String, method: java.lang.String): scala.Unit = js.native
  def addPolicy(url: java.lang.String, method: java.lang.String, allowed: scala.Boolean): scala.Unit = js.native
  def addPolicy(url: java.lang.String, method: java.lang.String, allowed: scala.Boolean, queryFilter: js.Any): scala.Unit = js.native
  def addPolicy(
    url: java.lang.String,
    method: java.lang.String,
    allowed: scala.Boolean,
    queryFilter: js.Any,
    postFilter: js.Any
  ): scala.Unit = js.native
  def allow(url: java.lang.String, method: java.lang.String): scala.Unit = js.native
  def allow(url: java.lang.String, method: java.lang.String, queryFilter: js.Any): scala.Unit = js.native
  def allow(url: java.lang.String, method: java.lang.String, queryFilter: js.Any, postFilter: js.Any): scala.Unit = js.native
  def allowDelete(): scala.Unit = js.native
  def allowDeleteSubresources(): scala.Unit = js.native
  def allowFetchSubresources(): scala.Unit = js.native
  def allowTaskReservationUpdates(): scala.Unit = js.native
  def allowUpdates(): scala.Unit = js.native
  def allowUpdatesSubresources(): scala.Unit = js.native
  def allowWorkerActivityUpdates(): scala.Unit = js.native
  def allowWorkerFetchAttributes(): scala.Unit = js.native
  def deny(url: java.lang.String, method: java.lang.String): scala.Unit = js.native
  def deny(url: java.lang.String, method: java.lang.String, queryFilter: js.Any): scala.Unit = js.native
  def deny(url: java.lang.String, method: java.lang.String, queryFilter: js.Any, postFilter: js.Any): scala.Unit = js.native
  def generate(ttl: scala.Double): java.lang.String = js.native
}

