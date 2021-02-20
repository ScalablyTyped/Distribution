package typings.titanium.global.Titanium

import typings.titanium.Titanium.AccelerometerUpdateEvent
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.update
import org.scalablytyped.runtime.StObject
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
object Accelerometer {
  
  @JSGlobal("Titanium.Accelerometer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.addEventListener")
  @js.native
  def addEventListener_update(
    name: update,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Accelerometer, 
      /* event */ AccelerometerUpdateEvent, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Accelerometer.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.fireEvent")
  @js.native
  def fireEvent_update(name: update): Unit = js.native
  @JSGlobal("Titanium.Accelerometer.fireEvent")
  @js.native
  def fireEvent_update(name: update, event: AccelerometerUpdateEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Accelerometer.apiName> property.
    * @deprecated Access <Titanium.Accelerometer.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Accelerometer.bubbleParent> property.
    * @deprecated Access <Titanium.Accelerometer.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Accelerometer.lifecycleContainer> property.
    * @deprecated Access <Titanium.Accelerometer.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.removeEventListener")
  @js.native
  def removeEventListener_update(
    name: update,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Accelerometer, 
      /* event */ AccelerometerUpdateEvent, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Accelerometer.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Accelerometer.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Accelerometer.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Accelerometer.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Accelerometer.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Accelerometer.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}
