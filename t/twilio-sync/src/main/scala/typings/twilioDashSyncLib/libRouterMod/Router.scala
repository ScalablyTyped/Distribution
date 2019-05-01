package typings
package twilioDashSyncLib.libRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/router", "Router")
@js.native
class Router protected () extends js.Object {
  def this(params: js.Any) = this()
  var config: js.Any = js.native
  var notifications: js.Any = js.native
  var subscriptions: js.Any = js.native
  /**
    * Handle transport establishing event
    * If we have any subscriptions - we should check object for modifications
    */
  def onConnectionStateChanged(isConnected: scala.Boolean): scala.Unit = js.native
  /**
    * Entry point for all incoming messages
    * @param {String} type - Type of incoming message
    * @param {Object} message - Message to route
    */
  def onMessage(`type`: java.lang.String, message: js.Any): scala.Unit = js.native
  /**
    * Subscribe for events
    */
  def subscribe(sid: java.lang.String, entity: js.Any): scala.Unit = js.native
  /**
    * Unsubscribe from events
    */
  def unsubscribe(sid: java.lang.String): scala.Unit = js.native
}

