package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "TaskRouterCapability")
@js.native
class TaskRouterCapability protected () extends StObject {
  def this(accountSid: String, authToken: String, workspaceSid: String, channelId: String) = this()
  
  var _baseUrl: String = js.native
  
  /* private */ def _generate(ttl: Double, extraAttributes: js.Any): String = js.native
  
  var _resourceUrl: String = js.native
  
  /* protected */ def _setupResource(): Unit = js.native
  
  /* private */ def _validateJWT(): Unit = js.native
  
  var accountSid: String = js.native
  
  def addPolicy(url: String, method: String): Unit = js.native
  def addPolicy(
    url: String,
    method: String,
    allowed: js.UndefOr[scala.Nothing],
    queryFilter: js.UndefOr[scala.Nothing],
    postFilter: js.Any
  ): Unit = js.native
  def addPolicy(url: String, method: String, allowed: js.UndefOr[scala.Nothing], queryFilter: js.Any): Unit = js.native
  def addPolicy(
    url: String,
    method: String,
    allowed: js.UndefOr[scala.Nothing],
    queryFilter: js.Any,
    postFilter: js.Any
  ): Unit = js.native
  def addPolicy(url: String, method: String, allowed: Boolean): Unit = js.native
  def addPolicy(
    url: String,
    method: String,
    allowed: Boolean,
    queryFilter: js.UndefOr[scala.Nothing],
    postFilter: js.Any
  ): Unit = js.native
  def addPolicy(url: String, method: String, allowed: Boolean, queryFilter: js.Any): Unit = js.native
  def addPolicy(url: String, method: String, allowed: Boolean, queryFilter: js.Any, postFilter: js.Any): Unit = js.native
  
  def allow(url: String, method: String): Unit = js.native
  def allow(url: String, method: String, queryFilter: js.UndefOr[scala.Nothing], postFilter: js.Any): Unit = js.native
  def allow(url: String, method: String, queryFilter: js.Any): Unit = js.native
  def allow(url: String, method: String, queryFilter: js.Any, postFilter: js.Any): Unit = js.native
  
  def allowDelete(): Unit = js.native
  
  def allowDeleteSubresources(): Unit = js.native
  
  def allowFetchSubresources(): Unit = js.native
  
  def allowTaskReservationUpdates(): Unit = js.native
  
  def allowUpdates(): Unit = js.native
  
  def allowUpdatesSubresources(): Unit = js.native
  
  def allowWorkerActivityUpdates(): Unit = js.native
  
  def allowWorkerFetchAttributes(): Unit = js.native
  
  var authToken: String = js.native
  
  var channelId: String = js.native
  
  def deny(url: String, method: String): Unit = js.native
  def deny(url: String, method: String, queryFilter: js.UndefOr[scala.Nothing], postFilter: js.Any): Unit = js.native
  def deny(url: String, method: String, queryFilter: js.Any): Unit = js.native
  def deny(url: String, method: String, queryFilter: js.Any, postFilter: js.Any): Unit = js.native
  
  def generate(ttl: Double): String = js.native
  
  var policies: js.Array[Policy] = js.native
  
  var workspaceSid: String = js.native
}
