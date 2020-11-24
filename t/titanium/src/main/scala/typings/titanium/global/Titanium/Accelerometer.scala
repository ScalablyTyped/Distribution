package typings.titanium.global.Titanium

import typings.titanium.Titanium.AccelerometerUpdateEvent
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level Accelerometer module, used to determine the device's physical position.
  */
@JSGlobal("Titanium.Accelerometer")
@js.native
class Accelerometer ()
  extends typings.titanium.Titanium.Proxy
/* static members */
@JSGlobal("Titanium.Accelerometer")
@js.native
object Accelerometer extends js.Object {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_update(
    name: update,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AccelerometerUpdateEvent, Unit]
  ): Unit = js.native
  
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
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_update(name: update): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_update(name: update, event: AccelerometerUpdateEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Accelerometer.apiName> property.
    * @deprecated Access <Titanium.Accelerometer.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Accelerometer.bubbleParent> property.
    * @deprecated Access <Titanium.Accelerometer.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Accelerometer.lifecycleContainer> property.
    * @deprecated Access <Titanium.Accelerometer.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_update(
    name: update,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AccelerometerUpdateEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Accelerometer.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Accelerometer.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Accelerometer.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Accelerometer.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}
