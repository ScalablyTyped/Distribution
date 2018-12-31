package typings
package titaniumLib.TitaniumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Used for transmitting developer-defined Analytics events to the Appcelerator Analytics product.
	 */
@JSGlobal("Titanium.Analytics")
@js.native
object AnalyticsNs extends js.Object {
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * JSON representation of the last Analytics event generated.
  		 */
  val lastEvent: java.lang.String = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Allows the user to opt out from Analytics during runtime to comply to GPDR.
  		 */
  var optedOut: scala.Boolean = js.native
  /**
  		 * Sends a generic event for this application session.
  		 * **Not displayed in Analytics UI**.
  		 */
  def addEvent(`type`: java.lang.String, name: java.lang.String): scala.Unit = js.native
  def addEvent(`type`: java.lang.String, name: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
  		 * Sends a feature event for this application session.
  		 */
  def featureEvent(name: java.lang.String): scala.Double = js.native
  def featureEvent(name: java.lang.String, data: js.Any): scala.Double = js.native
  /**
  		 * Sets a list of events that will not be sent to the Analytics server.
  		 */
  def filterEvents(events: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Analytics.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Analytics.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Analytics.lastEvent> property.
  		 */
  def getLastEvent(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Analytics.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Analytics.optedOut> property.
  		 */
  def getOptedOut(): scala.Boolean = js.native
  /**
  		 * Sends a navigation event for this application session.
  		 * **Not displayed in Analytics UI**.
  		 */
  def navEvent(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
  def navEvent(from: java.lang.String, to: java.lang.String, name: java.lang.String): scala.Unit = js.native
  def navEvent(from: java.lang.String, to: java.lang.String, name: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Analytics.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Analytics.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Analytics.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Analytics.optedOut> property.
  		 */
  def setOptedOut(optedOut: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sends a settings event for this application session.
  		 * **Not displayed in Analytics UI**.
  		 */
  def settingsEvent(name: java.lang.String): scala.Unit = js.native
  def settingsEvent(name: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
  		 * Send a timed event for this application session.
  		 * **Not displayed in Analytics UI**.
  		 */
  def timedEvent(name: java.lang.String, start: stdLib.Date, stop: stdLib.Date, duration: scala.Double): scala.Unit = js.native
  def timedEvent(
    name: java.lang.String,
    start: stdLib.Date,
    stop: stdLib.Date,
    duration: scala.Double,
    data: js.Any
  ): scala.Unit = js.native
  /**
  		 * Sends a user event for this application session. **Not displayed in Analytics UI**.
  		 */
  def userEvent(name: java.lang.String): scala.Unit = js.native
  def userEvent(name: java.lang.String, data: js.Any): scala.Unit = js.native
}

