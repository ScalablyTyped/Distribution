package typings.titanium.TitaniumNs

import typings.std.Date
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
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
  val apiName: String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * JSON representation of the last Analytics event generated.
  		 */
  val lastEvent: String = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Allows the user to opt out from Analytics during runtime to comply to GPDR.
  		 */
  var optedOut: Boolean = js.native
  /**
  		 * Sends a generic event for this application session.
  		 * **Not displayed in Analytics UI**.
  		 */
  def addEvent(`type`: String, name: String): Unit = js.native
  def addEvent(`type`: String, name: String, data: js.Any): Unit = js.native
  /**
  		 * Sends a feature event for this application session.
  		 */
  def featureEvent(name: String): Double = js.native
  def featureEvent(name: String, data: js.Any): Double = js.native
  /**
  		 * Sets a list of events that will not be sent to the Analytics server.
  		 */
  def filterEvents(events: js.Array[String]): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Analytics.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Analytics.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Analytics.lastEvent> property.
  		 */
  def getLastEvent(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Analytics.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Analytics.optedOut> property.
  		 */
  def getOptedOut(): Boolean = js.native
  /**
  		 * Sends a navigation event for this application session.
  		 * **Not displayed in Analytics UI**.
  		 */
  def navEvent(from: String, to: String): Unit = js.native
  def navEvent(from: String, to: String, name: String): Unit = js.native
  def navEvent(from: String, to: String, name: String, data: js.Any): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Analytics.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Analytics.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Analytics.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Analytics.optedOut> property.
  		 */
  def setOptedOut(optedOut: Boolean): Unit = js.native
  /**
  		 * Sends a settings event for this application session.
  		 * **Not displayed in Analytics UI**.
  		 */
  def settingsEvent(name: String): Unit = js.native
  def settingsEvent(name: String, data: js.Any): Unit = js.native
  /**
  		 * Send a timed event for this application session.
  		 * **Not displayed in Analytics UI**.
  		 */
  def timedEvent(name: String, start: Date, stop: Date, duration: Double): Unit = js.native
  def timedEvent(name: String, start: Date, stop: Date, duration: Double, data: js.Any): Unit = js.native
  /**
  		 * Sends a user event for this application session. **Not displayed in Analytics UI**.
  		 */
  def userEvent(name: String): Unit = js.native
  def userEvent(name: String, data: js.Any): Unit = js.native
}

