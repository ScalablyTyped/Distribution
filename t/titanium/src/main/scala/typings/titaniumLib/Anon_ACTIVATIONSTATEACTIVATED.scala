package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ACTIVATIONSTATEACTIVATED extends js.Object {
  /**
  		 * The watch is currently activated.
  		 */
  val ACTIVATION_STATE_ACTIVATED: scala.Double = js.native
  /**
  		 * The watch is currently inactive.
  		 */
  val ACTIVATION_STATE_INACTIVE: scala.Double = js.native
  /**
  		 * The watch is currently not activated.
  		 */
  val ACTIVATION_STATE_NOT_ACTIVATED: scala.Double = js.native
  /**
  		 * Returns the current activation state of the watch.
  		 */
  val activationState: scala.Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * Returns `true` if there is more content for the session to deliver.
  		 */
  val hasContentPending: scala.Boolean = js.native
  /**
  		 * Returns `true` if the watch is currently activated.
  		 */
  val isActivated: scala.Boolean = js.native
  /**
  		 * Returns `true` if complication is enabled on the installed watch app.
  		 */
  val isComplicationEnabled: scala.Boolean = js.native
  /**
  		 * Returns `true` if the device is paired with a watch.
  		 */
  val isPaired: scala.Boolean = js.native
  /**
  		 * Returns `true` if the watch is currently reachable.
  		 */
  val isReachable: scala.Boolean = js.native
  /**
  		 * Returns `true` if the device supports watch connectivity.
  		 */
  val isSupported: scala.Boolean = js.native
  /**
  		 * Returns `true` if the accompanying watch app is installed.
  		 */
  val isWatchAppInstalled: scala.Boolean = js.native
  /**
  		 * The most recent application context sent to the watch app.
  		 */
  val recentApplicationContext: js.Any = js.native
  /**
  		 * The number of calls remaining to `transferCurrentComplication` before the system starts
  		 * transferring the complicationUserInfo as regular userInfos.
  		 */
  val remainingComplicationUserInfoTransfers: scala.Double = js.native
  /**
  		 * Activates the watch session
  		 */
  def activateSession(): scala.Unit = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Cancels all incomplete file transfers to the apple watch.
  		 */
  def cancelAllFileTransfers(): scala.Unit = js.native
  /**
  		 * Cancels all incomplete transfers to the apple watch.
  		 */
  def cancelAllTransfers(): scala.Unit = js.native
  /**
  		 * Cancels all incomplete user info and complication transfers to the apple watch.
  		 */
  def cancelAllUserInfoTransfers(): scala.Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.activationState> property.
  		 */
  def getActivationState(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.hasContentPending> property.
  		 */
  def getHasContentPending(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.isActivated> property.
  		 */
  def getIsActivated(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.isComplicationEnabled> property.
  		 */
  def getIsComplicationEnabled(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.isPaired> property.
  		 */
  def getIsPaired(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.isReachable> property.
  		 */
  def getIsReachable(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.isSupported> property.
  		 */
  def getIsSupported(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.isWatchAppInstalled> property.
  		 */
  def getIsWatchAppInstalled(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.recentApplicationContext> property.
  		 */
  def getRecentApplicationContext(): js.Any = js.native
  /**
  		 * Gets the value of the <Titanium.WatchSession.remainingComplicationUserInfoTransfers> property.
  		 */
  def getRemainingComplicationUserInfoTransfers(): scala.Double = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Sends a message to the apple watch.
  		 */
  def sendMessage(message: js.Any): scala.Unit = js.native
  def sendMessage(message: js.Any, reply: js.Function1[/* param0 */ MessageReply, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.WatchSession.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Transfers complication data to the watch application.
  		 */
  def transferCurrentComplication(params: js.Any): scala.Unit = js.native
  /**
  		 * Transfers a file to the apple watch.
  		 */
  def transferFile(params: js.Any): scala.Unit = js.native
  /**
  		 * Transfers an user info to the apple watch.
  		 */
  def transferUserInfo(params: js.Any): scala.Unit = js.native
  /**
  		 * Sends an app context update to the apple watch.
  		 */
  def updateApplicationContext(params: js.Any): scala.Unit = js.native
}

