package typings.titanium.Titanium

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base for all Titanium objects.
  */
@js.native
trait Proxy extends js.Object {
  
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
    * Gets the value of the <Titanium.Proxy.apiName> property.
    * @deprecated Access <Titanium.Proxy.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Proxy.bubbleParent> property.
    * @deprecated Access <Titanium.Proxy.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Proxy.lifecycleContainer> property.
    * @deprecated Access <Titanium.Proxy.lifecycleContainer> instead.
    */
  var getLifecycleContainer: js.UndefOr[js.Function0[Window | TabGroup]] = js.native
  
  /**
    * Proxy identifier
    */
  var id: js.UndefOr[String | Double] = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: js.UndefOr[Window | TabGroup] = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Proxy.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Proxy.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Proxy.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Proxy.lifecycleContainer> instead.
    */
  var setLifecycleContainer: js.UndefOr[js.Function1[/* lifecycleContainer */ Window | TabGroup, Unit]] = js.native
}
