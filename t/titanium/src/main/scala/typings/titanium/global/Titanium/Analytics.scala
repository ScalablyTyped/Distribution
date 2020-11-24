package typings.titanium.global.Titanium

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for transmitting developer-defined Analytics events to the Appcelerator Analytics product.
  */
@JSGlobal("Titanium.Analytics")
@js.native
class Analytics ()
  extends typings.titanium.Titanium.Proxy
/* static members */
@JSGlobal("Titanium.Analytics")
@js.native
object Analytics extends js.Object {
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
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
    * @deprecated Access <Titanium.Analytics.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Analytics.bubbleParent> property.
    * @deprecated Access <Titanium.Analytics.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Analytics.lastEvent> property.
    * @deprecated Access <Titanium.Analytics.lastEvent> instead.
    */
  def getLastEvent(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Analytics.lifecycleContainer> property.
    * @deprecated Access <Titanium.Analytics.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.Analytics.optedOut> property.
    * @deprecated Access <Titanium.Analytics.optedOut> instead.
    */
  def getOptedOut(): Boolean = js.native
  
  /**
    * JSON representation of the last Analytics event generated.
    */
  val lastEvent: String = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  
  /**
    * Sends a navigation event for this application session.
    * **Not displayed in Analytics UI**.
    * @deprecated
    */
  def navEvent(from: String, to: String): Unit = js.native
  def navEvent(from: String, to: String, name: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
  def navEvent(from: String, to: String, name: String): Unit = js.native
  def navEvent(from: String, to: String, name: String, data: js.Any): Unit = js.native
  
  /**
    * Allows the user to opt out from Analytics during runtime to comply to GPDR.
    */
  var optedOut: Boolean = js.native
  
  /**
    * Sets the value of the <Titanium.Analytics.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Analytics.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Analytics.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Analytics.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Analytics.optedOut> property.
    * @deprecated Set the value using <Titanium.Analytics.optedOut> instead.
    */
  def setOptedOut(optedOut: Boolean): Unit = js.native
}
