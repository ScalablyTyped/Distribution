package typings.titanium.global.Titanium

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import org.scalablytyped.runtime.StObject
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
object Analytics {
  
  @JSGlobal("Titanium.Analytics")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Sends a generic event for this application session.
    * **Not displayed in Analytics UI**.
    * @deprecated
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.addEvent")
  @js.native
  def addEvent: scala.Nothing = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.addEventListener")
  @js.native
  def addEventListener: scala.Nothing = js.native
  @scala.inline
  def addEventListener_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def addEvent_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEvent")(x.asInstanceOf[js.Any])
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.applyProperties")
  @js.native
  def applyProperties: scala.Nothing = js.native
  @scala.inline
  def applyProperties_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applyProperties")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Sends a feature event for this application session.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.featureEvent")
  @js.native
  def featureEvent(name: String): Double = js.native
  @JSGlobal("Titanium.Analytics.featureEvent")
  @js.native
  def featureEvent(name: String, data: js.Any): Double = js.native
  
  /**
    * Sets a list of events that will not be sent to the Analytics server.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.filterEvents")
  @js.native
  def filterEvents(events: js.Array[String]): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.fireEvent")
  @js.native
  def fireEvent: scala.Nothing = js.native
  @scala.inline
  def fireEvent_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fireEvent")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the value of the <Titanium.Analytics.apiName> property.
    * @deprecated Access <Titanium.Analytics.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Analytics.bubbleParent> property.
    * @deprecated Access <Titanium.Analytics.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Analytics.lastEvent> property.
    * @deprecated Access <Titanium.Analytics.lastEvent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.getLastEvent")
  @js.native
  def getLastEvent(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Analytics.lifecycleContainer> property.
    * @deprecated Access <Titanium.Analytics.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.Analytics.optedOut> property.
    * @deprecated Access <Titanium.Analytics.optedOut> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.getOptedOut")
  @js.native
  def getOptedOut(): Boolean = js.native
  
  /**
    * JSON representation of the last Analytics event generated.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.lastEvent")
  @js.native
  val lastEvent: String = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Sends a navigation event for this application session.
    * **Not displayed in Analytics UI**.
    * @deprecated
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.navEvent")
  @js.native
  def navEvent(from: String, to: String): Unit = js.native
  @JSGlobal("Titanium.Analytics.navEvent")
  @js.native
  def navEvent(from: String, to: String, name: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
  @JSGlobal("Titanium.Analytics.navEvent")
  @js.native
  def navEvent(from: String, to: String, name: String): Unit = js.native
  @JSGlobal("Titanium.Analytics.navEvent")
  @js.native
  def navEvent(from: String, to: String, name: String, data: js.Any): Unit = js.native
  
  /**
    * Allows the user to opt out from Analytics during runtime to comply to GPDR.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.optedOut")
  @js.native
  def optedOut: Boolean = js.native
  @scala.inline
  def optedOut_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optedOut")(x.asInstanceOf[js.Any])
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.removeEventListener")
  @js.native
  def removeEventListener: scala.Nothing = js.native
  @scala.inline
  def removeEventListener_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(x.asInstanceOf[js.Any])
  
  /**
    * Sets the value of the <Titanium.Analytics.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Analytics.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Analytics.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Analytics.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Analytics.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Analytics.optedOut> property.
    * @deprecated Set the value using <Titanium.Analytics.optedOut> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.setOptedOut")
  @js.native
  def setOptedOut(optedOut: Boolean): Unit = js.native
  
  /**
    * Sends a settings event for this application session.
    * **Not displayed in Analytics UI**.
    * @deprecated
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.settingsEvent")
  @js.native
  def settingsEvent: scala.Nothing = js.native
  @scala.inline
  def settingsEvent_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settingsEvent")(x.asInstanceOf[js.Any])
  
  /**
    * Send a timed event for this application session.
    * **Not displayed in Analytics UI**.
    * @deprecated
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.timedEvent")
  @js.native
  def timedEvent: scala.Nothing = js.native
  @scala.inline
  def timedEvent_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timedEvent")(x.asInstanceOf[js.Any])
  
  /**
    * Sends a user event for this application session.
    * **Not displayed in Analytics UI**.
    * @deprecated
    */
  /* static member */
  @JSGlobal("Titanium.Analytics.userEvent")
  @js.native
  def userEvent: scala.Nothing = js.native
  @scala.inline
  def userEvent_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userEvent")(x.asInstanceOf[js.Any])
}
