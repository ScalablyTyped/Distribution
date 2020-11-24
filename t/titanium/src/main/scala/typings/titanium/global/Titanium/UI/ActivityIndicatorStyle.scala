package typings.titanium.global.Titanium.UI

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of constants for the styles available for <Titanium.UI.ActivityIndicator> objects.
  */
@JSGlobal("Titanium.UI.ActivityIndicatorStyle")
@js.native
class ActivityIndicatorStyle () extends Proxy
/* static members */
@JSGlobal("Titanium.UI.ActivityIndicatorStyle")
@js.native
object ActivityIndicatorStyle extends js.Object {
  
  /**
    * Large white spinning indicator.
    */
  val BIG: Double = js.native
  
  /**
    * Large gray spinning indicator.
    */
  val BIG_DARK: Double = js.native
  
  /**
    * Small gray spinning indicator.
    */
  val DARK: Double = js.native
  
  /**
    * Small white spinning indicator (default).
    */
  val PLAIN: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ActivityIndicatorStyle.apiName> property.
    * @deprecated Access <Titanium.UI.ActivityIndicatorStyle.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ActivityIndicatorStyle.bubbleParent> property.
    * @deprecated Access <Titanium.UI.ActivityIndicatorStyle.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ActivityIndicatorStyle.lifecycleContainer> property.
    * @deprecated Access <Titanium.UI.ActivityIndicatorStyle.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: typings.titanium.Titanium.UI.Window | typings.titanium.Titanium.UI.TabGroup = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ActivityIndicatorStyle.bubbleParent> property.
    * @deprecated Set the value using <Titanium.UI.ActivityIndicatorStyle.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.ActivityIndicatorStyle.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.UI.ActivityIndicatorStyle.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: typings.titanium.Titanium.UI.Window): Unit = js.native
}
